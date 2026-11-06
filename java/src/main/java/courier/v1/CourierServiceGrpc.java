package courier.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
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
   */
  public interface AsyncService {

    /**
     */
    default void sendNotification(courier.v1.Courier.SendNotificationRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Courier.SendNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNotificationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CourierService.
   */
  public static abstract class CourierServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CourierServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CourierService.
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
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CourierService.
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
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CourierService.
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
  }

  private static final int METHODID_SEND_NOTIFICATION = 0;

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
              .build();
        }
      }
    }
    return result;
  }
}
