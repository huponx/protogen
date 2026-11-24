// @generated
/// Generated client implementations.
pub mod dictionary_service_client {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    use tonic::codegen::http::Uri;
    #[derive(Debug, Clone)]
    pub struct DictionaryServiceClient<T> {
        inner: tonic::client::Grpc<T>,
    }
    impl DictionaryServiceClient<tonic::transport::Channel> {
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
    impl<T> DictionaryServiceClient<T>
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
        ) -> DictionaryServiceClient<InterceptedService<T, F>>
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
            DictionaryServiceClient::new(InterceptedService::new(inner, interceptor))
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
        pub async fn lookup_word(
            &mut self,
            request: impl tonic::IntoRequest<super::LookupWordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::LookupWordResponse>,
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
                "/dictionary.v1.DictionaryService/LookupWord",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "LookupWord"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn lookup_words(
            &mut self,
            request: impl tonic::IntoRequest<super::LookupWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::LookupWordsResponse>,
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
                "/dictionary.v1.DictionaryService/LookupWords",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "LookupWords"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn save_word(
            &mut self,
            request: impl tonic::IntoRequest<super::SaveWordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SaveWordResponse>,
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
                "/dictionary.v1.DictionaryService/SaveWord",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("dictionary.v1.DictionaryService", "SaveWord"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn list_saved_words(
            &mut self,
            request: impl tonic::IntoRequest<super::ListSavedWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListSavedWordsResponse>,
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
                "/dictionary.v1.DictionaryService/ListSavedWords",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "ListSavedWords"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn delete_saved_word(
            &mut self,
            request: impl tonic::IntoRequest<super::DeleteSavedWordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteSavedWordResponse>,
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
                "/dictionary.v1.DictionaryService/DeleteSavedWord",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "DeleteSavedWord"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn export_anki(
            &mut self,
            request: impl tonic::IntoRequest<super::ExportAnkiRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ExportAnkiResponse>,
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
                "/dictionary.v1.DictionaryService/ExportAnki",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "ExportAnki"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn create_deck_link(
            &mut self,
            request: impl tonic::IntoRequest<super::CreateDeckLinkRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateDeckLinkResponse>,
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
                "/dictionary.v1.DictionaryService/CreateDeckLink",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "CreateDeckLink"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn download_deck(
            &mut self,
            request: impl tonic::IntoRequest<super::DownloadDeckRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DownloadDeckResponse>,
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
                "/dictionary.v1.DictionaryService/DownloadDeck",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "DownloadDeck"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn remove_exported_words(
            &mut self,
            request: impl tonic::IntoRequest<super::RemoveExportedWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RemoveExportedWordsResponse>,
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
                "/dictionary.v1.DictionaryService/RemoveExportedWords",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "dictionary.v1.DictionaryService",
                        "RemoveExportedWords",
                    ),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn upload_image(
            &mut self,
            request: impl tonic::IntoRequest<super::UploadImageRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UploadImageResponse>,
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
                "/dictionary.v1.DictionaryService/UploadImage",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "UploadImage"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_image(
            &mut self,
            request: impl tonic::IntoRequest<super::GetImageRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetImageResponse>,
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
                "/dictionary.v1.DictionaryService/GetImage",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("dictionary.v1.DictionaryService", "GetImage"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::GetSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetSettingsResponse>,
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
                "/dictionary.v1.DictionaryService/GetSettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "GetSettings"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn update_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateSettingsResponse>,
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
                "/dictionary.v1.DictionaryService/UpdateSettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "UpdateSettings"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_my_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::GetMySettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMySettingsResponse>,
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
                "/dictionary.v1.DictionaryService/GetMySettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "GetMySettings"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn update_my_settings(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateMySettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateMySettingsResponse>,
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
                "/dictionary.v1.DictionaryService/UpdateMySettings",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "dictionary.v1.DictionaryService",
                        "UpdateMySettings",
                    ),
                );
            self.inner.unary(req, path, codec).await
        }
    }
}
/// Generated server implementations.
pub mod dictionary_service_server {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    /// Generated trait containing gRPC methods that should be implemented for use with DictionaryServiceServer.
    #[async_trait]
    pub trait DictionaryService: Send + Sync + 'static {
        async fn lookup_word(
            &self,
            request: tonic::Request<super::LookupWordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::LookupWordResponse>,
            tonic::Status,
        >;
        async fn lookup_words(
            &self,
            request: tonic::Request<super::LookupWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::LookupWordsResponse>,
            tonic::Status,
        >;
        async fn save_word(
            &self,
            request: tonic::Request<super::SaveWordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SaveWordResponse>,
            tonic::Status,
        >;
        async fn list_saved_words(
            &self,
            request: tonic::Request<super::ListSavedWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListSavedWordsResponse>,
            tonic::Status,
        >;
        async fn delete_saved_word(
            &self,
            request: tonic::Request<super::DeleteSavedWordRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteSavedWordResponse>,
            tonic::Status,
        >;
        async fn export_anki(
            &self,
            request: tonic::Request<super::ExportAnkiRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ExportAnkiResponse>,
            tonic::Status,
        >;
        async fn create_deck_link(
            &self,
            request: tonic::Request<super::CreateDeckLinkRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateDeckLinkResponse>,
            tonic::Status,
        >;
        async fn download_deck(
            &self,
            request: tonic::Request<super::DownloadDeckRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DownloadDeckResponse>,
            tonic::Status,
        >;
        async fn remove_exported_words(
            &self,
            request: tonic::Request<super::RemoveExportedWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RemoveExportedWordsResponse>,
            tonic::Status,
        >;
        async fn upload_image(
            &self,
            request: tonic::Request<super::UploadImageRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UploadImageResponse>,
            tonic::Status,
        >;
        async fn get_image(
            &self,
            request: tonic::Request<super::GetImageRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetImageResponse>,
            tonic::Status,
        >;
        async fn get_settings(
            &self,
            request: tonic::Request<super::GetSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetSettingsResponse>,
            tonic::Status,
        >;
        async fn update_settings(
            &self,
            request: tonic::Request<super::UpdateSettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateSettingsResponse>,
            tonic::Status,
        >;
        async fn get_my_settings(
            &self,
            request: tonic::Request<super::GetMySettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMySettingsResponse>,
            tonic::Status,
        >;
        async fn update_my_settings(
            &self,
            request: tonic::Request<super::UpdateMySettingsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateMySettingsResponse>,
            tonic::Status,
        >;
    }
    #[derive(Debug)]
    pub struct DictionaryServiceServer<T: DictionaryService> {
        inner: Arc<T>,
        accept_compression_encodings: EnabledCompressionEncodings,
        send_compression_encodings: EnabledCompressionEncodings,
        max_decoding_message_size: Option<usize>,
        max_encoding_message_size: Option<usize>,
    }
    impl<T: DictionaryService> DictionaryServiceServer<T> {
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
    impl<T, B> tonic::codegen::Service<http::Request<B>> for DictionaryServiceServer<T>
    where
        T: DictionaryService,
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
                "/dictionary.v1.DictionaryService/LookupWord" => {
                    #[allow(non_camel_case_types)]
                    struct LookupWordSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::LookupWordRequest>
                    for LookupWordSvc<T> {
                        type Response = super::LookupWordResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::LookupWordRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::lookup_word(&inner, request).await
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
                        let method = LookupWordSvc(inner);
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
                "/dictionary.v1.DictionaryService/LookupWords" => {
                    #[allow(non_camel_case_types)]
                    struct LookupWordsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::LookupWordsRequest>
                    for LookupWordsSvc<T> {
                        type Response = super::LookupWordsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::LookupWordsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::lookup_words(&inner, request)
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
                        let method = LookupWordsSvc(inner);
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
                "/dictionary.v1.DictionaryService/SaveWord" => {
                    #[allow(non_camel_case_types)]
                    struct SaveWordSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::SaveWordRequest>
                    for SaveWordSvc<T> {
                        type Response = super::SaveWordResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SaveWordRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::save_word(&inner, request).await
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
                        let method = SaveWordSvc(inner);
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
                "/dictionary.v1.DictionaryService/ListSavedWords" => {
                    #[allow(non_camel_case_types)]
                    struct ListSavedWordsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::ListSavedWordsRequest>
                    for ListSavedWordsSvc<T> {
                        type Response = super::ListSavedWordsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListSavedWordsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::list_saved_words(&inner, request)
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
                        let method = ListSavedWordsSvc(inner);
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
                "/dictionary.v1.DictionaryService/DeleteSavedWord" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteSavedWordSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::DeleteSavedWordRequest>
                    for DeleteSavedWordSvc<T> {
                        type Response = super::DeleteSavedWordResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DeleteSavedWordRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::delete_saved_word(&inner, request)
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
                        let method = DeleteSavedWordSvc(inner);
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
                "/dictionary.v1.DictionaryService/ExportAnki" => {
                    #[allow(non_camel_case_types)]
                    struct ExportAnkiSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::ExportAnkiRequest>
                    for ExportAnkiSvc<T> {
                        type Response = super::ExportAnkiResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ExportAnkiRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::export_anki(&inner, request).await
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
                        let method = ExportAnkiSvc(inner);
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
                "/dictionary.v1.DictionaryService/CreateDeckLink" => {
                    #[allow(non_camel_case_types)]
                    struct CreateDeckLinkSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::CreateDeckLinkRequest>
                    for CreateDeckLinkSvc<T> {
                        type Response = super::CreateDeckLinkResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CreateDeckLinkRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::create_deck_link(&inner, request)
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
                        let method = CreateDeckLinkSvc(inner);
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
                "/dictionary.v1.DictionaryService/DownloadDeck" => {
                    #[allow(non_camel_case_types)]
                    struct DownloadDeckSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::DownloadDeckRequest>
                    for DownloadDeckSvc<T> {
                        type Response = super::DownloadDeckResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DownloadDeckRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::download_deck(&inner, request)
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
                        let method = DownloadDeckSvc(inner);
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
                "/dictionary.v1.DictionaryService/RemoveExportedWords" => {
                    #[allow(non_camel_case_types)]
                    struct RemoveExportedWordsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::RemoveExportedWordsRequest>
                    for RemoveExportedWordsSvc<T> {
                        type Response = super::RemoveExportedWordsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RemoveExportedWordsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::remove_exported_words(
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
                        let method = RemoveExportedWordsSvc(inner);
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
                "/dictionary.v1.DictionaryService/UploadImage" => {
                    #[allow(non_camel_case_types)]
                    struct UploadImageSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::UploadImageRequest>
                    for UploadImageSvc<T> {
                        type Response = super::UploadImageResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UploadImageRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::upload_image(&inner, request)
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
                        let method = UploadImageSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetImage" => {
                    #[allow(non_camel_case_types)]
                    struct GetImageSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetImageRequest>
                    for GetImageSvc<T> {
                        type Response = super::GetImageResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetImageRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_image(&inner, request).await
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
                        let method = GetImageSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetSettings" => {
                    #[allow(non_camel_case_types)]
                    struct GetSettingsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetSettingsRequest>
                    for GetSettingsSvc<T> {
                        type Response = super::GetSettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetSettingsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_settings(&inner, request)
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
                        let method = GetSettingsSvc(inner);
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
                "/dictionary.v1.DictionaryService/UpdateSettings" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateSettingsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::UpdateSettingsRequest>
                    for UpdateSettingsSvc<T> {
                        type Response = super::UpdateSettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateSettingsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::update_settings(&inner, request)
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
                        let method = UpdateSettingsSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetMySettings" => {
                    #[allow(non_camel_case_types)]
                    struct GetMySettingsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetMySettingsRequest>
                    for GetMySettingsSvc<T> {
                        type Response = super::GetMySettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetMySettingsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_my_settings(&inner, request)
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
                        let method = GetMySettingsSvc(inner);
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
                "/dictionary.v1.DictionaryService/UpdateMySettings" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateMySettingsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::UpdateMySettingsRequest>
                    for UpdateMySettingsSvc<T> {
                        type Response = super::UpdateMySettingsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateMySettingsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::update_my_settings(
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
                        let method = UpdateMySettingsSvc(inner);
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
    impl<T: DictionaryService> Clone for DictionaryServiceServer<T> {
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
    impl<T: DictionaryService> tonic::server::NamedService
    for DictionaryServiceServer<T> {
        const NAME: &'static str = "dictionary.v1.DictionaryService";
    }
}
