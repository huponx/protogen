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
        pub async fn check_saved_words(
            &mut self,
            request: impl tonic::IntoRequest<super::CheckSavedWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CheckSavedWordsResponse>,
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
                "/dictionary.v1.DictionaryService/CheckSavedWords",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "CheckSavedWords"),
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
        pub async fn start_export(
            &mut self,
            request: impl tonic::IntoRequest<super::StartExportRequest>,
        ) -> std::result::Result<
            tonic::Response<super::StartExportResponse>,
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
                "/dictionary.v1.DictionaryService/StartExport",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "StartExport"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_export(
            &mut self,
            request: impl tonic::IntoRequest<super::GetExportRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetExportResponse>,
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
                "/dictionary.v1.DictionaryService/GetExport",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("dictionary.v1.DictionaryService", "GetExport"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn cancel_export(
            &mut self,
            request: impl tonic::IntoRequest<super::CancelExportRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CancelExportResponse>,
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
                "/dictionary.v1.DictionaryService/CancelExport",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "CancelExport"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn create_export_part_link(
            &mut self,
            request: impl tonic::IntoRequest<super::CreateExportPartLinkRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateExportPartLinkResponse>,
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
                "/dictionary.v1.DictionaryService/CreateExportPartLink",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "dictionary.v1.DictionaryService",
                        "CreateExportPartLink",
                    ),
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
        pub async fn download_export_part(
            &mut self,
            request: impl tonic::IntoRequest<super::DownloadExportPartRequest>,
        ) -> std::result::Result<
            tonic::Response<tonic::codec::Streaming<super::DownloadChunk>>,
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
                "/dictionary.v1.DictionaryService/DownloadExportPart",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "dictionary.v1.DictionaryService",
                        "DownloadExportPart",
                    ),
                );
            self.inner.server_streaming(req, path, codec).await
        }
        pub async fn list_categories(
            &mut self,
            request: impl tonic::IntoRequest<super::ListCategoriesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListCategoriesResponse>,
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
                "/dictionary.v1.DictionaryService/ListCategories",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "ListCategories"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn create_category(
            &mut self,
            request: impl tonic::IntoRequest<super::CreateCategoryRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateCategoryResponse>,
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
                "/dictionary.v1.DictionaryService/CreateCategory",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "CreateCategory"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn rename_category(
            &mut self,
            request: impl tonic::IntoRequest<super::RenameCategoryRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RenameCategoryResponse>,
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
                "/dictionary.v1.DictionaryService/RenameCategory",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "RenameCategory"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn delete_category(
            &mut self,
            request: impl tonic::IntoRequest<super::DeleteCategoryRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteCategoryResponse>,
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
                "/dictionary.v1.DictionaryService/DeleteCategory",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "DeleteCategory"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn update_word_categories(
            &mut self,
            request: impl tonic::IntoRequest<super::UpdateWordCategoriesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateWordCategoriesResponse>,
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
                "/dictionary.v1.DictionaryService/UpdateWordCategories",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "dictionary.v1.DictionaryService",
                        "UpdateWordCategories",
                    ),
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
        pub async fn upload_audio(
            &mut self,
            request: impl tonic::IntoRequest<super::UploadAudioRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UploadAudioResponse>,
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
                "/dictionary.v1.DictionaryService/UploadAudio",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "UploadAudio"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_audio(
            &mut self,
            request: impl tonic::IntoRequest<super::GetAudioRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetAudioResponse>,
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
                "/dictionary.v1.DictionaryService/GetAudio",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(GrpcMethod::new("dictionary.v1.DictionaryService", "GetAudio"));
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_review_queue(
            &mut self,
            request: impl tonic::IntoRequest<super::GetReviewQueueRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetReviewQueueResponse>,
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
                "/dictionary.v1.DictionaryService/GetReviewQueue",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "GetReviewQueue"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn submit_review(
            &mut self,
            request: impl tonic::IntoRequest<super::SubmitReviewRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SubmitReviewResponse>,
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
                "/dictionary.v1.DictionaryService/SubmitReview",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "SubmitReview"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn add_review_bonus(
            &mut self,
            request: impl tonic::IntoRequest<super::AddReviewBonusRequest>,
        ) -> std::result::Result<
            tonic::Response<super::AddReviewBonusResponse>,
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
                "/dictionary.v1.DictionaryService/AddReviewBonus",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "AddReviewBonus"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn optimize_review_parameters(
            &mut self,
            request: impl tonic::IntoRequest<super::OptimizeReviewParametersRequest>,
        ) -> std::result::Result<
            tonic::Response<super::OptimizeReviewParametersResponse>,
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
                "/dictionary.v1.DictionaryService/OptimizeReviewParameters",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new(
                        "dictionary.v1.DictionaryService",
                        "OptimizeReviewParameters",
                    ),
                );
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
        pub async fn get_user_quota(
            &mut self,
            request: impl tonic::IntoRequest<super::GetUserQuotaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserQuotaResponse>,
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
                "/dictionary.v1.DictionaryService/GetUserQuota",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "GetUserQuota"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn set_user_quota(
            &mut self,
            request: impl tonic::IntoRequest<super::SetUserQuotaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserQuotaResponse>,
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
                "/dictionary.v1.DictionaryService/SetUserQuota",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "SetUserQuota"),
                );
            self.inner.unary(req, path, codec).await
        }
        pub async fn get_my_storage(
            &mut self,
            request: impl tonic::IntoRequest<super::GetMyStorageRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMyStorageResponse>,
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
                "/dictionary.v1.DictionaryService/GetMyStorage",
            );
            let mut req = request.into_request();
            req.extensions_mut()
                .insert(
                    GrpcMethod::new("dictionary.v1.DictionaryService", "GetMyStorage"),
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
        async fn check_saved_words(
            &self,
            request: tonic::Request<super::CheckSavedWordsRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CheckSavedWordsResponse>,
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
        async fn start_export(
            &self,
            request: tonic::Request<super::StartExportRequest>,
        ) -> std::result::Result<
            tonic::Response<super::StartExportResponse>,
            tonic::Status,
        >;
        async fn get_export(
            &self,
            request: tonic::Request<super::GetExportRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetExportResponse>,
            tonic::Status,
        >;
        async fn cancel_export(
            &self,
            request: tonic::Request<super::CancelExportRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CancelExportResponse>,
            tonic::Status,
        >;
        async fn create_export_part_link(
            &self,
            request: tonic::Request<super::CreateExportPartLinkRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateExportPartLinkResponse>,
            tonic::Status,
        >;
        async fn download_deck(
            &self,
            request: tonic::Request<super::DownloadDeckRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DownloadDeckResponse>,
            tonic::Status,
        >;
        /// Server streaming response type for the DownloadExportPart method.
        type DownloadExportPartStream: tonic::codegen::tokio_stream::Stream<
                Item = std::result::Result<super::DownloadChunk, tonic::Status>,
            >
            + Send
            + 'static;
        async fn download_export_part(
            &self,
            request: tonic::Request<super::DownloadExportPartRequest>,
        ) -> std::result::Result<
            tonic::Response<Self::DownloadExportPartStream>,
            tonic::Status,
        >;
        async fn list_categories(
            &self,
            request: tonic::Request<super::ListCategoriesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::ListCategoriesResponse>,
            tonic::Status,
        >;
        async fn create_category(
            &self,
            request: tonic::Request<super::CreateCategoryRequest>,
        ) -> std::result::Result<
            tonic::Response<super::CreateCategoryResponse>,
            tonic::Status,
        >;
        async fn rename_category(
            &self,
            request: tonic::Request<super::RenameCategoryRequest>,
        ) -> std::result::Result<
            tonic::Response<super::RenameCategoryResponse>,
            tonic::Status,
        >;
        async fn delete_category(
            &self,
            request: tonic::Request<super::DeleteCategoryRequest>,
        ) -> std::result::Result<
            tonic::Response<super::DeleteCategoryResponse>,
            tonic::Status,
        >;
        async fn update_word_categories(
            &self,
            request: tonic::Request<super::UpdateWordCategoriesRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UpdateWordCategoriesResponse>,
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
        async fn upload_audio(
            &self,
            request: tonic::Request<super::UploadAudioRequest>,
        ) -> std::result::Result<
            tonic::Response<super::UploadAudioResponse>,
            tonic::Status,
        >;
        async fn get_audio(
            &self,
            request: tonic::Request<super::GetAudioRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetAudioResponse>,
            tonic::Status,
        >;
        async fn get_review_queue(
            &self,
            request: tonic::Request<super::GetReviewQueueRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetReviewQueueResponse>,
            tonic::Status,
        >;
        async fn submit_review(
            &self,
            request: tonic::Request<super::SubmitReviewRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SubmitReviewResponse>,
            tonic::Status,
        >;
        async fn add_review_bonus(
            &self,
            request: tonic::Request<super::AddReviewBonusRequest>,
        ) -> std::result::Result<
            tonic::Response<super::AddReviewBonusResponse>,
            tonic::Status,
        >;
        async fn optimize_review_parameters(
            &self,
            request: tonic::Request<super::OptimizeReviewParametersRequest>,
        ) -> std::result::Result<
            tonic::Response<super::OptimizeReviewParametersResponse>,
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
        async fn get_user_quota(
            &self,
            request: tonic::Request<super::GetUserQuotaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetUserQuotaResponse>,
            tonic::Status,
        >;
        async fn set_user_quota(
            &self,
            request: tonic::Request<super::SetUserQuotaRequest>,
        ) -> std::result::Result<
            tonic::Response<super::SetUserQuotaResponse>,
            tonic::Status,
        >;
        async fn get_my_storage(
            &self,
            request: tonic::Request<super::GetMyStorageRequest>,
        ) -> std::result::Result<
            tonic::Response<super::GetMyStorageResponse>,
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
                "/dictionary.v1.DictionaryService/CheckSavedWords" => {
                    #[allow(non_camel_case_types)]
                    struct CheckSavedWordsSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::CheckSavedWordsRequest>
                    for CheckSavedWordsSvc<T> {
                        type Response = super::CheckSavedWordsResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CheckSavedWordsRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::check_saved_words(&inner, request)
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
                        let method = CheckSavedWordsSvc(inner);
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
                "/dictionary.v1.DictionaryService/StartExport" => {
                    #[allow(non_camel_case_types)]
                    struct StartExportSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::StartExportRequest>
                    for StartExportSvc<T> {
                        type Response = super::StartExportResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::StartExportRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::start_export(&inner, request)
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
                        let method = StartExportSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetExport" => {
                    #[allow(non_camel_case_types)]
                    struct GetExportSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetExportRequest>
                    for GetExportSvc<T> {
                        type Response = super::GetExportResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetExportRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_export(&inner, request).await
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
                        let method = GetExportSvc(inner);
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
                "/dictionary.v1.DictionaryService/CancelExport" => {
                    #[allow(non_camel_case_types)]
                    struct CancelExportSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::CancelExportRequest>
                    for CancelExportSvc<T> {
                        type Response = super::CancelExportResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CancelExportRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::cancel_export(&inner, request)
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
                        let method = CancelExportSvc(inner);
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
                "/dictionary.v1.DictionaryService/CreateExportPartLink" => {
                    #[allow(non_camel_case_types)]
                    struct CreateExportPartLinkSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::CreateExportPartLinkRequest>
                    for CreateExportPartLinkSvc<T> {
                        type Response = super::CreateExportPartLinkResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CreateExportPartLinkRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::create_export_part_link(
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
                        let method = CreateExportPartLinkSvc(inner);
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
                "/dictionary.v1.DictionaryService/DownloadExportPart" => {
                    #[allow(non_camel_case_types)]
                    struct DownloadExportPartSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::ServerStreamingService<
                        super::DownloadExportPartRequest,
                    > for DownloadExportPartSvc<T> {
                        type Response = super::DownloadChunk;
                        type ResponseStream = T::DownloadExportPartStream;
                        type Future = BoxFuture<
                            tonic::Response<Self::ResponseStream>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DownloadExportPartRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::download_export_part(
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
                        let method = DownloadExportPartSvc(inner);
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
                        let res = grpc.server_streaming(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/dictionary.v1.DictionaryService/ListCategories" => {
                    #[allow(non_camel_case_types)]
                    struct ListCategoriesSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::ListCategoriesRequest>
                    for ListCategoriesSvc<T> {
                        type Response = super::ListCategoriesResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::ListCategoriesRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::list_categories(&inner, request)
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
                        let method = ListCategoriesSvc(inner);
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
                "/dictionary.v1.DictionaryService/CreateCategory" => {
                    #[allow(non_camel_case_types)]
                    struct CreateCategorySvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::CreateCategoryRequest>
                    for CreateCategorySvc<T> {
                        type Response = super::CreateCategoryResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::CreateCategoryRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::create_category(&inner, request)
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
                        let method = CreateCategorySvc(inner);
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
                "/dictionary.v1.DictionaryService/RenameCategory" => {
                    #[allow(non_camel_case_types)]
                    struct RenameCategorySvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::RenameCategoryRequest>
                    for RenameCategorySvc<T> {
                        type Response = super::RenameCategoryResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::RenameCategoryRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::rename_category(&inner, request)
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
                        let method = RenameCategorySvc(inner);
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
                "/dictionary.v1.DictionaryService/DeleteCategory" => {
                    #[allow(non_camel_case_types)]
                    struct DeleteCategorySvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::DeleteCategoryRequest>
                    for DeleteCategorySvc<T> {
                        type Response = super::DeleteCategoryResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::DeleteCategoryRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::delete_category(&inner, request)
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
                        let method = DeleteCategorySvc(inner);
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
                "/dictionary.v1.DictionaryService/UpdateWordCategories" => {
                    #[allow(non_camel_case_types)]
                    struct UpdateWordCategoriesSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::UpdateWordCategoriesRequest>
                    for UpdateWordCategoriesSvc<T> {
                        type Response = super::UpdateWordCategoriesResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UpdateWordCategoriesRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::update_word_categories(
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
                        let method = UpdateWordCategoriesSvc(inner);
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
                "/dictionary.v1.DictionaryService/UploadAudio" => {
                    #[allow(non_camel_case_types)]
                    struct UploadAudioSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::UploadAudioRequest>
                    for UploadAudioSvc<T> {
                        type Response = super::UploadAudioResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::UploadAudioRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::upload_audio(&inner, request)
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
                        let method = UploadAudioSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetAudio" => {
                    #[allow(non_camel_case_types)]
                    struct GetAudioSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetAudioRequest>
                    for GetAudioSvc<T> {
                        type Response = super::GetAudioResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetAudioRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_audio(&inner, request).await
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
                        let method = GetAudioSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetReviewQueue" => {
                    #[allow(non_camel_case_types)]
                    struct GetReviewQueueSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetReviewQueueRequest>
                    for GetReviewQueueSvc<T> {
                        type Response = super::GetReviewQueueResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetReviewQueueRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_review_queue(&inner, request)
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
                        let method = GetReviewQueueSvc(inner);
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
                "/dictionary.v1.DictionaryService/SubmitReview" => {
                    #[allow(non_camel_case_types)]
                    struct SubmitReviewSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::SubmitReviewRequest>
                    for SubmitReviewSvc<T> {
                        type Response = super::SubmitReviewResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SubmitReviewRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::submit_review(&inner, request)
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
                        let method = SubmitReviewSvc(inner);
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
                "/dictionary.v1.DictionaryService/AddReviewBonus" => {
                    #[allow(non_camel_case_types)]
                    struct AddReviewBonusSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::AddReviewBonusRequest>
                    for AddReviewBonusSvc<T> {
                        type Response = super::AddReviewBonusResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::AddReviewBonusRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::add_review_bonus(&inner, request)
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
                        let method = AddReviewBonusSvc(inner);
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
                "/dictionary.v1.DictionaryService/OptimizeReviewParameters" => {
                    #[allow(non_camel_case_types)]
                    struct OptimizeReviewParametersSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::OptimizeReviewParametersRequest>
                    for OptimizeReviewParametersSvc<T> {
                        type Response = super::OptimizeReviewParametersResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<
                                super::OptimizeReviewParametersRequest,
                            >,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::optimize_review_parameters(
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
                        let method = OptimizeReviewParametersSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetUserQuota" => {
                    #[allow(non_camel_case_types)]
                    struct GetUserQuotaSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetUserQuotaRequest>
                    for GetUserQuotaSvc<T> {
                        type Response = super::GetUserQuotaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetUserQuotaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_user_quota(&inner, request)
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
                        let method = GetUserQuotaSvc(inner);
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
                "/dictionary.v1.DictionaryService/SetUserQuota" => {
                    #[allow(non_camel_case_types)]
                    struct SetUserQuotaSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::SetUserQuotaRequest>
                    for SetUserQuotaSvc<T> {
                        type Response = super::SetUserQuotaResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SetUserQuotaRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::set_user_quota(&inner, request)
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
                        let method = SetUserQuotaSvc(inner);
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
                "/dictionary.v1.DictionaryService/GetMyStorage" => {
                    #[allow(non_camel_case_types)]
                    struct GetMyStorageSvc<T: DictionaryService>(pub Arc<T>);
                    impl<
                        T: DictionaryService,
                    > tonic::server::UnaryService<super::GetMyStorageRequest>
                    for GetMyStorageSvc<T> {
                        type Response = super::GetMyStorageResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::GetMyStorageRequest>,
                        ) -> Self::Future {
                            let inner = Arc::clone(&self.0);
                            let fut = async move {
                                <T as DictionaryService>::get_my_storage(&inner, request)
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
                        let method = GetMyStorageSvc(inner);
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
