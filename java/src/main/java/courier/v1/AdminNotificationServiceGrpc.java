package courier.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AdminNotificationService is for the administrators (the admin app): the event types and their templates, the
 * announcements, and the delivery log. Every method needs a permission, see its comment.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: courier/v1/admin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdminNotificationServiceGrpc {

  private AdminNotificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "courier.v1.AdminNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.ListEventTypesRequest,
      courier.v1.Admin.ListEventTypesResponse> getListEventTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEventTypes",
      requestType = courier.v1.Admin.ListEventTypesRequest.class,
      responseType = courier.v1.Admin.ListEventTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.ListEventTypesRequest,
      courier.v1.Admin.ListEventTypesResponse> getListEventTypesMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.ListEventTypesRequest, courier.v1.Admin.ListEventTypesResponse> getListEventTypesMethod;
    if ((getListEventTypesMethod = AdminNotificationServiceGrpc.getListEventTypesMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getListEventTypesMethod = AdminNotificationServiceGrpc.getListEventTypesMethod) == null) {
          AdminNotificationServiceGrpc.getListEventTypesMethod = getListEventTypesMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.ListEventTypesRequest, courier.v1.Admin.ListEventTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEventTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListEventTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListEventTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("ListEventTypes"))
              .build();
        }
      }
    }
    return getListEventTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.GetTemplateRequest,
      courier.v1.Admin.GetTemplateResponse> getGetTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemplate",
      requestType = courier.v1.Admin.GetTemplateRequest.class,
      responseType = courier.v1.Admin.GetTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.GetTemplateRequest,
      courier.v1.Admin.GetTemplateResponse> getGetTemplateMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.GetTemplateRequest, courier.v1.Admin.GetTemplateResponse> getGetTemplateMethod;
    if ((getGetTemplateMethod = AdminNotificationServiceGrpc.getGetTemplateMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getGetTemplateMethod = AdminNotificationServiceGrpc.getGetTemplateMethod) == null) {
          AdminNotificationServiceGrpc.getGetTemplateMethod = getGetTemplateMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.GetTemplateRequest, courier.v1.Admin.GetTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.GetTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.GetTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("GetTemplate"))
              .build();
        }
      }
    }
    return getGetTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.PreviewTemplateRequest,
      courier.v1.Admin.PreviewTemplateResponse> getPreviewTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewTemplate",
      requestType = courier.v1.Admin.PreviewTemplateRequest.class,
      responseType = courier.v1.Admin.PreviewTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.PreviewTemplateRequest,
      courier.v1.Admin.PreviewTemplateResponse> getPreviewTemplateMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.PreviewTemplateRequest, courier.v1.Admin.PreviewTemplateResponse> getPreviewTemplateMethod;
    if ((getPreviewTemplateMethod = AdminNotificationServiceGrpc.getPreviewTemplateMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getPreviewTemplateMethod = AdminNotificationServiceGrpc.getPreviewTemplateMethod) == null) {
          AdminNotificationServiceGrpc.getPreviewTemplateMethod = getPreviewTemplateMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.PreviewTemplateRequest, courier.v1.Admin.PreviewTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreviewTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.PreviewTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.PreviewTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("PreviewTemplate"))
              .build();
        }
      }
    }
    return getPreviewTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.ListTemplateVersionsRequest,
      courier.v1.Admin.ListTemplateVersionsResponse> getListTemplateVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTemplateVersions",
      requestType = courier.v1.Admin.ListTemplateVersionsRequest.class,
      responseType = courier.v1.Admin.ListTemplateVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.ListTemplateVersionsRequest,
      courier.v1.Admin.ListTemplateVersionsResponse> getListTemplateVersionsMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.ListTemplateVersionsRequest, courier.v1.Admin.ListTemplateVersionsResponse> getListTemplateVersionsMethod;
    if ((getListTemplateVersionsMethod = AdminNotificationServiceGrpc.getListTemplateVersionsMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getListTemplateVersionsMethod = AdminNotificationServiceGrpc.getListTemplateVersionsMethod) == null) {
          AdminNotificationServiceGrpc.getListTemplateVersionsMethod = getListTemplateVersionsMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.ListTemplateVersionsRequest, courier.v1.Admin.ListTemplateVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTemplateVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListTemplateVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListTemplateVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("ListTemplateVersions"))
              .build();
        }
      }
    }
    return getListTemplateVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.SaveTemplateRequest,
      courier.v1.Admin.SaveTemplateResponse> getSaveTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveTemplate",
      requestType = courier.v1.Admin.SaveTemplateRequest.class,
      responseType = courier.v1.Admin.SaveTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.SaveTemplateRequest,
      courier.v1.Admin.SaveTemplateResponse> getSaveTemplateMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.SaveTemplateRequest, courier.v1.Admin.SaveTemplateResponse> getSaveTemplateMethod;
    if ((getSaveTemplateMethod = AdminNotificationServiceGrpc.getSaveTemplateMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getSaveTemplateMethod = AdminNotificationServiceGrpc.getSaveTemplateMethod) == null) {
          AdminNotificationServiceGrpc.getSaveTemplateMethod = getSaveTemplateMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.SaveTemplateRequest, courier.v1.Admin.SaveTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.SaveTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.SaveTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("SaveTemplate"))
              .build();
        }
      }
    }
    return getSaveTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.RevertTemplateRequest,
      courier.v1.Admin.RevertTemplateResponse> getRevertTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevertTemplate",
      requestType = courier.v1.Admin.RevertTemplateRequest.class,
      responseType = courier.v1.Admin.RevertTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.RevertTemplateRequest,
      courier.v1.Admin.RevertTemplateResponse> getRevertTemplateMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.RevertTemplateRequest, courier.v1.Admin.RevertTemplateResponse> getRevertTemplateMethod;
    if ((getRevertTemplateMethod = AdminNotificationServiceGrpc.getRevertTemplateMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getRevertTemplateMethod = AdminNotificationServiceGrpc.getRevertTemplateMethod) == null) {
          AdminNotificationServiceGrpc.getRevertTemplateMethod = getRevertTemplateMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.RevertTemplateRequest, courier.v1.Admin.RevertTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevertTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.RevertTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.RevertTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("RevertTemplate"))
              .build();
        }
      }
    }
    return getRevertTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.CreateBroadcastRequest,
      courier.v1.Admin.CreateBroadcastResponse> getCreateBroadcastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBroadcast",
      requestType = courier.v1.Admin.CreateBroadcastRequest.class,
      responseType = courier.v1.Admin.CreateBroadcastResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.CreateBroadcastRequest,
      courier.v1.Admin.CreateBroadcastResponse> getCreateBroadcastMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.CreateBroadcastRequest, courier.v1.Admin.CreateBroadcastResponse> getCreateBroadcastMethod;
    if ((getCreateBroadcastMethod = AdminNotificationServiceGrpc.getCreateBroadcastMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getCreateBroadcastMethod = AdminNotificationServiceGrpc.getCreateBroadcastMethod) == null) {
          AdminNotificationServiceGrpc.getCreateBroadcastMethod = getCreateBroadcastMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.CreateBroadcastRequest, courier.v1.Admin.CreateBroadcastResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBroadcast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.CreateBroadcastRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.CreateBroadcastResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("CreateBroadcast"))
              .build();
        }
      }
    }
    return getCreateBroadcastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.ListBroadcastsRequest,
      courier.v1.Admin.ListBroadcastsResponse> getListBroadcastsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBroadcasts",
      requestType = courier.v1.Admin.ListBroadcastsRequest.class,
      responseType = courier.v1.Admin.ListBroadcastsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.ListBroadcastsRequest,
      courier.v1.Admin.ListBroadcastsResponse> getListBroadcastsMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.ListBroadcastsRequest, courier.v1.Admin.ListBroadcastsResponse> getListBroadcastsMethod;
    if ((getListBroadcastsMethod = AdminNotificationServiceGrpc.getListBroadcastsMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getListBroadcastsMethod = AdminNotificationServiceGrpc.getListBroadcastsMethod) == null) {
          AdminNotificationServiceGrpc.getListBroadcastsMethod = getListBroadcastsMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.ListBroadcastsRequest, courier.v1.Admin.ListBroadcastsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBroadcasts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListBroadcastsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListBroadcastsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("ListBroadcasts"))
              .build();
        }
      }
    }
    return getListBroadcastsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.ListWebhooksRequest,
      courier.v1.Admin.ListWebhooksResponse> getListWebhooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWebhooks",
      requestType = courier.v1.Admin.ListWebhooksRequest.class,
      responseType = courier.v1.Admin.ListWebhooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.ListWebhooksRequest,
      courier.v1.Admin.ListWebhooksResponse> getListWebhooksMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.ListWebhooksRequest, courier.v1.Admin.ListWebhooksResponse> getListWebhooksMethod;
    if ((getListWebhooksMethod = AdminNotificationServiceGrpc.getListWebhooksMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getListWebhooksMethod = AdminNotificationServiceGrpc.getListWebhooksMethod) == null) {
          AdminNotificationServiceGrpc.getListWebhooksMethod = getListWebhooksMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.ListWebhooksRequest, courier.v1.Admin.ListWebhooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWebhooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListWebhooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListWebhooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("ListWebhooks"))
              .build();
        }
      }
    }
    return getListWebhooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.SaveWebhookRequest,
      courier.v1.Admin.SaveWebhookResponse> getSaveWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveWebhook",
      requestType = courier.v1.Admin.SaveWebhookRequest.class,
      responseType = courier.v1.Admin.SaveWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.SaveWebhookRequest,
      courier.v1.Admin.SaveWebhookResponse> getSaveWebhookMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.SaveWebhookRequest, courier.v1.Admin.SaveWebhookResponse> getSaveWebhookMethod;
    if ((getSaveWebhookMethod = AdminNotificationServiceGrpc.getSaveWebhookMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getSaveWebhookMethod = AdminNotificationServiceGrpc.getSaveWebhookMethod) == null) {
          AdminNotificationServiceGrpc.getSaveWebhookMethod = getSaveWebhookMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.SaveWebhookRequest, courier.v1.Admin.SaveWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveWebhook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.SaveWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.SaveWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("SaveWebhook"))
              .build();
        }
      }
    }
    return getSaveWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.DeleteWebhookRequest,
      courier.v1.Admin.DeleteWebhookResponse> getDeleteWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWebhook",
      requestType = courier.v1.Admin.DeleteWebhookRequest.class,
      responseType = courier.v1.Admin.DeleteWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.DeleteWebhookRequest,
      courier.v1.Admin.DeleteWebhookResponse> getDeleteWebhookMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.DeleteWebhookRequest, courier.v1.Admin.DeleteWebhookResponse> getDeleteWebhookMethod;
    if ((getDeleteWebhookMethod = AdminNotificationServiceGrpc.getDeleteWebhookMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getDeleteWebhookMethod = AdminNotificationServiceGrpc.getDeleteWebhookMethod) == null) {
          AdminNotificationServiceGrpc.getDeleteWebhookMethod = getDeleteWebhookMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.DeleteWebhookRequest, courier.v1.Admin.DeleteWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWebhook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.DeleteWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.DeleteWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("DeleteWebhook"))
              .build();
        }
      }
    }
    return getDeleteWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.TestWebhookRequest,
      courier.v1.Admin.TestWebhookResponse> getTestWebhookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestWebhook",
      requestType = courier.v1.Admin.TestWebhookRequest.class,
      responseType = courier.v1.Admin.TestWebhookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.TestWebhookRequest,
      courier.v1.Admin.TestWebhookResponse> getTestWebhookMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.TestWebhookRequest, courier.v1.Admin.TestWebhookResponse> getTestWebhookMethod;
    if ((getTestWebhookMethod = AdminNotificationServiceGrpc.getTestWebhookMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getTestWebhookMethod = AdminNotificationServiceGrpc.getTestWebhookMethod) == null) {
          AdminNotificationServiceGrpc.getTestWebhookMethod = getTestWebhookMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.TestWebhookRequest, courier.v1.Admin.TestWebhookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestWebhook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.TestWebhookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.TestWebhookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("TestWebhook"))
              .build();
        }
      }
    }
    return getTestWebhookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<courier.v1.Admin.ListDeliveriesRequest,
      courier.v1.Admin.ListDeliveriesResponse> getListDeliveriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeliveries",
      requestType = courier.v1.Admin.ListDeliveriesRequest.class,
      responseType = courier.v1.Admin.ListDeliveriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<courier.v1.Admin.ListDeliveriesRequest,
      courier.v1.Admin.ListDeliveriesResponse> getListDeliveriesMethod() {
    io.grpc.MethodDescriptor<courier.v1.Admin.ListDeliveriesRequest, courier.v1.Admin.ListDeliveriesResponse> getListDeliveriesMethod;
    if ((getListDeliveriesMethod = AdminNotificationServiceGrpc.getListDeliveriesMethod) == null) {
      synchronized (AdminNotificationServiceGrpc.class) {
        if ((getListDeliveriesMethod = AdminNotificationServiceGrpc.getListDeliveriesMethod) == null) {
          AdminNotificationServiceGrpc.getListDeliveriesMethod = getListDeliveriesMethod =
              io.grpc.MethodDescriptor.<courier.v1.Admin.ListDeliveriesRequest, courier.v1.Admin.ListDeliveriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDeliveries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListDeliveriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  courier.v1.Admin.ListDeliveriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminNotificationServiceMethodDescriptorSupplier("ListDeliveries"))
              .build();
        }
      }
    }
    return getListDeliveriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminNotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminNotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminNotificationServiceStub>() {
        @java.lang.Override
        public AdminNotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminNotificationServiceStub(channel, callOptions);
        }
      };
    return AdminNotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminNotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminNotificationServiceBlockingStub>() {
        @java.lang.Override
        public AdminNotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminNotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return AdminNotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminNotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminNotificationServiceFutureStub>() {
        @java.lang.Override
        public AdminNotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminNotificationServiceFutureStub(channel, callOptions);
        }
      };
    return AdminNotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AdminNotificationService is for the administrators (the admin app): the event types and their templates, the
   * announcements, and the delivery log. Every method needs a permission, see its comment.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * The event types of the catalog and which templates are customized. Permission: courier:template:read.
     * </pre>
     */
    default void listEventTypes(courier.v1.Admin.ListEventTypesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListEventTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * The effective template of a channel and locale: the customized one, else the one built into courier (the
     * starting point of an edit). Permission: courier:template:read.
     * </pre>
     */
    default void getTemplate(courier.v1.Admin.GetTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.GetTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Renders a draft with sample data (or the given data) without saving it. Permission: courier:template:read.
     * </pre>
     */
    default void previewTemplate(courier.v1.Admin.PreviewTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.PreviewTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreviewTemplateMethod(), responseObserver);
    }

    /**
     */
    default void listTemplateVersions(courier.v1.Admin.ListTemplateVersionsRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListTemplateVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTemplateVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Saves a new version. The draft must render (INVALID_ARGUMENT, reason template_invalid, otherwise). The change
     * reaches the sending processes within half a minute. Permission: courier:template:write.
     * </pre>
     */
    default void saveTemplate(courier.v1.Admin.SaveTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.SaveTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Drops the customization: the built-in template is used again (the versions stay in the history).
     * </pre>
     */
    default void revertTemplate(courier.v1.Admin.RevertTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.RevertTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevertTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends an announcement. Permission: courier:broadcast:send.
     * </pre>
     */
    default void createBroadcast(courier.v1.Admin.CreateBroadcastRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.CreateBroadcastResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBroadcastMethod(), responseObserver);
    }

    /**
     */
    default void listBroadcasts(courier.v1.Admin.ListBroadcastsRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListBroadcastsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBroadcastsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Webhooks: endpoints that receive events (a Slack channel, or any service). Permission: courier:webhook:manage.
     * </pre>
     */
    default void listWebhooks(courier.v1.Admin.ListWebhooksRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListWebhooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWebhooksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a webhook (no id) or changes one. A new "generic" webhook gets a signing secret, returned once.
     * </pre>
     */
    default void saveWebhook(courier.v1.Admin.SaveWebhookRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.SaveWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveWebhookMethod(), responseObserver);
    }

    /**
     */
    default void deleteWebhook(courier.v1.Admin.DeleteWebhookRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.DeleteWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWebhookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends a test message now and reports what the endpoint answered.
     * </pre>
     */
    default void testWebhook(courier.v1.Admin.TestWebhookRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.TestWebhookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestWebhookMethod(), responseObserver);
    }

    /**
     * <pre>
     * The delivery log, newest first. Permission: courier:delivery:read.
     * </pre>
     */
    default void listDeliveries(courier.v1.Admin.ListDeliveriesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListDeliveriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDeliveriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdminNotificationService.
   * <pre>
   * AdminNotificationService is for the administrators (the admin app): the event types and their templates, the
   * announcements, and the delivery log. Every method needs a permission, see its comment.
   * </pre>
   */
  public static abstract class AdminNotificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdminNotificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdminNotificationService.
   * <pre>
   * AdminNotificationService is for the administrators (the admin app): the event types and their templates, the
   * announcements, and the delivery log. Every method needs a permission, see its comment.
   * </pre>
   */
  public static final class AdminNotificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdminNotificationServiceStub> {
    private AdminNotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminNotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminNotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * The event types of the catalog and which templates are customized. Permission: courier:template:read.
     * </pre>
     */
    public void listEventTypes(courier.v1.Admin.ListEventTypesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListEventTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEventTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The effective template of a channel and locale: the customized one, else the one built into courier (the
     * starting point of an edit). Permission: courier:template:read.
     * </pre>
     */
    public void getTemplate(courier.v1.Admin.GetTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.GetTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Renders a draft with sample data (or the given data) without saving it. Permission: courier:template:read.
     * </pre>
     */
    public void previewTemplate(courier.v1.Admin.PreviewTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.PreviewTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreviewTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTemplateVersions(courier.v1.Admin.ListTemplateVersionsRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListTemplateVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTemplateVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Saves a new version. The draft must render (INVALID_ARGUMENT, reason template_invalid, otherwise). The change
     * reaches the sending processes within half a minute. Permission: courier:template:write.
     * </pre>
     */
    public void saveTemplate(courier.v1.Admin.SaveTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.SaveTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Drops the customization: the built-in template is used again (the versions stay in the history).
     * </pre>
     */
    public void revertTemplate(courier.v1.Admin.RevertTemplateRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.RevertTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevertTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends an announcement. Permission: courier:broadcast:send.
     * </pre>
     */
    public void createBroadcast(courier.v1.Admin.CreateBroadcastRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.CreateBroadcastResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBroadcastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBroadcasts(courier.v1.Admin.ListBroadcastsRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListBroadcastsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBroadcastsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Webhooks: endpoints that receive events (a Slack channel, or any service). Permission: courier:webhook:manage.
     * </pre>
     */
    public void listWebhooks(courier.v1.Admin.ListWebhooksRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListWebhooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWebhooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a webhook (no id) or changes one. A new "generic" webhook gets a signing secret, returned once.
     * </pre>
     */
    public void saveWebhook(courier.v1.Admin.SaveWebhookRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.SaveWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWebhook(courier.v1.Admin.DeleteWebhookRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.DeleteWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a test message now and reports what the endpoint answered.
     * </pre>
     */
    public void testWebhook(courier.v1.Admin.TestWebhookRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.TestWebhookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestWebhookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The delivery log, newest first. Permission: courier:delivery:read.
     * </pre>
     */
    public void listDeliveries(courier.v1.Admin.ListDeliveriesRequest request,
        io.grpc.stub.StreamObserver<courier.v1.Admin.ListDeliveriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeliveriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdminNotificationService.
   * <pre>
   * AdminNotificationService is for the administrators (the admin app): the event types and their templates, the
   * announcements, and the delivery log. Every method needs a permission, see its comment.
   * </pre>
   */
  public static final class AdminNotificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdminNotificationServiceBlockingStub> {
    private AdminNotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminNotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * The event types of the catalog and which templates are customized. Permission: courier:template:read.
     * </pre>
     */
    public courier.v1.Admin.ListEventTypesResponse listEventTypes(courier.v1.Admin.ListEventTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEventTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The effective template of a channel and locale: the customized one, else the one built into courier (the
     * starting point of an edit). Permission: courier:template:read.
     * </pre>
     */
    public courier.v1.Admin.GetTemplateResponse getTemplate(courier.v1.Admin.GetTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Renders a draft with sample data (or the given data) without saving it. Permission: courier:template:read.
     * </pre>
     */
    public courier.v1.Admin.PreviewTemplateResponse previewTemplate(courier.v1.Admin.PreviewTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreviewTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public courier.v1.Admin.ListTemplateVersionsResponse listTemplateVersions(courier.v1.Admin.ListTemplateVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTemplateVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Saves a new version. The draft must render (INVALID_ARGUMENT, reason template_invalid, otherwise). The change
     * reaches the sending processes within half a minute. Permission: courier:template:write.
     * </pre>
     */
    public courier.v1.Admin.SaveTemplateResponse saveTemplate(courier.v1.Admin.SaveTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Drops the customization: the built-in template is used again (the versions stay in the history).
     * </pre>
     */
    public courier.v1.Admin.RevertTemplateResponse revertTemplate(courier.v1.Admin.RevertTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevertTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends an announcement. Permission: courier:broadcast:send.
     * </pre>
     */
    public courier.v1.Admin.CreateBroadcastResponse createBroadcast(courier.v1.Admin.CreateBroadcastRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBroadcastMethod(), getCallOptions(), request);
    }

    /**
     */
    public courier.v1.Admin.ListBroadcastsResponse listBroadcasts(courier.v1.Admin.ListBroadcastsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBroadcastsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Webhooks: endpoints that receive events (a Slack channel, or any service). Permission: courier:webhook:manage.
     * </pre>
     */
    public courier.v1.Admin.ListWebhooksResponse listWebhooks(courier.v1.Admin.ListWebhooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWebhooksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a webhook (no id) or changes one. A new "generic" webhook gets a signing secret, returned once.
     * </pre>
     */
    public courier.v1.Admin.SaveWebhookResponse saveWebhook(courier.v1.Admin.SaveWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveWebhookMethod(), getCallOptions(), request);
    }

    /**
     */
    public courier.v1.Admin.DeleteWebhookResponse deleteWebhook(courier.v1.Admin.DeleteWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWebhookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a test message now and reports what the endpoint answered.
     * </pre>
     */
    public courier.v1.Admin.TestWebhookResponse testWebhook(courier.v1.Admin.TestWebhookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestWebhookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The delivery log, newest first. Permission: courier:delivery:read.
     * </pre>
     */
    public courier.v1.Admin.ListDeliveriesResponse listDeliveries(courier.v1.Admin.ListDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeliveriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdminNotificationService.
   * <pre>
   * AdminNotificationService is for the administrators (the admin app): the event types and their templates, the
   * announcements, and the delivery log. Every method needs a permission, see its comment.
   * </pre>
   */
  public static final class AdminNotificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdminNotificationServiceFutureStub> {
    private AdminNotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminNotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * The event types of the catalog and which templates are customized. Permission: courier:template:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.ListEventTypesResponse> listEventTypes(
        courier.v1.Admin.ListEventTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEventTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The effective template of a channel and locale: the customized one, else the one built into courier (the
     * starting point of an edit). Permission: courier:template:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.GetTemplateResponse> getTemplate(
        courier.v1.Admin.GetTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Renders a draft with sample data (or the given data) without saving it. Permission: courier:template:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.PreviewTemplateResponse> previewTemplate(
        courier.v1.Admin.PreviewTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreviewTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.ListTemplateVersionsResponse> listTemplateVersions(
        courier.v1.Admin.ListTemplateVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTemplateVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Saves a new version. The draft must render (INVALID_ARGUMENT, reason template_invalid, otherwise). The change
     * reaches the sending processes within half a minute. Permission: courier:template:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.SaveTemplateResponse> saveTemplate(
        courier.v1.Admin.SaveTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Drops the customization: the built-in template is used again (the versions stay in the history).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.RevertTemplateResponse> revertTemplate(
        courier.v1.Admin.RevertTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevertTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends an announcement. Permission: courier:broadcast:send.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.CreateBroadcastResponse> createBroadcast(
        courier.v1.Admin.CreateBroadcastRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBroadcastMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.ListBroadcastsResponse> listBroadcasts(
        courier.v1.Admin.ListBroadcastsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBroadcastsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Webhooks: endpoints that receive events (a Slack channel, or any service). Permission: courier:webhook:manage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.ListWebhooksResponse> listWebhooks(
        courier.v1.Admin.ListWebhooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWebhooksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a webhook (no id) or changes one. A new "generic" webhook gets a signing secret, returned once.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.SaveWebhookResponse> saveWebhook(
        courier.v1.Admin.SaveWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveWebhookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.DeleteWebhookResponse> deleteWebhook(
        courier.v1.Admin.DeleteWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWebhookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends a test message now and reports what the endpoint answered.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.TestWebhookResponse> testWebhook(
        courier.v1.Admin.TestWebhookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestWebhookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The delivery log, newest first. Permission: courier:delivery:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<courier.v1.Admin.ListDeliveriesResponse> listDeliveries(
        courier.v1.Admin.ListDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeliveriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EVENT_TYPES = 0;
  private static final int METHODID_GET_TEMPLATE = 1;
  private static final int METHODID_PREVIEW_TEMPLATE = 2;
  private static final int METHODID_LIST_TEMPLATE_VERSIONS = 3;
  private static final int METHODID_SAVE_TEMPLATE = 4;
  private static final int METHODID_REVERT_TEMPLATE = 5;
  private static final int METHODID_CREATE_BROADCAST = 6;
  private static final int METHODID_LIST_BROADCASTS = 7;
  private static final int METHODID_LIST_WEBHOOKS = 8;
  private static final int METHODID_SAVE_WEBHOOK = 9;
  private static final int METHODID_DELETE_WEBHOOK = 10;
  private static final int METHODID_TEST_WEBHOOK = 11;
  private static final int METHODID_LIST_DELIVERIES = 12;

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
        case METHODID_LIST_EVENT_TYPES:
          serviceImpl.listEventTypes((courier.v1.Admin.ListEventTypesRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.ListEventTypesResponse>) responseObserver);
          break;
        case METHODID_GET_TEMPLATE:
          serviceImpl.getTemplate((courier.v1.Admin.GetTemplateRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.GetTemplateResponse>) responseObserver);
          break;
        case METHODID_PREVIEW_TEMPLATE:
          serviceImpl.previewTemplate((courier.v1.Admin.PreviewTemplateRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.PreviewTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATE_VERSIONS:
          serviceImpl.listTemplateVersions((courier.v1.Admin.ListTemplateVersionsRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.ListTemplateVersionsResponse>) responseObserver);
          break;
        case METHODID_SAVE_TEMPLATE:
          serviceImpl.saveTemplate((courier.v1.Admin.SaveTemplateRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.SaveTemplateResponse>) responseObserver);
          break;
        case METHODID_REVERT_TEMPLATE:
          serviceImpl.revertTemplate((courier.v1.Admin.RevertTemplateRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.RevertTemplateResponse>) responseObserver);
          break;
        case METHODID_CREATE_BROADCAST:
          serviceImpl.createBroadcast((courier.v1.Admin.CreateBroadcastRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.CreateBroadcastResponse>) responseObserver);
          break;
        case METHODID_LIST_BROADCASTS:
          serviceImpl.listBroadcasts((courier.v1.Admin.ListBroadcastsRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.ListBroadcastsResponse>) responseObserver);
          break;
        case METHODID_LIST_WEBHOOKS:
          serviceImpl.listWebhooks((courier.v1.Admin.ListWebhooksRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.ListWebhooksResponse>) responseObserver);
          break;
        case METHODID_SAVE_WEBHOOK:
          serviceImpl.saveWebhook((courier.v1.Admin.SaveWebhookRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.SaveWebhookResponse>) responseObserver);
          break;
        case METHODID_DELETE_WEBHOOK:
          serviceImpl.deleteWebhook((courier.v1.Admin.DeleteWebhookRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.DeleteWebhookResponse>) responseObserver);
          break;
        case METHODID_TEST_WEBHOOK:
          serviceImpl.testWebhook((courier.v1.Admin.TestWebhookRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.TestWebhookResponse>) responseObserver);
          break;
        case METHODID_LIST_DELIVERIES:
          serviceImpl.listDeliveries((courier.v1.Admin.ListDeliveriesRequest) request,
              (io.grpc.stub.StreamObserver<courier.v1.Admin.ListDeliveriesResponse>) responseObserver);
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
          getListEventTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.ListEventTypesRequest,
              courier.v1.Admin.ListEventTypesResponse>(
                service, METHODID_LIST_EVENT_TYPES)))
        .addMethod(
          getGetTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.GetTemplateRequest,
              courier.v1.Admin.GetTemplateResponse>(
                service, METHODID_GET_TEMPLATE)))
        .addMethod(
          getPreviewTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.PreviewTemplateRequest,
              courier.v1.Admin.PreviewTemplateResponse>(
                service, METHODID_PREVIEW_TEMPLATE)))
        .addMethod(
          getListTemplateVersionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.ListTemplateVersionsRequest,
              courier.v1.Admin.ListTemplateVersionsResponse>(
                service, METHODID_LIST_TEMPLATE_VERSIONS)))
        .addMethod(
          getSaveTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.SaveTemplateRequest,
              courier.v1.Admin.SaveTemplateResponse>(
                service, METHODID_SAVE_TEMPLATE)))
        .addMethod(
          getRevertTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.RevertTemplateRequest,
              courier.v1.Admin.RevertTemplateResponse>(
                service, METHODID_REVERT_TEMPLATE)))
        .addMethod(
          getCreateBroadcastMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.CreateBroadcastRequest,
              courier.v1.Admin.CreateBroadcastResponse>(
                service, METHODID_CREATE_BROADCAST)))
        .addMethod(
          getListBroadcastsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.ListBroadcastsRequest,
              courier.v1.Admin.ListBroadcastsResponse>(
                service, METHODID_LIST_BROADCASTS)))
        .addMethod(
          getListWebhooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.ListWebhooksRequest,
              courier.v1.Admin.ListWebhooksResponse>(
                service, METHODID_LIST_WEBHOOKS)))
        .addMethod(
          getSaveWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.SaveWebhookRequest,
              courier.v1.Admin.SaveWebhookResponse>(
                service, METHODID_SAVE_WEBHOOK)))
        .addMethod(
          getDeleteWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.DeleteWebhookRequest,
              courier.v1.Admin.DeleteWebhookResponse>(
                service, METHODID_DELETE_WEBHOOK)))
        .addMethod(
          getTestWebhookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.TestWebhookRequest,
              courier.v1.Admin.TestWebhookResponse>(
                service, METHODID_TEST_WEBHOOK)))
        .addMethod(
          getListDeliveriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              courier.v1.Admin.ListDeliveriesRequest,
              courier.v1.Admin.ListDeliveriesResponse>(
                service, METHODID_LIST_DELIVERIES)))
        .build();
  }

  private static abstract class AdminNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return courier.v1.Admin.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdminNotificationService");
    }
  }

  private static final class AdminNotificationServiceFileDescriptorSupplier
      extends AdminNotificationServiceBaseDescriptorSupplier {
    AdminNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class AdminNotificationServiceMethodDescriptorSupplier
      extends AdminNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdminNotificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdminNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminNotificationServiceFileDescriptorSupplier())
              .addMethod(getListEventTypesMethod())
              .addMethod(getGetTemplateMethod())
              .addMethod(getPreviewTemplateMethod())
              .addMethod(getListTemplateVersionsMethod())
              .addMethod(getSaveTemplateMethod())
              .addMethod(getRevertTemplateMethod())
              .addMethod(getCreateBroadcastMethod())
              .addMethod(getListBroadcastsMethod())
              .addMethod(getListWebhooksMethod())
              .addMethod(getSaveWebhookMethod())
              .addMethod(getDeleteWebhookMethod())
              .addMethod(getTestWebhookMethod())
              .addMethod(getListDeliveriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
