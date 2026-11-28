package courier.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * PreferencesService is what the signed-in user chooses about their notifications: which categories reach them on
 * which channel, quiet hours, and the Telegram chat. The user is the subject of the token, never a field of a
 * request. Security events (mandatory categories) cannot be turned off.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: courier/v1/preferences.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PreferencesServiceGrpc {

  private PreferencesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "courier.v1.PreferencesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<courier.v1.Preferences.GetPreferencesRequest,
      courier.v1.Preferences.GetPreferencesResponse> getGetPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPreferences",
      requestType = courier.v1.Preferences.GetPreferencesRequest.class,
      responseType = courier.v1.Preferences.GetPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Preferences.GetPreferencesRequest,
      courier.v1.Preferences.GetPreferencesResponse> getGetPreferencesMethod() {
    io.grpc.MethodDescriptor<courier.v1.Preferences.GetPreferencesRequest, courier.v1.Preferences.GetPreferencesResponse> getGetPreferencesMethod;
    if ((getGetPreferencesMethod = PreferencesServiceGrpc.getGetPreferencesMethod) == null) {
      synchronized (PreferencesServiceGrpc.class) {
        if ((getGetPreferencesMethod = PreferencesServiceGrpc.getGetPreferencesMethod) == null) {
          PreferencesServiceGrpc.getGetPreferencesMethod = getGetPreferencesMethod =
              io.grpc.MethodDescriptor.<courier.v1.Preferences.GetPreferencesRequest, courier.v1.Preferences.GetPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.GetPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.GetPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreferencesServiceMethodDescriptorSupplier("GetPreferences"))
              .build();
        }
      }
    }
    return getGetPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Preferences.SetPreferencesRequest,
      courier.v1.Preferences.SetPreferencesResponse> getSetPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPreferences",
      requestType = courier.v1.Preferences.SetPreferencesRequest.class,
      responseType = courier.v1.Preferences.SetPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Preferences.SetPreferencesRequest,
      courier.v1.Preferences.SetPreferencesResponse> getSetPreferencesMethod() {
    io.grpc.MethodDescriptor<courier.v1.Preferences.SetPreferencesRequest, courier.v1.Preferences.SetPreferencesResponse> getSetPreferencesMethod;
    if ((getSetPreferencesMethod = PreferencesServiceGrpc.getSetPreferencesMethod) == null) {
      synchronized (PreferencesServiceGrpc.class) {
        if ((getSetPreferencesMethod = PreferencesServiceGrpc.getSetPreferencesMethod) == null) {
          PreferencesServiceGrpc.getSetPreferencesMethod = getSetPreferencesMethod =
              io.grpc.MethodDescriptor.<courier.v1.Preferences.SetPreferencesRequest, courier.v1.Preferences.SetPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.SetPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.SetPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreferencesServiceMethodDescriptorSupplier("SetPreferences"))
              .build();
        }
      }
    }
    return getSetPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Preferences.StartTelegramBindingRequest,
      courier.v1.Preferences.StartTelegramBindingResponse> getStartTelegramBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartTelegramBinding",
      requestType = courier.v1.Preferences.StartTelegramBindingRequest.class,
      responseType = courier.v1.Preferences.StartTelegramBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Preferences.StartTelegramBindingRequest,
      courier.v1.Preferences.StartTelegramBindingResponse> getStartTelegramBindingMethod() {
    io.grpc.MethodDescriptor<courier.v1.Preferences.StartTelegramBindingRequest, courier.v1.Preferences.StartTelegramBindingResponse> getStartTelegramBindingMethod;
    if ((getStartTelegramBindingMethod = PreferencesServiceGrpc.getStartTelegramBindingMethod) == null) {
      synchronized (PreferencesServiceGrpc.class) {
        if ((getStartTelegramBindingMethod = PreferencesServiceGrpc.getStartTelegramBindingMethod) == null) {
          PreferencesServiceGrpc.getStartTelegramBindingMethod = getStartTelegramBindingMethod =
              io.grpc.MethodDescriptor.<courier.v1.Preferences.StartTelegramBindingRequest, courier.v1.Preferences.StartTelegramBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartTelegramBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.StartTelegramBindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.StartTelegramBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreferencesServiceMethodDescriptorSupplier("StartTelegramBinding"))
              .build();
        }
      }
    }
    return getStartTelegramBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Preferences.UnbindTelegramRequest,
      courier.v1.Preferences.UnbindTelegramResponse> getUnbindTelegramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindTelegram",
      requestType = courier.v1.Preferences.UnbindTelegramRequest.class,
      responseType = courier.v1.Preferences.UnbindTelegramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Preferences.UnbindTelegramRequest,
      courier.v1.Preferences.UnbindTelegramResponse> getUnbindTelegramMethod() {
    io.grpc.MethodDescriptor<courier.v1.Preferences.UnbindTelegramRequest, courier.v1.Preferences.UnbindTelegramResponse> getUnbindTelegramMethod;
    if ((getUnbindTelegramMethod = PreferencesServiceGrpc.getUnbindTelegramMethod) == null) {
      synchronized (PreferencesServiceGrpc.class) {
        if ((getUnbindTelegramMethod = PreferencesServiceGrpc.getUnbindTelegramMethod) == null) {
          PreferencesServiceGrpc.getUnbindTelegramMethod = getUnbindTelegramMethod =
              io.grpc.MethodDescriptor.<courier.v1.Preferences.UnbindTelegramRequest, courier.v1.Preferences.UnbindTelegramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindTelegram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.UnbindTelegramRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.UnbindTelegramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreferencesServiceMethodDescriptorSupplier("UnbindTelegram"))
              .build();
        }
      }
    }
    return getUnbindTelegramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Preferences.SubscribePushRequest,
      courier.v1.Preferences.SubscribePushResponse> getSubscribePushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribePush",
      requestType = courier.v1.Preferences.SubscribePushRequest.class,
      responseType = courier.v1.Preferences.SubscribePushResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Preferences.SubscribePushRequest,
      courier.v1.Preferences.SubscribePushResponse> getSubscribePushMethod() {
    io.grpc.MethodDescriptor<courier.v1.Preferences.SubscribePushRequest, courier.v1.Preferences.SubscribePushResponse> getSubscribePushMethod;
    if ((getSubscribePushMethod = PreferencesServiceGrpc.getSubscribePushMethod) == null) {
      synchronized (PreferencesServiceGrpc.class) {
        if ((getSubscribePushMethod = PreferencesServiceGrpc.getSubscribePushMethod) == null) {
          PreferencesServiceGrpc.getSubscribePushMethod = getSubscribePushMethod =
              io.grpc.MethodDescriptor.<courier.v1.Preferences.SubscribePushRequest, courier.v1.Preferences.SubscribePushResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribePush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.SubscribePushRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.SubscribePushResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreferencesServiceMethodDescriptorSupplier("SubscribePush"))
              .build();
        }
      }
    }
    return getSubscribePushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Preferences.UnsubscribePushRequest,
      courier.v1.Preferences.UnsubscribePushResponse> getUnsubscribePushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsubscribePush",
      requestType = courier.v1.Preferences.UnsubscribePushRequest.class,
      responseType = courier.v1.Preferences.UnsubscribePushResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Preferences.UnsubscribePushRequest,
      courier.v1.Preferences.UnsubscribePushResponse> getUnsubscribePushMethod() {
    io.grpc.MethodDescriptor<courier.v1.Preferences.UnsubscribePushRequest, courier.v1.Preferences.UnsubscribePushResponse> getUnsubscribePushMethod;
    if ((getUnsubscribePushMethod = PreferencesServiceGrpc.getUnsubscribePushMethod) == null) {
      synchronized (PreferencesServiceGrpc.class) {
        if ((getUnsubscribePushMethod = PreferencesServiceGrpc.getUnsubscribePushMethod) == null) {
          PreferencesServiceGrpc.getUnsubscribePushMethod = getUnsubscribePushMethod =
              io.grpc.MethodDescriptor.<courier.v1.Preferences.UnsubscribePushRequest, courier.v1.Preferences.UnsubscribePushResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsubscribePush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.UnsubscribePushRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Preferences.UnsubscribePushResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PreferencesServiceMethodDescriptorSupplier("UnsubscribePush"))
              .build();
        }
      }
    }
    return getUnsubscribePushMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PreferencesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PreferencesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PreferencesServiceStub>() {
        @java.lang.Override
        public PreferencesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PreferencesServiceStub(channel, callOptions);
        }
      };
    return PreferencesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PreferencesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PreferencesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PreferencesServiceBlockingStub>() {
        @java.lang.Override
        public PreferencesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PreferencesServiceBlockingStub(channel, callOptions);
        }
      };
    return PreferencesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PreferencesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PreferencesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PreferencesServiceFutureStub>() {
        @java.lang.Override
        public PreferencesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PreferencesServiceFutureStub(channel, callOptions);
        }
      };
    return PreferencesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PreferencesService is what the signed-in user chooses about their notifications: which categories reach them on
   * which channel, quiet hours, and the Telegram chat. The user is the subject of the token, never a field of a
   * request. Security events (mandatory categories) cannot be turned off.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getPreferences(courier.v1.Preferences.GetPreferencesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.GetPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPreferences replaces the choices of the given categories and the quiet hours. A mandatory category is
     * ignored (it stays on).
     * </pre>
     */
    default void setPreferences(courier.v1.Preferences.SetPreferencesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.SetPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartTelegramBinding returns a one-time code (valid 15 minutes) and the link that opens the bot with it: the
     * bot links the chat when it receives `/start &lt;code&gt;`.
     * </pre>
     */
    default void startTelegramBinding(courier.v1.Preferences.StartTelegramBindingRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.StartTelegramBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartTelegramBindingMethod(), responseObserver);
    }

    /**
     */
    default void unbindTelegram(courier.v1.Preferences.UnbindTelegramRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.UnbindTelegramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindTelegramMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubscribePush saves the push subscription of a browser (what PushManager.subscribe returned). The same endpoint
     * again updates it, and moves it to the signed-in user.
     * </pre>
     */
    default void subscribePush(courier.v1.Preferences.SubscribePushRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.SubscribePushResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribePushMethod(), responseObserver);
    }

    /**
     */
    default void unsubscribePush(courier.v1.Preferences.UnsubscribePushRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.UnsubscribePushResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribePushMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PreferencesService.
   * <pre>
   * PreferencesService is what the signed-in user chooses about their notifications: which categories reach them on
   * which channel, quiet hours, and the Telegram chat. The user is the subject of the token, never a field of a
   * request. Security events (mandatory categories) cannot be turned off.
   * </pre>
   */
  public static abstract class PreferencesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PreferencesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PreferencesService.
   * <pre>
   * PreferencesService is what the signed-in user chooses about their notifications: which categories reach them on
   * which channel, quiet hours, and the Telegram chat. The user is the subject of the token, never a field of a
   * request. Security events (mandatory categories) cannot be turned off.
   * </pre>
   */
  public static final class PreferencesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PreferencesServiceStub> {
    private PreferencesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreferencesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PreferencesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPreferences(courier.v1.Preferences.GetPreferencesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.GetPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPreferences replaces the choices of the given categories and the quiet hours. A mandatory category is
     * ignored (it stays on).
     * </pre>
     */
    public void setPreferences(courier.v1.Preferences.SetPreferencesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.SetPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartTelegramBinding returns a one-time code (valid 15 minutes) and the link that opens the bot with it: the
     * bot links the chat when it receives `/start &lt;code&gt;`.
     * </pre>
     */
    public void startTelegramBinding(courier.v1.Preferences.StartTelegramBindingRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.StartTelegramBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartTelegramBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unbindTelegram(courier.v1.Preferences.UnbindTelegramRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.UnbindTelegramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindTelegramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubscribePush saves the push subscription of a browser (what PushManager.subscribe returned). The same endpoint
     * again updates it, and moves it to the signed-in user.
     * </pre>
     */
    public void subscribePush(courier.v1.Preferences.SubscribePushRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.SubscribePushResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribePushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unsubscribePush(courier.v1.Preferences.UnsubscribePushRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Preferences.UnsubscribePushResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribePushMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PreferencesService.
   * <pre>
   * PreferencesService is what the signed-in user chooses about their notifications: which categories reach them on
   * which channel, quiet hours, and the Telegram chat. The user is the subject of the token, never a field of a
   * request. Security events (mandatory categories) cannot be turned off.
   * </pre>
   */
  public static final class PreferencesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PreferencesServiceBlockingStub> {
    private PreferencesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreferencesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PreferencesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public courier.v1.Preferences.GetPreferencesResponse getPreferences(courier.v1.Preferences.GetPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPreferences replaces the choices of the given categories and the quiet hours. A mandatory category is
     * ignored (it stays on).
     * </pre>
     */
    public courier.v1.Preferences.SetPreferencesResponse setPreferences(courier.v1.Preferences.SetPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartTelegramBinding returns a one-time code (valid 15 minutes) and the link that opens the bot with it: the
     * bot links the chat when it receives `/start &lt;code&gt;`.
     * </pre>
     */
    public courier.v1.Preferences.StartTelegramBindingResponse startTelegramBinding(courier.v1.Preferences.StartTelegramBindingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartTelegramBindingMethod(), getCallOptions(), request);
    }

    /**
     */
    public courier.v1.Preferences.UnbindTelegramResponse unbindTelegram(courier.v1.Preferences.UnbindTelegramRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindTelegramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubscribePush saves the push subscription of a browser (what PushManager.subscribe returned). The same endpoint
     * again updates it, and moves it to the signed-in user.
     * </pre>
     */
    public courier.v1.Preferences.SubscribePushResponse subscribePush(courier.v1.Preferences.SubscribePushRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribePushMethod(), getCallOptions(), request);
    }

    /**
     */
    public courier.v1.Preferences.UnsubscribePushResponse unsubscribePush(courier.v1.Preferences.UnsubscribePushRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribePushMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PreferencesService.
   * <pre>
   * PreferencesService is what the signed-in user chooses about their notifications: which categories reach them on
   * which channel, quiet hours, and the Telegram chat. The user is the subject of the token, never a field of a
   * request. Security events (mandatory categories) cannot be turned off.
   * </pre>
   */
  public static final class PreferencesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PreferencesServiceFutureStub> {
    private PreferencesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreferencesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PreferencesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Preferences.GetPreferencesResponse> getPreferences(
        courier.v1.Preferences.GetPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPreferences replaces the choices of the given categories and the quiet hours. A mandatory category is
     * ignored (it stays on).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Preferences.SetPreferencesResponse> setPreferences(
        courier.v1.Preferences.SetPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartTelegramBinding returns a one-time code (valid 15 minutes) and the link that opens the bot with it: the
     * bot links the chat when it receives `/start &lt;code&gt;`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Preferences.StartTelegramBindingResponse> startTelegramBinding(
        courier.v1.Preferences.StartTelegramBindingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartTelegramBindingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Preferences.UnbindTelegramResponse> unbindTelegram(
        courier.v1.Preferences.UnbindTelegramRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindTelegramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubscribePush saves the push subscription of a browser (what PushManager.subscribe returned). The same endpoint
     * again updates it, and moves it to the signed-in user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Preferences.SubscribePushResponse> subscribePush(
        courier.v1.Preferences.SubscribePushRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribePushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Preferences.UnsubscribePushResponse> unsubscribePush(
        courier.v1.Preferences.UnsubscribePushRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribePushMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PREFERENCES = 0;
  private static final int METHODID_SET_PREFERENCES = 1;
  private static final int METHODID_START_TELEGRAM_BINDING = 2;
  private static final int METHODID_UNBIND_TELEGRAM = 3;
  private static final int METHODID_SUBSCRIBE_PUSH = 4;
  private static final int METHODID_UNSUBSCRIBE_PUSH = 5;

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
        case METHODID_GET_PREFERENCES:
          serviceImpl.getPreferences((courier.v1.Preferences.GetPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Preferences.GetPreferencesResponse>) responseObserver);
          break;
        case METHODID_SET_PREFERENCES:
          serviceImpl.setPreferences((courier.v1.Preferences.SetPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Preferences.SetPreferencesResponse>) responseObserver);
          break;
        case METHODID_START_TELEGRAM_BINDING:
          serviceImpl.startTelegramBinding((courier.v1.Preferences.StartTelegramBindingRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Preferences.StartTelegramBindingResponse>) responseObserver);
          break;
        case METHODID_UNBIND_TELEGRAM:
          serviceImpl.unbindTelegram((courier.v1.Preferences.UnbindTelegramRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Preferences.UnbindTelegramResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_PUSH:
          serviceImpl.subscribePush((courier.v1.Preferences.SubscribePushRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Preferences.SubscribePushResponse>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE_PUSH:
          serviceImpl.unsubscribePush((courier.v1.Preferences.UnsubscribePushRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Preferences.UnsubscribePushResponse>) responseObserver);
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
          getGetPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Preferences.GetPreferencesRequest,
              courier.v1.Preferences.GetPreferencesResponse>(
                service, METHODID_GET_PREFERENCES)))
        .addMethod(
          getSetPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Preferences.SetPreferencesRequest,
              courier.v1.Preferences.SetPreferencesResponse>(
                service, METHODID_SET_PREFERENCES)))
        .addMethod(
          getStartTelegramBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Preferences.StartTelegramBindingRequest,
              courier.v1.Preferences.StartTelegramBindingResponse>(
                service, METHODID_START_TELEGRAM_BINDING)))
        .addMethod(
          getUnbindTelegramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Preferences.UnbindTelegramRequest,
              courier.v1.Preferences.UnbindTelegramResponse>(
                service, METHODID_UNBIND_TELEGRAM)))
        .addMethod(
          getSubscribePushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Preferences.SubscribePushRequest,
              courier.v1.Preferences.SubscribePushResponse>(
                service, METHODID_SUBSCRIBE_PUSH)))
        .addMethod(
          getUnsubscribePushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Preferences.UnsubscribePushRequest,
              courier.v1.Preferences.UnsubscribePushResponse>(
                service, METHODID_UNSUBSCRIBE_PUSH)))
        .build();
  }

  private static abstract class PreferencesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PreferencesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return courier.v1.Preferences.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PreferencesService");
    }
  }

  private static final class PreferencesServiceFileDescriptorSupplier
      extends PreferencesServiceBaseDescriptorSupplier {
    PreferencesServiceFileDescriptorSupplier() {}
  }

  private static final class PreferencesServiceMethodDescriptorSupplier
      extends PreferencesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PreferencesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PreferencesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PreferencesServiceFileDescriptorSupplier())
              .addMethod(getGetPreferencesMethod())
              .addMethod(getSetPreferencesMethod())
              .addMethod(getStartTelegramBindingMethod())
              .addMethod(getUnbindTelegramMethod())
              .addMethod(getSubscribePushMethod())
              .addMethod(getUnsubscribePushMethod())
              .build();
        }
      }
    }
    return result;
  }
}
