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
  private static final int METHODID_CREATE_ROLE = 9;
  private static final int METHODID_SET_ROLE_PERMISSIONS = 10;
  private static final int METHODID_LIST_ROLES = 11;
  private static final int METHODID_ASSIGN_ROLE = 12;
  private static final int METHODID_REVOKE_ROLE = 13;
  private static final int METHODID_CREATE_CLIENT = 14;
  private static final int METHODID_ROTATE_CLIENT_SECRET = 15;
  private static final int METHODID_LIST_CLIENTS = 16;
  private static final int METHODID_SET_EXCHANGE_POLICY = 17;
  private static final int METHODID_LIST_EXCHANGE_POLICIES = 18;
  private static final int METHODID_GET_USER_MFA = 19;
  private static final int METHODID_SET_USER_MFA = 20;
  private static final int METHODID_ENFORCE_USER_MFA = 21;
  private static final int METHODID_RESET_USER_MFA = 22;

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
              .addMethod(getCreateRoleMethod())
              .addMethod(getSetRolePermissionsMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getAssignRoleMethod())
              .addMethod(getRevokeRoleMethod())
              .addMethod(getCreateClientMethod())
              .addMethod(getRotateClientSecretMethod())
              .addMethod(getListClientsMethod())
              .addMethod(getSetExchangePolicyMethod())
              .addMethod(getListExchangePoliciesMethod())
              .addMethod(getGetUserMFAMethod())
              .addMethod(getSetUserMFAMethod())
              .addMethod(getEnforceUserMFAMethod())
              .addMethod(getResetUserMFAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
