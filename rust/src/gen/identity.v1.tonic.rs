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
        pub async fn list_user_sessions(
            &mut self,
            request: impl tonic::IntoRequest<super::ListUserSessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListUserSessionsResponse>,
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
                "/identity.v1.IdentityService/ListUserSessions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "ListUserSessions"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn revoke_user_sessions(
            &mut self,
            request: impl tonic::IntoRequest<super::RevokeUserSessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeUserSessionsResponse>,
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
                "/identity.v1.IdentityService/RevokeUserSessions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "RevokeUserSessions"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn delete_user(
            &mut self,
            request: impl tonic::IntoRequest<super::DeleteUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteUserResponse>,
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
                "/identity.v1.IdentityService/DeleteUser",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "DeleteUser"));
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
        pub async fn update_user(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateUserResponse>,
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
                "/identity.v1.IdentityService/UpdateUser",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "UpdateUser"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_user_avatar(
            &mut self,
            request: impl tonic::IntoRequest<super::SetUserAvatarRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserAvatarResponse>,
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
                "/identity.v1.IdentityService/SetUserAvatar",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "SetUserAvatar"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn send_welcome(
            &mut self,
            request: impl tonic::IntoRequest<super::SendWelcomeRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SendWelcomeResponse>,
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
                "/identity.v1.IdentityService/SendWelcome",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "SendWelcome"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn approve_user(
            &mut self,
            request: impl tonic::IntoRequest<super::ApproveUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ApproveUserResponse>,
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
                "/identity.v1.IdentityService/ApproveUser",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "ApproveUser"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn reject_user(
            &mut self,
            request: impl tonic::IntoRequest<super::RejectUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RejectUserResponse>,
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
                "/identity.v1.IdentityService/RejectUser",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "RejectUser"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_user_stats(
            &mut self,
            request: impl tonic::IntoRequest<super::GetUserStatsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserStatsResponse>,
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
                "/identity.v1.IdentityService/GetUserStats",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "GetUserStats"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_me(
            &mut self,
            request: impl tonic::IntoRequest<super::GetMeRequest>,
        ) -> std::result::Result<tonic::Response<super::GetMeResponse>, tonic::Status> {
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
                "/identity.v1.IdentityService/GetMe",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "GetMe"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn update_me(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateMeRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateMeResponse>,
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
                "/identity.v1.IdentityService/UpdateMe",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "UpdateMe"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_my_avatar(
            &mut self,
            request: impl tonic::IntoRequest<super::SetMyAvatarRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetMyAvatarResponse>,
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
                "/identity.v1.IdentityService/SetMyAvatar",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "SetMyAvatar"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn change_my_password(
            &mut self,
            request: impl tonic::IntoRequest<super::ChangeMyPasswordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ChangeMyPasswordResponse>,
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
                "/identity.v1.IdentityService/ChangeMyPassword",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "ChangeMyPassword"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_my_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::GetMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMyMfaResponse>,
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
                "/identity.v1.IdentityService/GetMyMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "GetMyMFA"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn begin_my_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::BeginMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::BeginMyMfaResponse>,
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
                "/identity.v1.IdentityService/BeginMyMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "BeginMyMFA"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn confirm_my_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::ConfirmMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ConfirmMyMfaResponse>,
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
                "/identity.v1.IdentityService/ConfirmMyMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "ConfirmMyMFA"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn disable_my_mfa(
            &mut self,
            request: impl tonic::IntoRequest<super::DisableMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DisableMyMfaResponse>,
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
                "/identity.v1.IdentityService/DisableMyMFA",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "DisableMyMFA"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn regenerate_my_recovery_codes(
            &mut self,
            request: impl tonic::IntoRequest<super::RegenerateMyRecoveryCodesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RegenerateMyRecoveryCodesResponse>,
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
                "/identity.v1.IdentityService/RegenerateMyRecoveryCodes",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "identity.v1.IdentityService",
                        "RegenerateMyRecoveryCodes",
                    ),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_my_passkeys(
            &mut self,
            request: impl tonic::IntoRequest<super::ListMyPasskeysRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListMyPasskeysResponse>,
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
                "/identity.v1.IdentityService/ListMyPasskeys",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "ListMyPasskeys"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn begin_my_passkey(
            &mut self,
            request: impl tonic::IntoRequest<super::BeginMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::BeginMyPasskeyResponse>,
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
                "/identity.v1.IdentityService/BeginMyPasskey",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "BeginMyPasskey"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn finish_my_passkey(
            &mut self,
            request: impl tonic::IntoRequest<super::FinishMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::FinishMyPasskeyResponse>,
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
                "/identity.v1.IdentityService/FinishMyPasskey",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "FinishMyPasskey"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn rename_my_passkey(
            &mut self,
            request: impl tonic::IntoRequest<super::RenameMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RenameMyPasskeyResponse>,
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
                "/identity.v1.IdentityService/RenameMyPasskey",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "RenameMyPasskey"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn delete_my_passkey(
            &mut self,
            request: impl tonic::IntoRequest<super::DeleteMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteMyPasskeyResponse>,
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
                "/identity.v1.IdentityService/DeleteMyPasskey",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "DeleteMyPasskey"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_my_sessions(
            &mut self,
            request: impl tonic::IntoRequest<super::ListMySessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListMySessionsResponse>,
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
                "/identity.v1.IdentityService/ListMySessions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "ListMySessions"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn revoke_my_session(
            &mut self,
            request: impl tonic::IntoRequest<super::RevokeMySessionRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeMySessionResponse>,
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
                "/identity.v1.IdentityService/RevokeMySession",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "RevokeMySession"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn revoke_my_other_sessions(
            &mut self,
            request: impl tonic::IntoRequest<super::RevokeMyOtherSessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeMyOtherSessionsResponse>,
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
                "/identity.v1.IdentityService/RevokeMyOtherSessions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "identity.v1.IdentityService",
                        "RevokeMyOtherSessions",
                    ),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_my_user_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::GetMyUserSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMyUserSettingsResponse>,
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
                "/identity.v1.IdentityService/GetMyUserSettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "GetMyUserSettings"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn put_my_user_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::PutMyUserSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::PutMyUserSettingsResponse>,
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
                "/identity.v1.IdentityService/PutMyUserSettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "PutMyUserSettings"),
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
        pub async fn update_role(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateRoleResponse>,
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
                "/identity.v1.IdentityService/UpdateRole",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "UpdateRole"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn delete_role(
            &mut self,
            request: impl tonic::IntoRequest<super::DeleteRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteRoleResponse>,
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
                "/identity.v1.IdentityService/DeleteRole",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "DeleteRole"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_permissions(
            &mut self,
            request: impl tonic::IntoRequest<super::ListPermissionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListPermissionsResponse>,
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
                "/identity.v1.IdentityService/ListPermissions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "ListPermissions"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn register_permissions(
            &mut self,
            request: impl tonic::IntoRequest<super::RegisterPermissionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RegisterPermissionsResponse>,
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
                "/identity.v1.IdentityService/RegisterPermissions",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "RegisterPermissions"),
                );
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
        pub async fn update_client(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateClientRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateClientResponse>,
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
                "/identity.v1.IdentityService/UpdateClient",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "UpdateClient"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_client_disabled(
            &mut self,
            request: impl tonic::IntoRequest<super::SetClientDisabledRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetClientDisabledResponse>,
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
                "/identity.v1.IdentityService/SetClientDisabled",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("identity.v1.IdentityService", "SetClientDisabled"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn delete_client(
            &mut self,
            request: impl tonic::IntoRequest<super::DeleteClientRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteClientResponse>,
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
                "/identity.v1.IdentityService/DeleteClient",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "DeleteClient"));
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
        pub async fn get_ui_style(
            &mut self,
            request: impl tonic::IntoRequest<super::GetUiStyleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUiStyleResponse>,
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
                "/identity.v1.IdentityService/GetUIStyle",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "GetUIStyle"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_ui_style(
            &mut self,
            request: impl tonic::IntoRequest<super::SetUiStyleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUiStyleResponse>,
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
                "/identity.v1.IdentityService/SetUIStyle",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("identity.v1.IdentityService", "SetUIStyle"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_registration_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::GetRegistrationSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetRegistrationSettingsResponse>,
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
                "/identity.v1.IdentityService/GetRegistrationSettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "identity.v1.IdentityService",
                        "GetRegistrationSettings",
                    ),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_registration_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::SetRegistrationSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetRegistrationSettingsResponse>,
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
                "/identity.v1.IdentityService/SetRegistrationSettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "identity.v1.IdentityService",
                        "SetRegistrationSettings",
                    ),
                );
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
        async fn list_user_sessions(
            &self,
            request: tonic::Request<super::ListUserSessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListUserSessionsResponse>,
            tonic::Status,
        >;
        async fn revoke_user_sessions(
            &self,
            request: tonic::Request<super::RevokeUserSessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeUserSessionsResponse>,
            tonic::Status,
        >;
        async fn delete_user(
            &self,
            request: tonic::Request<super::DeleteUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteUserResponse>,
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
        async fn update_user(
            &self,
            request: tonic::Request<super::UpdateUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateUserResponse>,
            tonic::Status,
        >;
        async fn set_user_avatar(
            &self,
            request: tonic::Request<super::SetUserAvatarRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserAvatarResponse>,
            tonic::Status,
        >;
        async fn send_welcome(
            &self,
            request: tonic::Request<super::SendWelcomeRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SendWelcomeResponse>,
            tonic::Status,
        >;
        async fn approve_user(
            &self,
            request: tonic::Request<super::ApproveUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ApproveUserResponse>,
            tonic::Status,
        >;
        async fn reject_user(
            &self,
            request: tonic::Request<super::RejectUserRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RejectUserResponse>,
            tonic::Status,
        >;
        async fn get_user_stats(
            &self,
            request: tonic::Request<super::GetUserStatsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserStatsResponse>,
            tonic::Status,
        >;
        async fn get_me(
            &self,
            request: tonic::Request<super::GetMeRequest>,
        ) -> std::result::Result<tonic::Response<super::GetMeResponse>, tonic::Status>;
        async fn update_me(
            &self,
            request: tonic::Request<super::UpdateMeRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateMeResponse>,
            tonic::Status,
        >;
        async fn set_my_avatar(
            &self,
            request: tonic::Request<super::SetMyAvatarRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetMyAvatarResponse>,
            tonic::Status,
        >;
        async fn change_my_password(
            &self,
            request: tonic::Request<super::ChangeMyPasswordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ChangeMyPasswordResponse>,
            tonic::Status,
        >;
        async fn get_my_mfa(
            &self,
            request: tonic::Request<super::GetMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMyMfaResponse>,
            tonic::Status,
        >;
        async fn begin_my_mfa(
            &self,
            request: tonic::Request<super::BeginMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::BeginMyMfaResponse>,
            tonic::Status,
        >;
        async fn confirm_my_mfa(
            &self,
            request: tonic::Request<super::ConfirmMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ConfirmMyMfaResponse>,
            tonic::Status,
        >;
        async fn disable_my_mfa(
            &self,
            request: tonic::Request<super::DisableMyMfaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DisableMyMfaResponse>,
            tonic::Status,
        >;
        async fn regenerate_my_recovery_codes(
            &self,
            request: tonic::Request<super::RegenerateMyRecoveryCodesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RegenerateMyRecoveryCodesResponse>,
            tonic::Status,
        >;
        async fn list_my_passkeys(
            &self,
            request: tonic::Request<super::ListMyPasskeysRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListMyPasskeysResponse>,
            tonic::Status,
        >;
        async fn begin_my_passkey(
            &self,
            request: tonic::Request<super::BeginMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::BeginMyPasskeyResponse>,
            tonic::Status,
        >;
        async fn finish_my_passkey(
            &self,
            request: tonic::Request<super::FinishMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::FinishMyPasskeyResponse>,
            tonic::Status,
        >;
        async fn rename_my_passkey(
            &self,
            request: tonic::Request<super::RenameMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RenameMyPasskeyResponse>,
            tonic::Status,
        >;
        async fn delete_my_passkey(
            &self,
            request: tonic::Request<super::DeleteMyPasskeyRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteMyPasskeyResponse>,
            tonic::Status,
        >;
        async fn list_my_sessions(
            &self,
            request: tonic::Request<super::ListMySessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListMySessionsResponse>,
            tonic::Status,
        >;
        async fn revoke_my_session(
            &self,
            request: tonic::Request<super::RevokeMySessionRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeMySessionResponse>,
            tonic::Status,
        >;
        async fn revoke_my_other_sessions(
            &self,
            request: tonic::Request<super::RevokeMyOtherSessionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RevokeMyOtherSessionsResponse>,
            tonic::Status,
        >;
        async fn get_my_user_settings(
            &self,
            request: tonic::Request<super::GetMyUserSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMyUserSettingsResponse>,
            tonic::Status,
        >;
        async fn put_my_user_settings(
            &self,
            request: tonic::Request<super::PutMyUserSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::PutMyUserSettingsResponse>,
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
        async fn update_role(
            &self,
            request: tonic::Request<super::UpdateRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateRoleResponse>,
            tonic::Status,
        >;
        async fn delete_role(
            &self,
            request: tonic::Request<super::DeleteRoleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteRoleResponse>,
            tonic::Status,
        >;
        async fn list_permissions(
            &self,
            request: tonic::Request<super::ListPermissionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListPermissionsResponse>,
            tonic::Status,
        >;
        async fn register_permissions(
            &self,
            request: tonic::Request<super::RegisterPermissionsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RegisterPermissionsResponse>,
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
        async fn update_client(
            &self,
            request: tonic::Request<super::UpdateClientRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateClientResponse>,
            tonic::Status,
        >;
        async fn set_client_disabled(
            &self,
            request: tonic::Request<super::SetClientDisabledRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetClientDisabledResponse>,
            tonic::Status,
        >;
        async fn delete_client(
            &self,
            request: tonic::Request<super::DeleteClientRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteClientResponse>,
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
        async fn get_ui_style(
            &self,
            request: tonic::Request<super::GetUiStyleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUiStyleResponse>,
            tonic::Status,
        >;
        async fn set_ui_style(
            &self,
            request: tonic::Request<super::SetUiStyleRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUiStyleResponse>,
            tonic::Status,
        >;
        async fn get_registration_settings(
            &self,
            request: tonic::Request<super::GetRegistrationSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetRegistrationSettingsResponse>,
            tonic::Status,
        >;
        async fn set_registration_settings(
            &self,
            request: tonic::Request<super::SetRegistrationSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetRegistrationSettingsResponse>,
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
                "/identity.v1.IdentityService/ListUserSessions" => {
                    #[allow(non_camel_case_types)]
                    struct ListUserSessionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListUserSessionsRequest>
                    for ListUserSessionsSvc<T> {
                        type Response = super::ListUserSessionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListUserSessionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_user_sessions(&inner, request)
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
                        let method = ListUserSessionsSvc(inner);
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
                "/identity.v1.IdentityService/RevokeUserSessions" => {
                    #[allow(non_camel_case_types)]
                    struct RevokeUserSessionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RevokeUserSessionsRequest>
                    for RevokeUserSessionsSvc<T> {
                        type Response = super::RevokeUserSessionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RevokeUserSessionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::revoke_user_sessions(
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
                        let method = RevokeUserSessionsSvc(inner);
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
                "/identity.v1.IdentityService/DeleteUser" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteUserSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::DeleteUserRequest>
                    for DeleteUserSvc<T> {
                        type Response = super::DeleteUserResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DeleteUserRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::delete_user(&inner, request).await
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
                        let method = DeleteUserSvc(inner);
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
                "/identity.v1.IdentityService/UpdateUser" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateUserSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::UpdateUserRequest>
                    for UpdateUserSvc<T> {
                        type Response = super::UpdateUserResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateUserRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::update_user(&inner, request).await
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
                        let method = UpdateUserSvc(inner);
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
                "/identity.v1.IdentityService/SetUserAvatar" => {
                    #[allow(non_camel_case_types)]
                    struct SetUserAvatarSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetUserAvatarRequest>
                    for SetUserAvatarSvc<T> {
                        type Response = super::SetUserAvatarResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetUserAvatarRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_user_avatar(&inner, request)
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
                        let method = SetUserAvatarSvc(inner);
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
                "/identity.v1.IdentityService/SendWelcome" => {
                    #[allow(non_camel_case_types)]
                    struct SendWelcomeSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SendWelcomeRequest>
                    for SendWelcomeSvc<T> {
                        type Response = super::SendWelcomeResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SendWelcomeRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::send_welcome(&inner, request).await
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
                        let method = SendWelcomeSvc(inner);
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
                "/identity.v1.IdentityService/ApproveUser" => {
                    #[allow(non_camel_case_types)]
                    struct ApproveUserSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ApproveUserRequest>
                    for ApproveUserSvc<T> {
                        type Response = super::ApproveUserResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ApproveUserRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::approve_user(&inner, request).await
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
                        let method = ApproveUserSvc(inner);
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
                "/identity.v1.IdentityService/RejectUser" => {
                    #[allow(non_camel_case_types)]
                    struct RejectUserSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RejectUserRequest>
                    for RejectUserSvc<T> {
                        type Response = super::RejectUserResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RejectUserRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::reject_user(&inner, request).await
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
                        let method = RejectUserSvc(inner);
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
                "/identity.v1.IdentityService/GetUserStats" => {
                    #[allow(non_camel_case_types)]
                    struct GetUserStatsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetUserStatsRequest>
                    for GetUserStatsSvc<T> {
                        type Response = super::GetUserStatsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetUserStatsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_user_stats(&inner, request)
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
                        let method = GetUserStatsSvc(inner);
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
                "/identity.v1.IdentityService/GetMe" => {
                    #[allow(non_camel_case_types)]
                    struct GetMeSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetMeRequest> for GetMeSvc<T> {
                        type Response = super::GetMeResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetMeRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_me(&inner, request).await
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
                        let method = GetMeSvc(inner);
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
                "/identity.v1.IdentityService/UpdateMe" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateMeSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::UpdateMeRequest>
                    for UpdateMeSvc<T> {
                        type Response = super::UpdateMeResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateMeRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::update_me(&inner, request).await
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
                        let method = UpdateMeSvc(inner);
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
                "/identity.v1.IdentityService/SetMyAvatar" => {
                    #[allow(non_camel_case_types)]
                    struct SetMyAvatarSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetMyAvatarRequest>
                    for SetMyAvatarSvc<T> {
                        type Response = super::SetMyAvatarResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetMyAvatarRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_my_avatar(&inner, request).await
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
                        let method = SetMyAvatarSvc(inner);
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
                "/identity.v1.IdentityService/ChangeMyPassword" => {
                    #[allow(non_camel_case_types)]
                    struct ChangeMyPasswordSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ChangeMyPasswordRequest>
                    for ChangeMyPasswordSvc<T> {
                        type Response = super::ChangeMyPasswordResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ChangeMyPasswordRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::change_my_password(&inner, request)
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
                        let method = ChangeMyPasswordSvc(inner);
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
                "/identity.v1.IdentityService/GetMyMFA" => {
                    #[allow(non_camel_case_types)]
                    struct GetMyMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetMyMfaRequest>
                    for GetMyMFASvc<T> {
                        type Response = super::GetMyMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetMyMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_my_mfa(&inner, request).await
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
                        let method = GetMyMFASvc(inner);
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
                "/identity.v1.IdentityService/BeginMyMFA" => {
                    #[allow(non_camel_case_types)]
                    struct BeginMyMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::BeginMyMfaRequest>
                    for BeginMyMFASvc<T> {
                        type Response = super::BeginMyMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::BeginMyMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::begin_my_mfa(&inner, request).await
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
                        let method = BeginMyMFASvc(inner);
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
                "/identity.v1.IdentityService/ConfirmMyMFA" => {
                    #[allow(non_camel_case_types)]
                    struct ConfirmMyMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ConfirmMyMfaRequest>
                    for ConfirmMyMFASvc<T> {
                        type Response = super::ConfirmMyMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ConfirmMyMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::confirm_my_mfa(&inner, request)
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
                        let method = ConfirmMyMFASvc(inner);
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
                "/identity.v1.IdentityService/DisableMyMFA" => {
                    #[allow(non_camel_case_types)]
                    struct DisableMyMFASvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::DisableMyMfaRequest>
                    for DisableMyMFASvc<T> {
                        type Response = super::DisableMyMfaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DisableMyMfaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::disable_my_mfa(&inner, request)
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
                        let method = DisableMyMFASvc(inner);
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
                "/identity.v1.IdentityService/RegenerateMyRecoveryCodes" => {
                    #[allow(non_camel_case_types)]
                    struct RegenerateMyRecoveryCodesSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<
                        super::RegenerateMyRecoveryCodesRequest,
                    > for RegenerateMyRecoveryCodesSvc<T> {
                        type Response = super::RegenerateMyRecoveryCodesResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<
                                super::RegenerateMyRecoveryCodesRequest,
                            >,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::regenerate_my_recovery_codes(
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
                        let method = RegenerateMyRecoveryCodesSvc(inner);
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
                "/identity.v1.IdentityService/ListMyPasskeys" => {
                    #[allow(non_camel_case_types)]
                    struct ListMyPasskeysSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListMyPasskeysRequest>
                    for ListMyPasskeysSvc<T> {
                        type Response = super::ListMyPasskeysResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListMyPasskeysRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_my_passkeys(&inner, request)
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
                        let method = ListMyPasskeysSvc(inner);
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
                "/identity.v1.IdentityService/BeginMyPasskey" => {
                    #[allow(non_camel_case_types)]
                    struct BeginMyPasskeySvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::BeginMyPasskeyRequest>
                    for BeginMyPasskeySvc<T> {
                        type Response = super::BeginMyPasskeyResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::BeginMyPasskeyRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::begin_my_passkey(&inner, request)
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
                        let method = BeginMyPasskeySvc(inner);
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
                "/identity.v1.IdentityService/FinishMyPasskey" => {
                    #[allow(non_camel_case_types)]
                    struct FinishMyPasskeySvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::FinishMyPasskeyRequest>
                    for FinishMyPasskeySvc<T> {
                        type Response = super::FinishMyPasskeyResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::FinishMyPasskeyRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::finish_my_passkey(&inner, request)
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
                        let method = FinishMyPasskeySvc(inner);
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
                "/identity.v1.IdentityService/RenameMyPasskey" => {
                    #[allow(non_camel_case_types)]
                    struct RenameMyPasskeySvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RenameMyPasskeyRequest>
                    for RenameMyPasskeySvc<T> {
                        type Response = super::RenameMyPasskeyResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RenameMyPasskeyRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::rename_my_passkey(&inner, request)
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
                        let method = RenameMyPasskeySvc(inner);
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
                "/identity.v1.IdentityService/DeleteMyPasskey" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteMyPasskeySvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::DeleteMyPasskeyRequest>
                    for DeleteMyPasskeySvc<T> {
                        type Response = super::DeleteMyPasskeyResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DeleteMyPasskeyRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::delete_my_passkey(&inner, request)
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
                        let method = DeleteMyPasskeySvc(inner);
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
                "/identity.v1.IdentityService/ListMySessions" => {
                    #[allow(non_camel_case_types)]
                    struct ListMySessionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListMySessionsRequest>
                    for ListMySessionsSvc<T> {
                        type Response = super::ListMySessionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListMySessionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_my_sessions(&inner, request)
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
                        let method = ListMySessionsSvc(inner);
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
                "/identity.v1.IdentityService/RevokeMySession" => {
                    #[allow(non_camel_case_types)]
                    struct RevokeMySessionSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RevokeMySessionRequest>
                    for RevokeMySessionSvc<T> {
                        type Response = super::RevokeMySessionResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RevokeMySessionRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::revoke_my_session(&inner, request)
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
                        let method = RevokeMySessionSvc(inner);
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
                "/identity.v1.IdentityService/RevokeMyOtherSessions" => {
                    #[allow(non_camel_case_types)]
                    struct RevokeMyOtherSessionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RevokeMyOtherSessionsRequest>
                    for RevokeMyOtherSessionsSvc<T> {
                        type Response = super::RevokeMyOtherSessionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RevokeMyOtherSessionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::revoke_my_other_sessions(
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
                        let method = RevokeMyOtherSessionsSvc(inner);
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
                "/identity.v1.IdentityService/GetMyUserSettings" => {
                    #[allow(non_camel_case_types)]
                    struct GetMyUserSettingsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetMyUserSettingsRequest>
                    for GetMyUserSettingsSvc<T> {
                        type Response = super::GetMyUserSettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetMyUserSettingsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_my_user_settings(
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
                        let method = GetMyUserSettingsSvc(inner);
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
                "/identity.v1.IdentityService/PutMyUserSettings" => {
                    #[allow(non_camel_case_types)]
                    struct PutMyUserSettingsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::PutMyUserSettingsRequest>
                    for PutMyUserSettingsSvc<T> {
                        type Response = super::PutMyUserSettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::PutMyUserSettingsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::put_my_user_settings(
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
                        let method = PutMyUserSettingsSvc(inner);
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
                "/identity.v1.IdentityService/UpdateRole" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateRoleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::UpdateRoleRequest>
                    for UpdateRoleSvc<T> {
                        type Response = super::UpdateRoleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateRoleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::update_role(&inner, request).await
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
                        let method = UpdateRoleSvc(inner);
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
                "/identity.v1.IdentityService/DeleteRole" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteRoleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::DeleteRoleRequest>
                    for DeleteRoleSvc<T> {
                        type Response = super::DeleteRoleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DeleteRoleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::delete_role(&inner, request).await
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
                        let method = DeleteRoleSvc(inner);
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
                "/identity.v1.IdentityService/ListPermissions" => {
                    #[allow(non_camel_case_types)]
                    struct ListPermissionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::ListPermissionsRequest>
                    for ListPermissionsSvc<T> {
                        type Response = super::ListPermissionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListPermissionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::list_permissions(&inner, request)
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
                        let method = ListPermissionsSvc(inner);
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
                "/identity.v1.IdentityService/RegisterPermissions" => {
                    #[allow(non_camel_case_types)]
                    struct RegisterPermissionsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::RegisterPermissionsRequest>
                    for RegisterPermissionsSvc<T> {
                        type Response = super::RegisterPermissionsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RegisterPermissionsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::register_permissions(
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
                        let method = RegisterPermissionsSvc(inner);
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
                "/identity.v1.IdentityService/UpdateClient" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateClientSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::UpdateClientRequest>
                    for UpdateClientSvc<T> {
                        type Response = super::UpdateClientResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateClientRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::update_client(&inner, request).await
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
                        let method = UpdateClientSvc(inner);
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
                "/identity.v1.IdentityService/SetClientDisabled" => {
                    #[allow(non_camel_case_types)]
                    struct SetClientDisabledSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetClientDisabledRequest>
                    for SetClientDisabledSvc<T> {
                        type Response = super::SetClientDisabledResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetClientDisabledRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_client_disabled(&inner, request)
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
                        let method = SetClientDisabledSvc(inner);
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
                "/identity.v1.IdentityService/DeleteClient" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteClientSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::DeleteClientRequest>
                    for DeleteClientSvc<T> {
                        type Response = super::DeleteClientResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DeleteClientRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::delete_client(&inner, request).await
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
                        let method = DeleteClientSvc(inner);
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
                "/identity.v1.IdentityService/GetUIStyle" => {
                    #[allow(non_camel_case_types)]
                    struct GetUIStyleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetUiStyleRequest>
                    for GetUIStyleSvc<T> {
                        type Response = super::GetUiStyleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetUiStyleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_ui_style(&inner, request).await
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
                        let method = GetUIStyleSvc(inner);
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
                "/identity.v1.IdentityService/SetUIStyle" => {
                    #[allow(non_camel_case_types)]
                    struct SetUIStyleSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetUiStyleRequest>
                    for SetUIStyleSvc<T> {
                        type Response = super::SetUiStyleResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetUiStyleRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_ui_style(&inner, request).await
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
                        let method = SetUIStyleSvc(inner);
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
                "/identity.v1.IdentityService/GetRegistrationSettings" => {
                    #[allow(non_camel_case_types)]
                    struct GetRegistrationSettingsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::GetRegistrationSettingsRequest>
                    for GetRegistrationSettingsSvc<T> {
                        type Response = super::GetRegistrationSettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<
                                super::GetRegistrationSettingsRequest,
                            >,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::get_registration_settings(
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
                        let method = GetRegistrationSettingsSvc(inner);
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
                "/identity.v1.IdentityService/SetRegistrationSettings" => {
                    #[allow(non_camel_case_types)]
                    struct SetRegistrationSettingsSvc<T: IdentityService>(pub Arc<T>);
                    impl<
                        T: IdentityService,
                    > tonic::server::UnaryService<super::SetRegistrationSettingsRequest>
                    for SetRegistrationSettingsSvc<T> {
                        type Response = super::SetRegistrationSettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<
                                super::SetRegistrationSettingsRequest,
                            >,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as IdentityService>::set_registration_settings(
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
                        let method = SetRegistrationSettingsSvc(inner);
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
