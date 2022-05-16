This is sample project which will generate the kafkatools/offset explorer plugin for the custom protobuf messages
# Kafka Tools Plugins
prerequisite to build
1. set up maven home env var(%maven_home%)
2. set up java home env var(%java_home%)

update src/main/resources/topicVsMsg.csv file with topic name,proto class name,outer class and multiple files,after that
run the following commands

mvn clean package
codeGen.bat
mvn clean package

copy the target/ProtobufPlugin-1.0.0-SNAPSHOT.jar and csv file (src/main/resources/topicVsMsg.csv) and paste
to plugins dir (C:\Program Files\OffsetExplorer2\plugins)

