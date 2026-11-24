package dictionary.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DictionaryService looks words up and keeps a per-user list of saved words that can be exported
 * as an Anki deck. The user is the subject of the token, never a field of a request. Every method
 * needs a permission, see the comment of the method.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.1)",
    comments = "Source: dictionary/v1/dictionary.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DictionaryServiceGrpc {

  private DictionaryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "dictionary.v1.DictionaryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.LookupWordRequest,
      dictionary.v1.DictionaryOuterClass.LookupWordResponse> getLookupWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupWord",
      requestType = dictionary.v1.DictionaryOuterClass.LookupWordRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.LookupWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.LookupWordRequest,
      dictionary.v1.DictionaryOuterClass.LookupWordResponse> getLookupWordMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.LookupWordRequest, dictionary.v1.DictionaryOuterClass.LookupWordResponse> getLookupWordMethod;
    if ((getLookupWordMethod = DictionaryServiceGrpc.getLookupWordMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getLookupWordMethod = DictionaryServiceGrpc.getLookupWordMethod) == null) {
          DictionaryServiceGrpc.getLookupWordMethod = getLookupWordMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.LookupWordRequest, dictionary.v1.DictionaryOuterClass.LookupWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.LookupWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.LookupWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("LookupWord"))
              .build();
        }
      }
    }
    return getLookupWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.LookupWordsRequest,
      dictionary.v1.DictionaryOuterClass.LookupWordsResponse> getLookupWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupWords",
      requestType = dictionary.v1.DictionaryOuterClass.LookupWordsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.LookupWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.LookupWordsRequest,
      dictionary.v1.DictionaryOuterClass.LookupWordsResponse> getLookupWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.LookupWordsRequest, dictionary.v1.DictionaryOuterClass.LookupWordsResponse> getLookupWordsMethod;
    if ((getLookupWordsMethod = DictionaryServiceGrpc.getLookupWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getLookupWordsMethod = DictionaryServiceGrpc.getLookupWordsMethod) == null) {
          DictionaryServiceGrpc.getLookupWordsMethod = getLookupWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.LookupWordsRequest, dictionary.v1.DictionaryOuterClass.LookupWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.LookupWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.LookupWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("LookupWords"))
              .build();
        }
      }
    }
    return getLookupWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.SaveWordRequest,
      dictionary.v1.DictionaryOuterClass.SaveWordResponse> getSaveWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveWord",
      requestType = dictionary.v1.DictionaryOuterClass.SaveWordRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.SaveWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.SaveWordRequest,
      dictionary.v1.DictionaryOuterClass.SaveWordResponse> getSaveWordMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.SaveWordRequest, dictionary.v1.DictionaryOuterClass.SaveWordResponse> getSaveWordMethod;
    if ((getSaveWordMethod = DictionaryServiceGrpc.getSaveWordMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getSaveWordMethod = DictionaryServiceGrpc.getSaveWordMethod) == null) {
          DictionaryServiceGrpc.getSaveWordMethod = getSaveWordMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.SaveWordRequest, dictionary.v1.DictionaryOuterClass.SaveWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.SaveWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.SaveWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("SaveWord"))
              .build();
        }
      }
    }
    return getSaveWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest,
      dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse> getListSavedWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSavedWords",
      requestType = dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest,
      dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse> getListSavedWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest, dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse> getListSavedWordsMethod;
    if ((getListSavedWordsMethod = DictionaryServiceGrpc.getListSavedWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getListSavedWordsMethod = DictionaryServiceGrpc.getListSavedWordsMethod) == null) {
          DictionaryServiceGrpc.getListSavedWordsMethod = getListSavedWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest, dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSavedWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("ListSavedWords"))
              .build();
        }
      }
    }
    return getListSavedWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest,
      dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse> getDeleteSavedWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSavedWord",
      requestType = dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest,
      dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse> getDeleteSavedWordMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest, dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse> getDeleteSavedWordMethod;
    if ((getDeleteSavedWordMethod = DictionaryServiceGrpc.getDeleteSavedWordMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getDeleteSavedWordMethod = DictionaryServiceGrpc.getDeleteSavedWordMethod) == null) {
          DictionaryServiceGrpc.getDeleteSavedWordMethod = getDeleteSavedWordMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest, dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSavedWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("DeleteSavedWord"))
              .build();
        }
      }
    }
    return getDeleteSavedWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.ExportAnkiRequest,
      dictionary.v1.DictionaryOuterClass.ExportAnkiResponse> getExportAnkiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportAnki",
      requestType = dictionary.v1.DictionaryOuterClass.ExportAnkiRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.ExportAnkiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.ExportAnkiRequest,
      dictionary.v1.DictionaryOuterClass.ExportAnkiResponse> getExportAnkiMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.ExportAnkiRequest, dictionary.v1.DictionaryOuterClass.ExportAnkiResponse> getExportAnkiMethod;
    if ((getExportAnkiMethod = DictionaryServiceGrpc.getExportAnkiMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getExportAnkiMethod = DictionaryServiceGrpc.getExportAnkiMethod) == null) {
          DictionaryServiceGrpc.getExportAnkiMethod = getExportAnkiMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.ExportAnkiRequest, dictionary.v1.DictionaryOuterClass.ExportAnkiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportAnki"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.ExportAnkiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.ExportAnkiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("ExportAnki"))
              .build();
        }
      }
    }
    return getExportAnkiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest,
      dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse> getCreateDeckLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeckLink",
      requestType = dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest,
      dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse> getCreateDeckLinkMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest, dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse> getCreateDeckLinkMethod;
    if ((getCreateDeckLinkMethod = DictionaryServiceGrpc.getCreateDeckLinkMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getCreateDeckLinkMethod = DictionaryServiceGrpc.getCreateDeckLinkMethod) == null) {
          DictionaryServiceGrpc.getCreateDeckLinkMethod = getCreateDeckLinkMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest, dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeckLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("CreateDeckLink"))
              .build();
        }
      }
    }
    return getCreateDeckLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.DownloadDeckRequest,
      dictionary.v1.DictionaryOuterClass.DownloadDeckResponse> getDownloadDeckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadDeck",
      requestType = dictionary.v1.DictionaryOuterClass.DownloadDeckRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.DownloadDeckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.DownloadDeckRequest,
      dictionary.v1.DictionaryOuterClass.DownloadDeckResponse> getDownloadDeckMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.DownloadDeckRequest, dictionary.v1.DictionaryOuterClass.DownloadDeckResponse> getDownloadDeckMethod;
    if ((getDownloadDeckMethod = DictionaryServiceGrpc.getDownloadDeckMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getDownloadDeckMethod = DictionaryServiceGrpc.getDownloadDeckMethod) == null) {
          DictionaryServiceGrpc.getDownloadDeckMethod = getDownloadDeckMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.DownloadDeckRequest, dictionary.v1.DictionaryOuterClass.DownloadDeckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadDeck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.DownloadDeckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.DownloadDeckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("DownloadDeck"))
              .build();
        }
      }
    }
    return getDownloadDeckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest,
      dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse> getRemoveExportedWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveExportedWords",
      requestType = dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest,
      dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse> getRemoveExportedWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest, dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse> getRemoveExportedWordsMethod;
    if ((getRemoveExportedWordsMethod = DictionaryServiceGrpc.getRemoveExportedWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getRemoveExportedWordsMethod = DictionaryServiceGrpc.getRemoveExportedWordsMethod) == null) {
          DictionaryServiceGrpc.getRemoveExportedWordsMethod = getRemoveExportedWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest, dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveExportedWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("RemoveExportedWords"))
              .build();
        }
      }
    }
    return getRemoveExportedWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UploadImageRequest,
      dictionary.v1.DictionaryOuterClass.UploadImageResponse> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = dictionary.v1.DictionaryOuterClass.UploadImageRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.UploadImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UploadImageRequest,
      dictionary.v1.DictionaryOuterClass.UploadImageResponse> getUploadImageMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UploadImageRequest, dictionary.v1.DictionaryOuterClass.UploadImageResponse> getUploadImageMethod;
    if ((getUploadImageMethod = DictionaryServiceGrpc.getUploadImageMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUploadImageMethod = DictionaryServiceGrpc.getUploadImageMethod) == null) {
          DictionaryServiceGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.UploadImageRequest, dictionary.v1.DictionaryOuterClass.UploadImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.UploadImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.UploadImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetImageRequest,
      dictionary.v1.DictionaryOuterClass.GetImageResponse> getGetImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImage",
      requestType = dictionary.v1.DictionaryOuterClass.GetImageRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.GetImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetImageRequest,
      dictionary.v1.DictionaryOuterClass.GetImageResponse> getGetImageMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetImageRequest, dictionary.v1.DictionaryOuterClass.GetImageResponse> getGetImageMethod;
    if ((getGetImageMethod = DictionaryServiceGrpc.getGetImageMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetImageMethod = DictionaryServiceGrpc.getGetImageMethod) == null) {
          DictionaryServiceGrpc.getGetImageMethod = getGetImageMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.GetImageRequest, dictionary.v1.DictionaryOuterClass.GetImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.GetImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetImage"))
              .build();
        }
      }
    }
    return getGetImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetSettingsRequest,
      dictionary.v1.DictionaryOuterClass.GetSettingsResponse> getGetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSettings",
      requestType = dictionary.v1.DictionaryOuterClass.GetSettingsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.GetSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetSettingsRequest,
      dictionary.v1.DictionaryOuterClass.GetSettingsResponse> getGetSettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetSettingsRequest, dictionary.v1.DictionaryOuterClass.GetSettingsResponse> getGetSettingsMethod;
    if ((getGetSettingsMethod = DictionaryServiceGrpc.getGetSettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetSettingsMethod = DictionaryServiceGrpc.getGetSettingsMethod) == null) {
          DictionaryServiceGrpc.getGetSettingsMethod = getGetSettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.GetSettingsRequest, dictionary.v1.DictionaryOuterClass.GetSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.GetSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.GetSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetSettings"))
              .build();
        }
      }
    }
    return getGetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest,
      dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse> getUpdateSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSettings",
      requestType = dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest,
      dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse> getUpdateSettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest, dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse> getUpdateSettingsMethod;
    if ((getUpdateSettingsMethod = DictionaryServiceGrpc.getUpdateSettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUpdateSettingsMethod = DictionaryServiceGrpc.getUpdateSettingsMethod) == null) {
          DictionaryServiceGrpc.getUpdateSettingsMethod = getUpdateSettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest, dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UpdateSettings"))
              .build();
        }
      }
    }
    return getUpdateSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetMySettingsRequest,
      dictionary.v1.DictionaryOuterClass.GetMySettingsResponse> getGetMySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMySettings",
      requestType = dictionary.v1.DictionaryOuterClass.GetMySettingsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.GetMySettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetMySettingsRequest,
      dictionary.v1.DictionaryOuterClass.GetMySettingsResponse> getGetMySettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.GetMySettingsRequest, dictionary.v1.DictionaryOuterClass.GetMySettingsResponse> getGetMySettingsMethod;
    if ((getGetMySettingsMethod = DictionaryServiceGrpc.getGetMySettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetMySettingsMethod = DictionaryServiceGrpc.getGetMySettingsMethod) == null) {
          DictionaryServiceGrpc.getGetMySettingsMethod = getGetMySettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.GetMySettingsRequest, dictionary.v1.DictionaryOuterClass.GetMySettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.GetMySettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.GetMySettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetMySettings"))
              .build();
        }
      }
    }
    return getGetMySettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest,
      dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse> getUpdateMySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMySettings",
      requestType = dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest.class,
      responseType = dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest,
      dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse> getUpdateMySettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest, dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse> getUpdateMySettingsMethod;
    if ((getUpdateMySettingsMethod = DictionaryServiceGrpc.getUpdateMySettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUpdateMySettingsMethod = DictionaryServiceGrpc.getUpdateMySettingsMethod) == null) {
          DictionaryServiceGrpc.getUpdateMySettingsMethod = getUpdateMySettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest, dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UpdateMySettings"))
              .build();
        }
      }
    }
    return getUpdateMySettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DictionaryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DictionaryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DictionaryServiceStub>() {
        @java.lang.Override
        public DictionaryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DictionaryServiceStub(channel, callOptions);
        }
      };
    return DictionaryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DictionaryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DictionaryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DictionaryServiceBlockingStub>() {
        @java.lang.Override
        public DictionaryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DictionaryServiceBlockingStub(channel, callOptions);
        }
      };
    return DictionaryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DictionaryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DictionaryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DictionaryServiceFutureStub>() {
        @java.lang.Override
        public DictionaryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DictionaryServiceFutureStub(channel, callOptions);
        }
      };
    return DictionaryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DictionaryService looks words up and keeps a per-user list of saved words that can be exported
   * as an Anki deck. The user is the subject of the token, never a field of a request. Every method
   * needs a permission, see the comment of the method.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * LookupWord returns the entry of one word. Permission: dictionary:word:read.
     * </pre>
     */
    default void lookupWord(dictionary.v1.DictionaryOuterClass.LookupWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.LookupWordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupWordMethod(), responseObserver);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    default void lookupWords(dictionary.v1.DictionaryOuterClass.LookupWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.LookupWordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupWordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    default void saveWord(dictionary.v1.DictionaryOuterClass.SaveWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.SaveWordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveWordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    default void listSavedWords(dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSavedWordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    default void deleteSavedWord(dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSavedWordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExportAnki builds an Anki deck (.apkg) from the new words (or all of the list, see scope) and marks
     * them exported. When remove after export is in effect (system AND user) they also leave the list.
     * Fails with INVALID_ARGUMENT (NO_WORDS_TO_EXPORT) when there is nothing to export.
     * Permission: dictionary:word:write.
     * </pre>
     */
    default void exportAnki(dictionary.v1.DictionaryOuterClass.ExportAnkiRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.ExportAnkiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportAnkiMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDeckLink does what ExportAnki does (builds the deck, marks the words exported) but keeps
     * the .apkg for a short time behind a random token instead of returning it, so that an Anki app
     * can import it from a link ("download link" of AnkiMobile). A link of the same user created
     * earlier is replaced. Permission: dictionary:word:write.
     * </pre>
     */
    default void createDeckLink(dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeckLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    default void downloadDeck(dictionary.v1.DictionaryOuterClass.DownloadDeckRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.DownloadDeckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadDeckMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    default void removeExportedWords(dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveExportedWordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UploadImage stores an image of a card (png, jpeg, gif or webp; never svg). The service shrinks it
     * (longest side at most DICTIONARY_IMAGE_MAX_DIM), re-encodes it without metadata and returns the id that
     * the card content refers to as dictimg:&lt;id&gt;. The same image of the same user gets the same id. Fails with
     * INVALID_ARGUMENT (IMAGE_UNSUPPORTED, IMAGE_TOO_LARGE), RESOURCE_EXHAUSTED (IMAGE_QUOTA_EXCEEDED) or
     * FAILED_PRECONDITION (IMAGES_DISABLED, no image directory). Permission: dictionary:word:write.
     * </pre>
     */
    default void uploadImage(dictionary.v1.DictionaryOuterClass.UploadImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UploadImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void getImage(dictionary.v1.DictionaryOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    default void getSettings(dictionary.v1.DictionaryOuterClass.GetSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSettings changes them (all fields are written; only the ones that differ are stored). Fails with
     * INVALID_ARGUMENT when a value is out of range or no dictionary stays enabled.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    default void updateSettings(dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    default void getMySettings(dictionary.v1.DictionaryOuterClass.GetMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetMySettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMySettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMySettings stores the preferences of the user (kept by identity). INVALID_ARGUMENT when a value
     * is out of range, no dictionary is left enabled or the default is not an enabled one.
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void updateMySettings(dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMySettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DictionaryService.
   * <pre>
   * DictionaryService looks words up and keeps a per-user list of saved words that can be exported
   * as an Anki deck. The user is the subject of the token, never a field of a request. Every method
   * needs a permission, see the comment of the method.
   * </pre>
   */
  public static abstract class DictionaryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DictionaryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DictionaryService.
   * <pre>
   * DictionaryService looks words up and keeps a per-user list of saved words that can be exported
   * as an Anki deck. The user is the subject of the token, never a field of a request. Every method
   * needs a permission, see the comment of the method.
   * </pre>
   */
  public static final class DictionaryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DictionaryServiceStub> {
    private DictionaryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DictionaryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DictionaryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * LookupWord returns the entry of one word. Permission: dictionary:word:read.
     * </pre>
     */
    public void lookupWord(dictionary.v1.DictionaryOuterClass.LookupWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.LookupWordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    public void lookupWords(dictionary.v1.DictionaryOuterClass.LookupWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.LookupWordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupWordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    public void saveWord(dictionary.v1.DictionaryOuterClass.SaveWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.SaveWordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    public void listSavedWords(dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSavedWordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    public void deleteSavedWord(dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSavedWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExportAnki builds an Anki deck (.apkg) from the new words (or all of the list, see scope) and marks
     * them exported. When remove after export is in effect (system AND user) they also leave the list.
     * Fails with INVALID_ARGUMENT (NO_WORDS_TO_EXPORT) when there is nothing to export.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public void exportAnki(dictionary.v1.DictionaryOuterClass.ExportAnkiRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.ExportAnkiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportAnkiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDeckLink does what ExportAnki does (builds the deck, marks the words exported) but keeps
     * the .apkg for a short time behind a random token instead of returning it, so that an Anki app
     * can import it from a link ("download link" of AnkiMobile). A link of the same user created
     * earlier is replaced. Permission: dictionary:word:write.
     * </pre>
     */
    public void createDeckLink(dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeckLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    public void downloadDeck(dictionary.v1.DictionaryOuterClass.DownloadDeckRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.DownloadDeckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadDeckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    public void removeExportedWords(dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveExportedWordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UploadImage stores an image of a card (png, jpeg, gif or webp; never svg). The service shrinks it
     * (longest side at most DICTIONARY_IMAGE_MAX_DIM), re-encodes it without metadata and returns the id that
     * the card content refers to as dictimg:&lt;id&gt;. The same image of the same user gets the same id. Fails with
     * INVALID_ARGUMENT (IMAGE_UNSUPPORTED, IMAGE_TOO_LARGE), RESOURCE_EXHAUSTED (IMAGE_QUOTA_EXCEEDED) or
     * FAILED_PRECONDITION (IMAGES_DISABLED, no image directory). Permission: dictionary:word:write.
     * </pre>
     */
    public void uploadImage(dictionary.v1.DictionaryOuterClass.UploadImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UploadImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void getImage(dictionary.v1.DictionaryOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    public void getSettings(dictionary.v1.DictionaryOuterClass.GetSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSettings changes them (all fields are written; only the ones that differ are stored). Fails with
     * INVALID_ARGUMENT when a value is out of range or no dictionary stays enabled.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    public void updateSettings(dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    public void getMySettings(dictionary.v1.DictionaryOuterClass.GetMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetMySettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMySettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMySettings stores the preferences of the user (kept by identity). INVALID_ARGUMENT when a value
     * is out of range, no dictionary is left enabled or the default is not an enabled one.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void updateMySettings(dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMySettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DictionaryService.
   * <pre>
   * DictionaryService looks words up and keeps a per-user list of saved words that can be exported
   * as an Anki deck. The user is the subject of the token, never a field of a request. Every method
   * needs a permission, see the comment of the method.
   * </pre>
   */
  public static final class DictionaryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DictionaryServiceBlockingStub> {
    private DictionaryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DictionaryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DictionaryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * LookupWord returns the entry of one word. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.LookupWordResponse lookupWord(dictionary.v1.DictionaryOuterClass.LookupWordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupWordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.LookupWordsResponse lookupWords(dictionary.v1.DictionaryOuterClass.LookupWordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupWordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.SaveWordResponse saveWord(dictionary.v1.DictionaryOuterClass.SaveWordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveWordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse listSavedWords(dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSavedWordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse deleteSavedWord(dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSavedWordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExportAnki builds an Anki deck (.apkg) from the new words (or all of the list, see scope) and marks
     * them exported. When remove after export is in effect (system AND user) they also leave the list.
     * Fails with INVALID_ARGUMENT (NO_WORDS_TO_EXPORT) when there is nothing to export.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.ExportAnkiResponse exportAnki(dictionary.v1.DictionaryOuterClass.ExportAnkiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportAnkiMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDeckLink does what ExportAnki does (builds the deck, marks the words exported) but keeps
     * the .apkg for a short time behind a random token instead of returning it, so that an Anki app
     * can import it from a link ("download link" of AnkiMobile). A link of the same user created
     * earlier is replaced. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse createDeckLink(dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeckLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.DownloadDeckResponse downloadDeck(dictionary.v1.DictionaryOuterClass.DownloadDeckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadDeckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse removeExportedWords(dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveExportedWordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UploadImage stores an image of a card (png, jpeg, gif or webp; never svg). The service shrinks it
     * (longest side at most DICTIONARY_IMAGE_MAX_DIM), re-encodes it without metadata and returns the id that
     * the card content refers to as dictimg:&lt;id&gt;. The same image of the same user gets the same id. Fails with
     * INVALID_ARGUMENT (IMAGE_UNSUPPORTED, IMAGE_TOO_LARGE), RESOURCE_EXHAUSTED (IMAGE_QUOTA_EXCEEDED) or
     * FAILED_PRECONDITION (IMAGES_DISABLED, no image directory). Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.UploadImageResponse uploadImage(dictionary.v1.DictionaryOuterClass.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.GetImageResponse getImage(dictionary.v1.DictionaryOuterClass.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.GetSettingsResponse getSettings(dictionary.v1.DictionaryOuterClass.GetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSettings changes them (all fields are written; only the ones that differ are stored). Fails with
     * INVALID_ARGUMENT when a value is out of range or no dictionary stays enabled.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse updateSettings(dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.GetMySettingsResponse getMySettings(dictionary.v1.DictionaryOuterClass.GetMySettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMySettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMySettings stores the preferences of the user (kept by identity). INVALID_ARGUMENT when a value
     * is out of range, no dictionary is left enabled or the default is not an enabled one.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse updateMySettings(dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMySettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DictionaryService.
   * <pre>
   * DictionaryService looks words up and keeps a per-user list of saved words that can be exported
   * as an Anki deck. The user is the subject of the token, never a field of a request. Every method
   * needs a permission, see the comment of the method.
   * </pre>
   */
  public static final class DictionaryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DictionaryServiceFutureStub> {
    private DictionaryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DictionaryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DictionaryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * LookupWord returns the entry of one word. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.LookupWordResponse> lookupWord(
        dictionary.v1.DictionaryOuterClass.LookupWordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupWordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.LookupWordsResponse> lookupWords(
        dictionary.v1.DictionaryOuterClass.LookupWordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupWordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.SaveWordResponse> saveWord(
        dictionary.v1.DictionaryOuterClass.SaveWordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveWordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse> listSavedWords(
        dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSavedWordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse> deleteSavedWord(
        dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSavedWordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExportAnki builds an Anki deck (.apkg) from the new words (or all of the list, see scope) and marks
     * them exported. When remove after export is in effect (system AND user) they also leave the list.
     * Fails with INVALID_ARGUMENT (NO_WORDS_TO_EXPORT) when there is nothing to export.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.ExportAnkiResponse> exportAnki(
        dictionary.v1.DictionaryOuterClass.ExportAnkiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportAnkiMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDeckLink does what ExportAnki does (builds the deck, marks the words exported) but keeps
     * the .apkg for a short time behind a random token instead of returning it, so that an Anki app
     * can import it from a link ("download link" of AnkiMobile). A link of the same user created
     * earlier is replaced. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse> createDeckLink(
        dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeckLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.DownloadDeckResponse> downloadDeck(
        dictionary.v1.DictionaryOuterClass.DownloadDeckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadDeckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse> removeExportedWords(
        dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveExportedWordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UploadImage stores an image of a card (png, jpeg, gif or webp; never svg). The service shrinks it
     * (longest side at most DICTIONARY_IMAGE_MAX_DIM), re-encodes it without metadata and returns the id that
     * the card content refers to as dictimg:&lt;id&gt;. The same image of the same user gets the same id. Fails with
     * INVALID_ARGUMENT (IMAGE_UNSUPPORTED, IMAGE_TOO_LARGE), RESOURCE_EXHAUSTED (IMAGE_QUOTA_EXCEEDED) or
     * FAILED_PRECONDITION (IMAGES_DISABLED, no image directory). Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.UploadImageResponse> uploadImage(
        dictionary.v1.DictionaryOuterClass.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.GetImageResponse> getImage(
        dictionary.v1.DictionaryOuterClass.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.GetSettingsResponse> getSettings(
        dictionary.v1.DictionaryOuterClass.GetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSettings changes them (all fields are written; only the ones that differ are stored). Fails with
     * INVALID_ARGUMENT when a value is out of range or no dictionary stays enabled.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse> updateSettings(
        dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.GetMySettingsResponse> getMySettings(
        dictionary.v1.DictionaryOuterClass.GetMySettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMySettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMySettings stores the preferences of the user (kept by identity). INVALID_ARGUMENT when a value
     * is out of range, no dictionary is left enabled or the default is not an enabled one.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse> updateMySettings(
        dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMySettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP_WORD = 0;
  private static final int METHODID_LOOKUP_WORDS = 1;
  private static final int METHODID_SAVE_WORD = 2;
  private static final int METHODID_LIST_SAVED_WORDS = 3;
  private static final int METHODID_DELETE_SAVED_WORD = 4;
  private static final int METHODID_EXPORT_ANKI = 5;
  private static final int METHODID_CREATE_DECK_LINK = 6;
  private static final int METHODID_DOWNLOAD_DECK = 7;
  private static final int METHODID_REMOVE_EXPORTED_WORDS = 8;
  private static final int METHODID_UPLOAD_IMAGE = 9;
  private static final int METHODID_GET_IMAGE = 10;
  private static final int METHODID_GET_SETTINGS = 11;
  private static final int METHODID_UPDATE_SETTINGS = 12;
  private static final int METHODID_GET_MY_SETTINGS = 13;
  private static final int METHODID_UPDATE_MY_SETTINGS = 14;

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
        case METHODID_LOOKUP_WORD:
          serviceImpl.lookupWord((dictionary.v1.DictionaryOuterClass.LookupWordRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.LookupWordResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_WORDS:
          serviceImpl.lookupWords((dictionary.v1.DictionaryOuterClass.LookupWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.LookupWordsResponse>) responseObserver);
          break;
        case METHODID_SAVE_WORD:
          serviceImpl.saveWord((dictionary.v1.DictionaryOuterClass.SaveWordRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.SaveWordResponse>) responseObserver);
          break;
        case METHODID_LIST_SAVED_WORDS:
          serviceImpl.listSavedWords((dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse>) responseObserver);
          break;
        case METHODID_DELETE_SAVED_WORD:
          serviceImpl.deleteSavedWord((dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse>) responseObserver);
          break;
        case METHODID_EXPORT_ANKI:
          serviceImpl.exportAnki((dictionary.v1.DictionaryOuterClass.ExportAnkiRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.ExportAnkiResponse>) responseObserver);
          break;
        case METHODID_CREATE_DECK_LINK:
          serviceImpl.createDeckLink((dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_DECK:
          serviceImpl.downloadDeck((dictionary.v1.DictionaryOuterClass.DownloadDeckRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.DownloadDeckResponse>) responseObserver);
          break;
        case METHODID_REMOVE_EXPORTED_WORDS:
          serviceImpl.removeExportedWords((dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_IMAGE:
          serviceImpl.uploadImage((dictionary.v1.DictionaryOuterClass.UploadImageRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UploadImageResponse>) responseObserver);
          break;
        case METHODID_GET_IMAGE:
          serviceImpl.getImage((dictionary.v1.DictionaryOuterClass.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetImageResponse>) responseObserver);
          break;
        case METHODID_GET_SETTINGS:
          serviceImpl.getSettings((dictionary.v1.DictionaryOuterClass.GetSettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetSettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SETTINGS:
          serviceImpl.updateSettings((dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_MY_SETTINGS:
          serviceImpl.getMySettings((dictionary.v1.DictionaryOuterClass.GetMySettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.GetMySettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MY_SETTINGS:
          serviceImpl.updateMySettings((dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse>) responseObserver);
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
          getLookupWordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.LookupWordRequest,
              dictionary.v1.DictionaryOuterClass.LookupWordResponse>(
                service, METHODID_LOOKUP_WORD)))
        .addMethod(
          getLookupWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.LookupWordsRequest,
              dictionary.v1.DictionaryOuterClass.LookupWordsResponse>(
                service, METHODID_LOOKUP_WORDS)))
        .addMethod(
          getSaveWordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.SaveWordRequest,
              dictionary.v1.DictionaryOuterClass.SaveWordResponse>(
                service, METHODID_SAVE_WORD)))
        .addMethod(
          getListSavedWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.ListSavedWordsRequest,
              dictionary.v1.DictionaryOuterClass.ListSavedWordsResponse>(
                service, METHODID_LIST_SAVED_WORDS)))
        .addMethod(
          getDeleteSavedWordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.DeleteSavedWordRequest,
              dictionary.v1.DictionaryOuterClass.DeleteSavedWordResponse>(
                service, METHODID_DELETE_SAVED_WORD)))
        .addMethod(
          getExportAnkiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.ExportAnkiRequest,
              dictionary.v1.DictionaryOuterClass.ExportAnkiResponse>(
                service, METHODID_EXPORT_ANKI)))
        .addMethod(
          getCreateDeckLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.CreateDeckLinkRequest,
              dictionary.v1.DictionaryOuterClass.CreateDeckLinkResponse>(
                service, METHODID_CREATE_DECK_LINK)))
        .addMethod(
          getDownloadDeckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.DownloadDeckRequest,
              dictionary.v1.DictionaryOuterClass.DownloadDeckResponse>(
                service, METHODID_DOWNLOAD_DECK)))
        .addMethod(
          getRemoveExportedWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.RemoveExportedWordsRequest,
              dictionary.v1.DictionaryOuterClass.RemoveExportedWordsResponse>(
                service, METHODID_REMOVE_EXPORTED_WORDS)))
        .addMethod(
          getUploadImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.UploadImageRequest,
              dictionary.v1.DictionaryOuterClass.UploadImageResponse>(
                service, METHODID_UPLOAD_IMAGE)))
        .addMethod(
          getGetImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.GetImageRequest,
              dictionary.v1.DictionaryOuterClass.GetImageResponse>(
                service, METHODID_GET_IMAGE)))
        .addMethod(
          getGetSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.GetSettingsRequest,
              dictionary.v1.DictionaryOuterClass.GetSettingsResponse>(
                service, METHODID_GET_SETTINGS)))
        .addMethod(
          getUpdateSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.UpdateSettingsRequest,
              dictionary.v1.DictionaryOuterClass.UpdateSettingsResponse>(
                service, METHODID_UPDATE_SETTINGS)))
        .addMethod(
          getGetMySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.GetMySettingsRequest,
              dictionary.v1.DictionaryOuterClass.GetMySettingsResponse>(
                service, METHODID_GET_MY_SETTINGS)))
        .addMethod(
          getUpdateMySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.DictionaryOuterClass.UpdateMySettingsRequest,
              dictionary.v1.DictionaryOuterClass.UpdateMySettingsResponse>(
                service, METHODID_UPDATE_MY_SETTINGS)))
        .build();
  }

  private static abstract class DictionaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DictionaryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dictionary.v1.DictionaryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DictionaryService");
    }
  }

  private static final class DictionaryServiceFileDescriptorSupplier
      extends DictionaryServiceBaseDescriptorSupplier {
    DictionaryServiceFileDescriptorSupplier() {}
  }

  private static final class DictionaryServiceMethodDescriptorSupplier
      extends DictionaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DictionaryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DictionaryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DictionaryServiceFileDescriptorSupplier())
              .addMethod(getLookupWordMethod())
              .addMethod(getLookupWordsMethod())
              .addMethod(getSaveWordMethod())
              .addMethod(getListSavedWordsMethod())
              .addMethod(getDeleteSavedWordMethod())
              .addMethod(getExportAnkiMethod())
              .addMethod(getCreateDeckLinkMethod())
              .addMethod(getDownloadDeckMethod())
              .addMethod(getRemoveExportedWordsMethod())
              .addMethod(getUploadImageMethod())
              .addMethod(getGetImageMethod())
              .addMethod(getGetSettingsMethod())
              .addMethod(getUpdateSettingsMethod())
              .addMethod(getGetMySettingsMethod())
              .addMethod(getUpdateMySettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
