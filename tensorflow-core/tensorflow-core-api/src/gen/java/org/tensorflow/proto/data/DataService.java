// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/data_service.proto

package org.tensorflow.proto.data;

public final class DataService {
  private DataService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProcessingModeDefOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.data.ProcessingModeDef)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
     */
    int getShardingPolicyValue();
    /**
     * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
     */
    org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy getShardingPolicy();
  }
  /**
   * Protobuf type {@code tensorflow.data.ProcessingModeDef}
   */
  public  static final class ProcessingModeDef extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.data.ProcessingModeDef)
      ProcessingModeDefOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProcessingModeDef.newBuilder() to construct.
    private ProcessingModeDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProcessingModeDef() {
      shardingPolicy_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProcessingModeDef();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ProcessingModeDef(
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
            case 8: {
              int rawValue = input.readEnum();

              shardingPolicy_ = rawValue;
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
      return org.tensorflow.proto.data.DataService.internal_static_tensorflow_data_ProcessingModeDef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.DataService.internal_static_tensorflow_data_ProcessingModeDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.DataService.ProcessingModeDef.class, org.tensorflow.proto.data.DataService.ProcessingModeDef.Builder.class);
    }

    /**
     * <pre>
     * Specifies how data is sharded among tf.data service workers.
     * </pre>
     *
     * Protobuf enum {@code tensorflow.data.ProcessingModeDef.ShardingPolicy}
     */
    public enum ShardingPolicy
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * No sharding will be performed. Each worker produces the entire dataset
       * without any sharding. With this mode, the best practice is to shuffle the
       * dataset nondeterministically so that workers process the dataset in
       * different orders.
       * </pre>
       *
       * <code>OFF = 0;</code>
       */
      OFF(0),
      /**
       * <pre>
       * The input dataset is dynamically split among workers at runtime. Each
       * worker gets the next split when it reads data from the dispatcher. There
       * is no fixed sharding with this mode.
       * </pre>
       *
       * <code>DYNAMIC = 1;</code>
       */
      DYNAMIC(1),
      /**
       * <pre>
       * The following are static sharding policies. The semantics are similar to
       * `tf.data.experimental.AutoShardPolicy`. These policies require:
       * * The tf.data service cluster has a fixed size, and you need to specify
       *   the workers in DispatcherConfig.
       * * Each client only reads from the local tf.data service worker.
       * Shards by input files (each worker will get a set of files to process).
       * When this option is selected, make sure that there is at least as many
       * files as workers. If there are fewer input files than workers, a runtime
       * error will be raised.
       * </pre>
       *
       * <code>FILE = 2;</code>
       */
      FILE(2),
      /**
       * <pre>
       * Shards by elements produced by the dataset. Each worker will process the
       * whole dataset and discard the portion that is not for itself. Note that
       * for this mode to correctly partitions the dataset elements, the dataset
       * needs to produce elements in a deterministic order.
       * </pre>
       *
       * <code>DATA = 3;</code>
       */
      DATA(3),
      /**
       * <pre>
       * Attempts FILE-based sharding, falling back to DATA-based sharding on
       * failures.
       * </pre>
       *
       * <code>FILE_OR_DATA = 4;</code>
       */
      FILE_OR_DATA(4),
      /**
       * <pre>
       * Looks for the presence of `shard(SHARD_HINT, ...)` which is treated as a
       * placeholder to replace with `shard(num_workers, worker_index)`.
       * </pre>
       *
       * <code>HINT = 5;</code>
       */
      HINT(5),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       * No sharding will be performed. Each worker produces the entire dataset
       * without any sharding. With this mode, the best practice is to shuffle the
       * dataset nondeterministically so that workers process the dataset in
       * different orders.
       * </pre>
       *
       * <code>OFF = 0;</code>
       */
      public static final int OFF_VALUE = 0;
      /**
       * <pre>
       * The input dataset is dynamically split among workers at runtime. Each
       * worker gets the next split when it reads data from the dispatcher. There
       * is no fixed sharding with this mode.
       * </pre>
       *
       * <code>DYNAMIC = 1;</code>
       */
      public static final int DYNAMIC_VALUE = 1;
      /**
       * <pre>
       * The following are static sharding policies. The semantics are similar to
       * `tf.data.experimental.AutoShardPolicy`. These policies require:
       * * The tf.data service cluster has a fixed size, and you need to specify
       *   the workers in DispatcherConfig.
       * * Each client only reads from the local tf.data service worker.
       * Shards by input files (each worker will get a set of files to process).
       * When this option is selected, make sure that there is at least as many
       * files as workers. If there are fewer input files than workers, a runtime
       * error will be raised.
       * </pre>
       *
       * <code>FILE = 2;</code>
       */
      public static final int FILE_VALUE = 2;
      /**
       * <pre>
       * Shards by elements produced by the dataset. Each worker will process the
       * whole dataset and discard the portion that is not for itself. Note that
       * for this mode to correctly partitions the dataset elements, the dataset
       * needs to produce elements in a deterministic order.
       * </pre>
       *
       * <code>DATA = 3;</code>
       */
      public static final int DATA_VALUE = 3;
      /**
       * <pre>
       * Attempts FILE-based sharding, falling back to DATA-based sharding on
       * failures.
       * </pre>
       *
       * <code>FILE_OR_DATA = 4;</code>
       */
      public static final int FILE_OR_DATA_VALUE = 4;
      /**
       * <pre>
       * Looks for the presence of `shard(SHARD_HINT, ...)` which is treated as a
       * placeholder to replace with `shard(num_workers, worker_index)`.
       * </pre>
       *
       * <code>HINT = 5;</code>
       */
      public static final int HINT_VALUE = 5;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ShardingPolicy valueOf(int value) {
        return forNumber(value);
      }

      public static ShardingPolicy forNumber(int value) {
        switch (value) {
          case 0: return OFF;
          case 1: return DYNAMIC;
          case 2: return FILE;
          case 3: return DATA;
          case 4: return FILE_OR_DATA;
          case 5: return HINT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ShardingPolicy>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ShardingPolicy> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ShardingPolicy>() {
              public ShardingPolicy findValueByNumber(int number) {
                return ShardingPolicy.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.tensorflow.proto.data.DataService.ProcessingModeDef.getDescriptor().getEnumTypes().get(0);
      }

      private static final ShardingPolicy[] VALUES = values();

      public static ShardingPolicy valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private ShardingPolicy(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:tensorflow.data.ProcessingModeDef.ShardingPolicy)
    }

    public static final int SHARDING_POLICY_FIELD_NUMBER = 1;
    private int shardingPolicy_;
    /**
     * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
     */
    public int getShardingPolicyValue() {
      return shardingPolicy_;
    }
    /**
     * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
     */
    public org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy getShardingPolicy() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy result = org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy.valueOf(shardingPolicy_);
      return result == null ? org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy.UNRECOGNIZED : result;
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
      if (shardingPolicy_ != org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy.OFF.getNumber()) {
        output.writeEnum(1, shardingPolicy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shardingPolicy_ != org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy.OFF.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, shardingPolicy_);
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
      if (!(obj instanceof org.tensorflow.proto.data.DataService.ProcessingModeDef)) {
        return super.equals(obj);
      }
      org.tensorflow.proto.data.DataService.ProcessingModeDef other = (org.tensorflow.proto.data.DataService.ProcessingModeDef) obj;

      if (shardingPolicy_ != other.shardingPolicy_) return false;
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
      hash = (37 * hash) + SHARDING_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + shardingPolicy_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.data.DataService.ProcessingModeDef parseFrom(
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
    public static Builder newBuilder(org.tensorflow.proto.data.DataService.ProcessingModeDef prototype) {
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
     * Protobuf type {@code tensorflow.data.ProcessingModeDef}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.data.ProcessingModeDef)
        org.tensorflow.proto.data.DataService.ProcessingModeDefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tensorflow.proto.data.DataService.internal_static_tensorflow_data_ProcessingModeDef_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tensorflow.proto.data.DataService.internal_static_tensorflow_data_ProcessingModeDef_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tensorflow.proto.data.DataService.ProcessingModeDef.class, org.tensorflow.proto.data.DataService.ProcessingModeDef.Builder.class);
      }

      // Construct using org.tensorflow.proto.data.DataService.ProcessingModeDef.newBuilder()
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
        shardingPolicy_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tensorflow.proto.data.DataService.internal_static_tensorflow_data_ProcessingModeDef_descriptor;
      }

      @java.lang.Override
      public org.tensorflow.proto.data.DataService.ProcessingModeDef getDefaultInstanceForType() {
        return org.tensorflow.proto.data.DataService.ProcessingModeDef.getDefaultInstance();
      }

      @java.lang.Override
      public org.tensorflow.proto.data.DataService.ProcessingModeDef build() {
        org.tensorflow.proto.data.DataService.ProcessingModeDef result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tensorflow.proto.data.DataService.ProcessingModeDef buildPartial() {
        org.tensorflow.proto.data.DataService.ProcessingModeDef result = new org.tensorflow.proto.data.DataService.ProcessingModeDef(this);
        result.shardingPolicy_ = shardingPolicy_;
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
        if (other instanceof org.tensorflow.proto.data.DataService.ProcessingModeDef) {
          return mergeFrom((org.tensorflow.proto.data.DataService.ProcessingModeDef)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tensorflow.proto.data.DataService.ProcessingModeDef other) {
        if (other == org.tensorflow.proto.data.DataService.ProcessingModeDef.getDefaultInstance()) return this;
        if (other.shardingPolicy_ != 0) {
          setShardingPolicyValue(other.getShardingPolicyValue());
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
        org.tensorflow.proto.data.DataService.ProcessingModeDef parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tensorflow.proto.data.DataService.ProcessingModeDef) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int shardingPolicy_ = 0;
      /**
       * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
       */
      public int getShardingPolicyValue() {
        return shardingPolicy_;
      }
      /**
       * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
       */
      public Builder setShardingPolicyValue(int value) {
        shardingPolicy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
       */
      public org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy getShardingPolicy() {
        @SuppressWarnings("deprecation")
        org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy result = org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy.valueOf(shardingPolicy_);
        return result == null ? org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy.UNRECOGNIZED : result;
      }
      /**
       * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
       */
      public Builder setShardingPolicy(org.tensorflow.proto.data.DataService.ProcessingModeDef.ShardingPolicy value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        shardingPolicy_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.tensorflow.data.ProcessingModeDef.ShardingPolicy sharding_policy = 1;</code>
       */
      public Builder clearShardingPolicy() {
        
        shardingPolicy_ = 0;
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


      // @@protoc_insertion_point(builder_scope:tensorflow.data.ProcessingModeDef)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.data.ProcessingModeDef)
    private static final org.tensorflow.proto.data.DataService.ProcessingModeDef DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tensorflow.proto.data.DataService.ProcessingModeDef();
    }

    public static org.tensorflow.proto.data.DataService.ProcessingModeDef getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProcessingModeDef>
        PARSER = new com.google.protobuf.AbstractParser<ProcessingModeDef>() {
      @java.lang.Override
      public ProcessingModeDef parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProcessingModeDef(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ProcessingModeDef> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProcessingModeDef> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.DataService.ProcessingModeDef getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_data_ProcessingModeDef_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_data_ProcessingModeDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+tensorflow/core/protobuf/data_service." +
      "proto\022\017tensorflow.data\"\267\001\n\021ProcessingMod" +
      "eDef\022J\n\017sharding_policy\030\001 \001(\01621.tensorfl" +
      "ow.data.ProcessingModeDef.ShardingPolicy" +
      "\"V\n\016ShardingPolicy\022\007\n\003OFF\020\000\022\013\n\007DYNAMIC\020\001" +
      "\022\010\n\004FILE\020\002\022\010\n\004DATA\020\003\022\020\n\014FILE_OR_DATA\020\004\022\010" +
      "\n\004HINT\020\005Br\n\031org.tensorflow.proto.dataZUg" +
      "ithub.com/tensorflow/tensorflow/tensorfl" +
      "ow/go/core/protobuf/for_core_protos_go_p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_data_ProcessingModeDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_data_ProcessingModeDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_data_ProcessingModeDef_descriptor,
        new java.lang.String[] { "ShardingPolicy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}