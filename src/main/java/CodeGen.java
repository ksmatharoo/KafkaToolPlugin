package com;

import com.kafkatool.external.Utils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Map;
import java.util.Objects;

public class CodeGen {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            genFiles(null);
        } else {
            genFiles(args[0]);
        }
    }

    public static void genFiles(String path) throws IOException {

        if (path == null) {
            path = "src/main/resources/topicVsMsg.csv";
        }

        Map<String, Utils.MetaData> map = Utils.readFile(path);

        InputStream classTemplateV1 = Thread.currentThread().getContextClassLoader().getResourceAsStream("classTemplateV1");
        InputStream classTemplateV2 = Thread.currentThread().getContextClassLoader().getResourceAsStream("classTemplateV2");

        String v1 = IOUtils.toString(classTemplateV1, "UTF-8");
        String v2 = IOUtils.toString(classTemplateV2, "UTF-8");

        for (Map.Entry<String, Utils.MetaData> entry : map.entrySet()) {
            String k = entry.getKey();
            Utils.MetaData v = entry.getValue();
            String data;
            final Utils.MetaData metadata = v;

            if (metadata.multiple_file == true) {
                data = v1.replaceAll("\\$\\{MessageClass}", String.format("%sMessage", metadata.message)).
                        replaceAll("\\$\\{AdapterClass}", String.format("%sAdapter", metadata.message));
            } else {
                String java_outer_classname = Objects.isNull(metadata.java_outer_classname) ?
                        String.format("%sProto", metadata.message) : metadata.java_outer_classname;

                data = v2.replaceAll("\\$\\{OuterClass}", java_outer_classname).
                        replaceAll("\\$\\{MessageClass}", String.format("%sMessage", metadata.message)).
                        replaceAll("\\$\\{AdapterClass}", String.format("%sAdapter", metadata.message));
            }
            String fname = String.format("%sAdapter.java", metadata.message);
            FileUtils.writeStringToFile(new File("src/main/java/com/kafkatool/external/" + fname)
                    , data);
        }

    }

    public static String readFile(String path) throws IOException {
        File file = new File(path);
        String s = FileUtils.readFileToString(file, "UTF-8");
        return s;
    }
}
