package com.kafkatool.external;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Utils {

    public static class MetaData {
        public String topic_name;
        public String message;
        public String java_outer_classname;
        public boolean multiple_file;

        public MetaData(String topic_name, String message, String java_outer_classname, boolean multiple_file) {
            this.topic_name = topic_name;
            this.message = message;
            this.java_outer_classname = java_outer_classname;
            this.multiple_file = multiple_file;
        }
    }

    public static Map<String,MetaData> readFile(String path) throws IOException {
        Map<String,MetaData> map  = new HashMap<>();
        // Open the file
        if(Objects.isNull(path)){
            path = "C:\\Program Files\\OffsetExplorer2\\plugins\\topicVsMsg.csv";
            //path = "src/main/resources/topicVsMsg.csv";
        }
        FileInputStream fstream = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            if(strLine.startsWith("#")){
                continue;
            }
            String[] split = strLine.split(",");
            if(split.length == 4) {
                boolean multiple_file = Boolean.parseBoolean(split[3]);
                String java_outer_classname = split[2].equalsIgnoreCase("null") ? null : split[2];

                MetaData metaData = new MetaData(split[0], split[1],java_outer_classname,multiple_file);
                map.put(split[0], metaData);
            }else {
                System.out.println(strLine);
            }
        }
        fstream.close();
        return map;
    }
}
