package identity.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * IdentityService is the internal administration API of identity. The OAuth 2.0 and OpenID
 * Connect endpoints (authorize, token, revoke, userinfo, JWKS) are HTTP and are not part of
 * this contract. Every method needs a permission, see the comment of the method.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: identity/v1/identity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IdentityServiceGrpc {

  private IdentityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "identity.v1.IdentityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.IntrospectRequest,
      identity.v1.Identity.IntrospectResponse> getIntrospectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Introspect",
      requestType = identity.v1.Identity.IntrospectRequest.class,
      responseType = identity.v1.Identity.IntrospectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.IntrospectRequest,
      identity.v1.Identity.IntrospectResponse> getIntrospectMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.IntrospectRequest, identity.v1.Identity.IntrospectResponse> getIntrospectMethod;
    if ((getIntrospectMethod = IdentityServiceGrpc.getIntrospectMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getIntrospectMethod = IdentityServiceGrpc.getIntrospectMethod) == null) {
          IdentityServiceGrpc.getIntrospectMethod = getIntrospectMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.IntrospectRequest, identity.v1.Identity.IntrospectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Introspect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.IntrospectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.IntrospectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("Introspect"))
              .build();
        }
      }
    }
    return getIntrospectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.CheckPermissionRequest,
      identity.v1.Identity.CheckPermissionResponse> getCheckPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermission",
      requestType = identity.v1.Identity.CheckPermissionRequest.class,
      responseType = identity.v1.Identity.CheckPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.CheckPermissionRequest,
      identity.v1.Identity.CheckPermissionResponse> getCheckPermissionMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.CheckPermissionRequest, identity.v1.Identity.CheckPermissionResponse> getCheckPermissionMethod;
    if ((getCheckPermissionMethod = IdentityServiceGrpc.getCheckPermissionMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getCheckPermissionMethod = IdentityServiceGrpc.getCheckPermissionMethod) == null) {
          IdentityServiceGrpc.getCheckPermissionMethod = getCheckPermissionMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.CheckPermissionRequest, identity.v1.Identity.CheckPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CheckPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CheckPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("CheckPermission"))
              .build();
        }
      }
    }
    return getCheckPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RevokeTokenRequest,
      identity.v1.Identity.RevokeTokenResponse> getRevokeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeToken",
      requestType = identity.v1.Identity.RevokeTokenRequest.class,
      responseType = identity.v1.Identity.RevokeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RevokeTokenRequest,
      identity.v1.Identity.RevokeTokenResponse> getRevokeTokenMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RevokeTokenRequest, identity.v1.Identity.RevokeTokenResponse> getRevokeTokenMethod;
    if ((getRevokeTokenMethod = IdentityServiceGrpc.getRevokeTokenMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRevokeTokenMethod = IdentityServiceGrpc.getRevokeTokenMethod) == null) {
          IdentityServiceGrpc.getRevokeTokenMethod = getRevokeTokenMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RevokeTokenRequest, identity.v1.Identity.RevokeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RevokeToken"))
              .build();
        }
      }
    }
    return getRevokeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetUserRequest,
      identity.v1.Identity.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = identity.v1.Identity.GetUserRequest.class,
      responseType = identity.v1.Identity.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetUserRequest,
      identity.v1.Identity.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetUserRequest, identity.v1.Identity.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = IdentityServiceGrpc.getGetUserMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetUserMethod = IdentityServiceGrpc.getGetUserMethod) == null) {
          IdentityServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetUserRequest, identity.v1.Identity.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListUsersRequest,
      identity.v1.Identity.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = identity.v1.Identity.ListUsersRequest.class,
      responseType = identity.v1.Identity.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListUsersRequest,
      identity.v1.Identity.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListUsersRequest, identity.v1.Identity.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = IdentityServiceGrpc.getListUsersMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListUsersMethod = IdentityServiceGrpc.getListUsersMethod) == null) {
          IdentityServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListUsersRequest, identity.v1.Identity.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.CreateUserRequest,
      identity.v1.Identity.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = identity.v1.Identity.CreateUserRequest.class,
      responseType = identity.v1.Identity.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.CreateUserRequest,
      identity.v1.Identity.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.CreateUserRequest, identity.v1.Identity.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = IdentityServiceGrpc.getCreateUserMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getCreateUserMethod = IdentityServiceGrpc.getCreateUserMethod) == null) {
          IdentityServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.CreateUserRequest, identity.v1.Identity.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetUserDisabledRequest,
      identity.v1.Identity.SetUserDisabledResponse> getSetUserDisabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserDisabled",
      requestType = identity.v1.Identity.SetUserDisabledRequest.class,
      responseType = identity.v1.Identity.SetUserDisabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetUserDisabledRequest,
      identity.v1.Identity.SetUserDisabledResponse> getSetUserDisabledMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetUserDisabledRequest, identity.v1.Identity.SetUserDisabledResponse> getSetUserDisabledMethod;
    if ((getSetUserDisabledMethod = IdentityServiceGrpc.getSetUserDisabledMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetUserDisabledMethod = IdentityServiceGrpc.getSetUserDisabledMethod) == null) {
          IdentityServiceGrpc.getSetUserDisabledMethod = getSetUserDisabledMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetUserDisabledRequest, identity.v1.Identity.SetUserDisabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserDisabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserDisabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserDisabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetUserDisabled"))
              .build();
        }
      }
    }
    return getSetUserDisabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetUserPasswordRequest,
      identity.v1.Identity.SetUserPasswordResponse> getSetUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserPassword",
      requestType = identity.v1.Identity.SetUserPasswordRequest.class,
      responseType = identity.v1.Identity.SetUserPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetUserPasswordRequest,
      identity.v1.Identity.SetUserPasswordResponse> getSetUserPasswordMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetUserPasswordRequest, identity.v1.Identity.SetUserPasswordResponse> getSetUserPasswordMethod;
    if ((getSetUserPasswordMethod = IdentityServiceGrpc.getSetUserPasswordMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetUserPasswordMethod = IdentityServiceGrpc.getSetUserPasswordMethod) == null) {
          IdentityServiceGrpc.getSetUserPasswordMethod = getSetUserPasswordMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetUserPasswordRequest, identity.v1.Identity.SetUserPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetUserPassword"))
              .build();
        }
      }
    }
    return getSetUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SendPasswordResetRequest,
      identity.v1.Identity.SendPasswordResetResponse> getSendPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPasswordReset",
      requestType = identity.v1.Identity.SendPasswordResetRequest.class,
      responseType = identity.v1.Identity.SendPasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SendPasswordResetRequest,
      identity.v1.Identity.SendPasswordResetResponse> getSendPasswordResetMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SendPasswordResetRequest, identity.v1.Identity.SendPasswordResetResponse> getSendPasswordResetMethod;
    if ((getSendPasswordResetMethod = IdentityServiceGrpc.getSendPasswordResetMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSendPasswordResetMethod = IdentityServiceGrpc.getSendPasswordResetMethod) == null) {
          IdentityServiceGrpc.getSendPasswordResetMethod = getSendPasswordResetMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SendPasswordResetRequest, identity.v1.Identity.SendPasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SendPasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SendPasswordResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SendPasswordReset"))
              .build();
        }
      }
    }
    return getSendPasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.UpdateUserRequest,
      identity.v1.Identity.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = identity.v1.Identity.UpdateUserRequest.class,
      responseType = identity.v1.Identity.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.UpdateUserRequest,
      identity.v1.Identity.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.UpdateUserRequest, identity.v1.Identity.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = IdentityServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getUpdateUserMethod = IdentityServiceGrpc.getUpdateUserMethod) == null) {
          IdentityServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.UpdateUserRequest, identity.v1.Identity.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetUserAvatarRequest,
      identity.v1.Identity.SetUserAvatarResponse> getSetUserAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserAvatar",
      requestType = identity.v1.Identity.SetUserAvatarRequest.class,
      responseType = identity.v1.Identity.SetUserAvatarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetUserAvatarRequest,
      identity.v1.Identity.SetUserAvatarResponse> getSetUserAvatarMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetUserAvatarRequest, identity.v1.Identity.SetUserAvatarResponse> getSetUserAvatarMethod;
    if ((getSetUserAvatarMethod = IdentityServiceGrpc.getSetUserAvatarMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetUserAvatarMethod = IdentityServiceGrpc.getSetUserAvatarMethod) == null) {
          IdentityServiceGrpc.getSetUserAvatarMethod = getSetUserAvatarMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetUserAvatarRequest, identity.v1.Identity.SetUserAvatarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserAvatarResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetUserAvatar"))
              .build();
        }
      }
    }
    return getSetUserAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SendWelcomeRequest,
      identity.v1.Identity.SendWelcomeResponse> getSendWelcomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendWelcome",
      requestType = identity.v1.Identity.SendWelcomeRequest.class,
      responseType = identity.v1.Identity.SendWelcomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SendWelcomeRequest,
      identity.v1.Identity.SendWelcomeResponse> getSendWelcomeMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SendWelcomeRequest, identity.v1.Identity.SendWelcomeResponse> getSendWelcomeMethod;
    if ((getSendWelcomeMethod = IdentityServiceGrpc.getSendWelcomeMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSendWelcomeMethod = IdentityServiceGrpc.getSendWelcomeMethod) == null) {
          IdentityServiceGrpc.getSendWelcomeMethod = getSendWelcomeMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SendWelcomeRequest, identity.v1.Identity.SendWelcomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendWelcome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SendWelcomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SendWelcomeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SendWelcome"))
              .build();
        }
      }
    }
    return getSendWelcomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetUserStatsRequest,
      identity.v1.Identity.GetUserStatsResponse> getGetUserStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserStats",
      requestType = identity.v1.Identity.GetUserStatsRequest.class,
      responseType = identity.v1.Identity.GetUserStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetUserStatsRequest,
      identity.v1.Identity.GetUserStatsResponse> getGetUserStatsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetUserStatsRequest, identity.v1.Identity.GetUserStatsResponse> getGetUserStatsMethod;
    if ((getGetUserStatsMethod = IdentityServiceGrpc.getGetUserStatsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetUserStatsMethod = IdentityServiceGrpc.getGetUserStatsMethod) == null) {
          IdentityServiceGrpc.getGetUserStatsMethod = getGetUserStatsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetUserStatsRequest, identity.v1.Identity.GetUserStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUserStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUserStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetUserStats"))
              .build();
        }
      }
    }
    return getGetUserStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetMeRequest,
      identity.v1.Identity.GetMeResponse> getGetMeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMe",
      requestType = identity.v1.Identity.GetMeRequest.class,
      responseType = identity.v1.Identity.GetMeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetMeRequest,
      identity.v1.Identity.GetMeResponse> getGetMeMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetMeRequest, identity.v1.Identity.GetMeResponse> getGetMeMethod;
    if ((getGetMeMethod = IdentityServiceGrpc.getGetMeMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetMeMethod = IdentityServiceGrpc.getGetMeMethod) == null) {
          IdentityServiceGrpc.getGetMeMethod = getGetMeMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetMeRequest, identity.v1.Identity.GetMeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetMeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetMeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetMe"))
              .build();
        }
      }
    }
    return getGetMeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.UpdateMeRequest,
      identity.v1.Identity.UpdateMeResponse> getUpdateMeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMe",
      requestType = identity.v1.Identity.UpdateMeRequest.class,
      responseType = identity.v1.Identity.UpdateMeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.UpdateMeRequest,
      identity.v1.Identity.UpdateMeResponse> getUpdateMeMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.UpdateMeRequest, identity.v1.Identity.UpdateMeResponse> getUpdateMeMethod;
    if ((getUpdateMeMethod = IdentityServiceGrpc.getUpdateMeMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getUpdateMeMethod = IdentityServiceGrpc.getUpdateMeMethod) == null) {
          IdentityServiceGrpc.getUpdateMeMethod = getUpdateMeMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.UpdateMeRequest, identity.v1.Identity.UpdateMeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateMeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateMeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("UpdateMe"))
              .build();
        }
      }
    }
    return getUpdateMeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetMyAvatarRequest,
      identity.v1.Identity.SetMyAvatarResponse> getSetMyAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMyAvatar",
      requestType = identity.v1.Identity.SetMyAvatarRequest.class,
      responseType = identity.v1.Identity.SetMyAvatarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetMyAvatarRequest,
      identity.v1.Identity.SetMyAvatarResponse> getSetMyAvatarMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetMyAvatarRequest, identity.v1.Identity.SetMyAvatarResponse> getSetMyAvatarMethod;
    if ((getSetMyAvatarMethod = IdentityServiceGrpc.getSetMyAvatarMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetMyAvatarMethod = IdentityServiceGrpc.getSetMyAvatarMethod) == null) {
          IdentityServiceGrpc.getSetMyAvatarMethod = getSetMyAvatarMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetMyAvatarRequest, identity.v1.Identity.SetMyAvatarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMyAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetMyAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetMyAvatarResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetMyAvatar"))
              .build();
        }
      }
    }
    return getSetMyAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetMyUserSettingsRequest,
      identity.v1.Identity.GetMyUserSettingsResponse> getGetMyUserSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUserSettings",
      requestType = identity.v1.Identity.GetMyUserSettingsRequest.class,
      responseType = identity.v1.Identity.GetMyUserSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetMyUserSettingsRequest,
      identity.v1.Identity.GetMyUserSettingsResponse> getGetMyUserSettingsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetMyUserSettingsRequest, identity.v1.Identity.GetMyUserSettingsResponse> getGetMyUserSettingsMethod;
    if ((getGetMyUserSettingsMethod = IdentityServiceGrpc.getGetMyUserSettingsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetMyUserSettingsMethod = IdentityServiceGrpc.getGetMyUserSettingsMethod) == null) {
          IdentityServiceGrpc.getGetMyUserSettingsMethod = getGetMyUserSettingsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetMyUserSettingsRequest, identity.v1.Identity.GetMyUserSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyUserSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetMyUserSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetMyUserSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetMyUserSettings"))
              .build();
        }
      }
    }
    return getGetMyUserSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.PutMyUserSettingsRequest,
      identity.v1.Identity.PutMyUserSettingsResponse> getPutMyUserSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutMyUserSettings",
      requestType = identity.v1.Identity.PutMyUserSettingsRequest.class,
      responseType = identity.v1.Identity.PutMyUserSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.PutMyUserSettingsRequest,
      identity.v1.Identity.PutMyUserSettingsResponse> getPutMyUserSettingsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.PutMyUserSettingsRequest, identity.v1.Identity.PutMyUserSettingsResponse> getPutMyUserSettingsMethod;
    if ((getPutMyUserSettingsMethod = IdentityServiceGrpc.getPutMyUserSettingsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getPutMyUserSettingsMethod = IdentityServiceGrpc.getPutMyUserSettingsMethod) == null) {
          IdentityServiceGrpc.getPutMyUserSettingsMethod = getPutMyUserSettingsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.PutMyUserSettingsRequest, identity.v1.Identity.PutMyUserSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutMyUserSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.PutMyUserSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.PutMyUserSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("PutMyUserSettings"))
              .build();
        }
      }
    }
    return getPutMyUserSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.CreateRoleRequest,
      identity.v1.Identity.CreateRoleResponse> getCreateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRole",
      requestType = identity.v1.Identity.CreateRoleRequest.class,
      responseType = identity.v1.Identity.CreateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.CreateRoleRequest,
      identity.v1.Identity.CreateRoleResponse> getCreateRoleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.CreateRoleRequest, identity.v1.Identity.CreateRoleResponse> getCreateRoleMethod;
    if ((getCreateRoleMethod = IdentityServiceGrpc.getCreateRoleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getCreateRoleMethod = IdentityServiceGrpc.getCreateRoleMethod) == null) {
          IdentityServiceGrpc.getCreateRoleMethod = getCreateRoleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.CreateRoleRequest, identity.v1.Identity.CreateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("CreateRole"))
              .build();
        }
      }
    }
    return getCreateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetRolePermissionsRequest,
      identity.v1.Identity.SetRolePermissionsResponse> getSetRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRolePermissions",
      requestType = identity.v1.Identity.SetRolePermissionsRequest.class,
      responseType = identity.v1.Identity.SetRolePermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetRolePermissionsRequest,
      identity.v1.Identity.SetRolePermissionsResponse> getSetRolePermissionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetRolePermissionsRequest, identity.v1.Identity.SetRolePermissionsResponse> getSetRolePermissionsMethod;
    if ((getSetRolePermissionsMethod = IdentityServiceGrpc.getSetRolePermissionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetRolePermissionsMethod = IdentityServiceGrpc.getSetRolePermissionsMethod) == null) {
          IdentityServiceGrpc.getSetRolePermissionsMethod = getSetRolePermissionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetRolePermissionsRequest, identity.v1.Identity.SetRolePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetRolePermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetRolePermissions"))
              .build();
        }
      }
    }
    return getSetRolePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListRolesRequest,
      identity.v1.Identity.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = identity.v1.Identity.ListRolesRequest.class,
      responseType = identity.v1.Identity.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListRolesRequest,
      identity.v1.Identity.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListRolesRequest, identity.v1.Identity.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = IdentityServiceGrpc.getListRolesMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListRolesMethod = IdentityServiceGrpc.getListRolesMethod) == null) {
          IdentityServiceGrpc.getListRolesMethod = getListRolesMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListRolesRequest, identity.v1.Identity.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListRoles"))
              .build();
        }
      }
    }
    return getListRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.UpdateRoleRequest,
      identity.v1.Identity.UpdateRoleResponse> getUpdateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRole",
      requestType = identity.v1.Identity.UpdateRoleRequest.class,
      responseType = identity.v1.Identity.UpdateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.UpdateRoleRequest,
      identity.v1.Identity.UpdateRoleResponse> getUpdateRoleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.UpdateRoleRequest, identity.v1.Identity.UpdateRoleResponse> getUpdateRoleMethod;
    if ((getUpdateRoleMethod = IdentityServiceGrpc.getUpdateRoleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getUpdateRoleMethod = IdentityServiceGrpc.getUpdateRoleMethod) == null) {
          IdentityServiceGrpc.getUpdateRoleMethod = getUpdateRoleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.UpdateRoleRequest, identity.v1.Identity.UpdateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("UpdateRole"))
              .build();
        }
      }
    }
    return getUpdateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.DeleteRoleRequest,
      identity.v1.Identity.DeleteRoleResponse> getDeleteRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRole",
      requestType = identity.v1.Identity.DeleteRoleRequest.class,
      responseType = identity.v1.Identity.DeleteRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.DeleteRoleRequest,
      identity.v1.Identity.DeleteRoleResponse> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.DeleteRoleRequest, identity.v1.Identity.DeleteRoleResponse> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = IdentityServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getDeleteRoleMethod = IdentityServiceGrpc.getDeleteRoleMethod) == null) {
          IdentityServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.DeleteRoleRequest, identity.v1.Identity.DeleteRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("DeleteRole"))
              .build();
        }
      }
    }
    return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListPermissionsRequest,
      identity.v1.Identity.ListPermissionsResponse> getListPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPermissions",
      requestType = identity.v1.Identity.ListPermissionsRequest.class,
      responseType = identity.v1.Identity.ListPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListPermissionsRequest,
      identity.v1.Identity.ListPermissionsResponse> getListPermissionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListPermissionsRequest, identity.v1.Identity.ListPermissionsResponse> getListPermissionsMethod;
    if ((getListPermissionsMethod = IdentityServiceGrpc.getListPermissionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListPermissionsMethod = IdentityServiceGrpc.getListPermissionsMethod) == null) {
          IdentityServiceGrpc.getListPermissionsMethod = getListPermissionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListPermissionsRequest, identity.v1.Identity.ListPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListPermissions"))
              .build();
        }
      }
    }
    return getListPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.CreatePermissionRequest,
      identity.v1.Identity.CreatePermissionResponse> getCreatePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePermission",
      requestType = identity.v1.Identity.CreatePermissionRequest.class,
      responseType = identity.v1.Identity.CreatePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.CreatePermissionRequest,
      identity.v1.Identity.CreatePermissionResponse> getCreatePermissionMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.CreatePermissionRequest, identity.v1.Identity.CreatePermissionResponse> getCreatePermissionMethod;
    if ((getCreatePermissionMethod = IdentityServiceGrpc.getCreatePermissionMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getCreatePermissionMethod = IdentityServiceGrpc.getCreatePermissionMethod) == null) {
          IdentityServiceGrpc.getCreatePermissionMethod = getCreatePermissionMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.CreatePermissionRequest, identity.v1.Identity.CreatePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreatePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreatePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("CreatePermission"))
              .build();
        }
      }
    }
    return getCreatePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.UpdatePermissionRequest,
      identity.v1.Identity.UpdatePermissionResponse> getUpdatePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePermission",
      requestType = identity.v1.Identity.UpdatePermissionRequest.class,
      responseType = identity.v1.Identity.UpdatePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.UpdatePermissionRequest,
      identity.v1.Identity.UpdatePermissionResponse> getUpdatePermissionMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.UpdatePermissionRequest, identity.v1.Identity.UpdatePermissionResponse> getUpdatePermissionMethod;
    if ((getUpdatePermissionMethod = IdentityServiceGrpc.getUpdatePermissionMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getUpdatePermissionMethod = IdentityServiceGrpc.getUpdatePermissionMethod) == null) {
          IdentityServiceGrpc.getUpdatePermissionMethod = getUpdatePermissionMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.UpdatePermissionRequest, identity.v1.Identity.UpdatePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdatePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdatePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("UpdatePermission"))
              .build();
        }
      }
    }
    return getUpdatePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.DeletePermissionRequest,
      identity.v1.Identity.DeletePermissionResponse> getDeletePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePermission",
      requestType = identity.v1.Identity.DeletePermissionRequest.class,
      responseType = identity.v1.Identity.DeletePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.DeletePermissionRequest,
      identity.v1.Identity.DeletePermissionResponse> getDeletePermissionMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.DeletePermissionRequest, identity.v1.Identity.DeletePermissionResponse> getDeletePermissionMethod;
    if ((getDeletePermissionMethod = IdentityServiceGrpc.getDeletePermissionMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getDeletePermissionMethod = IdentityServiceGrpc.getDeletePermissionMethod) == null) {
          IdentityServiceGrpc.getDeletePermissionMethod = getDeletePermissionMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.DeletePermissionRequest, identity.v1.Identity.DeletePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeletePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeletePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("DeletePermission"))
              .build();
        }
      }
    }
    return getDeletePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.AssignRoleRequest,
      identity.v1.Identity.AssignRoleResponse> getAssignRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRole",
      requestType = identity.v1.Identity.AssignRoleRequest.class,
      responseType = identity.v1.Identity.AssignRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.AssignRoleRequest,
      identity.v1.Identity.AssignRoleResponse> getAssignRoleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.AssignRoleRequest, identity.v1.Identity.AssignRoleResponse> getAssignRoleMethod;
    if ((getAssignRoleMethod = IdentityServiceGrpc.getAssignRoleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getAssignRoleMethod = IdentityServiceGrpc.getAssignRoleMethod) == null) {
          IdentityServiceGrpc.getAssignRoleMethod = getAssignRoleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.AssignRoleRequest, identity.v1.Identity.AssignRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.AssignRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.AssignRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("AssignRole"))
              .build();
        }
      }
    }
    return getAssignRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RevokeRoleRequest,
      identity.v1.Identity.RevokeRoleResponse> getRevokeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeRole",
      requestType = identity.v1.Identity.RevokeRoleRequest.class,
      responseType = identity.v1.Identity.RevokeRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RevokeRoleRequest,
      identity.v1.Identity.RevokeRoleResponse> getRevokeRoleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RevokeRoleRequest, identity.v1.Identity.RevokeRoleResponse> getRevokeRoleMethod;
    if ((getRevokeRoleMethod = IdentityServiceGrpc.getRevokeRoleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRevokeRoleMethod = IdentityServiceGrpc.getRevokeRoleMethod) == null) {
          IdentityServiceGrpc.getRevokeRoleMethod = getRevokeRoleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RevokeRoleRequest, identity.v1.Identity.RevokeRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RevokeRole"))
              .build();
        }
      }
    }
    return getRevokeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.CreateClientRequest,
      identity.v1.Identity.CreateClientResponse> getCreateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClient",
      requestType = identity.v1.Identity.CreateClientRequest.class,
      responseType = identity.v1.Identity.CreateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.CreateClientRequest,
      identity.v1.Identity.CreateClientResponse> getCreateClientMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.CreateClientRequest, identity.v1.Identity.CreateClientResponse> getCreateClientMethod;
    if ((getCreateClientMethod = IdentityServiceGrpc.getCreateClientMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getCreateClientMethod = IdentityServiceGrpc.getCreateClientMethod) == null) {
          IdentityServiceGrpc.getCreateClientMethod = getCreateClientMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.CreateClientRequest, identity.v1.Identity.CreateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.CreateClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("CreateClient"))
              .build();
        }
      }
    }
    return getCreateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.UpdateClientRequest,
      identity.v1.Identity.UpdateClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = identity.v1.Identity.UpdateClientRequest.class,
      responseType = identity.v1.Identity.UpdateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.UpdateClientRequest,
      identity.v1.Identity.UpdateClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.UpdateClientRequest, identity.v1.Identity.UpdateClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = IdentityServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getUpdateClientMethod = IdentityServiceGrpc.getUpdateClientMethod) == null) {
          IdentityServiceGrpc.getUpdateClientMethod = getUpdateClientMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.UpdateClientRequest, identity.v1.Identity.UpdateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.UpdateClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("UpdateClient"))
              .build();
        }
      }
    }
    return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetClientDisabledRequest,
      identity.v1.Identity.SetClientDisabledResponse> getSetClientDisabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetClientDisabled",
      requestType = identity.v1.Identity.SetClientDisabledRequest.class,
      responseType = identity.v1.Identity.SetClientDisabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetClientDisabledRequest,
      identity.v1.Identity.SetClientDisabledResponse> getSetClientDisabledMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetClientDisabledRequest, identity.v1.Identity.SetClientDisabledResponse> getSetClientDisabledMethod;
    if ((getSetClientDisabledMethod = IdentityServiceGrpc.getSetClientDisabledMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetClientDisabledMethod = IdentityServiceGrpc.getSetClientDisabledMethod) == null) {
          IdentityServiceGrpc.getSetClientDisabledMethod = getSetClientDisabledMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetClientDisabledRequest, identity.v1.Identity.SetClientDisabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetClientDisabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetClientDisabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetClientDisabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetClientDisabled"))
              .build();
        }
      }
    }
    return getSetClientDisabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.DeleteClientRequest,
      identity.v1.Identity.DeleteClientResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClient",
      requestType = identity.v1.Identity.DeleteClientRequest.class,
      responseType = identity.v1.Identity.DeleteClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.DeleteClientRequest,
      identity.v1.Identity.DeleteClientResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.DeleteClientRequest, identity.v1.Identity.DeleteClientResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = IdentityServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getDeleteClientMethod = IdentityServiceGrpc.getDeleteClientMethod) == null) {
          IdentityServiceGrpc.getDeleteClientMethod = getDeleteClientMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.DeleteClientRequest, identity.v1.Identity.DeleteClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("DeleteClient"))
              .build();
        }
      }
    }
    return getDeleteClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RotateClientSecretRequest,
      identity.v1.Identity.RotateClientSecretResponse> getRotateClientSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateClientSecret",
      requestType = identity.v1.Identity.RotateClientSecretRequest.class,
      responseType = identity.v1.Identity.RotateClientSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RotateClientSecretRequest,
      identity.v1.Identity.RotateClientSecretResponse> getRotateClientSecretMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RotateClientSecretRequest, identity.v1.Identity.RotateClientSecretResponse> getRotateClientSecretMethod;
    if ((getRotateClientSecretMethod = IdentityServiceGrpc.getRotateClientSecretMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRotateClientSecretMethod = IdentityServiceGrpc.getRotateClientSecretMethod) == null) {
          IdentityServiceGrpc.getRotateClientSecretMethod = getRotateClientSecretMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RotateClientSecretRequest, identity.v1.Identity.RotateClientSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateClientSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RotateClientSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RotateClientSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RotateClientSecret"))
              .build();
        }
      }
    }
    return getRotateClientSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListClientsRequest,
      identity.v1.Identity.ListClientsResponse> getListClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClients",
      requestType = identity.v1.Identity.ListClientsRequest.class,
      responseType = identity.v1.Identity.ListClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListClientsRequest,
      identity.v1.Identity.ListClientsResponse> getListClientsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListClientsRequest, identity.v1.Identity.ListClientsResponse> getListClientsMethod;
    if ((getListClientsMethod = IdentityServiceGrpc.getListClientsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListClientsMethod = IdentityServiceGrpc.getListClientsMethod) == null) {
          IdentityServiceGrpc.getListClientsMethod = getListClientsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListClientsRequest, identity.v1.Identity.ListClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListClientsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListClients"))
              .build();
        }
      }
    }
    return getListClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetExchangePolicyRequest,
      identity.v1.Identity.SetExchangePolicyResponse> getSetExchangePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetExchangePolicy",
      requestType = identity.v1.Identity.SetExchangePolicyRequest.class,
      responseType = identity.v1.Identity.SetExchangePolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetExchangePolicyRequest,
      identity.v1.Identity.SetExchangePolicyResponse> getSetExchangePolicyMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetExchangePolicyRequest, identity.v1.Identity.SetExchangePolicyResponse> getSetExchangePolicyMethod;
    if ((getSetExchangePolicyMethod = IdentityServiceGrpc.getSetExchangePolicyMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetExchangePolicyMethod = IdentityServiceGrpc.getSetExchangePolicyMethod) == null) {
          IdentityServiceGrpc.getSetExchangePolicyMethod = getSetExchangePolicyMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetExchangePolicyRequest, identity.v1.Identity.SetExchangePolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetExchangePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetExchangePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetExchangePolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetExchangePolicy"))
              .build();
        }
      }
    }
    return getSetExchangePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListExchangePoliciesRequest,
      identity.v1.Identity.ListExchangePoliciesResponse> getListExchangePoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchangePolicies",
      requestType = identity.v1.Identity.ListExchangePoliciesRequest.class,
      responseType = identity.v1.Identity.ListExchangePoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListExchangePoliciesRequest,
      identity.v1.Identity.ListExchangePoliciesResponse> getListExchangePoliciesMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListExchangePoliciesRequest, identity.v1.Identity.ListExchangePoliciesResponse> getListExchangePoliciesMethod;
    if ((getListExchangePoliciesMethod = IdentityServiceGrpc.getListExchangePoliciesMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListExchangePoliciesMethod = IdentityServiceGrpc.getListExchangePoliciesMethod) == null) {
          IdentityServiceGrpc.getListExchangePoliciesMethod = getListExchangePoliciesMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListExchangePoliciesRequest, identity.v1.Identity.ListExchangePoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchangePolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListExchangePoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListExchangePoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListExchangePolicies"))
              .build();
        }
      }
    }
    return getListExchangePoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetUserMFARequest,
      identity.v1.Identity.GetUserMFAResponse> getGetUserMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserMFA",
      requestType = identity.v1.Identity.GetUserMFARequest.class,
      responseType = identity.v1.Identity.GetUserMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetUserMFARequest,
      identity.v1.Identity.GetUserMFAResponse> getGetUserMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetUserMFARequest, identity.v1.Identity.GetUserMFAResponse> getGetUserMFAMethod;
    if ((getGetUserMFAMethod = IdentityServiceGrpc.getGetUserMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetUserMFAMethod = IdentityServiceGrpc.getGetUserMFAMethod) == null) {
          IdentityServiceGrpc.getGetUserMFAMethod = getGetUserMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetUserMFARequest, identity.v1.Identity.GetUserMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUserMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUserMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetUserMFA"))
              .build();
        }
      }
    }
    return getGetUserMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetUserMFARequest,
      identity.v1.Identity.SetUserMFAResponse> getSetUserMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserMFA",
      requestType = identity.v1.Identity.SetUserMFARequest.class,
      responseType = identity.v1.Identity.SetUserMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetUserMFARequest,
      identity.v1.Identity.SetUserMFAResponse> getSetUserMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetUserMFARequest, identity.v1.Identity.SetUserMFAResponse> getSetUserMFAMethod;
    if ((getSetUserMFAMethod = IdentityServiceGrpc.getSetUserMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetUserMFAMethod = IdentityServiceGrpc.getSetUserMFAMethod) == null) {
          IdentityServiceGrpc.getSetUserMFAMethod = getSetUserMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetUserMFARequest, identity.v1.Identity.SetUserMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUserMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetUserMFA"))
              .build();
        }
      }
    }
    return getSetUserMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.EnforceUserMFARequest,
      identity.v1.Identity.EnforceUserMFAResponse> getEnforceUserMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnforceUserMFA",
      requestType = identity.v1.Identity.EnforceUserMFARequest.class,
      responseType = identity.v1.Identity.EnforceUserMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.EnforceUserMFARequest,
      identity.v1.Identity.EnforceUserMFAResponse> getEnforceUserMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.EnforceUserMFARequest, identity.v1.Identity.EnforceUserMFAResponse> getEnforceUserMFAMethod;
    if ((getEnforceUserMFAMethod = IdentityServiceGrpc.getEnforceUserMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getEnforceUserMFAMethod = IdentityServiceGrpc.getEnforceUserMFAMethod) == null) {
          IdentityServiceGrpc.getEnforceUserMFAMethod = getEnforceUserMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.EnforceUserMFARequest, identity.v1.Identity.EnforceUserMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnforceUserMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.EnforceUserMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.EnforceUserMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("EnforceUserMFA"))
              .build();
        }
      }
    }
    return getEnforceUserMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ResetUserMFARequest,
      identity.v1.Identity.ResetUserMFAResponse> getResetUserMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetUserMFA",
      requestType = identity.v1.Identity.ResetUserMFARequest.class,
      responseType = identity.v1.Identity.ResetUserMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ResetUserMFARequest,
      identity.v1.Identity.ResetUserMFAResponse> getResetUserMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ResetUserMFARequest, identity.v1.Identity.ResetUserMFAResponse> getResetUserMFAMethod;
    if ((getResetUserMFAMethod = IdentityServiceGrpc.getResetUserMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getResetUserMFAMethod = IdentityServiceGrpc.getResetUserMFAMethod) == null) {
          IdentityServiceGrpc.getResetUserMFAMethod = getResetUserMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ResetUserMFARequest, identity.v1.Identity.ResetUserMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetUserMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ResetUserMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ResetUserMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ResetUserMFA"))
              .build();
        }
      }
    }
    return getResetUserMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetUIStyleRequest,
      identity.v1.Identity.GetUIStyleResponse> getGetUIStyleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUIStyle",
      requestType = identity.v1.Identity.GetUIStyleRequest.class,
      responseType = identity.v1.Identity.GetUIStyleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetUIStyleRequest,
      identity.v1.Identity.GetUIStyleResponse> getGetUIStyleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetUIStyleRequest, identity.v1.Identity.GetUIStyleResponse> getGetUIStyleMethod;
    if ((getGetUIStyleMethod = IdentityServiceGrpc.getGetUIStyleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetUIStyleMethod = IdentityServiceGrpc.getGetUIStyleMethod) == null) {
          IdentityServiceGrpc.getGetUIStyleMethod = getGetUIStyleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetUIStyleRequest, identity.v1.Identity.GetUIStyleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUIStyle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUIStyleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetUIStyleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetUIStyle"))
              .build();
        }
      }
    }
    return getGetUIStyleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetUIStyleRequest,
      identity.v1.Identity.SetUIStyleResponse> getSetUIStyleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUIStyle",
      requestType = identity.v1.Identity.SetUIStyleRequest.class,
      responseType = identity.v1.Identity.SetUIStyleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetUIStyleRequest,
      identity.v1.Identity.SetUIStyleResponse> getSetUIStyleMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetUIStyleRequest, identity.v1.Identity.SetUIStyleResponse> getSetUIStyleMethod;
    if ((getSetUIStyleMethod = IdentityServiceGrpc.getSetUIStyleMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetUIStyleMethod = IdentityServiceGrpc.getSetUIStyleMethod) == null) {
          IdentityServiceGrpc.getSetUIStyleMethod = getSetUIStyleMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetUIStyleRequest, identity.v1.Identity.SetUIStyleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUIStyle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUIStyleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetUIStyleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetUIStyle"))
              .build();
        }
      }
    }
    return getSetUIStyleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityServiceStub>() {
        @java.lang.Override
        public IdentityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityServiceStub(channel, callOptions);
        }
      };
    return IdentityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityServiceBlockingStub>() {
        @java.lang.Override
        public IdentityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityServiceBlockingStub(channel, callOptions);
        }
      };
    return IdentityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityServiceFutureStub>() {
        @java.lang.Override
        public IdentityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityServiceFutureStub(channel, callOptions);
        }
      };
    return IdentityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IdentityService is the internal administration API of identity. The OAuth 2.0 and OpenID
   * Connect endpoints (authorize, token, revoke, userinfo, JWKS) are HTTP and are not part of
   * this contract. Every method needs a permission, see the comment of the method.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Introspect reports whether an access token is active (RFC 7662). Permission: identity:token:read.
     * </pre>
     */
    default void introspect(identity.v1.Identity.IntrospectRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.IntrospectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntrospectMethod(), responseObserver);
    }

    /**
     * <pre>
     * CheckPermission reports whether a user holds a permission. Permission: identity:permission:read.
     * </pre>
     */
    default void checkPermission(identity.v1.Identity.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeToken revokes an access token by jti. Permission: identity:token:write.
     * </pre>
     */
    default void revokeToken(identity.v1.Identity.RevokeTokenRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Users. Permission: identity:user:read for Get and List, identity:user:write for the others.
     * </pre>
     */
    default void getUser(identity.v1.Identity.GetUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void listUsers(identity.v1.Identity.ListUsersRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     */
    default void createUser(identity.v1.Identity.CreateUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void setUserDisabled(identity.v1.Identity.SetUserDisabledRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserDisabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserDisabledMethod(), responseObserver);
    }

    /**
     */
    default void setUserPassword(identity.v1.Identity.SetUserPasswordRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserPasswordMethod(), responseObserver);
    }

    /**
     */
    default void sendPasswordReset(identity.v1.Identity.SendPasswordResetRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SendPasswordResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUser changes the name and the locale. SetUserAvatar stores (or clears) the picture.
     * </pre>
     */
    default void updateUser(identity.v1.Identity.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void setUserAvatar(identity.v1.Identity.SetUserAvatarRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserAvatarResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserAvatarMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendWelcome (re)sends the welcome mail with a link to set the first password. Only for a
     * user who has no password yet (status PENDING).
     * </pre>
     */
    default void sendWelcome(identity.v1.Identity.SendWelcomeRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SendWelcomeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendWelcomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Counts of users by status, MFA and activity.
     * </pre>
     */
    default void getUserStats(identity.v1.Identity.GetUserStatsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * The signed-in user's own profile. Any user with a user token may call them (no permission):
     * the user is the subject of the token, never a field of the request, so nobody can reach
     * another user through them. Service tokens are refused.
     * </pre>
     */
    default void getMe(identity.v1.Identity.GetMeRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetMeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMeMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMe changes the own name and locale; an empty field keeps the current value.
     * </pre>
     */
    default void updateMe(identity.v1.Identity.UpdateMeRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateMeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMeMethod(), responseObserver);
    }

    /**
     */
    default void setMyAvatar(identity.v1.Identity.SetMyAvatarRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetMyAvatarResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMyAvatarMethod(), responseObserver);
    }

    /**
     * <pre>
     * The settings the signed-in user keeps for one application ("dictionary"): a JSON object that
     * identity stores without looking inside; the application validates what it writes. Same rules as
     * the other "me" methods (user token, no permission). Called by the application on behalf of the
     * user (token exchange), not by the browser.
     * </pre>
     */
    default void getMyUserSettings(identity.v1.Identity.GetMyUserSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetMyUserSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyUserSettingsMethod(), responseObserver);
    }

    /**
     */
    default void putMyUserSettings(identity.v1.Identity.PutMyUserSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.PutMyUserSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMyUserSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Roles. Permission: identity:role:read for List, identity:role:write for the others.
     * </pre>
     */
    default void createRole(identity.v1.Identity.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreateRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
    }

    /**
     */
    default void setRolePermissions(identity.v1.Identity.SetRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetRolePermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRolePermissionsMethod(), responseObserver);
    }

    /**
     */
    default void listRoles(identity.v1.Identity.ListRolesRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     */
    default void updateRole(identity.v1.Identity.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     */
    default void deleteRole(identity.v1.Identity.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * The catalog of permissions roles can be given (wildcards are entries too).
     * </pre>
     */
    default void listPermissions(identity.v1.Identity.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void createPermission(identity.v1.Identity.CreatePermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreatePermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePermission changes the description; the name is the key.
     * </pre>
     */
    default void updatePermission(identity.v1.Identity.UpdatePermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdatePermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePermission fails while a role holds the permission.
     * </pre>
     */
    default void deletePermission(identity.v1.Identity.DeletePermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeletePermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePermissionMethod(), responseObserver);
    }

    /**
     */
    default void assignRole(identity.v1.Identity.AssignRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.AssignRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRoleMethod(), responseObserver);
    }

    /**
     */
    default void revokeRole(identity.v1.Identity.RevokeRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clients. Permission: identity:client:read for List, identity:client:write for the others.
     * </pre>
     */
    default void createClient(identity.v1.Identity.CreateClientRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreateClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientMethod(), responseObserver);
    }

    /**
     */
    default void updateClient(identity.v1.Identity.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    default void setClientDisabled(identity.v1.Identity.SetClientDisabledRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetClientDisabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetClientDisabledMethod(), responseObserver);
    }

    /**
     */
    default void deleteClient(identity.v1.Identity.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteClientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    /**
     */
    default void rotateClientSecret(identity.v1.Identity.RotateClientSecretRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RotateClientSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateClientSecretMethod(), responseObserver);
    }

    /**
     */
    default void listClients(identity.v1.Identity.ListClientsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListClientsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Token exchange policies (deny by default). Permission: identity:exchange:read for List,
     * identity:exchange:write for Set.
     * </pre>
     */
    default void setExchangePolicy(identity.v1.Identity.SetExchangePolicyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetExchangePolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetExchangePolicyMethod(), responseObserver);
    }

    /**
     */
    default void listExchangePolicies(identity.v1.Identity.ListExchangePoliciesRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListExchangePoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExchangePoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Multi-factor authentication. Permission: identity:mfa:read for Get, identity:mfa:write for the others.
     * </pre>
     */
    default void getUserMFA(identity.v1.Identity.GetUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMFAMethod(), responseObserver);
    }

    /**
     */
    default void setUserMFA(identity.v1.Identity.SetUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserMFAMethod(), responseObserver);
    }

    /**
     */
    default void enforceUserMFA(identity.v1.Identity.EnforceUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.EnforceUserMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnforceUserMFAMethod(), responseObserver);
    }

    /**
     */
    default void resetUserMFA(identity.v1.Identity.ResetUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ResetUserMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetUserMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * The look of the web apps (admin, dictionary, sign in), one value for the whole system.
     * GetUIStyle: any signed-in user (no permission); the sign in pages read it through the public
     * /auth-api/ui-style instead. SetUIStyle. Permission: identity:settings:write.
     * </pre>
     */
    default void getUIStyle(identity.v1.Identity.GetUIStyleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUIStyleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUIStyleMethod(), responseObserver);
    }

    /**
     */
    default void setUIStyle(identity.v1.Identity.SetUIStyleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUIStyleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUIStyleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IdentityService.
   * <pre>
   * IdentityService is the internal administration API of identity. The OAuth 2.0 and OpenID
   * Connect endpoints (authorize, token, revoke, userinfo, JWKS) are HTTP and are not part of
   * this contract. Every method needs a permission, see the comment of the method.
   * </pre>
   */
  public static abstract class IdentityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IdentityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IdentityService.
   * <pre>
   * IdentityService is the internal administration API of identity. The OAuth 2.0 and OpenID
   * Connect endpoints (authorize, token, revoke, userinfo, JWKS) are HTTP and are not part of
   * this contract. Every method needs a permission, see the comment of the method.
   * </pre>
   */
  public static final class IdentityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IdentityServiceStub> {
    private IdentityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Introspect reports whether an access token is active (RFC 7662). Permission: identity:token:read.
     * </pre>
     */
    public void introspect(identity.v1.Identity.IntrospectRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.IntrospectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntrospectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CheckPermission reports whether a user holds a permission. Permission: identity:permission:read.
     * </pre>
     */
    public void checkPermission(identity.v1.Identity.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeToken revokes an access token by jti. Permission: identity:token:write.
     * </pre>
     */
    public void revokeToken(identity.v1.Identity.RevokeTokenRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Users. Permission: identity:user:read for Get and List, identity:user:write for the others.
     * </pre>
     */
    public void getUser(identity.v1.Identity.GetUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUsers(identity.v1.Identity.ListUsersRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(identity.v1.Identity.CreateUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUserDisabled(identity.v1.Identity.SetUserDisabledRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserDisabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserDisabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUserPassword(identity.v1.Identity.SetUserPasswordRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendPasswordReset(identity.v1.Identity.SendPasswordResetRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SendPasswordResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUser changes the name and the locale. SetUserAvatar stores (or clears) the picture.
     * </pre>
     */
    public void updateUser(identity.v1.Identity.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUserAvatar(identity.v1.Identity.SetUserAvatarRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserAvatarResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendWelcome (re)sends the welcome mail with a link to set the first password. Only for a
     * user who has no password yet (status PENDING).
     * </pre>
     */
    public void sendWelcome(identity.v1.Identity.SendWelcomeRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SendWelcomeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendWelcomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Counts of users by status, MFA and activity.
     * </pre>
     */
    public void getUserStats(identity.v1.Identity.GetUserStatsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The signed-in user's own profile. Any user with a user token may call them (no permission):
     * the user is the subject of the token, never a field of the request, so nobody can reach
     * another user through them. Service tokens are refused.
     * </pre>
     */
    public void getMe(identity.v1.Identity.GetMeRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetMeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMe changes the own name and locale; an empty field keeps the current value.
     * </pre>
     */
    public void updateMe(identity.v1.Identity.UpdateMeRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateMeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMyAvatar(identity.v1.Identity.SetMyAvatarRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetMyAvatarResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMyAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The settings the signed-in user keeps for one application ("dictionary"): a JSON object that
     * identity stores without looking inside; the application validates what it writes. Same rules as
     * the other "me" methods (user token, no permission). Called by the application on behalf of the
     * user (token exchange), not by the browser.
     * </pre>
     */
    public void getMyUserSettings(identity.v1.Identity.GetMyUserSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetMyUserSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyUserSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putMyUserSettings(identity.v1.Identity.PutMyUserSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.PutMyUserSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMyUserSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Roles. Permission: identity:role:read for List, identity:role:write for the others.
     * </pre>
     */
    public void createRole(identity.v1.Identity.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreateRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRolePermissions(identity.v1.Identity.SetRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetRolePermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoles(identity.v1.Identity.ListRolesRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRole(identity.v1.Identity.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(identity.v1.Identity.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The catalog of permissions roles can be given (wildcards are entries too).
     * </pre>
     */
    public void listPermissions(identity.v1.Identity.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPermission(identity.v1.Identity.CreatePermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreatePermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePermission changes the description; the name is the key.
     * </pre>
     */
    public void updatePermission(identity.v1.Identity.UpdatePermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdatePermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePermission fails while a role holds the permission.
     * </pre>
     */
    public void deletePermission(identity.v1.Identity.DeletePermissionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeletePermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRole(identity.v1.Identity.AssignRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.AssignRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeRole(identity.v1.Identity.RevokeRoleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clients. Permission: identity:client:read for List, identity:client:write for the others.
     * </pre>
     */
    public void createClient(identity.v1.Identity.CreateClientRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.CreateClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(identity.v1.Identity.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setClientDisabled(identity.v1.Identity.SetClientDisabledRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetClientDisabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetClientDisabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(identity.v1.Identity.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteClientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rotateClientSecret(identity.v1.Identity.RotateClientSecretRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RotateClientSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateClientSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listClients(identity.v1.Identity.ListClientsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListClientsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Token exchange policies (deny by default). Permission: identity:exchange:read for List,
     * identity:exchange:write for Set.
     * </pre>
     */
    public void setExchangePolicy(identity.v1.Identity.SetExchangePolicyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetExchangePolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetExchangePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchangePolicies(identity.v1.Identity.ListExchangePoliciesRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListExchangePoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExchangePoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Multi-factor authentication. Permission: identity:mfa:read for Get, identity:mfa:write for the others.
     * </pre>
     */
    public void getUserMFA(identity.v1.Identity.GetUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUserMFA(identity.v1.Identity.SetUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enforceUserMFA(identity.v1.Identity.EnforceUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.EnforceUserMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnforceUserMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetUserMFA(identity.v1.Identity.ResetUserMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ResetUserMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetUserMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The look of the web apps (admin, dictionary, sign in), one value for the whole system.
     * GetUIStyle: any signed-in user (no permission); the sign in pages read it through the public
     * /auth-api/ui-style instead. SetUIStyle. Permission: identity:settings:write.
     * </pre>
     */
    public void getUIStyle(identity.v1.Identity.GetUIStyleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetUIStyleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUIStyleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUIStyle(identity.v1.Identity.SetUIStyleRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetUIStyleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUIStyleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IdentityService.
   * <pre>
   * IdentityService is the internal administration API of identity. The OAuth 2.0 and OpenID
   * Connect endpoints (authorize, token, revoke, userinfo, JWKS) are HTTP and are not part of
   * this contract. Every method needs a permission, see the comment of the method.
   * </pre>
   */
  public static final class IdentityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IdentityServiceBlockingStub> {
    private IdentityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Introspect reports whether an access token is active (RFC 7662). Permission: identity:token:read.
     * </pre>
     */
    public identity.v1.Identity.IntrospectResponse introspect(identity.v1.Identity.IntrospectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntrospectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CheckPermission reports whether a user holds a permission. Permission: identity:permission:read.
     * </pre>
     */
    public identity.v1.Identity.CheckPermissionResponse checkPermission(identity.v1.Identity.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeToken revokes an access token by jti. Permission: identity:token:write.
     * </pre>
     */
    public identity.v1.Identity.RevokeTokenResponse revokeToken(identity.v1.Identity.RevokeTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Users. Permission: identity:user:read for Get and List, identity:user:write for the others.
     * </pre>
     */
    public identity.v1.Identity.GetUserResponse getUser(identity.v1.Identity.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.ListUsersResponse listUsers(identity.v1.Identity.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.CreateUserResponse createUser(identity.v1.Identity.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetUserDisabledResponse setUserDisabled(identity.v1.Identity.SetUserDisabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserDisabledMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetUserPasswordResponse setUserPassword(identity.v1.Identity.SetUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SendPasswordResetResponse sendPasswordReset(identity.v1.Identity.SendPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUser changes the name and the locale. SetUserAvatar stores (or clears) the picture.
     * </pre>
     */
    public identity.v1.Identity.UpdateUserResponse updateUser(identity.v1.Identity.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetUserAvatarResponse setUserAvatar(identity.v1.Identity.SetUserAvatarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserAvatarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendWelcome (re)sends the welcome mail with a link to set the first password. Only for a
     * user who has no password yet (status PENDING).
     * </pre>
     */
    public identity.v1.Identity.SendWelcomeResponse sendWelcome(identity.v1.Identity.SendWelcomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendWelcomeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Counts of users by status, MFA and activity.
     * </pre>
     */
    public identity.v1.Identity.GetUserStatsResponse getUserStats(identity.v1.Identity.GetUserStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The signed-in user's own profile. Any user with a user token may call them (no permission):
     * the user is the subject of the token, never a field of the request, so nobody can reach
     * another user through them. Service tokens are refused.
     * </pre>
     */
    public identity.v1.Identity.GetMeResponse getMe(identity.v1.Identity.GetMeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMe changes the own name and locale; an empty field keeps the current value.
     * </pre>
     */
    public identity.v1.Identity.UpdateMeResponse updateMe(identity.v1.Identity.UpdateMeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMeMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetMyAvatarResponse setMyAvatar(identity.v1.Identity.SetMyAvatarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMyAvatarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The settings the signed-in user keeps for one application ("dictionary"): a JSON object that
     * identity stores without looking inside; the application validates what it writes. Same rules as
     * the other "me" methods (user token, no permission). Called by the application on behalf of the
     * user (token exchange), not by the browser.
     * </pre>
     */
    public identity.v1.Identity.GetMyUserSettingsResponse getMyUserSettings(identity.v1.Identity.GetMyUserSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyUserSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.PutMyUserSettingsResponse putMyUserSettings(identity.v1.Identity.PutMyUserSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMyUserSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Roles. Permission: identity:role:read for List, identity:role:write for the others.
     * </pre>
     */
    public identity.v1.Identity.CreateRoleResponse createRole(identity.v1.Identity.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetRolePermissionsResponse setRolePermissions(identity.v1.Identity.SetRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRolePermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.ListRolesResponse listRoles(identity.v1.Identity.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.UpdateRoleResponse updateRole(identity.v1.Identity.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.DeleteRoleResponse deleteRole(identity.v1.Identity.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The catalog of permissions roles can be given (wildcards are entries too).
     * </pre>
     */
    public identity.v1.Identity.ListPermissionsResponse listPermissions(identity.v1.Identity.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.CreatePermissionResponse createPermission(identity.v1.Identity.CreatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePermission changes the description; the name is the key.
     * </pre>
     */
    public identity.v1.Identity.UpdatePermissionResponse updatePermission(identity.v1.Identity.UpdatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePermission fails while a role holds the permission.
     * </pre>
     */
    public identity.v1.Identity.DeletePermissionResponse deletePermission(identity.v1.Identity.DeletePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.AssignRoleResponse assignRole(identity.v1.Identity.AssignRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RevokeRoleResponse revokeRole(identity.v1.Identity.RevokeRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clients. Permission: identity:client:read for List, identity:client:write for the others.
     * </pre>
     */
    public identity.v1.Identity.CreateClientResponse createClient(identity.v1.Identity.CreateClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.UpdateClientResponse updateClient(identity.v1.Identity.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetClientDisabledResponse setClientDisabled(identity.v1.Identity.SetClientDisabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetClientDisabledMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.DeleteClientResponse deleteClient(identity.v1.Identity.DeleteClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RotateClientSecretResponse rotateClientSecret(identity.v1.Identity.RotateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateClientSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.ListClientsResponse listClients(identity.v1.Identity.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Token exchange policies (deny by default). Permission: identity:exchange:read for List,
     * identity:exchange:write for Set.
     * </pre>
     */
    public identity.v1.Identity.SetExchangePolicyResponse setExchangePolicy(identity.v1.Identity.SetExchangePolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetExchangePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.ListExchangePoliciesResponse listExchangePolicies(identity.v1.Identity.ListExchangePoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExchangePoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Multi-factor authentication. Permission: identity:mfa:read for Get, identity:mfa:write for the others.
     * </pre>
     */
    public identity.v1.Identity.GetUserMFAResponse getUserMFA(identity.v1.Identity.GetUserMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMFAMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetUserMFAResponse setUserMFA(identity.v1.Identity.SetUserMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserMFAMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.EnforceUserMFAResponse enforceUserMFA(identity.v1.Identity.EnforceUserMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnforceUserMFAMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.ResetUserMFAResponse resetUserMFA(identity.v1.Identity.ResetUserMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetUserMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The look of the web apps (admin, dictionary, sign in), one value for the whole system.
     * GetUIStyle: any signed-in user (no permission); the sign in pages read it through the public
     * /auth-api/ui-style instead. SetUIStyle. Permission: identity:settings:write.
     * </pre>
     */
    public identity.v1.Identity.GetUIStyleResponse getUIStyle(identity.v1.Identity.GetUIStyleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUIStyleMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetUIStyleResponse setUIStyle(identity.v1.Identity.SetUIStyleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUIStyleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IdentityService.
   * <pre>
   * IdentityService is the internal administration API of identity. The OAuth 2.0 and OpenID
   * Connect endpoints (authorize, token, revoke, userinfo, JWKS) are HTTP and are not part of
   * this contract. Every method needs a permission, see the comment of the method.
   * </pre>
   */
  public static final class IdentityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IdentityServiceFutureStub> {
    private IdentityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Introspect reports whether an access token is active (RFC 7662). Permission: identity:token:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.IntrospectResponse> introspect(
        identity.v1.Identity.IntrospectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntrospectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CheckPermission reports whether a user holds a permission. Permission: identity:permission:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.CheckPermissionResponse> checkPermission(
        identity.v1.Identity.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeToken revokes an access token by jti. Permission: identity:token:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RevokeTokenResponse> revokeToken(
        identity.v1.Identity.RevokeTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Users. Permission: identity:user:read for Get and List, identity:user:write for the others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetUserResponse> getUser(
        identity.v1.Identity.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListUsersResponse> listUsers(
        identity.v1.Identity.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.CreateUserResponse> createUser(
        identity.v1.Identity.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetUserDisabledResponse> setUserDisabled(
        identity.v1.Identity.SetUserDisabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserDisabledMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetUserPasswordResponse> setUserPassword(
        identity.v1.Identity.SetUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SendPasswordResetResponse> sendPasswordReset(
        identity.v1.Identity.SendPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUser changes the name and the locale. SetUserAvatar stores (or clears) the picture.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.UpdateUserResponse> updateUser(
        identity.v1.Identity.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetUserAvatarResponse> setUserAvatar(
        identity.v1.Identity.SetUserAvatarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserAvatarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendWelcome (re)sends the welcome mail with a link to set the first password. Only for a
     * user who has no password yet (status PENDING).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SendWelcomeResponse> sendWelcome(
        identity.v1.Identity.SendWelcomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendWelcomeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Counts of users by status, MFA and activity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetUserStatsResponse> getUserStats(
        identity.v1.Identity.GetUserStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The signed-in user's own profile. Any user with a user token may call them (no permission):
     * the user is the subject of the token, never a field of the request, so nobody can reach
     * another user through them. Service tokens are refused.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetMeResponse> getMe(
        identity.v1.Identity.GetMeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMe changes the own name and locale; an empty field keeps the current value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.UpdateMeResponse> updateMe(
        identity.v1.Identity.UpdateMeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetMyAvatarResponse> setMyAvatar(
        identity.v1.Identity.SetMyAvatarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMyAvatarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The settings the signed-in user keeps for one application ("dictionary"): a JSON object that
     * identity stores without looking inside; the application validates what it writes. Same rules as
     * the other "me" methods (user token, no permission). Called by the application on behalf of the
     * user (token exchange), not by the browser.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetMyUserSettingsResponse> getMyUserSettings(
        identity.v1.Identity.GetMyUserSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyUserSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.PutMyUserSettingsResponse> putMyUserSettings(
        identity.v1.Identity.PutMyUserSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMyUserSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Roles. Permission: identity:role:read for List, identity:role:write for the others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.CreateRoleResponse> createRole(
        identity.v1.Identity.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetRolePermissionsResponse> setRolePermissions(
        identity.v1.Identity.SetRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRolePermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListRolesResponse> listRoles(
        identity.v1.Identity.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.UpdateRoleResponse> updateRole(
        identity.v1.Identity.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.DeleteRoleResponse> deleteRole(
        identity.v1.Identity.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The catalog of permissions roles can be given (wildcards are entries too).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListPermissionsResponse> listPermissions(
        identity.v1.Identity.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.CreatePermissionResponse> createPermission(
        identity.v1.Identity.CreatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePermission changes the description; the name is the key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.UpdatePermissionResponse> updatePermission(
        identity.v1.Identity.UpdatePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePermission fails while a role holds the permission.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.DeletePermissionResponse> deletePermission(
        identity.v1.Identity.DeletePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.AssignRoleResponse> assignRole(
        identity.v1.Identity.AssignRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RevokeRoleResponse> revokeRole(
        identity.v1.Identity.RevokeRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clients. Permission: identity:client:read for List, identity:client:write for the others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.CreateClientResponse> createClient(
        identity.v1.Identity.CreateClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.UpdateClientResponse> updateClient(
        identity.v1.Identity.UpdateClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetClientDisabledResponse> setClientDisabled(
        identity.v1.Identity.SetClientDisabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetClientDisabledMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.DeleteClientResponse> deleteClient(
        identity.v1.Identity.DeleteClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RotateClientSecretResponse> rotateClientSecret(
        identity.v1.Identity.RotateClientSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateClientSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListClientsResponse> listClients(
        identity.v1.Identity.ListClientsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Token exchange policies (deny by default). Permission: identity:exchange:read for List,
     * identity:exchange:write for Set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetExchangePolicyResponse> setExchangePolicy(
        identity.v1.Identity.SetExchangePolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetExchangePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListExchangePoliciesResponse> listExchangePolicies(
        identity.v1.Identity.ListExchangePoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExchangePoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Multi-factor authentication. Permission: identity:mfa:read for Get, identity:mfa:write for the others.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetUserMFAResponse> getUserMFA(
        identity.v1.Identity.GetUserMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMFAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetUserMFAResponse> setUserMFA(
        identity.v1.Identity.SetUserMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserMFAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.EnforceUserMFAResponse> enforceUserMFA(
        identity.v1.Identity.EnforceUserMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnforceUserMFAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ResetUserMFAResponse> resetUserMFA(
        identity.v1.Identity.ResetUserMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetUserMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The look of the web apps (admin, dictionary, sign in), one value for the whole system.
     * GetUIStyle: any signed-in user (no permission); the sign in pages read it through the public
     * /auth-api/ui-style instead. SetUIStyle. Permission: identity:settings:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetUIStyleResponse> getUIStyle(
        identity.v1.Identity.GetUIStyleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUIStyleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetUIStyleResponse> setUIStyle(
        identity.v1.Identity.SetUIStyleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUIStyleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTROSPECT = 0;
  private static final int METHODID_CHECK_PERMISSION = 1;
  private static final int METHODID_REVOKE_TOKEN = 2;
  private static final int METHODID_GET_USER = 3;
  private static final int METHODID_LIST_USERS = 4;
  private static final int METHODID_CREATE_USER = 5;
  private static final int METHODID_SET_USER_DISABLED = 6;
  private static final int METHODID_SET_USER_PASSWORD = 7;
  private static final int METHODID_SEND_PASSWORD_RESET = 8;
  private static final int METHODID_UPDATE_USER = 9;
  private static final int METHODID_SET_USER_AVATAR = 10;
  private static final int METHODID_SEND_WELCOME = 11;
  private static final int METHODID_GET_USER_STATS = 12;
  private static final int METHODID_GET_ME = 13;
  private static final int METHODID_UPDATE_ME = 14;
  private static final int METHODID_SET_MY_AVATAR = 15;
  private static final int METHODID_GET_MY_USER_SETTINGS = 16;
  private static final int METHODID_PUT_MY_USER_SETTINGS = 17;
  private static final int METHODID_CREATE_ROLE = 18;
  private static final int METHODID_SET_ROLE_PERMISSIONS = 19;
  private static final int METHODID_LIST_ROLES = 20;
  private static final int METHODID_UPDATE_ROLE = 21;
  private static final int METHODID_DELETE_ROLE = 22;
  private static final int METHODID_LIST_PERMISSIONS = 23;
  private static final int METHODID_CREATE_PERMISSION = 24;
  private static final int METHODID_UPDATE_PERMISSION = 25;
  private static final int METHODID_DELETE_PERMISSION = 26;
  private static final int METHODID_ASSIGN_ROLE = 27;
  private static final int METHODID_REVOKE_ROLE = 28;
  private static final int METHODID_CREATE_CLIENT = 29;
  private static final int METHODID_UPDATE_CLIENT = 30;
  private static final int METHODID_SET_CLIENT_DISABLED = 31;
  private static final int METHODID_DELETE_CLIENT = 32;
  private static final int METHODID_ROTATE_CLIENT_SECRET = 33;
  private static final int METHODID_LIST_CLIENTS = 34;
  private static final int METHODID_SET_EXCHANGE_POLICY = 35;
  private static final int METHODID_LIST_EXCHANGE_POLICIES = 36;
  private static final int METHODID_GET_USER_MFA = 37;
  private static final int METHODID_SET_USER_MFA = 38;
  private static final int METHODID_ENFORCE_USER_MFA = 39;
  private static final int METHODID_RESET_USER_MFA = 40;
  private static final int METHODID_GET_UISTYLE = 41;
  private static final int METHODID_SET_UISTYLE = 42;

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
        case METHODID_INTROSPECT:
          serviceImpl.introspect((identity.v1.Identity.IntrospectRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.IntrospectResponse>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSION:
          serviceImpl.checkPermission((identity.v1.Identity.CheckPermissionRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.CheckPermissionResponse>) responseObserver);
          break;
        case METHODID_REVOKE_TOKEN:
          serviceImpl.revokeToken((identity.v1.Identity.RevokeTokenRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeTokenResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((identity.v1.Identity.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((identity.v1.Identity.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((identity.v1.Identity.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.CreateUserResponse>) responseObserver);
          break;
        case METHODID_SET_USER_DISABLED:
          serviceImpl.setUserDisabled((identity.v1.Identity.SetUserDisabledRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserDisabledResponse>) responseObserver);
          break;
        case METHODID_SET_USER_PASSWORD:
          serviceImpl.setUserPassword((identity.v1.Identity.SetUserPasswordRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserPasswordResponse>) responseObserver);
          break;
        case METHODID_SEND_PASSWORD_RESET:
          serviceImpl.sendPasswordReset((identity.v1.Identity.SendPasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SendPasswordResetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((identity.v1.Identity.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_SET_USER_AVATAR:
          serviceImpl.setUserAvatar((identity.v1.Identity.SetUserAvatarRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserAvatarResponse>) responseObserver);
          break;
        case METHODID_SEND_WELCOME:
          serviceImpl.sendWelcome((identity.v1.Identity.SendWelcomeRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SendWelcomeResponse>) responseObserver);
          break;
        case METHODID_GET_USER_STATS:
          serviceImpl.getUserStats((identity.v1.Identity.GetUserStatsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserStatsResponse>) responseObserver);
          break;
        case METHODID_GET_ME:
          serviceImpl.getMe((identity.v1.Identity.GetMeRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetMeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ME:
          serviceImpl.updateMe((identity.v1.Identity.UpdateMeRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateMeResponse>) responseObserver);
          break;
        case METHODID_SET_MY_AVATAR:
          serviceImpl.setMyAvatar((identity.v1.Identity.SetMyAvatarRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetMyAvatarResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER_SETTINGS:
          serviceImpl.getMyUserSettings((identity.v1.Identity.GetMyUserSettingsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetMyUserSettingsResponse>) responseObserver);
          break;
        case METHODID_PUT_MY_USER_SETTINGS:
          serviceImpl.putMyUserSettings((identity.v1.Identity.PutMyUserSettingsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.PutMyUserSettingsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROLE:
          serviceImpl.createRole((identity.v1.Identity.CreateRoleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.CreateRoleResponse>) responseObserver);
          break;
        case METHODID_SET_ROLE_PERMISSIONS:
          serviceImpl.setRolePermissions((identity.v1.Identity.SetRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetRolePermissionsResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((identity.v1.Identity.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListRolesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE:
          serviceImpl.updateRole((identity.v1.Identity.UpdateRoleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateRoleResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((identity.v1.Identity.DeleteRoleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_PERMISSIONS:
          serviceImpl.listPermissions((identity.v1.Identity.ListPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListPermissionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_PERMISSION:
          serviceImpl.createPermission((identity.v1.Identity.CreatePermissionRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.CreatePermissionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERMISSION:
          serviceImpl.updatePermission((identity.v1.Identity.UpdatePermissionRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.UpdatePermissionResponse>) responseObserver);
          break;
        case METHODID_DELETE_PERMISSION:
          serviceImpl.deletePermission((identity.v1.Identity.DeletePermissionRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.DeletePermissionResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLE:
          serviceImpl.assignRole((identity.v1.Identity.AssignRoleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.AssignRoleResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ROLE:
          serviceImpl.revokeRole((identity.v1.Identity.RevokeRoleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeRoleResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT:
          serviceImpl.createClient((identity.v1.Identity.CreateClientRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.CreateClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((identity.v1.Identity.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.UpdateClientResponse>) responseObserver);
          break;
        case METHODID_SET_CLIENT_DISABLED:
          serviceImpl.setClientDisabled((identity.v1.Identity.SetClientDisabledRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetClientDisabledResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((identity.v1.Identity.DeleteClientRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteClientResponse>) responseObserver);
          break;
        case METHODID_ROTATE_CLIENT_SECRET:
          serviceImpl.rotateClientSecret((identity.v1.Identity.RotateClientSecretRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RotateClientSecretResponse>) responseObserver);
          break;
        case METHODID_LIST_CLIENTS:
          serviceImpl.listClients((identity.v1.Identity.ListClientsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListClientsResponse>) responseObserver);
          break;
        case METHODID_SET_EXCHANGE_POLICY:
          serviceImpl.setExchangePolicy((identity.v1.Identity.SetExchangePolicyRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetExchangePolicyResponse>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGE_POLICIES:
          serviceImpl.listExchangePolicies((identity.v1.Identity.ListExchangePoliciesRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListExchangePoliciesResponse>) responseObserver);
          break;
        case METHODID_GET_USER_MFA:
          serviceImpl.getUserMFA((identity.v1.Identity.GetUserMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetUserMFAResponse>) responseObserver);
          break;
        case METHODID_SET_USER_MFA:
          serviceImpl.setUserMFA((identity.v1.Identity.SetUserMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetUserMFAResponse>) responseObserver);
          break;
        case METHODID_ENFORCE_USER_MFA:
          serviceImpl.enforceUserMFA((identity.v1.Identity.EnforceUserMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.EnforceUserMFAResponse>) responseObserver);
          break;
        case METHODID_RESET_USER_MFA:
          serviceImpl.resetUserMFA((identity.v1.Identity.ResetUserMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ResetUserMFAResponse>) responseObserver);
          break;
        case METHODID_GET_UISTYLE:
          serviceImpl.getUIStyle((identity.v1.Identity.GetUIStyleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetUIStyleResponse>) responseObserver);
          break;
        case METHODID_SET_UISTYLE:
          serviceImpl.setUIStyle((identity.v1.Identity.SetUIStyleRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetUIStyleResponse>) responseObserver);
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
          getIntrospectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.IntrospectRequest,
              identity.v1.Identity.IntrospectResponse>(
                service, METHODID_INTROSPECT)))
        .addMethod(
          getCheckPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.CheckPermissionRequest,
              identity.v1.Identity.CheckPermissionResponse>(
                service, METHODID_CHECK_PERMISSION)))
        .addMethod(
          getRevokeTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RevokeTokenRequest,
              identity.v1.Identity.RevokeTokenResponse>(
                service, METHODID_REVOKE_TOKEN)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetUserRequest,
              identity.v1.Identity.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListUsersRequest,
              identity.v1.Identity.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.CreateUserRequest,
              identity.v1.Identity.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getSetUserDisabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetUserDisabledRequest,
              identity.v1.Identity.SetUserDisabledResponse>(
                service, METHODID_SET_USER_DISABLED)))
        .addMethod(
          getSetUserPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetUserPasswordRequest,
              identity.v1.Identity.SetUserPasswordResponse>(
                service, METHODID_SET_USER_PASSWORD)))
        .addMethod(
          getSendPasswordResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SendPasswordResetRequest,
              identity.v1.Identity.SendPasswordResetResponse>(
                service, METHODID_SEND_PASSWORD_RESET)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.UpdateUserRequest,
              identity.v1.Identity.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getSetUserAvatarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetUserAvatarRequest,
              identity.v1.Identity.SetUserAvatarResponse>(
                service, METHODID_SET_USER_AVATAR)))
        .addMethod(
          getSendWelcomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SendWelcomeRequest,
              identity.v1.Identity.SendWelcomeResponse>(
                service, METHODID_SEND_WELCOME)))
        .addMethod(
          getGetUserStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetUserStatsRequest,
              identity.v1.Identity.GetUserStatsResponse>(
                service, METHODID_GET_USER_STATS)))
        .addMethod(
          getGetMeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetMeRequest,
              identity.v1.Identity.GetMeResponse>(
                service, METHODID_GET_ME)))
        .addMethod(
          getUpdateMeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.UpdateMeRequest,
              identity.v1.Identity.UpdateMeResponse>(
                service, METHODID_UPDATE_ME)))
        .addMethod(
          getSetMyAvatarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetMyAvatarRequest,
              identity.v1.Identity.SetMyAvatarResponse>(
                service, METHODID_SET_MY_AVATAR)))
        .addMethod(
          getGetMyUserSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetMyUserSettingsRequest,
              identity.v1.Identity.GetMyUserSettingsResponse>(
                service, METHODID_GET_MY_USER_SETTINGS)))
        .addMethod(
          getPutMyUserSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.PutMyUserSettingsRequest,
              identity.v1.Identity.PutMyUserSettingsResponse>(
                service, METHODID_PUT_MY_USER_SETTINGS)))
        .addMethod(
          getCreateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.CreateRoleRequest,
              identity.v1.Identity.CreateRoleResponse>(
                service, METHODID_CREATE_ROLE)))
        .addMethod(
          getSetRolePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetRolePermissionsRequest,
              identity.v1.Identity.SetRolePermissionsResponse>(
                service, METHODID_SET_ROLE_PERMISSIONS)))
        .addMethod(
          getListRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListRolesRequest,
              identity.v1.Identity.ListRolesResponse>(
                service, METHODID_LIST_ROLES)))
        .addMethod(
          getUpdateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.UpdateRoleRequest,
              identity.v1.Identity.UpdateRoleResponse>(
                service, METHODID_UPDATE_ROLE)))
        .addMethod(
          getDeleteRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.DeleteRoleRequest,
              identity.v1.Identity.DeleteRoleResponse>(
                service, METHODID_DELETE_ROLE)))
        .addMethod(
          getListPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListPermissionsRequest,
              identity.v1.Identity.ListPermissionsResponse>(
                service, METHODID_LIST_PERMISSIONS)))
        .addMethod(
          getCreatePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.CreatePermissionRequest,
              identity.v1.Identity.CreatePermissionResponse>(
                service, METHODID_CREATE_PERMISSION)))
        .addMethod(
          getUpdatePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.UpdatePermissionRequest,
              identity.v1.Identity.UpdatePermissionResponse>(
                service, METHODID_UPDATE_PERMISSION)))
        .addMethod(
          getDeletePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.DeletePermissionRequest,
              identity.v1.Identity.DeletePermissionResponse>(
                service, METHODID_DELETE_PERMISSION)))
        .addMethod(
          getAssignRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.AssignRoleRequest,
              identity.v1.Identity.AssignRoleResponse>(
                service, METHODID_ASSIGN_ROLE)))
        .addMethod(
          getRevokeRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RevokeRoleRequest,
              identity.v1.Identity.RevokeRoleResponse>(
                service, METHODID_REVOKE_ROLE)))
        .addMethod(
          getCreateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.CreateClientRequest,
              identity.v1.Identity.CreateClientResponse>(
                service, METHODID_CREATE_CLIENT)))
        .addMethod(
          getUpdateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.UpdateClientRequest,
              identity.v1.Identity.UpdateClientResponse>(
                service, METHODID_UPDATE_CLIENT)))
        .addMethod(
          getSetClientDisabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetClientDisabledRequest,
              identity.v1.Identity.SetClientDisabledResponse>(
                service, METHODID_SET_CLIENT_DISABLED)))
        .addMethod(
          getDeleteClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.DeleteClientRequest,
              identity.v1.Identity.DeleteClientResponse>(
                service, METHODID_DELETE_CLIENT)))
        .addMethod(
          getRotateClientSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RotateClientSecretRequest,
              identity.v1.Identity.RotateClientSecretResponse>(
                service, METHODID_ROTATE_CLIENT_SECRET)))
        .addMethod(
          getListClientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListClientsRequest,
              identity.v1.Identity.ListClientsResponse>(
                service, METHODID_LIST_CLIENTS)))
        .addMethod(
          getSetExchangePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetExchangePolicyRequest,
              identity.v1.Identity.SetExchangePolicyResponse>(
                service, METHODID_SET_EXCHANGE_POLICY)))
        .addMethod(
          getListExchangePoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListExchangePoliciesRequest,
              identity.v1.Identity.ListExchangePoliciesResponse>(
                service, METHODID_LIST_EXCHANGE_POLICIES)))
        .addMethod(
          getGetUserMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetUserMFARequest,
              identity.v1.Identity.GetUserMFAResponse>(
                service, METHODID_GET_USER_MFA)))
        .addMethod(
          getSetUserMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetUserMFARequest,
              identity.v1.Identity.SetUserMFAResponse>(
                service, METHODID_SET_USER_MFA)))
        .addMethod(
          getEnforceUserMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.EnforceUserMFARequest,
              identity.v1.Identity.EnforceUserMFAResponse>(
                service, METHODID_ENFORCE_USER_MFA)))
        .addMethod(
          getResetUserMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ResetUserMFARequest,
              identity.v1.Identity.ResetUserMFAResponse>(
                service, METHODID_RESET_USER_MFA)))
        .addMethod(
          getGetUIStyleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetUIStyleRequest,
              identity.v1.Identity.GetUIStyleResponse>(
                service, METHODID_GET_UISTYLE)))
        .addMethod(
          getSetUIStyleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetUIStyleRequest,
              identity.v1.Identity.SetUIStyleResponse>(
                service, METHODID_SET_UISTYLE)))
        .build();
  }

  private static abstract class IdentityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return identity.v1.Identity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityService");
    }
  }

  private static final class IdentityServiceFileDescriptorSupplier
      extends IdentityServiceBaseDescriptorSupplier {
    IdentityServiceFileDescriptorSupplier() {}
  }

  private static final class IdentityServiceMethodDescriptorSupplier
      extends IdentityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IdentityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IdentityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityServiceFileDescriptorSupplier())
              .addMethod(getIntrospectMethod())
              .addMethod(getCheckPermissionMethod())
              .addMethod(getRevokeTokenMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getSetUserDisabledMethod())
              .addMethod(getSetUserPasswordMethod())
              .addMethod(getSendPasswordResetMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getSetUserAvatarMethod())
              .addMethod(getSendWelcomeMethod())
              .addMethod(getGetUserStatsMethod())
              .addMethod(getGetMeMethod())
              .addMethod(getUpdateMeMethod())
              .addMethod(getSetMyAvatarMethod())
              .addMethod(getGetMyUserSettingsMethod())
              .addMethod(getPutMyUserSettingsMethod())
              .addMethod(getCreateRoleMethod())
              .addMethod(getSetRolePermissionsMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getListPermissionsMethod())
              .addMethod(getCreatePermissionMethod())
              .addMethod(getUpdatePermissionMethod())
              .addMethod(getDeletePermissionMethod())
              .addMethod(getAssignRoleMethod())
              .addMethod(getRevokeRoleMethod())
              .addMethod(getCreateClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getSetClientDisabledMethod())
              .addMethod(getDeleteClientMethod())
              .addMethod(getRotateClientSecretMethod())
              .addMethod(getListClientsMethod())
              .addMethod(getSetExchangePolicyMethod())
              .addMethod(getListExchangePoliciesMethod())
              .addMethod(getGetUserMFAMethod())
              .addMethod(getSetUserMFAMethod())
              .addMethod(getEnforceUserMFAMethod())
              .addMethod(getResetUserMFAMethod())
              .addMethod(getGetUIStyleMethod())
              .addMethod(getSetUIStyleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
