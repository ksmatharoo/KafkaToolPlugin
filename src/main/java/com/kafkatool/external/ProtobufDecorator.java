package com.kafkatool.external;


import com.google.protobuf.util.JsonFormat;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.*;


public class ProtobufDecorator implements ICustomMessageDecorator2 {
    private GsonBuilder gsonBuilder;
    private Gson gson;
    private Map<String, Utils.MetaData> topicMsgMap;

    public ProtobufDecorator() {
        gsonBuilder = new GsonBuilder();

        try {
            topicMsgMap = Utils.readFile(null);
        } catch (IOException e) {
            System.out.println("exception caught while reading file:" + e.toString());
            //e.printStackTrace();
        }

        topicMsgMap.forEach((k, v) -> {
            try {

                String adapterClassString = String.format("com.kafkatool.external.%sAdapter", v.message);
                //Class<?> msgClass = Class.forName(messageClass);
                Class<?> msgClass = getMessageClass(v.message);
                Class<?> adapterClass = Class.forName(adapterClassString);
                Object adapterObject = adapterClass.newInstance();
                gson = gsonBuilder.registerTypeAdapter(msgClass, adapterObject).create();
            } catch (Exception e) {
                System.out.println("exception caught :" + e.toString());
                //e.printStackTrace();
            }
        });
    }

    private Class<?> getMessageClass(String cName) throws ClassNotFoundException {
        Class<?> msgClass = null;
        String messageClass = String.format("org.ksm.test.protobuf.%sMessage", cName);
        try {
            msgClass = Class.forName(messageClass);
        } catch (ClassNotFoundException e) {
            messageClass = String.format("org.ksm.test.protobuf.%sProto$%sMessage", cName, cName);
            msgClass = Class.forName(messageClass);
        }
        return msgClass;
    }


    @Override
    public String getDisplayName() {
        return "Test Protobuf";
    }

    @Override
    public String decorate(String zookeeperHost, String brokerHost, String topic, long partitionId, long offset, byte[] msg, Map<String, byte[]> headers, Map<String, String> reserved) {
        try {
            String ret;
            if (this.topicMsgMap.containsKey(topic)) {
                Utils.MetaData metaData = topicMsgMap.get(topic);
                String messageClass = metaData.message;
                Class<?> klass = getMessageClass(messageClass);
                Method method = klass.getDeclaredMethod("parseFrom", byte[].class);
                Object invoke = method.invoke(null, msg);
                ret = gson.toJson(invoke);
            } else {
                ret = topic + " is unknown";
            }
            return ret;
        } catch (Throwable t) {
            String error = t.toString();
            String e = Objects.nonNull(t.getCause()) ?
                    error + " {Caused By} :" + t.getCause().toString() : error;

            System.out.println(e);
            return "Error: " + e;
        }
    }
}