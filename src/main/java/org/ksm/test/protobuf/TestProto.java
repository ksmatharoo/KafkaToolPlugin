// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Test.proto

package org.ksm.test.protobuf;

public final class TestProto {
  private TestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:test.protobuf.TestMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string guid = 1;</code>
     * @return The guid.
     */
    java.lang.String getGuid();
    /**
     * <code>string guid = 1;</code>
     * @return The bytes for guid.
     */
    com.google.protobuf.ByteString
        getGuidBytes();
  }
  /**
   * Protobuf type {@code test.protobuf.TestMessage}
   */
  public static final class TestMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:test.protobuf.TestMessage)
      TestMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestMessage.newBuilder() to construct.
    private TestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestMessage() {
      guid_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TestMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              guid_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.ksm.test.protobuf.TestProto.internal_static_test_protobuf_TestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.ksm.test.protobuf.TestProto.internal_static_test_protobuf_TestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.ksm.test.protobuf.TestProto.TestMessage.class, org.ksm.test.protobuf.TestProto.TestMessage.Builder.class);
    }

    public static final int GUID_FIELD_NUMBER = 1;
    private volatile java.lang.Object guid_;
    /**
     * <code>string guid = 1;</code>
     * @return The guid.
     */
    @java.lang.Override
    public java.lang.String getGuid() {
      java.lang.Object ref = guid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guid_ = s;
        return s;
      }
    }
    /**
     * <code>string guid = 1;</code>
     * @return The bytes for guid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuidBytes() {
      java.lang.Object ref = guid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGuidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGuidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, guid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.ksm.test.protobuf.TestProto.TestMessage)) {
        return super.equals(obj);
      }
      org.ksm.test.protobuf.TestProto.TestMessage other = (org.ksm.test.protobuf.TestProto.TestMessage) obj;

      if (!getGuid()
          .equals(other.getGuid())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.ksm.test.protobuf.TestProto.TestMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.ksm.test.protobuf.TestProto.TestMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code test.protobuf.TestMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:test.protobuf.TestMessage)
        org.ksm.test.protobuf.TestProto.TestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.ksm.test.protobuf.TestProto.internal_static_test_protobuf_TestMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.ksm.test.protobuf.TestProto.internal_static_test_protobuf_TestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.ksm.test.protobuf.TestProto.TestMessage.class, org.ksm.test.protobuf.TestProto.TestMessage.Builder.class);
      }

      // Construct using org.ksm.test.protobuf.TestProto.TestMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        guid_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.ksm.test.protobuf.TestProto.internal_static_test_protobuf_TestMessage_descriptor;
      }

      @java.lang.Override
      public org.ksm.test.protobuf.TestProto.TestMessage getDefaultInstanceForType() {
        return org.ksm.test.protobuf.TestProto.TestMessage.getDefaultInstance();
      }

      @java.lang.Override
      public org.ksm.test.protobuf.TestProto.TestMessage build() {
        org.ksm.test.protobuf.TestProto.TestMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.ksm.test.protobuf.TestProto.TestMessage buildPartial() {
        org.ksm.test.protobuf.TestProto.TestMessage result = new org.ksm.test.protobuf.TestProto.TestMessage(this);
        result.guid_ = guid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.ksm.test.protobuf.TestProto.TestMessage) {
          return mergeFrom((org.ksm.test.protobuf.TestProto.TestMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.ksm.test.protobuf.TestProto.TestMessage other) {
        if (other == org.ksm.test.protobuf.TestProto.TestMessage.getDefaultInstance()) return this;
        if (!other.getGuid().isEmpty()) {
          guid_ = other.guid_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.ksm.test.protobuf.TestProto.TestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.ksm.test.protobuf.TestProto.TestMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object guid_ = "";
      /**
       * <code>string guid = 1;</code>
       * @return The guid.
       */
      public java.lang.String getGuid() {
        java.lang.Object ref = guid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          guid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string guid = 1;</code>
       * @return The bytes for guid.
       */
      public com.google.protobuf.ByteString
          getGuidBytes() {
        java.lang.Object ref = guid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          guid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string guid = 1;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = getDefaultInstance().getGuid();
        onChanged();
        return this;
      }
      /**
       * <code>string guid = 1;</code>
       * @param value The bytes for guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        guid_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:test.protobuf.TestMessage)
    }

    // @@protoc_insertion_point(class_scope:test.protobuf.TestMessage)
    private static final org.ksm.test.protobuf.TestProto.TestMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.ksm.test.protobuf.TestProto.TestMessage();
    }

    public static org.ksm.test.protobuf.TestProto.TestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TestMessage>
        PARSER = new com.google.protobuf.AbstractParser<TestMessage>() {
      @java.lang.Override
      public TestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TestMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TestMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.ksm.test.protobuf.TestProto.TestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_protobuf_TestMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_protobuf_TestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nTest.proto\022\rtest.protobuf\"\033\n\013TestMessa" +
      "ge\022\014\n\004guid\030\001 \001(\tB\"\n\025org.ksm.test.protobu" +
      "fB\tTestProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_test_protobuf_TestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_test_protobuf_TestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_protobuf_TestMessage_descriptor,
        new java.lang.String[] { "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
