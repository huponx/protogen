// @generated
/// Generated client implementations.
pub mod identity_service_client {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    use tonic::codegen::http::Uri;
    #[derive(Debug, Clone)]
    pub struct IdentityServiceClient<T> {
        inner: tonic::client::Grpc<T>,
    }
    impl IdentityServiceClient<tonic::transport::Channel> {
        /// Attempt to create a new client by connecting to a given endpoint.
        pub async fn connect<D>(dst: D) -> Result<Self, tonic::transport::Error>
        where
            D: TryInto<tonic::transport::Endpoint>,
            D::Error: Into<StdError>,
        {
            let conn = tonic::transport::Endpoint::new(dst)?.connect().await?;
            Ok(Self::new(conn))
        }
    }
    impl<T> IdentityServiceClient<T>
    where
        T: tonic::client::GrpcService<tonic::body::BoxBody>,
        T::Error: Into<StdError>,
        T::ResponseBody: Body<Data = Bytes> + Send + 'static,
        <T::ResponseBody as Body>::Error: Into<StdError> + Send,
    {
        pub fn new(inner: T) -> Self {
            let inner = tonic::client::Grpc::new(inner);
            Self { inner }
        }
        pub fn with_origin(inner: T, origin: Uri) -> Self {
            let inner = tonic::client::Grpc::with_origin(inner, origin);
            Self { inner }
        }
        pub fn with_interceptor<F>(
            inner: T,
            interceptor: F,
        ) -> IdentityServiceClient<InterceptedService<T, F>>
        where
            F: tonic::service::Interceptor,
            T::ResponseBody: Default,
            T: tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
                Response = http::Response<
                    <T as tonic::client::GrpcService<tonic::body::BoxBody>>::ResponseBody,
                >,
            >,
            <T as tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
            >>::Error: Into<StdError> + Send + Sync,
        {
            IdentityServiceClient::new(InterceptedService::new(inner, interceptor))
        }
        /// Compress requests with the given encoding.
        ///
        /// This requires the server to support it otherwise it might respond with an
        /// error.
        #[must_use]
        pub fn send_compressed(mut self, encoding: CompressionEncoding) -> Self {
            self.inner = self.inner.send_compressed(encoding);
            self
        }
        /// Enable decompressing responses.
        #[must_use]
        pub fn accept_compressed(mut self, encoding: CompressionEncoding) -> Self {
            self.inner = self.inner.accept_compressed(encoding);
            self
        }
        /// Limits the maximum size of a decoded message.
        ///
        /// Default: `4MB`
        #[must_use]
        pub fn max_decoding_message_size(mut self, limit: usize) -> Self {
            self.inner = self.inner.max_decoding_message_size(limit);
            self
        }
        /// Limits the maximum size of an encoded message.
        ///
        /// Default: `usize::MAX`
        #[must_use]
        pub fn max_encoding_message_size(mut self, limit: usize) -> Self {
            self.inner = self.inner.max_encoding_message_size(limit);
            self
        }
        pub async fn introspect(
            &mut self,
            request: impl tonic::IntoRequest<super::IntrospectRequest>,
        ) -> std::result::Result<
            tonic::Response<super::IntrospectResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/Introspect",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "Introspect"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn check_permission(
            &mut self,
            request: impl tonic::IntoRequest<super::CheckPermissionRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CheckPermissionResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/CheckPermission",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "CheckPermission"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn revoke_token(
            &mut self,
            request: impl tonic::IntoRequest<super::RevokeTokenRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeTokenResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/RevokeToken",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "RevokeToken"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_user(
            &mut self,
            request: impl tonic::IntoRequest<super::GetUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/GetUser",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "GetUser"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_users(
            &mut self,
            request: impl tonic::IntoRequest<super::ListUsersRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListUsersResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/ListUsers",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "ListUsers"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn create_user(
            &mut self,
            request: impl tonic::IntoRequest<super::CreateUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateUserResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/CreateUser",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "CreateUser"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_user_disabled(
            &mut self,
            request: impl tonic::IntoRequest<super::SetUserDisabledRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserDisabledResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/SetUserDisabled",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "SetUserDisabled"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_user_password(
            &mut self,
            request: impl tonic::IntoRequest<super::SetUserPasswordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserPasswordResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/SetUserPassword",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "SetUserPassword"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn send_password_reset(
            &mut self,
            request: impl tonic::IntoRequest<super::SendPasswordResetRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SendPasswordResetResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/SendPasswordReset",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "SendPasswordReset"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn create_role(
            &mut self,
            request: impl tonic::IntoRequest<super::CreateRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateRoleResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/CreateRole",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "CreateRole"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_role_permissions(
            &mut self,
            request: impl tonic::IntoRequest<super::SetRolePermissionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetRolePermissionsResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/SetRolePermissions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "SetRolePermissions"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_roles(
            &mut self,
            request: impl tonic::IntoRequest<super::ListRolesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListRolesResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/ListRoles",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "ListRoles"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn assign_role(
            &mut self,
            request: impl tonic::IntoRequest<super::AssignRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::AssignRoleResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/AssignRole",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "AssignRole"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn revoke_role(
            &mut self,
            request: impl tonic::IntoRequest<super::RevokeRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeRoleResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/RevokeRole",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "RevokeRole"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn create_client(
            &mut self,
            request: impl tonic::IntoRequest<super::CreateClientRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateClientResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/CreateClient",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "CreateClient"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn rotate_client_secret(
            &mut self,
            request: impl tonic::IntoRequest<super::RotateClientSecretRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RotateClientSecretResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/RotateClientSecret",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "RotateClientSecret"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_clients(
            &mut self,
            request: impl tonic::IntoRequest<super::ListClientsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListClientsResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/ListClients",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "ListClients"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_exchange_policy(
            &mut self,
            request: impl tonic::IntoRequest<super::SetExchangePolicyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetExchangePolicyResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/SetExchangePolicy",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "SetExchangePolicy"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_exchange_policies(
            &mut self,
            request: impl tonic::IntoRequest<super::ListExchangePoliciesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListExchangePoliciesResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/ListExchangePolicies",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "identity.v1.IdentityService",
                        "ListExchangePolicies",
                    ),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_user_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::GetUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserMfaResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/GetUserMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "GetUserMFA"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_user_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::SetUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserMfaResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/SetUserMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "SetUserMFA"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn enforce_user_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::EnforceUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::EnforceUserMfaResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/EnforceUserMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "EnforceUserMFA"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn reset_user_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::ResetUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ResetUserMfaResponse>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static(
                "/identity.v1.IdentityService/ResetUserMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "ResetUserMFA"));
            self.inner.unary(req, path, codec).await
        }
    }
}
/// Generated server implementations.
pub mod identity_service_server {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    /// Generated trait containing gRPC methods that should be implemented for use with IdentityServiceServer.
    #[async_trait]
    pub trait IdentityService: Send + Sync + 'static {
        async fn introspect(
            &self,
            request: tonic::Request<super::IntrospectRequest>,
        ) -> std::result::Result<
            tonic::Response<super::IntrospectResponse>,
            tonic::Status,
        >;
        async fn check_permission(
            &self,
            request: tonic::Request<super::CheckPermissionRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CheckPermissionResponse>,
            tonic::Status,
        >;
        async fn revoke_token(
            &self,
            request: tonic::Request<super::RevokeTokenRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeTokenResponse>,
            tonic::Status,
        >;
        async fn get_user(
            &self,
            request: tonic::Request<super::GetUserRequest>,
        ) -> std::result::Result<tonic::Response<super::GetUserResponse>, tonic::Status>;
        async fn list_users(
            &self,
            request: tonic::Request<super::ListUsersRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListUsersResponse>,
            tonic::Status,
        >;
        async fn create_user(
            &self,
            request: tonic::Request<super::CreateUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateUserResponse>,
            tonic::Status,
        >;
        async fn set_user_disabled(
            &self,
            request: tonic::Request<super::SetUserDisabledRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserDisabledResponse>,
            tonic::Status,
        >;
        async fn set_user_password(
            &self,
            request: tonic::Request<super::SetUserPasswordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserPasswordResponse>,
            tonic::Status,
        >;
        async fn send_password_reset(
            &self,
            request: tonic::Request<super::SendPasswordResetRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SendPasswordResetResponse>,
            tonic::Status,
        >;
        async fn create_role(
            &self,
            request: tonic::Request<super::CreateRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateRoleResponse>,
            tonic::Status,
        >;
        async fn set_role_permissions(
            &self,
            request: tonic::Request<super::SetRolePermissionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetRolePermissionsResponse>,
            tonic::Status,
        >;
        async fn list_roles(
            &self,
            request: tonic::Request<super::ListRolesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListRolesResponse>,
            tonic::Status,
        >;
        async fn assign_role(
            &self,
            request: tonic::Request<super::AssignRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::AssignRoleResponse>,
            tonic::Status,
        >;
        async fn revoke_role(
            &self,
            request: tonic::Request<super::RevokeRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeRoleResponse>,
            tonic::Status,
        >;
        async fn create_client(
            &self,
            request: tonic::Request<super::CreateClientRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateClientResponse>,
            tonic::Status,
        >;
        async fn rotate_client_secret(
            &self,
            request: tonic::Request<super::RotateClientSecretRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RotateClientSecretResponse>,
            tonic::Status,
        >;
        async fn list_clients(
            &self,
            request: tonic::Request<super::ListClientsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListClientsResponse>,
            tonic::Status,
        >;
        async fn set_exchange_policy(
            &self,
            request: tonic::Request<super::SetExchangePolicyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetExchangePolicyResponse>,
            tonic::Status,
        >;
        async fn list_exchange_policies(
            &self,
            request: tonic::Request<super::ListExchangePoliciesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListExchangePoliciesResponse>,
            tonic::Status,
        >;
        async fn get_user_mfa(
            &self,
            request: tonic::Request<super::GetUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserMfaResponse>,
            tonic::Status,
        >;
        async fn set_user_mfa(
            &self,
            request: tonic::Request<super::SetUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserMfaResponse>,
            tonic::Status,
        >;
        async fn enforce_user_mfa(
            &self,
            request: tonic::Request<super::EnforceUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::EnforceUserMfaResponse>,
            tonic::Status,
        >;
        async fn reset_user_mfa(
            &self,
            request: tonic::Request<super::ResetUserMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ResetUserMfaResponse>,
            tonic::Status,
        >;
    }
    #[derive(Debug)]
    pub struct IdentityServiceServer<T: IdentityService> {
        inner: Arc<T>,
        accept_compression_encodings: EnabledCompressionEncodings,
        send_compression_encodings: EnabledCompressionEncodings,
        max_decoding_message_size: Option<usize>,
        max_encoding_message_size: Option<usize>,
    }
    impl<T: IdentityService> IdentityServiceServer<T> {
        pub fn new(inner: T) -> Self {
            Self::from_arc(Arc::new(inner))
        }
        pub fn from_arc(inner: Arc<T>) -> Self {
            Self {
                inner,
                accept_compression_encodings: Default::default(),
                send_compression_encodings: Default::default(),
                max_decoding_message_size: None,
                max_encoding_message_size: None,
            }
        }
        pub fn with_interceptor<F>(
            inner: T,
            interceptor: F,
        ) -> InterceptedService<Self, F>
        where
            F: tonic::service::Interceptor,
        {
            InterceptedService::new(Self::new(inner), interceptor)
        }
        /// Enable decompressing requests with the given encoding.
        #[must_use]
        pub fn accept_compressed(mut self, encoding: CompressionEncoding) -> Self {
            self.accept_compression_encodings.enable(encoding);
            self
        }
        /// Compress responses with the given encoding, if the client supports it.
        #[must_use]
        pub fn send_compressed(mut self, encoding: CompressionEncoding) -> Self {
            self.send_compression_encodings.enable(encoding);
            self
        }
        /// Limits the maximum size of a decoded message.
        ///
        /// Default: `4MB`
        #[must_use]
        pub fn max_decoding_message_size(mut self, limit: usize) -> Self {
            self.max_decoding_message_size = Some(limit);
            self
        }
        /// Limits the maximum size of an encoded message.
        ///
        /// Default: `usize::MAX`
        #[must_use]
        pub fn max_encoding_message_size(mut self, limit: usize) -> Self {
            self.max_encoding_message_size = Some(limit);
            self
        }
    }
    impl<T, B> tonic::codegen::Service<http::Request<B>> for IdentityServiceServer<T>
    where
        T: IdentityService,
        B: Body + Send + 'static,
        B::Error: Into<StdError> + Send + 'static,
    {
        type Response = http::Response<tonic::body::BoxBody>;
        type Error = std::convert::Infallible;
        type Future = BoxFuture<Self::Response, Self::Error>;
        fn poll_ready(
            &mut self,
            _cx: &mut Context<'_>,
        ) -> Poll<std::result::Result<(), Self::Error>> {
            Poll::Ready(Ok(()))
        }
        fn call(&mut self, req: http::Request<B>) -> Self::Future {
            match req.uri().path() {
                "/identity.v1.IdentityService/Introspect" => {
                    #[allow(non_camel_case_types)]
                    struct IntrospectSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::IntrospectRequest>
                    for IntrospectSvc<T> {
                        type Response = super::IntrospectResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::IntrospectRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::introspect(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = IntrospectSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/CheckPermission" => {
                    #[allow(non_camel_case_types)]
                    struct CheckPermissionSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::CheckPermissionRequest>
                    for CheckPermissionSvc<T> {
                        type Response = super::CheckPermissionResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CheckPermissionRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::check_permission(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = CheckPermissionSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/RevokeToken" => {
                    #[allow(non_camel_case_types)]
                    struct RevokeTokenSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RevokeTokenRequest>
                    for RevokeTokenSvc<T> {
                        type Response = super::RevokeTokenResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RevokeTokenRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::revoke_token(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = RevokeTokenSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/GetUser" => {
                    #[allow(non_camel_case_types)]
                    struct GetUserSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetUserRequest>
                    for GetUserSvc<T> {
                        type Response = super::GetUserResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetUserRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_user(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = GetUserSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/ListUsers" => {
                    #[allow(non_camel_case_types)]
                    struct ListUsersSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListUsersRequest>
                    for ListUsersSvc<T> {
                        type Response = super::ListUsersResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListUsersRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_users(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = ListUsersSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/CreateUser" => {
                    #[allow(non_camel_case_types)]
                    struct CreateUserSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::CreateUserRequest>
                    for CreateUserSvc<T> {
                        type Response = super::CreateUserResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CreateUserRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::create_user(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = CreateUserSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/SetUserDisabled" => {
                    #[allow(non_camel_case_types)]
                    struct SetUserDisabledSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetUserDisabledRequest>
                    for SetUserDisabledSvc<T> {
                        type Response = super::SetUserDisabledResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetUserDisabledRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_user_disabled(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = SetUserDisabledSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/SetUserPassword" => {
                    #[allow(non_camel_case_types)]
                    struct SetUserPasswordSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetUserPasswordRequest>
                    for SetUserPasswordSvc<T> {
                        type Response = super::SetUserPasswordResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetUserPasswordRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_user_password(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = SetUserPasswordSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/SendPasswordReset" => {
                    #[allow(non_camel_case_types)]
                    struct SendPasswordResetSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SendPasswordResetRequest>
                    for SendPasswordResetSvc<T> {
                        type Response = super::SendPasswordResetResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SendPasswordResetRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::send_password_reset(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = SendPasswordResetSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/CreateRole" => {
                    #[allow(non_camel_case_types)]
                    struct CreateRoleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::CreateRoleRequest>
                    for CreateRoleSvc<T> {
                        type Response = super::CreateRoleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CreateRoleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::create_role(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = CreateRoleSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/SetRolePermissions" => {
                    #[allow(non_camel_case_types)]
                    struct SetRolePermissionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetRolePermissionsRequest>
                    for SetRolePermissionsSvc<T> {
                        type Response = super::SetRolePermissionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetRolePermissionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_role_permissions(
                                        &inner,
                                        request,
                                    )
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = SetRolePermissionsSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/ListRoles" => {
                    #[allow(non_camel_case_types)]
                    struct ListRolesSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListRolesRequest>
                    for ListRolesSvc<T> {
                        type Response = super::ListRolesResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListRolesRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_roles(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = ListRolesSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/AssignRole" => {
                    #[allow(non_camel_case_types)]
                    struct AssignRoleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::AssignRoleRequest>
                    for AssignRoleSvc<T> {
                        type Response = super::AssignRoleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::AssignRoleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::assign_role(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = AssignRoleSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/RevokeRole" => {
                    #[allow(non_camel_case_types)]
                    struct RevokeRoleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RevokeRoleRequest>
                    for RevokeRoleSvc<T> {
                        type Response = super::RevokeRoleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RevokeRoleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::revoke_role(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = RevokeRoleSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/CreateClient" => {
                    #[allow(non_camel_case_types)]
                    struct CreateClientSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::CreateClientRequest>
                    for CreateClientSvc<T> {
                        type Response = super::CreateClientResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CreateClientRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::create_client(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = CreateClientSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/RotateClientSecret" => {
                    #[allow(non_camel_case_types)]
                    struct RotateClientSecretSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RotateClientSecretRequest>
                    for RotateClientSecretSvc<T> {
                        type Response = super::RotateClientSecretResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RotateClientSecretRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::rotate_client_secret(
                                        &inner,
                                        request,
                                    )
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = RotateClientSecretSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/ListClients" => {
                    #[allow(non_camel_case_types)]
                    struct ListClientsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListClientsRequest>
                    for ListClientsSvc<T> {
                        type Response = super::ListClientsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListClientsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_clients(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = ListClientsSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/SetExchangePolicy" => {
                    #[allow(non_camel_case_types)]
                    struct SetExchangePolicySvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetExchangePolicyRequest>
                    for SetExchangePolicySvc<T> {
                        type Response = super::SetExchangePolicyResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetExchangePolicyRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_exchange_policy(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = SetExchangePolicySvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/ListExchangePolicies" => {
                    #[allow(non_camel_case_types)]
                    struct ListExchangePoliciesSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListExchangePoliciesRequest>
                    for ListExchangePoliciesSvc<T> {
                        type Response = super::ListExchangePoliciesResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListExchangePoliciesRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_exchange_policies(
                                        &inner,
                                        request,
                                    )
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = ListExchangePoliciesSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/GetUserMFA" => {
                    #[allow(non_camel_case_types)]
                    struct GetUserMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetUserMfaRequest>
                    for GetUserMFASvc<T> {
                        type Response = super::GetUserMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetUserMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_user_mfa(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = GetUserMFASvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/SetUserMFA" => {
                    #[allow(non_camel_case_types)]
                    struct SetUserMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetUserMfaRequest>
                    for SetUserMFASvc<T> {
                        type Response = super::SetUserMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetUserMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_user_mfa(&inner, request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = SetUserMFASvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/EnforceUserMFA" => {
                    #[allow(non_camel_case_types)]
                    struct EnforceUserMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::EnforceUserMfaRequest>
                    for EnforceUserMFASvc<T> {
                        type Response = super::EnforceUserMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::EnforceUserMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::enforce_user_mfa(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = EnforceUserMFASvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/identity.v1.IdentityService/ResetUserMFA" => {
                    #[allow(non_camel_case_types)]
                    struct ResetUserMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ResetUserMfaRequest>
                    for ResetUserMFASvc<T> {
                        type Response = super::ResetUserMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ResetUserMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::reset_user_mfa(&inner, request)
                                    .await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let max_decoding_message_size = self.max_decoding_message_size;
                    let max_encoding_message_size = self.max_encoding_message_size;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let method = ResetUserMFASvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            )
                            .apply_max_message_size_config(
                                max_decoding_message_size,
                                max_encoding_message_size,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                _ => {
                    Box::pin(async move {
                        Ok(
                            http::Response::builder()
                                .status(200)
                                .header("grpc-status", tonic::Code::Unimplemented as i32)
                                .header(
                                    http::header::CONTENT_TYPE,
                                    tonic::metadata::GRPC_CONTENT_TYPE,
                                )
                                .body(empty_body())
                                .unwrap(),
                        )
                    })
                }
            }
        }
    }
    impl<T: IdentityService> Clone for IdentityServiceServer<T> {
        fn clone(&self) -> Self {
            let inner = self.inner.clone();
            Self {
                inner,
                accept_compression_encodings: self.accept_compression_encodings,
                send_compression_encodings: self.send_compression_encodings,
                max_decoding_message_size: self.max_decoding_message_size,
                max_encoding_message_size: self.max_encoding_message_size,
            }
        }
    }
    impl<T: IdentityService> tonic::server::NamedService for IdentityServiceServer<T> {
        const NAME: &'static str = "identity.v1.IdentityService";
    }
}
