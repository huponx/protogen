package courier.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * InboxService is the in-app inbox of the signed-in user (the bell). The user is the subject of the token, never a
 * field of a request: a user reads and changes only their own inbox. Any signed-in user may call it; a service
 * token (no user) is refused.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: courier/v1/inbox.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InboxServiceGrpc {

  private InboxServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "courier.v1.InboxService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<courier.v1.Inbox.ListInboxRequest,
      courier.v1.Inbox.ListInboxResponse> getListInboxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInbox",
      requestType = courier.v1.Inbox.ListInboxRequest.class,
      responseType = courier.v1.Inbox.ListInboxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Inbox.ListInboxRequest,
      courier.v1.Inbox.ListInboxResponse> getListInboxMethod() {
    io.grpc.MethodDescriptor<courier.v1.Inbox.ListInboxRequest, courier.v1.Inbox.ListInboxResponse> getListInboxMethod;
    if ((getListInboxMethod = InboxServiceGrpc.getListInboxMethod) == null) {
      synchronized (InboxServiceGrpc.class) {
        if ((getListInboxMethod = InboxServiceGrpc.getListInboxMethod) == null) {
          InboxServiceGrpc.getListInboxMethod = getListInboxMethod =
              io.grpc.MethodDescriptor.<courier.v1.Inbox.ListInboxRequest, courier.v1.Inbox.ListInboxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInbox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.ListInboxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.ListInboxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InboxServiceMethodDescriptorSupplier("ListInbox"))
              .build();
        }
      }
    }
    return getListInboxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Inbox.GetUnreadCountRequest,
      courier.v1.Inbox.GetUnreadCountResponse> getGetUnreadCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnreadCount",
      requestType = courier.v1.Inbox.GetUnreadCountRequest.class,
      responseType = courier.v1.Inbox.GetUnreadCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Inbox.GetUnreadCountRequest,
      courier.v1.Inbox.GetUnreadCountResponse> getGetUnreadCountMethod() {
    io.grpc.MethodDescriptor<courier.v1.Inbox.GetUnreadCountRequest, courier.v1.Inbox.GetUnreadCountResponse> getGetUnreadCountMethod;
    if ((getGetUnreadCountMethod = InboxServiceGrpc.getGetUnreadCountMethod) == null) {
      synchronized (InboxServiceGrpc.class) {
        if ((getGetUnreadCountMethod = InboxServiceGrpc.getGetUnreadCountMethod) == null) {
          InboxServiceGrpc.getGetUnreadCountMethod = getGetUnreadCountMethod =
              io.grpc.MethodDescriptor.<courier.v1.Inbox.GetUnreadCountRequest, courier.v1.Inbox.GetUnreadCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnreadCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.GetUnreadCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.GetUnreadCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InboxServiceMethodDescriptorSupplier("GetUnreadCount"))
              .build();
        }
      }
    }
    return getGetUnreadCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Inbox.MarkReadRequest,
      courier.v1.Inbox.MarkReadResponse> getMarkReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkRead",
      requestType = courier.v1.Inbox.MarkReadRequest.class,
      responseType = courier.v1.Inbox.MarkReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Inbox.MarkReadRequest,
      courier.v1.Inbox.MarkReadResponse> getMarkReadMethod() {
    io.grpc.MethodDescriptor<courier.v1.Inbox.MarkReadRequest, courier.v1.Inbox.MarkReadResponse> getMarkReadMethod;
    if ((getMarkReadMethod = InboxServiceGrpc.getMarkReadMethod) == null) {
      synchronized (InboxServiceGrpc.class) {
        if ((getMarkReadMethod = InboxServiceGrpc.getMarkReadMethod) == null) {
          InboxServiceGrpc.getMarkReadMethod = getMarkReadMethod =
              io.grpc.MethodDescriptor.<courier.v1.Inbox.MarkReadRequest, courier.v1.Inbox.MarkReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.MarkReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.MarkReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InboxServiceMethodDescriptorSupplier("MarkRead"))
              .build();
        }
      }
    }
    return getMarkReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Inbox.StreamInboxRequest,
      courier.v1.Inbox.StreamInboxResponse> getStreamInboxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamInbox",
      requestType = courier.v1.Inbox.StreamInboxRequest.class,
      responseType = courier.v1.Inbox.StreamInboxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<courier.v1.Inbox.StreamInboxRequest,
      courier.v1.Inbox.StreamInboxResponse> getStreamInboxMethod() {
    io.grpc.MethodDescriptor<courier.v1.Inbox.StreamInboxRequest, courier.v1.Inbox.StreamInboxResponse> getStreamInboxMethod;
    if ((getStreamInboxMethod = InboxServiceGrpc.getStreamInboxMethod) == null) {
      synchronized (InboxServiceGrpc.class) {
        if ((getStreamInboxMethod = InboxServiceGrpc.getStreamInboxMethod) == null) {
          InboxServiceGrpc.getStreamInboxMethod = getStreamInboxMethod =
              io.grpc.MethodDescriptor.<courier.v1.Inbox.StreamInboxRequest, courier.v1.Inbox.StreamInboxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamInbox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.StreamInboxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.StreamInboxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InboxServiceMethodDescriptorSupplier("StreamInbox"))
              .build();
        }
      }
    }
    return getStreamInboxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Inbox.ArchiveRequest,
      courier.v1.Inbox.ArchiveResponse> getArchiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Archive",
      requestType = courier.v1.Inbox.ArchiveRequest.class,
      responseType = courier.v1.Inbox.ArchiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Inbox.ArchiveRequest,
      courier.v1.Inbox.ArchiveResponse> getArchiveMethod() {
    io.grpc.MethodDescriptor<courier.v1.Inbox.ArchiveRequest, courier.v1.Inbox.ArchiveResponse> getArchiveMethod;
    if ((getArchiveMethod = InboxServiceGrpc.getArchiveMethod) == null) {
      synchronized (InboxServiceGrpc.class) {
        if ((getArchiveMethod = InboxServiceGrpc.getArchiveMethod) == null) {
          InboxServiceGrpc.getArchiveMethod = getArchiveMethod =
              io.grpc.MethodDescriptor.<courier.v1.Inbox.ArchiveRequest, courier.v1.Inbox.ArchiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Archive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.ArchiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Inbox.ArchiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InboxServiceMethodDescriptorSupplier("Archive"))
              .build();
        }
      }
    }
    return getArchiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InboxServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InboxServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InboxServiceStub>() {
        @java.lang.Override
        public InboxServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InboxServiceStub(channel, callOptions);
        }
      };
    return InboxServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InboxServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InboxServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InboxServiceBlockingStub>() {
        @java.lang.Override
        public InboxServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InboxServiceBlockingStub(channel, callOptions);
        }
      };
    return InboxServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InboxServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InboxServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InboxServiceFutureStub>() {
        @java.lang.Override
        public InboxServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InboxServiceFutureStub(channel, callOptions);
        }
      };
    return InboxServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * InboxService is the in-app inbox of the signed-in user (the bell). The user is the subject of the token, never a
   * field of a request: a user reads and changes only their own inbox. Any signed-in user may call it; a service
   * token (no user) is refused.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListInbox returns the notifications of the user, newest first, without the archived ones.
     * </pre>
     */
    default void listInbox(courier.v1.Inbox.ListInboxRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.ListInboxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboxMethod(), responseObserver);
    }

    /**
     */
    default void getUnreadCount(courier.v1.Inbox.GetUnreadCountRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.GetUnreadCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnreadCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarkRead marks the given notifications (or all of them) as read. Ids of other users are ignored.
     * </pre>
     */
    default void markRead(courier.v1.Inbox.MarkReadRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.MarkReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamInbox is the realtime channel of the bell: the first message carries the unread count, then one message
     * per change (a new item, or a read/archive from another tab), and a heartbeat every 25 seconds. The stream
     * stays open until the client or the gateway closes it (the gateway ends it after a few minutes so the session
     * is checked again); the client reconnects.
     * </pre>
     */
    default void streamInbox(courier.v1.Inbox.StreamInboxRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.StreamInboxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamInboxMethod(), responseObserver);
    }

    /**
     * <pre>
     * Archive hides notifications from the list.
     * </pre>
     */
    default void archive(courier.v1.Inbox.ArchiveRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.ArchiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InboxService.
   * <pre>
   * InboxService is the in-app inbox of the signed-in user (the bell). The user is the subject of the token, never a
   * field of a request: a user reads and changes only their own inbox. Any signed-in user may call it; a service
   * token (no user) is refused.
   * </pre>
   */
  public static abstract class InboxServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InboxServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InboxService.
   * <pre>
   * InboxService is the in-app inbox of the signed-in user (the bell). The user is the subject of the token, never a
   * field of a request: a user reads and changes only their own inbox. Any signed-in user may call it; a service
   * token (no user) is refused.
   * </pre>
   */
  public static final class InboxServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InboxServiceStub> {
    private InboxServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InboxServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InboxServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListInbox returns the notifications of the user, newest first, without the archived ones.
     * </pre>
     */
    public void listInbox(courier.v1.Inbox.ListInboxRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.ListInboxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInboxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUnreadCount(courier.v1.Inbox.GetUnreadCountRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.GetUnreadCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnreadCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarkRead marks the given notifications (or all of them) as read. Ids of other users are ignored.
     * </pre>
     */
    public void markRead(courier.v1.Inbox.MarkReadRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.MarkReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamInbox is the realtime channel of the bell: the first message carries the unread count, then one message
     * per change (a new item, or a read/archive from another tab), and a heartbeat every 25 seconds. The stream
     * stays open until the client or the gateway closes it (the gateway ends it after a few minutes so the session
     * is checked again); the client reconnects.
     * </pre>
     */
    public void streamInbox(courier.v1.Inbox.StreamInboxRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.StreamInboxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamInboxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Archive hides notifications from the list.
     * </pre>
     */
    public void archive(courier.v1.Inbox.ArchiveRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Inbox.ArchiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InboxService.
   * <pre>
   * InboxService is the in-app inbox of the signed-in user (the bell). The user is the subject of the token, never a
   * field of a request: a user reads and changes only their own inbox. Any signed-in user may call it; a service
   * token (no user) is refused.
   * </pre>
   */
  public static final class InboxServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InboxServiceBlockingStub> {
    private InboxServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InboxServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InboxServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListInbox returns the notifications of the user, newest first, without the archived ones.
     * </pre>
     */
    public courier.v1.Inbox.ListInboxResponse listInbox(courier.v1.Inbox.ListInboxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInboxMethod(), getCallOptions(), request);
    }

    /**
     */
    public courier.v1.Inbox.GetUnreadCountResponse getUnreadCount(courier.v1.Inbox.GetUnreadCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnreadCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarkRead marks the given notifications (or all of them) as read. Ids of other users are ignored.
     * </pre>
     */
    public courier.v1.Inbox.MarkReadResponse markRead(courier.v1.Inbox.MarkReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamInbox is the realtime channel of the bell: the first message carries the unread count, then one message
     * per change (a new item, or a read/archive from another tab), and a heartbeat every 25 seconds. The stream
     * stays open until the client or the gateway closes it (the gateway ends it after a few minutes so the session
     * is checked again); the client reconnects.
     * </pre>
     */
    public java.util.Iterator<courier.v1.Inbox.StreamInboxResponse> streamInbox(
        courier.v1.Inbox.StreamInboxRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamInboxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Archive hides notifications from the list.
     * </pre>
     */
    public courier.v1.Inbox.ArchiveResponse archive(courier.v1.Inbox.ArchiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InboxService.
   * <pre>
   * InboxService is the in-app inbox of the signed-in user (the bell). The user is the subject of the token, never a
   * field of a request: a user reads and changes only their own inbox. Any signed-in user may call it; a service
   * token (no user) is refused.
   * </pre>
   */
  public static final class InboxServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InboxServiceFutureStub> {
    private InboxServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InboxServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InboxServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListInbox returns the notifications of the user, newest first, without the archived ones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Inbox.ListInboxResponse> listInbox(
        courier.v1.Inbox.ListInboxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInboxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Inbox.GetUnreadCountResponse> getUnreadCount(
        courier.v1.Inbox.GetUnreadCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnreadCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarkRead marks the given notifications (or all of them) as read. Ids of other users are ignored.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Inbox.MarkReadResponse> markRead(
        courier.v1.Inbox.MarkReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Archive hides notifications from the list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Inbox.ArchiveResponse> archive(
        courier.v1.Inbox.ArchiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INBOX = 0;
  private static final int METHODID_GET_UNREAD_COUNT = 1;
  private static final int METHODID_MARK_READ = 2;
  private static final int METHODID_STREAM_INBOX = 3;
  private static final int METHODID_ARCHIVE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INBOX:
          serviceImpl.listInbox((courier.v1.Inbox.ListInboxRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Inbox.ListInboxResponse>) responseObserver);
          break;
        case METHODID_GET_UNREAD_COUNT:
          serviceImpl.getUnreadCount((courier.v1.Inbox.GetUnreadCountRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Inbox.GetUnreadCountResponse>) responseObserver);
          break;
        case METHODID_MARK_READ:
          serviceImpl.markRead((courier.v1.Inbox.MarkReadRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Inbox.MarkReadResponse>) responseObserver);
          break;
        case METHODID_STREAM_INBOX:
          serviceImpl.streamInbox((courier.v1.Inbox.StreamInboxRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Inbox.StreamInboxResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE:
          serviceImpl.archive((courier.v1.Inbox.ArchiveRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Inbox.ArchiveResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListInboxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Inbox.ListInboxRequest,
              courier.v1.Inbox.ListInboxResponse>(
                service, METHODID_LIST_INBOX)))
        .addMethod(
          getGetUnreadCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Inbox.GetUnreadCountRequest,
              courier.v1.Inbox.GetUnreadCountResponse>(
                service, METHODID_GET_UNREAD_COUNT)))
        .addMethod(
          getMarkReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Inbox.MarkReadRequest,
              courier.v1.Inbox.MarkReadResponse>(
                service, METHODID_MARK_READ)))
        .addMethod(
          getStreamInboxMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              courier.v1.Inbox.StreamInboxRequest,
              courier.v1.Inbox.StreamInboxResponse>(
                service, METHODID_STREAM_INBOX)))
        .addMethod(
          getArchiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Inbox.ArchiveRequest,
              courier.v1.Inbox.ArchiveResponse>(
                service, METHODID_ARCHIVE)))
        .build();
  }

  private static abstract class InboxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InboxServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return courier.v1.Inbox.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InboxService");
    }
  }

  private static final class InboxServiceFileDescriptorSupplier
      extends InboxServiceBaseDescriptorSupplier {
    InboxServiceFileDescriptorSupplier() {}
  }

  private static final class InboxServiceMethodDescriptorSupplier
      extends InboxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InboxServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InboxServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InboxServiceFileDescriptorSupplier())
              .addMethod(getListInboxMethod())
              .addMethod(getGetUnreadCountMethod())
              .addMethod(getMarkReadMethod())
              .addMethod(getStreamInboxMethod())
              .addMethod(getArchiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
