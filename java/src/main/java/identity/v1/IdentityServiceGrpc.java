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

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListUserSessionsRequest,
      identity.v1.Identity.ListUserSessionsResponse> getListUserSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSessions",
      requestType = identity.v1.Identity.ListUserSessionsRequest.class,
      responseType = identity.v1.Identity.ListUserSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListUserSessionsRequest,
      identity.v1.Identity.ListUserSessionsResponse> getListUserSessionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListUserSessionsRequest, identity.v1.Identity.ListUserSessionsResponse> getListUserSessionsMethod;
    if ((getListUserSessionsMethod = IdentityServiceGrpc.getListUserSessionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListUserSessionsMethod = IdentityServiceGrpc.getListUserSessionsMethod) == null) {
          IdentityServiceGrpc.getListUserSessionsMethod = getListUserSessionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListUserSessionsRequest, identity.v1.Identity.ListUserSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListUserSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListUserSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListUserSessions"))
              .build();
        }
      }
    }
    return getListUserSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RevokeUserSessionsRequest,
      identity.v1.Identity.RevokeUserSessionsResponse> getRevokeUserSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeUserSessions",
      requestType = identity.v1.Identity.RevokeUserSessionsRequest.class,
      responseType = identity.v1.Identity.RevokeUserSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RevokeUserSessionsRequest,
      identity.v1.Identity.RevokeUserSessionsResponse> getRevokeUserSessionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RevokeUserSessionsRequest, identity.v1.Identity.RevokeUserSessionsResponse> getRevokeUserSessionsMethod;
    if ((getRevokeUserSessionsMethod = IdentityServiceGrpc.getRevokeUserSessionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRevokeUserSessionsMethod = IdentityServiceGrpc.getRevokeUserSessionsMethod) == null) {
          IdentityServiceGrpc.getRevokeUserSessionsMethod = getRevokeUserSessionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RevokeUserSessionsRequest, identity.v1.Identity.RevokeUserSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeUserSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeUserSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeUserSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RevokeUserSessions"))
              .build();
        }
      }
    }
    return getRevokeUserSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.DeleteUserRequest,
      identity.v1.Identity.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = identity.v1.Identity.DeleteUserRequest.class,
      responseType = identity.v1.Identity.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.DeleteUserRequest,
      identity.v1.Identity.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.DeleteUserRequest, identity.v1.Identity.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = IdentityServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getDeleteUserMethod = IdentityServiceGrpc.getDeleteUserMethod) == null) {
          IdentityServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.DeleteUserRequest, identity.v1.Identity.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
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

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ApproveUserRequest,
      identity.v1.Identity.ApproveUserResponse> getApproveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveUser",
      requestType = identity.v1.Identity.ApproveUserRequest.class,
      responseType = identity.v1.Identity.ApproveUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ApproveUserRequest,
      identity.v1.Identity.ApproveUserResponse> getApproveUserMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ApproveUserRequest, identity.v1.Identity.ApproveUserResponse> getApproveUserMethod;
    if ((getApproveUserMethod = IdentityServiceGrpc.getApproveUserMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getApproveUserMethod = IdentityServiceGrpc.getApproveUserMethod) == null) {
          IdentityServiceGrpc.getApproveUserMethod = getApproveUserMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ApproveUserRequest, identity.v1.Identity.ApproveUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ApproveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ApproveUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ApproveUser"))
              .build();
        }
      }
    }
    return getApproveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RejectUserRequest,
      identity.v1.Identity.RejectUserResponse> getRejectUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RejectUser",
      requestType = identity.v1.Identity.RejectUserRequest.class,
      responseType = identity.v1.Identity.RejectUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RejectUserRequest,
      identity.v1.Identity.RejectUserResponse> getRejectUserMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RejectUserRequest, identity.v1.Identity.RejectUserResponse> getRejectUserMethod;
    if ((getRejectUserMethod = IdentityServiceGrpc.getRejectUserMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRejectUserMethod = IdentityServiceGrpc.getRejectUserMethod) == null) {
          IdentityServiceGrpc.getRejectUserMethod = getRejectUserMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RejectUserRequest, identity.v1.Identity.RejectUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RejectUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RejectUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RejectUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RejectUser"))
              .build();
        }
      }
    }
    return getRejectUserMethod;
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

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ChangeMyPasswordRequest,
      identity.v1.Identity.ChangeMyPasswordResponse> getChangeMyPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeMyPassword",
      requestType = identity.v1.Identity.ChangeMyPasswordRequest.class,
      responseType = identity.v1.Identity.ChangeMyPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ChangeMyPasswordRequest,
      identity.v1.Identity.ChangeMyPasswordResponse> getChangeMyPasswordMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ChangeMyPasswordRequest, identity.v1.Identity.ChangeMyPasswordResponse> getChangeMyPasswordMethod;
    if ((getChangeMyPasswordMethod = IdentityServiceGrpc.getChangeMyPasswordMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getChangeMyPasswordMethod = IdentityServiceGrpc.getChangeMyPasswordMethod) == null) {
          IdentityServiceGrpc.getChangeMyPasswordMethod = getChangeMyPasswordMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ChangeMyPasswordRequest, identity.v1.Identity.ChangeMyPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeMyPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ChangeMyPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ChangeMyPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ChangeMyPassword"))
              .build();
        }
      }
    }
    return getChangeMyPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetMyMFARequest,
      identity.v1.Identity.GetMyMFAResponse> getGetMyMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyMFA",
      requestType = identity.v1.Identity.GetMyMFARequest.class,
      responseType = identity.v1.Identity.GetMyMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetMyMFARequest,
      identity.v1.Identity.GetMyMFAResponse> getGetMyMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetMyMFARequest, identity.v1.Identity.GetMyMFAResponse> getGetMyMFAMethod;
    if ((getGetMyMFAMethod = IdentityServiceGrpc.getGetMyMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetMyMFAMethod = IdentityServiceGrpc.getGetMyMFAMethod) == null) {
          IdentityServiceGrpc.getGetMyMFAMethod = getGetMyMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetMyMFARequest, identity.v1.Identity.GetMyMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetMyMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetMyMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetMyMFA"))
              .build();
        }
      }
    }
    return getGetMyMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.BeginMyMFARequest,
      identity.v1.Identity.BeginMyMFAResponse> getBeginMyMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginMyMFA",
      requestType = identity.v1.Identity.BeginMyMFARequest.class,
      responseType = identity.v1.Identity.BeginMyMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.BeginMyMFARequest,
      identity.v1.Identity.BeginMyMFAResponse> getBeginMyMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.BeginMyMFARequest, identity.v1.Identity.BeginMyMFAResponse> getBeginMyMFAMethod;
    if ((getBeginMyMFAMethod = IdentityServiceGrpc.getBeginMyMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getBeginMyMFAMethod = IdentityServiceGrpc.getBeginMyMFAMethod) == null) {
          IdentityServiceGrpc.getBeginMyMFAMethod = getBeginMyMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.BeginMyMFARequest, identity.v1.Identity.BeginMyMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginMyMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.BeginMyMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.BeginMyMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("BeginMyMFA"))
              .build();
        }
      }
    }
    return getBeginMyMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ConfirmMyMFARequest,
      identity.v1.Identity.ConfirmMyMFAResponse> getConfirmMyMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmMyMFA",
      requestType = identity.v1.Identity.ConfirmMyMFARequest.class,
      responseType = identity.v1.Identity.ConfirmMyMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ConfirmMyMFARequest,
      identity.v1.Identity.ConfirmMyMFAResponse> getConfirmMyMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ConfirmMyMFARequest, identity.v1.Identity.ConfirmMyMFAResponse> getConfirmMyMFAMethod;
    if ((getConfirmMyMFAMethod = IdentityServiceGrpc.getConfirmMyMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getConfirmMyMFAMethod = IdentityServiceGrpc.getConfirmMyMFAMethod) == null) {
          IdentityServiceGrpc.getConfirmMyMFAMethod = getConfirmMyMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ConfirmMyMFARequest, identity.v1.Identity.ConfirmMyMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmMyMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ConfirmMyMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ConfirmMyMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ConfirmMyMFA"))
              .build();
        }
      }
    }
    return getConfirmMyMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.DisableMyMFARequest,
      identity.v1.Identity.DisableMyMFAResponse> getDisableMyMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableMyMFA",
      requestType = identity.v1.Identity.DisableMyMFARequest.class,
      responseType = identity.v1.Identity.DisableMyMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.DisableMyMFARequest,
      identity.v1.Identity.DisableMyMFAResponse> getDisableMyMFAMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.DisableMyMFARequest, identity.v1.Identity.DisableMyMFAResponse> getDisableMyMFAMethod;
    if ((getDisableMyMFAMethod = IdentityServiceGrpc.getDisableMyMFAMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getDisableMyMFAMethod = IdentityServiceGrpc.getDisableMyMFAMethod) == null) {
          IdentityServiceGrpc.getDisableMyMFAMethod = getDisableMyMFAMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.DisableMyMFARequest, identity.v1.Identity.DisableMyMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableMyMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DisableMyMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DisableMyMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("DisableMyMFA"))
              .build();
        }
      }
    }
    return getDisableMyMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListMyPasskeysRequest,
      identity.v1.Identity.ListMyPasskeysResponse> getListMyPasskeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMyPasskeys",
      requestType = identity.v1.Identity.ListMyPasskeysRequest.class,
      responseType = identity.v1.Identity.ListMyPasskeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListMyPasskeysRequest,
      identity.v1.Identity.ListMyPasskeysResponse> getListMyPasskeysMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListMyPasskeysRequest, identity.v1.Identity.ListMyPasskeysResponse> getListMyPasskeysMethod;
    if ((getListMyPasskeysMethod = IdentityServiceGrpc.getListMyPasskeysMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListMyPasskeysMethod = IdentityServiceGrpc.getListMyPasskeysMethod) == null) {
          IdentityServiceGrpc.getListMyPasskeysMethod = getListMyPasskeysMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListMyPasskeysRequest, identity.v1.Identity.ListMyPasskeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMyPasskeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListMyPasskeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListMyPasskeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListMyPasskeys"))
              .build();
        }
      }
    }
    return getListMyPasskeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.BeginMyPasskeyRequest,
      identity.v1.Identity.BeginMyPasskeyResponse> getBeginMyPasskeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginMyPasskey",
      requestType = identity.v1.Identity.BeginMyPasskeyRequest.class,
      responseType = identity.v1.Identity.BeginMyPasskeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.BeginMyPasskeyRequest,
      identity.v1.Identity.BeginMyPasskeyResponse> getBeginMyPasskeyMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.BeginMyPasskeyRequest, identity.v1.Identity.BeginMyPasskeyResponse> getBeginMyPasskeyMethod;
    if ((getBeginMyPasskeyMethod = IdentityServiceGrpc.getBeginMyPasskeyMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getBeginMyPasskeyMethod = IdentityServiceGrpc.getBeginMyPasskeyMethod) == null) {
          IdentityServiceGrpc.getBeginMyPasskeyMethod = getBeginMyPasskeyMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.BeginMyPasskeyRequest, identity.v1.Identity.BeginMyPasskeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginMyPasskey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.BeginMyPasskeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.BeginMyPasskeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("BeginMyPasskey"))
              .build();
        }
      }
    }
    return getBeginMyPasskeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.FinishMyPasskeyRequest,
      identity.v1.Identity.FinishMyPasskeyResponse> getFinishMyPasskeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishMyPasskey",
      requestType = identity.v1.Identity.FinishMyPasskeyRequest.class,
      responseType = identity.v1.Identity.FinishMyPasskeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.FinishMyPasskeyRequest,
      identity.v1.Identity.FinishMyPasskeyResponse> getFinishMyPasskeyMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.FinishMyPasskeyRequest, identity.v1.Identity.FinishMyPasskeyResponse> getFinishMyPasskeyMethod;
    if ((getFinishMyPasskeyMethod = IdentityServiceGrpc.getFinishMyPasskeyMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getFinishMyPasskeyMethod = IdentityServiceGrpc.getFinishMyPasskeyMethod) == null) {
          IdentityServiceGrpc.getFinishMyPasskeyMethod = getFinishMyPasskeyMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.FinishMyPasskeyRequest, identity.v1.Identity.FinishMyPasskeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishMyPasskey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.FinishMyPasskeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.FinishMyPasskeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("FinishMyPasskey"))
              .build();
        }
      }
    }
    return getFinishMyPasskeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RenameMyPasskeyRequest,
      identity.v1.Identity.RenameMyPasskeyResponse> getRenameMyPasskeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameMyPasskey",
      requestType = identity.v1.Identity.RenameMyPasskeyRequest.class,
      responseType = identity.v1.Identity.RenameMyPasskeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RenameMyPasskeyRequest,
      identity.v1.Identity.RenameMyPasskeyResponse> getRenameMyPasskeyMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RenameMyPasskeyRequest, identity.v1.Identity.RenameMyPasskeyResponse> getRenameMyPasskeyMethod;
    if ((getRenameMyPasskeyMethod = IdentityServiceGrpc.getRenameMyPasskeyMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRenameMyPasskeyMethod = IdentityServiceGrpc.getRenameMyPasskeyMethod) == null) {
          IdentityServiceGrpc.getRenameMyPasskeyMethod = getRenameMyPasskeyMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RenameMyPasskeyRequest, identity.v1.Identity.RenameMyPasskeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameMyPasskey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RenameMyPasskeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RenameMyPasskeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RenameMyPasskey"))
              .build();
        }
      }
    }
    return getRenameMyPasskeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.DeleteMyPasskeyRequest,
      identity.v1.Identity.DeleteMyPasskeyResponse> getDeleteMyPasskeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMyPasskey",
      requestType = identity.v1.Identity.DeleteMyPasskeyRequest.class,
      responseType = identity.v1.Identity.DeleteMyPasskeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.DeleteMyPasskeyRequest,
      identity.v1.Identity.DeleteMyPasskeyResponse> getDeleteMyPasskeyMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.DeleteMyPasskeyRequest, identity.v1.Identity.DeleteMyPasskeyResponse> getDeleteMyPasskeyMethod;
    if ((getDeleteMyPasskeyMethod = IdentityServiceGrpc.getDeleteMyPasskeyMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getDeleteMyPasskeyMethod = IdentityServiceGrpc.getDeleteMyPasskeyMethod) == null) {
          IdentityServiceGrpc.getDeleteMyPasskeyMethod = getDeleteMyPasskeyMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.DeleteMyPasskeyRequest, identity.v1.Identity.DeleteMyPasskeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMyPasskey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteMyPasskeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.DeleteMyPasskeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("DeleteMyPasskey"))
              .build();
        }
      }
    }
    return getDeleteMyPasskeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.ListMySessionsRequest,
      identity.v1.Identity.ListMySessionsResponse> getListMySessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMySessions",
      requestType = identity.v1.Identity.ListMySessionsRequest.class,
      responseType = identity.v1.Identity.ListMySessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.ListMySessionsRequest,
      identity.v1.Identity.ListMySessionsResponse> getListMySessionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.ListMySessionsRequest, identity.v1.Identity.ListMySessionsResponse> getListMySessionsMethod;
    if ((getListMySessionsMethod = IdentityServiceGrpc.getListMySessionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getListMySessionsMethod = IdentityServiceGrpc.getListMySessionsMethod) == null) {
          IdentityServiceGrpc.getListMySessionsMethod = getListMySessionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.ListMySessionsRequest, identity.v1.Identity.ListMySessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMySessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListMySessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.ListMySessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("ListMySessions"))
              .build();
        }
      }
    }
    return getListMySessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RevokeMySessionRequest,
      identity.v1.Identity.RevokeMySessionResponse> getRevokeMySessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeMySession",
      requestType = identity.v1.Identity.RevokeMySessionRequest.class,
      responseType = identity.v1.Identity.RevokeMySessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RevokeMySessionRequest,
      identity.v1.Identity.RevokeMySessionResponse> getRevokeMySessionMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RevokeMySessionRequest, identity.v1.Identity.RevokeMySessionResponse> getRevokeMySessionMethod;
    if ((getRevokeMySessionMethod = IdentityServiceGrpc.getRevokeMySessionMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRevokeMySessionMethod = IdentityServiceGrpc.getRevokeMySessionMethod) == null) {
          IdentityServiceGrpc.getRevokeMySessionMethod = getRevokeMySessionMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RevokeMySessionRequest, identity.v1.Identity.RevokeMySessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeMySession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeMySessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeMySessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RevokeMySession"))
              .build();
        }
      }
    }
    return getRevokeMySessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RevokeMyOtherSessionsRequest,
      identity.v1.Identity.RevokeMyOtherSessionsResponse> getRevokeMyOtherSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeMyOtherSessions",
      requestType = identity.v1.Identity.RevokeMyOtherSessionsRequest.class,
      responseType = identity.v1.Identity.RevokeMyOtherSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RevokeMyOtherSessionsRequest,
      identity.v1.Identity.RevokeMyOtherSessionsResponse> getRevokeMyOtherSessionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RevokeMyOtherSessionsRequest, identity.v1.Identity.RevokeMyOtherSessionsResponse> getRevokeMyOtherSessionsMethod;
    if ((getRevokeMyOtherSessionsMethod = IdentityServiceGrpc.getRevokeMyOtherSessionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRevokeMyOtherSessionsMethod = IdentityServiceGrpc.getRevokeMyOtherSessionsMethod) == null) {
          IdentityServiceGrpc.getRevokeMyOtherSessionsMethod = getRevokeMyOtherSessionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RevokeMyOtherSessionsRequest, identity.v1.Identity.RevokeMyOtherSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeMyOtherSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeMyOtherSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RevokeMyOtherSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RevokeMyOtherSessions"))
              .build();
        }
      }
    }
    return getRevokeMyOtherSessionsMethod;
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

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.RegisterPermissionsRequest,
      identity.v1.Identity.RegisterPermissionsResponse> getRegisterPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPermissions",
      requestType = identity.v1.Identity.RegisterPermissionsRequest.class,
      responseType = identity.v1.Identity.RegisterPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.RegisterPermissionsRequest,
      identity.v1.Identity.RegisterPermissionsResponse> getRegisterPermissionsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.RegisterPermissionsRequest, identity.v1.Identity.RegisterPermissionsResponse> getRegisterPermissionsMethod;
    if ((getRegisterPermissionsMethod = IdentityServiceGrpc.getRegisterPermissionsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getRegisterPermissionsMethod = IdentityServiceGrpc.getRegisterPermissionsMethod) == null) {
          IdentityServiceGrpc.getRegisterPermissionsMethod = getRegisterPermissionsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.RegisterPermissionsRequest, identity.v1.Identity.RegisterPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RegisterPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.RegisterPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("RegisterPermissions"))
              .build();
        }
      }
    }
    return getRegisterPermissionsMethod;
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

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.GetRegistrationSettingsRequest,
      identity.v1.Identity.GetRegistrationSettingsResponse> getGetRegistrationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegistrationSettings",
      requestType = identity.v1.Identity.GetRegistrationSettingsRequest.class,
      responseType = identity.v1.Identity.GetRegistrationSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.GetRegistrationSettingsRequest,
      identity.v1.Identity.GetRegistrationSettingsResponse> getGetRegistrationSettingsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.GetRegistrationSettingsRequest, identity.v1.Identity.GetRegistrationSettingsResponse> getGetRegistrationSettingsMethod;
    if ((getGetRegistrationSettingsMethod = IdentityServiceGrpc.getGetRegistrationSettingsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getGetRegistrationSettingsMethod = IdentityServiceGrpc.getGetRegistrationSettingsMethod) == null) {
          IdentityServiceGrpc.getGetRegistrationSettingsMethod = getGetRegistrationSettingsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.GetRegistrationSettingsRequest, identity.v1.Identity.GetRegistrationSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegistrationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetRegistrationSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.GetRegistrationSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("GetRegistrationSettings"))
              .build();
        }
      }
    }
    return getGetRegistrationSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<identity.v1.Identity.SetRegistrationSettingsRequest,
      identity.v1.Identity.SetRegistrationSettingsResponse> getSetRegistrationSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRegistrationSettings",
      requestType = identity.v1.Identity.SetRegistrationSettingsRequest.class,
      responseType = identity.v1.Identity.SetRegistrationSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<identity.v1.Identity.SetRegistrationSettingsRequest,
      identity.v1.Identity.SetRegistrationSettingsResponse> getSetRegistrationSettingsMethod() {
    io.grpc.MethodDescriptor<identity.v1.Identity.SetRegistrationSettingsRequest, identity.v1.Identity.SetRegistrationSettingsResponse> getSetRegistrationSettingsMethod;
    if ((getSetRegistrationSettingsMethod = IdentityServiceGrpc.getSetRegistrationSettingsMethod) == null) {
      synchronized (IdentityServiceGrpc.class) {
        if ((getSetRegistrationSettingsMethod = IdentityServiceGrpc.getSetRegistrationSettingsMethod) == null) {
          IdentityServiceGrpc.getSetRegistrationSettingsMethod = getSetRegistrationSettingsMethod =
              io.grpc.MethodDescriptor.<identity.v1.Identity.SetRegistrationSettingsRequest, identity.v1.Identity.SetRegistrationSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRegistrationSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetRegistrationSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  identity.v1.Identity.SetRegistrationSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityServiceMethodDescriptorSupplier("SetRegistrationSettings"))
              .build();
        }
      }
    }
    return getSetRegistrationSettingsMethod;
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
     * <pre>
     * ListUserSessions lists the SSO sessions (devices) of a user; `current` is always false. RevokeUserSessions ends all of
     * them, revokes the refresh tokens and the access tokens issued so far (like disabling the user, without disabling).
     * </pre>
     */
    default void listUserSessions(identity.v1.Identity.ListUserSessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListUserSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserSessionsMethod(), responseObserver);
    }

    /**
     */
    default void revokeUserSessions(identity.v1.Identity.RevokeUserSessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeUserSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeUserSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteUser deletes the account (soft: see DeleteUserRequest).
     * </pre>
     */
    default void deleteUser(identity.v1.Identity.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
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
     * ApproveUser accepts a self-registered user (status PENDING_APPROVAL): the welcome mail with the link to set the
     * password goes out. RejectUser deletes the user and tells them by mail (the address may register again).
     * Permission: identity:user:approve.
     * </pre>
     */
    default void approveUser(identity.v1.Identity.ApproveUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ApproveUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveUserMethod(), responseObserver);
    }

    /**
     */
    default void rejectUser(identity.v1.Identity.RejectUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RejectUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRejectUserMethod(), responseObserver);
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
     * ChangeMyPassword checks the current password and sets a new one (the password policy applies). Like SetUserPassword it
     * ends every session and token of the user, the caller's too: the user signs in again.
     * </pre>
     */
    default void changeMyPassword(identity.v1.Identity.ChangeMyPasswordRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ChangeMyPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeMyPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * The own multi-factor authentication (the same steps as the account page of the sign in app). GetMyMFA only says whether it is on.
     * </pre>
     */
    default void getMyMFA(identity.v1.Identity.GetMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetMyMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * BeginMyMFA starts the setup: it returns the QR code and the key of the pending enrollment (created on the first call,
     * the same ones after). Refused when MFA is already on.
     * </pre>
     */
    default void beginMyMFA(identity.v1.Identity.BeginMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.BeginMyMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginMyMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConfirmMyMFA checks the first code of the authenticator app, turns MFA on and returns the recovery codes (shown once).
     * </pre>
     */
    default void confirmMyMFA(identity.v1.Identity.ConfirmMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ConfirmMyMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmMyMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableMyMFA turns MFA off after the password and a code (or a recovery code); refused when MFA is required for the user.
     * </pre>
     */
    default void disableMyMFA(identity.v1.Identity.DisableMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DisableMyMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMyMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * The own passkeys (WebAuthn credentials), a way to sign in next to the password. The browser runs the ceremony: Begin
     * returns the options for navigator.credentials.create (as the JSON of the web API) and Finish takes the answer back, so
     * the same steps as the account page of the sign in app. Adding and deleting need the current password. They answer
     * NOT_FOUND "passkeys_off" when the server has passkeys turned off.
     * </pre>
     */
    default void listMyPasskeys(identity.v1.Identity.ListMyPasskeysRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListMyPasskeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMyPasskeysMethod(), responseObserver);
    }

    /**
     */
    default void beginMyPasskey(identity.v1.Identity.BeginMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.BeginMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginMyPasskeyMethod(), responseObserver);
    }

    /**
     */
    default void finishMyPasskey(identity.v1.Identity.FinishMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.FinishMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishMyPasskeyMethod(), responseObserver);
    }

    /**
     */
    default void renameMyPasskey(identity.v1.Identity.RenameMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RenameMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameMyPasskeyMethod(), responseObserver);
    }

    /**
     */
    default void deleteMyPasskey(identity.v1.Identity.DeleteMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMyPasskeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * The own SSO sessions, one per sign in on a browser or device. ListMySessions marks the one of the caller (the sid of
     * its token) as current. RevokeMySession ends one (NOT_FOUND "session_not_found" for an unknown id or one of another
     * user); revoking the current one signs the caller out. RevokeMyOtherSessions keeps the current one. Ending a session
     * revokes its refresh tokens and signs out the applications that used it (back-channel logout); access tokens already
     * issued live until they expire (IDENTITY_ACCESS_TOKEN_TTL) where a service verifies them locally.
     * </pre>
     */
    default void listMySessions(identity.v1.Identity.ListMySessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListMySessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMySessionsMethod(), responseObserver);
    }

    /**
     */
    default void revokeMySession(identity.v1.Identity.RevokeMySessionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeMySessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeMySessionMethod(), responseObserver);
    }

    /**
     */
    default void revokeMyOtherSessions(identity.v1.Identity.RevokeMyOtherSessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeMyOtherSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeMyOtherSessionsMethod(), responseObserver);
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
     * The catalog of permissions roles can be given, read only: services define them in their permissions.proto and
     * register them at start. The wildcards that cover them are listed too (generated, not stored).
     * </pre>
     */
    default void listPermissions(identity.v1.Identity.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisterPermissions is called by a service at start with everything it declares in its permissions.proto:
     * identity inserts, updates, renames and retires the permissions of that service in one transaction. A service
     * may only name permissions of its own namespace ("dictionary:*" from the dictionary).
     * </pre>
     */
    default void registerPermissions(identity.v1.Identity.RegisterPermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RegisterPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPermissionsMethod(), responseObserver);
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

    /**
     * <pre>
     * Self-registration settings. GetRegistrationSettings: identity:settings:read. SetRegistrationSettings:
     * identity:settings:write.
     * </pre>
     */
    default void getRegistrationSettings(identity.v1.Identity.GetRegistrationSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetRegistrationSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistrationSettingsMethod(), responseObserver);
    }

    /**
     */
    default void setRegistrationSettings(identity.v1.Identity.SetRegistrationSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetRegistrationSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRegistrationSettingsMethod(), responseObserver);
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
     * <pre>
     * ListUserSessions lists the SSO sessions (devices) of a user; `current` is always false. RevokeUserSessions ends all of
     * them, revokes the refresh tokens and the access tokens issued so far (like disabling the user, without disabling).
     * </pre>
     */
    public void listUserSessions(identity.v1.Identity.ListUserSessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListUserSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeUserSessions(identity.v1.Identity.RevokeUserSessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeUserSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeUserSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteUser deletes the account (soft: see DeleteUserRequest).
     * </pre>
     */
    public void deleteUser(identity.v1.Identity.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
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
     * ApproveUser accepts a self-registered user (status PENDING_APPROVAL): the welcome mail with the link to set the
     * password goes out. RejectUser deletes the user and tells them by mail (the address may register again).
     * Permission: identity:user:approve.
     * </pre>
     */
    public void approveUser(identity.v1.Identity.ApproveUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ApproveUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rejectUser(identity.v1.Identity.RejectUserRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RejectUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectUserMethod(), getCallOptions()), request, responseObserver);
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
     * ChangeMyPassword checks the current password and sets a new one (the password policy applies). Like SetUserPassword it
     * ends every session and token of the user, the caller's too: the user signs in again.
     * </pre>
     */
    public void changeMyPassword(identity.v1.Identity.ChangeMyPasswordRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ChangeMyPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeMyPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The own multi-factor authentication (the same steps as the account page of the sign in app). GetMyMFA only says whether it is on.
     * </pre>
     */
    public void getMyMFA(identity.v1.Identity.GetMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetMyMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BeginMyMFA starts the setup: it returns the QR code and the key of the pending enrollment (created on the first call,
     * the same ones after). Refused when MFA is already on.
     * </pre>
     */
    public void beginMyMFA(identity.v1.Identity.BeginMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.BeginMyMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginMyMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConfirmMyMFA checks the first code of the authenticator app, turns MFA on and returns the recovery codes (shown once).
     * </pre>
     */
    public void confirmMyMFA(identity.v1.Identity.ConfirmMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ConfirmMyMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmMyMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableMyMFA turns MFA off after the password and a code (or a recovery code); refused when MFA is required for the user.
     * </pre>
     */
    public void disableMyMFA(identity.v1.Identity.DisableMyMFARequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DisableMyMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMyMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The own passkeys (WebAuthn credentials), a way to sign in next to the password. The browser runs the ceremony: Begin
     * returns the options for navigator.credentials.create (as the JSON of the web API) and Finish takes the answer back, so
     * the same steps as the account page of the sign in app. Adding and deleting need the current password. They answer
     * NOT_FOUND "passkeys_off" when the server has passkeys turned off.
     * </pre>
     */
    public void listMyPasskeys(identity.v1.Identity.ListMyPasskeysRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListMyPasskeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMyPasskeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beginMyPasskey(identity.v1.Identity.BeginMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.BeginMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginMyPasskeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishMyPasskey(identity.v1.Identity.FinishMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.FinishMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishMyPasskeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameMyPasskey(identity.v1.Identity.RenameMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RenameMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameMyPasskeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMyPasskey(identity.v1.Identity.DeleteMyPasskeyRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteMyPasskeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMyPasskeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The own SSO sessions, one per sign in on a browser or device. ListMySessions marks the one of the caller (the sid of
     * its token) as current. RevokeMySession ends one (NOT_FOUND "session_not_found" for an unknown id or one of another
     * user); revoking the current one signs the caller out. RevokeMyOtherSessions keeps the current one. Ending a session
     * revokes its refresh tokens and signs out the applications that used it (back-channel logout); access tokens already
     * issued live until they expire (IDENTITY_ACCESS_TOKEN_TTL) where a service verifies them locally.
     * </pre>
     */
    public void listMySessions(identity.v1.Identity.ListMySessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListMySessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMySessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeMySession(identity.v1.Identity.RevokeMySessionRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeMySessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeMySessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeMyOtherSessions(identity.v1.Identity.RevokeMyOtherSessionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeMyOtherSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeMyOtherSessionsMethod(), getCallOptions()), request, responseObserver);
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
     * The catalog of permissions roles can be given, read only: services define them in their permissions.proto and
     * register them at start. The wildcards that cover them are listed too (generated, not stored).
     * </pre>
     */
    public void listPermissions(identity.v1.Identity.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisterPermissions is called by a service at start with everything it declares in its permissions.proto:
     * identity inserts, updates, renames and retires the permissions of that service in one transaction. A service
     * may only name permissions of its own namespace ("dictionary:*" from the dictionary).
     * </pre>
     */
    public void registerPermissions(identity.v1.Identity.RegisterPermissionsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.RegisterPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPermissionsMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * Self-registration settings. GetRegistrationSettings: identity:settings:read. SetRegistrationSettings:
     * identity:settings:write.
     * </pre>
     */
    public void getRegistrationSettings(identity.v1.Identity.GetRegistrationSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.GetRegistrationSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistrationSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRegistrationSettings(identity.v1.Identity.SetRegistrationSettingsRequest request,
        io.grpc.stub.StreamObserver<identity.v1.Identity.SetRegistrationSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRegistrationSettingsMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * ListUserSessions lists the SSO sessions (devices) of a user; `current` is always false. RevokeUserSessions ends all of
     * them, revokes the refresh tokens and the access tokens issued so far (like disabling the user, without disabling).
     * </pre>
     */
    public identity.v1.Identity.ListUserSessionsResponse listUserSessions(identity.v1.Identity.ListUserSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RevokeUserSessionsResponse revokeUserSessions(identity.v1.Identity.RevokeUserSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeUserSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteUser deletes the account (soft: see DeleteUserRequest).
     * </pre>
     */
    public identity.v1.Identity.DeleteUserResponse deleteUser(identity.v1.Identity.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
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
     * ApproveUser accepts a self-registered user (status PENDING_APPROVAL): the welcome mail with the link to set the
     * password goes out. RejectUser deletes the user and tells them by mail (the address may register again).
     * Permission: identity:user:approve.
     * </pre>
     */
    public identity.v1.Identity.ApproveUserResponse approveUser(identity.v1.Identity.ApproveUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RejectUserResponse rejectUser(identity.v1.Identity.RejectUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectUserMethod(), getCallOptions(), request);
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
     * ChangeMyPassword checks the current password and sets a new one (the password policy applies). Like SetUserPassword it
     * ends every session and token of the user, the caller's too: the user signs in again.
     * </pre>
     */
    public identity.v1.Identity.ChangeMyPasswordResponse changeMyPassword(identity.v1.Identity.ChangeMyPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeMyPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The own multi-factor authentication (the same steps as the account page of the sign in app). GetMyMFA only says whether it is on.
     * </pre>
     */
    public identity.v1.Identity.GetMyMFAResponse getMyMFA(identity.v1.Identity.GetMyMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BeginMyMFA starts the setup: it returns the QR code and the key of the pending enrollment (created on the first call,
     * the same ones after). Refused when MFA is already on.
     * </pre>
     */
    public identity.v1.Identity.BeginMyMFAResponse beginMyMFA(identity.v1.Identity.BeginMyMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginMyMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfirmMyMFA checks the first code of the authenticator app, turns MFA on and returns the recovery codes (shown once).
     * </pre>
     */
    public identity.v1.Identity.ConfirmMyMFAResponse confirmMyMFA(identity.v1.Identity.ConfirmMyMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmMyMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableMyMFA turns MFA off after the password and a code (or a recovery code); refused when MFA is required for the user.
     * </pre>
     */
    public identity.v1.Identity.DisableMyMFAResponse disableMyMFA(identity.v1.Identity.DisableMyMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMyMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The own passkeys (WebAuthn credentials), a way to sign in next to the password. The browser runs the ceremony: Begin
     * returns the options for navigator.credentials.create (as the JSON of the web API) and Finish takes the answer back, so
     * the same steps as the account page of the sign in app. Adding and deleting need the current password. They answer
     * NOT_FOUND "passkeys_off" when the server has passkeys turned off.
     * </pre>
     */
    public identity.v1.Identity.ListMyPasskeysResponse listMyPasskeys(identity.v1.Identity.ListMyPasskeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMyPasskeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.BeginMyPasskeyResponse beginMyPasskey(identity.v1.Identity.BeginMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginMyPasskeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.FinishMyPasskeyResponse finishMyPasskey(identity.v1.Identity.FinishMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishMyPasskeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RenameMyPasskeyResponse renameMyPasskey(identity.v1.Identity.RenameMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameMyPasskeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.DeleteMyPasskeyResponse deleteMyPasskey(identity.v1.Identity.DeleteMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMyPasskeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The own SSO sessions, one per sign in on a browser or device. ListMySessions marks the one of the caller (the sid of
     * its token) as current. RevokeMySession ends one (NOT_FOUND "session_not_found" for an unknown id or one of another
     * user); revoking the current one signs the caller out. RevokeMyOtherSessions keeps the current one. Ending a session
     * revokes its refresh tokens and signs out the applications that used it (back-channel logout); access tokens already
     * issued live until they expire (IDENTITY_ACCESS_TOKEN_TTL) where a service verifies them locally.
     * </pre>
     */
    public identity.v1.Identity.ListMySessionsResponse listMySessions(identity.v1.Identity.ListMySessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMySessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RevokeMySessionResponse revokeMySession(identity.v1.Identity.RevokeMySessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeMySessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.RevokeMyOtherSessionsResponse revokeMyOtherSessions(identity.v1.Identity.RevokeMyOtherSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeMyOtherSessionsMethod(), getCallOptions(), request);
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
     * The catalog of permissions roles can be given, read only: services define them in their permissions.proto and
     * register them at start. The wildcards that cover them are listed too (generated, not stored).
     * </pre>
     */
    public identity.v1.Identity.ListPermissionsResponse listPermissions(identity.v1.Identity.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisterPermissions is called by a service at start with everything it declares in its permissions.proto:
     * identity inserts, updates, renames and retires the permissions of that service in one transaction. A service
     * may only name permissions of its own namespace ("dictionary:*" from the dictionary).
     * </pre>
     */
    public identity.v1.Identity.RegisterPermissionsResponse registerPermissions(identity.v1.Identity.RegisterPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPermissionsMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * Self-registration settings. GetRegistrationSettings: identity:settings:read. SetRegistrationSettings:
     * identity:settings:write.
     * </pre>
     */
    public identity.v1.Identity.GetRegistrationSettingsResponse getRegistrationSettings(identity.v1.Identity.GetRegistrationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistrationSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public identity.v1.Identity.SetRegistrationSettingsResponse setRegistrationSettings(identity.v1.Identity.SetRegistrationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRegistrationSettingsMethod(), getCallOptions(), request);
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
     * <pre>
     * ListUserSessions lists the SSO sessions (devices) of a user; `current` is always false. RevokeUserSessions ends all of
     * them, revokes the refresh tokens and the access tokens issued so far (like disabling the user, without disabling).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListUserSessionsResponse> listUserSessions(
        identity.v1.Identity.ListUserSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RevokeUserSessionsResponse> revokeUserSessions(
        identity.v1.Identity.RevokeUserSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeUserSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteUser deletes the account (soft: see DeleteUserRequest).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.DeleteUserResponse> deleteUser(
        identity.v1.Identity.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
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
     * ApproveUser accepts a self-registered user (status PENDING_APPROVAL): the welcome mail with the link to set the
     * password goes out. RejectUser deletes the user and tells them by mail (the address may register again).
     * Permission: identity:user:approve.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ApproveUserResponse> approveUser(
        identity.v1.Identity.ApproveUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RejectUserResponse> rejectUser(
        identity.v1.Identity.RejectUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectUserMethod(), getCallOptions()), request);
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
     * ChangeMyPassword checks the current password and sets a new one (the password policy applies). Like SetUserPassword it
     * ends every session and token of the user, the caller's too: the user signs in again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ChangeMyPasswordResponse> changeMyPassword(
        identity.v1.Identity.ChangeMyPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeMyPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The own multi-factor authentication (the same steps as the account page of the sign in app). GetMyMFA only says whether it is on.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetMyMFAResponse> getMyMFA(
        identity.v1.Identity.GetMyMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BeginMyMFA starts the setup: it returns the QR code and the key of the pending enrollment (created on the first call,
     * the same ones after). Refused when MFA is already on.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.BeginMyMFAResponse> beginMyMFA(
        identity.v1.Identity.BeginMyMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginMyMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConfirmMyMFA checks the first code of the authenticator app, turns MFA on and returns the recovery codes (shown once).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ConfirmMyMFAResponse> confirmMyMFA(
        identity.v1.Identity.ConfirmMyMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmMyMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableMyMFA turns MFA off after the password and a code (or a recovery code); refused when MFA is required for the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.DisableMyMFAResponse> disableMyMFA(
        identity.v1.Identity.DisableMyMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMyMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The own passkeys (WebAuthn credentials), a way to sign in next to the password. The browser runs the ceremony: Begin
     * returns the options for navigator.credentials.create (as the JSON of the web API) and Finish takes the answer back, so
     * the same steps as the account page of the sign in app. Adding and deleting need the current password. They answer
     * NOT_FOUND "passkeys_off" when the server has passkeys turned off.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListMyPasskeysResponse> listMyPasskeys(
        identity.v1.Identity.ListMyPasskeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMyPasskeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.BeginMyPasskeyResponse> beginMyPasskey(
        identity.v1.Identity.BeginMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginMyPasskeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.FinishMyPasskeyResponse> finishMyPasskey(
        identity.v1.Identity.FinishMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishMyPasskeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RenameMyPasskeyResponse> renameMyPasskey(
        identity.v1.Identity.RenameMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameMyPasskeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.DeleteMyPasskeyResponse> deleteMyPasskey(
        identity.v1.Identity.DeleteMyPasskeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMyPasskeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The own SSO sessions, one per sign in on a browser or device. ListMySessions marks the one of the caller (the sid of
     * its token) as current. RevokeMySession ends one (NOT_FOUND "session_not_found" for an unknown id or one of another
     * user); revoking the current one signs the caller out. RevokeMyOtherSessions keeps the current one. Ending a session
     * revokes its refresh tokens and signs out the applications that used it (back-channel logout); access tokens already
     * issued live until they expire (IDENTITY_ACCESS_TOKEN_TTL) where a service verifies them locally.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListMySessionsResponse> listMySessions(
        identity.v1.Identity.ListMySessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMySessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RevokeMySessionResponse> revokeMySession(
        identity.v1.Identity.RevokeMySessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeMySessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RevokeMyOtherSessionsResponse> revokeMyOtherSessions(
        identity.v1.Identity.RevokeMyOtherSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeMyOtherSessionsMethod(), getCallOptions()), request);
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
     * The catalog of permissions roles can be given, read only: services define them in their permissions.proto and
     * register them at start. The wildcards that cover them are listed too (generated, not stored).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.ListPermissionsResponse> listPermissions(
        identity.v1.Identity.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisterPermissions is called by a service at start with everything it declares in its permissions.proto:
     * identity inserts, updates, renames and retires the permissions of that service in one transaction. A service
     * may only name permissions of its own namespace ("dictionary:*" from the dictionary).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.RegisterPermissionsResponse> registerPermissions(
        identity.v1.Identity.RegisterPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPermissionsMethod(), getCallOptions()), request);
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

    /**
     * <pre>
     * Self-registration settings. GetRegistrationSettings: identity:settings:read. SetRegistrationSettings:
     * identity:settings:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.GetRegistrationSettingsResponse> getRegistrationSettings(
        identity.v1.Identity.GetRegistrationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistrationSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<identity.v1.Identity.SetRegistrationSettingsResponse> setRegistrationSettings(
        identity.v1.Identity.SetRegistrationSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRegistrationSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTROSPECT = 0;
  private static final int METHODID_CHECK_PERMISSION = 1;
  private static final int METHODID_REVOKE_TOKEN = 2;
  private static final int METHODID_GET_USER = 3;
  private static final int METHODID_LIST_USERS = 4;
  private static final int METHODID_CREATE_USER = 5;
  private static final int METHODID_SET_USER_DISABLED = 6;
  private static final int METHODID_LIST_USER_SESSIONS = 7;
  private static final int METHODID_REVOKE_USER_SESSIONS = 8;
  private static final int METHODID_DELETE_USER = 9;
  private static final int METHODID_SET_USER_PASSWORD = 10;
  private static final int METHODID_SEND_PASSWORD_RESET = 11;
  private static final int METHODID_UPDATE_USER = 12;
  private static final int METHODID_SET_USER_AVATAR = 13;
  private static final int METHODID_SEND_WELCOME = 14;
  private static final int METHODID_APPROVE_USER = 15;
  private static final int METHODID_REJECT_USER = 16;
  private static final int METHODID_GET_USER_STATS = 17;
  private static final int METHODID_GET_ME = 18;
  private static final int METHODID_UPDATE_ME = 19;
  private static final int METHODID_SET_MY_AVATAR = 20;
  private static final int METHODID_CHANGE_MY_PASSWORD = 21;
  private static final int METHODID_GET_MY_MFA = 22;
  private static final int METHODID_BEGIN_MY_MFA = 23;
  private static final int METHODID_CONFIRM_MY_MFA = 24;
  private static final int METHODID_DISABLE_MY_MFA = 25;
  private static final int METHODID_LIST_MY_PASSKEYS = 26;
  private static final int METHODID_BEGIN_MY_PASSKEY = 27;
  private static final int METHODID_FINISH_MY_PASSKEY = 28;
  private static final int METHODID_RENAME_MY_PASSKEY = 29;
  private static final int METHODID_DELETE_MY_PASSKEY = 30;
  private static final int METHODID_LIST_MY_SESSIONS = 31;
  private static final int METHODID_REVOKE_MY_SESSION = 32;
  private static final int METHODID_REVOKE_MY_OTHER_SESSIONS = 33;
  private static final int METHODID_GET_MY_USER_SETTINGS = 34;
  private static final int METHODID_PUT_MY_USER_SETTINGS = 35;
  private static final int METHODID_CREATE_ROLE = 36;
  private static final int METHODID_SET_ROLE_PERMISSIONS = 37;
  private static final int METHODID_LIST_ROLES = 38;
  private static final int METHODID_UPDATE_ROLE = 39;
  private static final int METHODID_DELETE_ROLE = 40;
  private static final int METHODID_LIST_PERMISSIONS = 41;
  private static final int METHODID_REGISTER_PERMISSIONS = 42;
  private static final int METHODID_ASSIGN_ROLE = 43;
  private static final int METHODID_REVOKE_ROLE = 44;
  private static final int METHODID_CREATE_CLIENT = 45;
  private static final int METHODID_UPDATE_CLIENT = 46;
  private static final int METHODID_SET_CLIENT_DISABLED = 47;
  private static final int METHODID_DELETE_CLIENT = 48;
  private static final int METHODID_ROTATE_CLIENT_SECRET = 49;
  private static final int METHODID_LIST_CLIENTS = 50;
  private static final int METHODID_SET_EXCHANGE_POLICY = 51;
  private static final int METHODID_LIST_EXCHANGE_POLICIES = 52;
  private static final int METHODID_GET_USER_MFA = 53;
  private static final int METHODID_SET_USER_MFA = 54;
  private static final int METHODID_ENFORCE_USER_MFA = 55;
  private static final int METHODID_RESET_USER_MFA = 56;
  private static final int METHODID_GET_UISTYLE = 57;
  private static final int METHODID_SET_UISTYLE = 58;
  private static final int METHODID_GET_REGISTRATION_SETTINGS = 59;
  private static final int METHODID_SET_REGISTRATION_SETTINGS = 60;

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
        case METHODID_LIST_USER_SESSIONS:
          serviceImpl.listUserSessions((identity.v1.Identity.ListUserSessionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListUserSessionsResponse>) responseObserver);
          break;
        case METHODID_REVOKE_USER_SESSIONS:
          serviceImpl.revokeUserSessions((identity.v1.Identity.RevokeUserSessionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeUserSessionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((identity.v1.Identity.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteUserResponse>) responseObserver);
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
        case METHODID_APPROVE_USER:
          serviceImpl.approveUser((identity.v1.Identity.ApproveUserRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ApproveUserResponse>) responseObserver);
          break;
        case METHODID_REJECT_USER:
          serviceImpl.rejectUser((identity.v1.Identity.RejectUserRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RejectUserResponse>) responseObserver);
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
        case METHODID_CHANGE_MY_PASSWORD:
          serviceImpl.changeMyPassword((identity.v1.Identity.ChangeMyPasswordRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ChangeMyPasswordResponse>) responseObserver);
          break;
        case METHODID_GET_MY_MFA:
          serviceImpl.getMyMFA((identity.v1.Identity.GetMyMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetMyMFAResponse>) responseObserver);
          break;
        case METHODID_BEGIN_MY_MFA:
          serviceImpl.beginMyMFA((identity.v1.Identity.BeginMyMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.BeginMyMFAResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_MY_MFA:
          serviceImpl.confirmMyMFA((identity.v1.Identity.ConfirmMyMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ConfirmMyMFAResponse>) responseObserver);
          break;
        case METHODID_DISABLE_MY_MFA:
          serviceImpl.disableMyMFA((identity.v1.Identity.DisableMyMFARequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.DisableMyMFAResponse>) responseObserver);
          break;
        case METHODID_LIST_MY_PASSKEYS:
          serviceImpl.listMyPasskeys((identity.v1.Identity.ListMyPasskeysRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListMyPasskeysResponse>) responseObserver);
          break;
        case METHODID_BEGIN_MY_PASSKEY:
          serviceImpl.beginMyPasskey((identity.v1.Identity.BeginMyPasskeyRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.BeginMyPasskeyResponse>) responseObserver);
          break;
        case METHODID_FINISH_MY_PASSKEY:
          serviceImpl.finishMyPasskey((identity.v1.Identity.FinishMyPasskeyRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.FinishMyPasskeyResponse>) responseObserver);
          break;
        case METHODID_RENAME_MY_PASSKEY:
          serviceImpl.renameMyPasskey((identity.v1.Identity.RenameMyPasskeyRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RenameMyPasskeyResponse>) responseObserver);
          break;
        case METHODID_DELETE_MY_PASSKEY:
          serviceImpl.deleteMyPasskey((identity.v1.Identity.DeleteMyPasskeyRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.DeleteMyPasskeyResponse>) responseObserver);
          break;
        case METHODID_LIST_MY_SESSIONS:
          serviceImpl.listMySessions((identity.v1.Identity.ListMySessionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.ListMySessionsResponse>) responseObserver);
          break;
        case METHODID_REVOKE_MY_SESSION:
          serviceImpl.revokeMySession((identity.v1.Identity.RevokeMySessionRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeMySessionResponse>) responseObserver);
          break;
        case METHODID_REVOKE_MY_OTHER_SESSIONS:
          serviceImpl.revokeMyOtherSessions((identity.v1.Identity.RevokeMyOtherSessionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RevokeMyOtherSessionsResponse>) responseObserver);
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
        case METHODID_REGISTER_PERMISSIONS:
          serviceImpl.registerPermissions((identity.v1.Identity.RegisterPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.RegisterPermissionsResponse>) responseObserver);
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
        case METHODID_GET_REGISTRATION_SETTINGS:
          serviceImpl.getRegistrationSettings((identity.v1.Identity.GetRegistrationSettingsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.GetRegistrationSettingsResponse>) responseObserver);
          break;
        case METHODID_SET_REGISTRATION_SETTINGS:
          serviceImpl.setRegistrationSettings((identity.v1.Identity.SetRegistrationSettingsRequest) request,
              (io.grpc.stub.StreamObserver<identity.v1.Identity.SetRegistrationSettingsResponse>) responseObserver);
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
          getListUserSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListUserSessionsRequest,
              identity.v1.Identity.ListUserSessionsResponse>(
                service, METHODID_LIST_USER_SESSIONS)))
        .addMethod(
          getRevokeUserSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RevokeUserSessionsRequest,
              identity.v1.Identity.RevokeUserSessionsResponse>(
                service, METHODID_REVOKE_USER_SESSIONS)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.DeleteUserRequest,
              identity.v1.Identity.DeleteUserResponse>(
                service, METHODID_DELETE_USER)))
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
          getApproveUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ApproveUserRequest,
              identity.v1.Identity.ApproveUserResponse>(
                service, METHODID_APPROVE_USER)))
        .addMethod(
          getRejectUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RejectUserRequest,
              identity.v1.Identity.RejectUserResponse>(
                service, METHODID_REJECT_USER)))
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
          getChangeMyPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ChangeMyPasswordRequest,
              identity.v1.Identity.ChangeMyPasswordResponse>(
                service, METHODID_CHANGE_MY_PASSWORD)))
        .addMethod(
          getGetMyMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetMyMFARequest,
              identity.v1.Identity.GetMyMFAResponse>(
                service, METHODID_GET_MY_MFA)))
        .addMethod(
          getBeginMyMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.BeginMyMFARequest,
              identity.v1.Identity.BeginMyMFAResponse>(
                service, METHODID_BEGIN_MY_MFA)))
        .addMethod(
          getConfirmMyMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ConfirmMyMFARequest,
              identity.v1.Identity.ConfirmMyMFAResponse>(
                service, METHODID_CONFIRM_MY_MFA)))
        .addMethod(
          getDisableMyMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.DisableMyMFARequest,
              identity.v1.Identity.DisableMyMFAResponse>(
                service, METHODID_DISABLE_MY_MFA)))
        .addMethod(
          getListMyPasskeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListMyPasskeysRequest,
              identity.v1.Identity.ListMyPasskeysResponse>(
                service, METHODID_LIST_MY_PASSKEYS)))
        .addMethod(
          getBeginMyPasskeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.BeginMyPasskeyRequest,
              identity.v1.Identity.BeginMyPasskeyResponse>(
                service, METHODID_BEGIN_MY_PASSKEY)))
        .addMethod(
          getFinishMyPasskeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.FinishMyPasskeyRequest,
              identity.v1.Identity.FinishMyPasskeyResponse>(
                service, METHODID_FINISH_MY_PASSKEY)))
        .addMethod(
          getRenameMyPasskeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RenameMyPasskeyRequest,
              identity.v1.Identity.RenameMyPasskeyResponse>(
                service, METHODID_RENAME_MY_PASSKEY)))
        .addMethod(
          getDeleteMyPasskeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.DeleteMyPasskeyRequest,
              identity.v1.Identity.DeleteMyPasskeyResponse>(
                service, METHODID_DELETE_MY_PASSKEY)))
        .addMethod(
          getListMySessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.ListMySessionsRequest,
              identity.v1.Identity.ListMySessionsResponse>(
                service, METHODID_LIST_MY_SESSIONS)))
        .addMethod(
          getRevokeMySessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RevokeMySessionRequest,
              identity.v1.Identity.RevokeMySessionResponse>(
                service, METHODID_REVOKE_MY_SESSION)))
        .addMethod(
          getRevokeMyOtherSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RevokeMyOtherSessionsRequest,
              identity.v1.Identity.RevokeMyOtherSessionsResponse>(
                service, METHODID_REVOKE_MY_OTHER_SESSIONS)))
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
          getRegisterPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.RegisterPermissionsRequest,
              identity.v1.Identity.RegisterPermissionsResponse>(
                service, METHODID_REGISTER_PERMISSIONS)))
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
        .addMethod(
          getGetRegistrationSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.GetRegistrationSettingsRequest,
              identity.v1.Identity.GetRegistrationSettingsResponse>(
                service, METHODID_GET_REGISTRATION_SETTINGS)))
        .addMethod(
          getSetRegistrationSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              identity.v1.Identity.SetRegistrationSettingsRequest,
              identity.v1.Identity.SetRegistrationSettingsResponse>(
                service, METHODID_SET_REGISTRATION_SETTINGS)))
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
              .addMethod(getListUserSessionsMethod())
              .addMethod(getRevokeUserSessionsMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getSetUserPasswordMethod())
              .addMethod(getSendPasswordResetMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getSetUserAvatarMethod())
              .addMethod(getSendWelcomeMethod())
              .addMethod(getApproveUserMethod())
              .addMethod(getRejectUserMethod())
              .addMethod(getGetUserStatsMethod())
              .addMethod(getGetMeMethod())
              .addMethod(getUpdateMeMethod())
              .addMethod(getSetMyAvatarMethod())
              .addMethod(getChangeMyPasswordMethod())
              .addMethod(getGetMyMFAMethod())
              .addMethod(getBeginMyMFAMethod())
              .addMethod(getConfirmMyMFAMethod())
              .addMethod(getDisableMyMFAMethod())
              .addMethod(getListMyPasskeysMethod())
              .addMethod(getBeginMyPasskeyMethod())
              .addMethod(getFinishMyPasskeyMethod())
              .addMethod(getRenameMyPasskeyMethod())
              .addMethod(getDeleteMyPasskeyMethod())
              .addMethod(getListMySessionsMethod())
              .addMethod(getRevokeMySessionMethod())
              .addMethod(getRevokeMyOtherSessionsMethod())
              .addMethod(getGetMyUserSettingsMethod())
              .addMethod(getPutMyUserSettingsMethod())
              .addMethod(getCreateRoleMethod())
              .addMethod(getSetRolePermissionsMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getListPermissionsMethod())
              .addMethod(getRegisterPermissionsMethod())
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
              .addMethod(getGetRegistrationSettingsMethod())
              .addMethod(getSetRegistrationSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
