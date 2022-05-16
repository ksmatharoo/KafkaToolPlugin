/**
this is auto generated file by codegen.java,don't edit manually
*/

package com.kafkatool.external;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.protobuf.util.JsonFormat;
import org.ksm.test.protobuf.TestProto;

import java.io.IOException;

class TestAdapter extends TypeAdapter<TestProto.TestMessage> {
    @Override // dummy, never used in this context
    public TestProto.TestMessage read(JsonReader jsonReader) throws IOException {
        return TestProto.TestMessage.newBuilder().build();
    }

    @Override
    public void write(JsonWriter jsonWriter, TestProto.TestMessage msg) throws IOException {
        jsonWriter.jsonValue(JsonFormat.printer().print(msg));
    }
}