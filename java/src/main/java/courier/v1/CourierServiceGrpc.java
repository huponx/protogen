package courier.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CourierService is for services (Kubernetes ServiceAccount token, or a token holding the permission).
 * The inbox of a user is InboxService.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: courier/v1/courier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CourierServiceGrpc {

  private CourierServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "courier.v1.CourierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<courier.v1.Courier.SendNotificationRequest,
      courier.v1.Courier.SendNotificationResponse> getSendNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNotification",
      requestType = courier.v1.Courier.SendNotificationRequest.class,
      responseType = courier.v1.Courier.SendNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Courier.SendNotificationRequest,
      courier.v1.Courier.SendNotificationResponse> getSendNotificationMethod() {
    io.grpc.MethodDescriptor<courier.v1.Courier.SendNotificationRequest, courier.v1.Courier.SendNotificationResponse> getSendNotificationMethod;
    if ((getSendNotificationMethod = CourierServiceGrpc.getSendNotificationMethod) == null) {
      synchronized (CourierServiceGrpc.class) {
        if ((getSendNotificationMethod = CourierServiceGrpc.getSendNotificationMethod) == null) {
          CourierServiceGrpc.getSendNotificationMethod = getSendNotificationMethod =
              io.grpc.MethodDescriptor.<courier.v1.Courier.SendNotificationRequest, courier.v1.Courier.SendNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.SendNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.SendNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CourierServiceMethodDescriptorSupplier("SendNotification"))
              .build();
        }
      }
    }
    return getSendNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Courier.NotifyRequest,
      courier.v1.Courier.NotifyResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notify",
      requestType = courier.v1.Courier.NotifyRequest.class,
      responseType = courier.v1.Courier.NotifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Courier.NotifyRequest,
      courier.v1.Courier.NotifyResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<courier.v1.Courier.NotifyRequest, courier.v1.Courier.NotifyResponse> getNotifyMethod;
    if ((getNotifyMethod = CourierServiceGrpc.getNotifyMethod) == null) {
      synchronized (CourierServiceGrpc.class) {
        if ((getNotifyMethod = CourierServiceGrpc.getNotifyMethod) == null) {
          CourierServiceGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<courier.v1.Courier.NotifyRequest, courier.v1.Courier.NotifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.NotifyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CourierServiceMethodDescriptorSupplier("Notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Courier.GetNotificationRequest,
      courier.v1.Courier.GetNotificationResponse> getGetNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotification",
      requestType = courier.v1.Courier.GetNotificationRequest.class,
      responseType = courier.v1.Courier.GetNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Courier.GetNotificationRequest,
      courier.v1.Courier.GetNotificationResponse> getGetNotificationMethod() {
    io.grpc.MethodDescriptor<courier.v1.Courier.GetNotificationRequest, courier.v1.Courier.GetNotificationResponse> getGetNotificationMethod;
    if ((getGetNotificationMethod = CourierServiceGrpc.getGetNotificationMethod) == null) {
      synchronized (CourierServiceGrpc.class) {
        if ((getGetNotificationMethod = CourierServiceGrpc.getGetNotificationMethod) == null) {
          CourierServiceGrpc.getGetNotificationMethod = getGetNotificationMethod =
              io.grpc.MethodDescriptor.<courier.v1.Courier.GetNotificationRequest, courier.v1.Courier.GetNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.GetNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.GetNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CourierServiceMethodDescriptorSupplier("GetNotification"))
              .build();
        }
      }
    }
    return getGetNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Courier.RetryDeliveryRequest,
      courier.v1.Courier.RetryDeliveryResponse> getRetryDeliveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetryDelivery",
      requestType = courier.v1.Courier.RetryDeliveryRequest.class,
      responseType = courier.v1.Courier.RetryDeliveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Courier.RetryDeliveryRequest,
      courier.v1.Courier.RetryDeliveryResponse> getRetryDeliveryMethod() {
    io.grpc.MethodDescriptor<courier.v1.Courier.RetryDeliveryRequest, courier.v1.Courier.RetryDeliveryResponse> getRetryDeliveryMethod;
    if ((getRetryDeliveryMethod = CourierServiceGrpc.getRetryDeliveryMethod) == null) {
      synchronized (CourierServiceGrpc.class) {
        if ((getRetryDeliveryMethod = CourierServiceGrpc.getRetryDeliveryMethod) == null) {
          CourierServiceGrpc.getRetryDeliveryMethod = getRetryDeliveryMethod =
              io.grpc.MethodDescriptor.<courier.v1.Courier.RetryDeliveryRequest, courier.v1.Courier.RetryDeliveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetryDelivery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.RetryDeliveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Courier.RetryDeliveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CourierServiceMethodDescriptorSupplier("RetryDelivery"))
              .build();
        }
      }
    }
    return getRetryDeliveryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CourierServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourierServiceStub>() {
        @java.lang.Override
        public CourierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourierServiceStub(channel, callOptions);
        }
      };
    return CourierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CourierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourierServiceBlockingStub>() {
        @java.lang.Override
        public CourierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourierServiceBlockingStub(channel, callOptions);
        }
      };
    return CourierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CourierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourierServiceFutureStub>() {
        @java.lang.Override
        public CourierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourierServiceFutureStub(channel, callOptions);
        }
      };
    return CourierServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CourierService is for services (Kubernetes ServiceAccount token, or a token holding the permission).
   * The inbox of a user is InboxService.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void sendNotification(courier.v1.Courier.SendNotificationRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.SendNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify sends an event of the catalog (courier/internal/catalog) to users and/or raw addresses.
     * Courier picks the channels, addresses and locale; the caller only says what happened and to whom.
     * </pre>
     */
    default void notify(courier.v1.Courier.NotifyRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.NotifyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNotification returns the state of every delivery of a notification (the audit trail).
     * </pre>
     */
    default void getNotification(courier.v1.Courier.GetNotificationRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.GetNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * RetryDelivery puts a failed or dead delivery back in the queue (resets its attempts).
     * </pre>
     */
    default void retryDelivery(courier.v1.Courier.RetryDeliveryRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.RetryDeliveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetryDeliveryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CourierService.
   * <pre>
   * CourierService is for services (Kubernetes ServiceAccount token, or a token holding the permission).
   * The inbox of a user is InboxService.
   * </pre>
   */
  public static abstract class CourierServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CourierServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CourierService.
   * <pre>
   * CourierService is for services (Kubernetes ServiceAccount token, or a token holding the permission).
   * The inbox of a user is InboxService.
   * </pre>
   */
  public static final class CourierServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CourierServiceStub> {
    private CourierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourierServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendNotification(courier.v1.Courier.SendNotificationRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.SendNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify sends an event of the catalog (courier/internal/catalog) to users and/or raw addresses.
     * Courier picks the channels, addresses and locale; the caller only says what happened and to whom.
     * </pre>
     */
    public void notify(courier.v1.Courier.NotifyRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.NotifyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNotification returns the state of every delivery of a notification (the audit trail).
     * </pre>
     */
    public void getNotification(courier.v1.Courier.GetNotificationRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.GetNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RetryDelivery puts a failed or dead delivery back in the queue (resets its attempts).
     * </pre>
     */
    public void retryDelivery(courier.v1.Courier.RetryDeliveryRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.RetryDeliveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetryDeliveryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CourierService.
   * <pre>
   * CourierService is for services (Kubernetes ServiceAccount token, or a token holding the permission).
   * The inbox of a user is InboxService.
   * </pre>
   */
  public static final class CourierServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CourierServiceBlockingStub> {
    private CourierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public courier.v1.Courier.SendNotificationResponse sendNotification(courier.v1.Courier.SendNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify sends an event of the catalog (courier/internal/catalog) to users and/or raw addresses.
     * Courier picks the channels, addresses and locale; the caller only says what happened and to whom.
     * </pre>
     */
    public courier.v1.Courier.NotifyResponse notify(courier.v1.Courier.NotifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNotification returns the state of every delivery of a notification (the audit trail).
     * </pre>
     */
    public courier.v1.Courier.GetNotificationResponse getNotification(courier.v1.Courier.GetNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RetryDelivery puts a failed or dead delivery back in the queue (resets its attempts).
     * </pre>
     */
    public courier.v1.Courier.RetryDeliveryResponse retryDelivery(courier.v1.Courier.RetryDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetryDeliveryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CourierService.
   * <pre>
   * CourierService is for services (Kubernetes ServiceAccount token, or a token holding the permission).
   * The inbox of a user is InboxService.
   * </pre>
   */
  public static final class CourierServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CourierServiceFutureStub> {
    private CourierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Courier.SendNotificationResponse> sendNotification(
        courier.v1.Courier.SendNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify sends an event of the catalog (courier/internal/catalog) to users and/or raw addresses.
     * Courier picks the channels, addresses and locale; the caller only says what happened and to whom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Courier.NotifyResponse> notify(
        courier.v1.Courier.NotifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNotification returns the state of every delivery of a notification (the audit trail).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Courier.GetNotificationResponse> getNotification(
        courier.v1.Courier.GetNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RetryDelivery puts a failed or dead delivery back in the queue (resets its attempts).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Courier.RetryDeliveryResponse> retryDelivery(
        courier.v1.Courier.RetryDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetryDeliveryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_NOTIFICATION = 0;
  private static final int METHODID_NOTIFY = 1;
  private static final int METHODID_GET_NOTIFICATION = 2;
  private static final int METHODID_RETRY_DELIVERY = 3;

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
        case METHODID_SEND_NOTIFICATION:
          serviceImpl.sendNotification((courier.v1.Courier.SendNotificationRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Courier.SendNotificationResponse>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((courier.v1.Courier.NotifyRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Courier.NotifyResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION:
          serviceImpl.getNotification((courier.v1.Courier.GetNotificationRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Courier.GetNotificationResponse>) responseObserver);
          break;
        case METHODID_RETRY_DELIVERY:
          serviceImpl.retryDelivery((courier.v1.Courier.RetryDeliveryRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Courier.RetryDeliveryResponse>) responseObserver);
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
          getSendNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Courier.SendNotificationRequest,
              courier.v1.Courier.SendNotificationResponse>(
                service, METHODID_SEND_NOTIFICATION)))
        .addMethod(
          getNotifyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Courier.NotifyRequest,
              courier.v1.Courier.NotifyResponse>(
                service, METHODID_NOTIFY)))
        .addMethod(
          getGetNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Courier.GetNotificationRequest,
              courier.v1.Courier.GetNotificationResponse>(
                service, METHODID_GET_NOTIFICATION)))
        .addMethod(
          getRetryDeliveryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Courier.RetryDeliveryRequest,
              courier.v1.Courier.RetryDeliveryResponse>(
                service, METHODID_RETRY_DELIVERY)))
        .build();
  }

  private static abstract class CourierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CourierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return courier.v1.Courier.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CourierService");
    }
  }

  private static final class CourierServiceFileDescriptorSupplier
      extends CourierServiceBaseDescriptorSupplier {
    CourierServiceFileDescriptorSupplier() {}
  }

  private static final class CourierServiceMethodDescriptorSupplier
      extends CourierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CourierServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CourierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CourierServiceFileDescriptorSupplier())
              .addMethod(getSendNotificationMethod())
              .addMethod(getNotifyMethod())
              .addMethod(getGetNotificationMethod())
              .addMethod(getRetryDeliveryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
