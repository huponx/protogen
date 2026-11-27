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
  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.LookupWordRequest,
      dictionary.v1.Dictionary.LookupWordResponse> getLookupWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupWord",
      requestType = dictionary.v1.Dictionary.LookupWordRequest.class,
      responseType = dictionary.v1.Dictionary.LookupWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.LookupWordRequest,
      dictionary.v1.Dictionary.LookupWordResponse> getLookupWordMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.LookupWordRequest, dictionary.v1.Dictionary.LookupWordResponse> getLookupWordMethod;
    if ((getLookupWordMethod = DictionaryServiceGrpc.getLookupWordMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getLookupWordMethod = DictionaryServiceGrpc.getLookupWordMethod) == null) {
          DictionaryServiceGrpc.getLookupWordMethod = getLookupWordMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.LookupWordRequest, dictionary.v1.Dictionary.LookupWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.LookupWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.LookupWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("LookupWord"))
              .build();
        }
      }
    }
    return getLookupWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.LookupWordsRequest,
      dictionary.v1.Dictionary.LookupWordsResponse> getLookupWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupWords",
      requestType = dictionary.v1.Dictionary.LookupWordsRequest.class,
      responseType = dictionary.v1.Dictionary.LookupWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.LookupWordsRequest,
      dictionary.v1.Dictionary.LookupWordsResponse> getLookupWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.LookupWordsRequest, dictionary.v1.Dictionary.LookupWordsResponse> getLookupWordsMethod;
    if ((getLookupWordsMethod = DictionaryServiceGrpc.getLookupWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getLookupWordsMethod = DictionaryServiceGrpc.getLookupWordsMethod) == null) {
          DictionaryServiceGrpc.getLookupWordsMethod = getLookupWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.LookupWordsRequest, dictionary.v1.Dictionary.LookupWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.LookupWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.LookupWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("LookupWords"))
              .build();
        }
      }
    }
    return getLookupWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListDictionariesRequest,
      dictionary.v1.Dictionary.ListDictionariesResponse> getListDictionariesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDictionaries",
      requestType = dictionary.v1.Dictionary.ListDictionariesRequest.class,
      responseType = dictionary.v1.Dictionary.ListDictionariesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListDictionariesRequest,
      dictionary.v1.Dictionary.ListDictionariesResponse> getListDictionariesMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListDictionariesRequest, dictionary.v1.Dictionary.ListDictionariesResponse> getListDictionariesMethod;
    if ((getListDictionariesMethod = DictionaryServiceGrpc.getListDictionariesMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getListDictionariesMethod = DictionaryServiceGrpc.getListDictionariesMethod) == null) {
          DictionaryServiceGrpc.getListDictionariesMethod = getListDictionariesMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.ListDictionariesRequest, dictionary.v1.Dictionary.ListDictionariesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDictionaries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ListDictionariesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ListDictionariesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("ListDictionaries"))
              .build();
        }
      }
    }
    return getListDictionariesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SaveWordRequest,
      dictionary.v1.Dictionary.SaveWordResponse> getSaveWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveWord",
      requestType = dictionary.v1.Dictionary.SaveWordRequest.class,
      responseType = dictionary.v1.Dictionary.SaveWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SaveWordRequest,
      dictionary.v1.Dictionary.SaveWordResponse> getSaveWordMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SaveWordRequest, dictionary.v1.Dictionary.SaveWordResponse> getSaveWordMethod;
    if ((getSaveWordMethod = DictionaryServiceGrpc.getSaveWordMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getSaveWordMethod = DictionaryServiceGrpc.getSaveWordMethod) == null) {
          DictionaryServiceGrpc.getSaveWordMethod = getSaveWordMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.SaveWordRequest, dictionary.v1.Dictionary.SaveWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.SaveWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.SaveWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("SaveWord"))
              .build();
        }
      }
    }
    return getSaveWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListSavedWordsRequest,
      dictionary.v1.Dictionary.ListSavedWordsResponse> getListSavedWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSavedWords",
      requestType = dictionary.v1.Dictionary.ListSavedWordsRequest.class,
      responseType = dictionary.v1.Dictionary.ListSavedWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListSavedWordsRequest,
      dictionary.v1.Dictionary.ListSavedWordsResponse> getListSavedWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListSavedWordsRequest, dictionary.v1.Dictionary.ListSavedWordsResponse> getListSavedWordsMethod;
    if ((getListSavedWordsMethod = DictionaryServiceGrpc.getListSavedWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getListSavedWordsMethod = DictionaryServiceGrpc.getListSavedWordsMethod) == null) {
          DictionaryServiceGrpc.getListSavedWordsMethod = getListSavedWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.ListSavedWordsRequest, dictionary.v1.Dictionary.ListSavedWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSavedWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ListSavedWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ListSavedWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("ListSavedWords"))
              .build();
        }
      }
    }
    return getListSavedWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CheckSavedWordsRequest,
      dictionary.v1.Dictionary.CheckSavedWordsResponse> getCheckSavedWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckSavedWords",
      requestType = dictionary.v1.Dictionary.CheckSavedWordsRequest.class,
      responseType = dictionary.v1.Dictionary.CheckSavedWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CheckSavedWordsRequest,
      dictionary.v1.Dictionary.CheckSavedWordsResponse> getCheckSavedWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CheckSavedWordsRequest, dictionary.v1.Dictionary.CheckSavedWordsResponse> getCheckSavedWordsMethod;
    if ((getCheckSavedWordsMethod = DictionaryServiceGrpc.getCheckSavedWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getCheckSavedWordsMethod = DictionaryServiceGrpc.getCheckSavedWordsMethod) == null) {
          DictionaryServiceGrpc.getCheckSavedWordsMethod = getCheckSavedWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.CheckSavedWordsRequest, dictionary.v1.Dictionary.CheckSavedWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckSavedWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CheckSavedWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CheckSavedWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("CheckSavedWords"))
              .build();
        }
      }
    }
    return getCheckSavedWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DeleteSavedWordRequest,
      dictionary.v1.Dictionary.DeleteSavedWordResponse> getDeleteSavedWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSavedWord",
      requestType = dictionary.v1.Dictionary.DeleteSavedWordRequest.class,
      responseType = dictionary.v1.Dictionary.DeleteSavedWordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DeleteSavedWordRequest,
      dictionary.v1.Dictionary.DeleteSavedWordResponse> getDeleteSavedWordMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DeleteSavedWordRequest, dictionary.v1.Dictionary.DeleteSavedWordResponse> getDeleteSavedWordMethod;
    if ((getDeleteSavedWordMethod = DictionaryServiceGrpc.getDeleteSavedWordMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getDeleteSavedWordMethod = DictionaryServiceGrpc.getDeleteSavedWordMethod) == null) {
          DictionaryServiceGrpc.getDeleteSavedWordMethod = getDeleteSavedWordMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.DeleteSavedWordRequest, dictionary.v1.Dictionary.DeleteSavedWordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSavedWord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DeleteSavedWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DeleteSavedWordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("DeleteSavedWord"))
              .build();
        }
      }
    }
    return getDeleteSavedWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ExportAnkiRequest,
      dictionary.v1.Dictionary.ExportAnkiResponse> getExportAnkiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportAnki",
      requestType = dictionary.v1.Dictionary.ExportAnkiRequest.class,
      responseType = dictionary.v1.Dictionary.ExportAnkiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ExportAnkiRequest,
      dictionary.v1.Dictionary.ExportAnkiResponse> getExportAnkiMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ExportAnkiRequest, dictionary.v1.Dictionary.ExportAnkiResponse> getExportAnkiMethod;
    if ((getExportAnkiMethod = DictionaryServiceGrpc.getExportAnkiMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getExportAnkiMethod = DictionaryServiceGrpc.getExportAnkiMethod) == null) {
          DictionaryServiceGrpc.getExportAnkiMethod = getExportAnkiMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.ExportAnkiRequest, dictionary.v1.Dictionary.ExportAnkiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportAnki"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ExportAnkiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ExportAnkiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("ExportAnki"))
              .build();
        }
      }
    }
    return getExportAnkiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateDeckLinkRequest,
      dictionary.v1.Dictionary.CreateDeckLinkResponse> getCreateDeckLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeckLink",
      requestType = dictionary.v1.Dictionary.CreateDeckLinkRequest.class,
      responseType = dictionary.v1.Dictionary.CreateDeckLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateDeckLinkRequest,
      dictionary.v1.Dictionary.CreateDeckLinkResponse> getCreateDeckLinkMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateDeckLinkRequest, dictionary.v1.Dictionary.CreateDeckLinkResponse> getCreateDeckLinkMethod;
    if ((getCreateDeckLinkMethod = DictionaryServiceGrpc.getCreateDeckLinkMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getCreateDeckLinkMethod = DictionaryServiceGrpc.getCreateDeckLinkMethod) == null) {
          DictionaryServiceGrpc.getCreateDeckLinkMethod = getCreateDeckLinkMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.CreateDeckLinkRequest, dictionary.v1.Dictionary.CreateDeckLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeckLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CreateDeckLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CreateDeckLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("CreateDeckLink"))
              .build();
        }
      }
    }
    return getCreateDeckLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.StartExportRequest,
      dictionary.v1.Dictionary.StartExportResponse> getStartExportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartExport",
      requestType = dictionary.v1.Dictionary.StartExportRequest.class,
      responseType = dictionary.v1.Dictionary.StartExportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.StartExportRequest,
      dictionary.v1.Dictionary.StartExportResponse> getStartExportMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.StartExportRequest, dictionary.v1.Dictionary.StartExportResponse> getStartExportMethod;
    if ((getStartExportMethod = DictionaryServiceGrpc.getStartExportMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getStartExportMethod = DictionaryServiceGrpc.getStartExportMethod) == null) {
          DictionaryServiceGrpc.getStartExportMethod = getStartExportMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.StartExportRequest, dictionary.v1.Dictionary.StartExportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartExport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.StartExportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.StartExportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("StartExport"))
              .build();
        }
      }
    }
    return getStartExportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetExportRequest,
      dictionary.v1.Dictionary.GetExportResponse> getGetExportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExport",
      requestType = dictionary.v1.Dictionary.GetExportRequest.class,
      responseType = dictionary.v1.Dictionary.GetExportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetExportRequest,
      dictionary.v1.Dictionary.GetExportResponse> getGetExportMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetExportRequest, dictionary.v1.Dictionary.GetExportResponse> getGetExportMethod;
    if ((getGetExportMethod = DictionaryServiceGrpc.getGetExportMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetExportMethod = DictionaryServiceGrpc.getGetExportMethod) == null) {
          DictionaryServiceGrpc.getGetExportMethod = getGetExportMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetExportRequest, dictionary.v1.Dictionary.GetExportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetExportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetExportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetExport"))
              .build();
        }
      }
    }
    return getGetExportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CancelExportRequest,
      dictionary.v1.Dictionary.CancelExportResponse> getCancelExportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelExport",
      requestType = dictionary.v1.Dictionary.CancelExportRequest.class,
      responseType = dictionary.v1.Dictionary.CancelExportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CancelExportRequest,
      dictionary.v1.Dictionary.CancelExportResponse> getCancelExportMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CancelExportRequest, dictionary.v1.Dictionary.CancelExportResponse> getCancelExportMethod;
    if ((getCancelExportMethod = DictionaryServiceGrpc.getCancelExportMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getCancelExportMethod = DictionaryServiceGrpc.getCancelExportMethod) == null) {
          DictionaryServiceGrpc.getCancelExportMethod = getCancelExportMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.CancelExportRequest, dictionary.v1.Dictionary.CancelExportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelExport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CancelExportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CancelExportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("CancelExport"))
              .build();
        }
      }
    }
    return getCancelExportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateExportPartLinkRequest,
      dictionary.v1.Dictionary.CreateExportPartLinkResponse> getCreateExportPartLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExportPartLink",
      requestType = dictionary.v1.Dictionary.CreateExportPartLinkRequest.class,
      responseType = dictionary.v1.Dictionary.CreateExportPartLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateExportPartLinkRequest,
      dictionary.v1.Dictionary.CreateExportPartLinkResponse> getCreateExportPartLinkMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateExportPartLinkRequest, dictionary.v1.Dictionary.CreateExportPartLinkResponse> getCreateExportPartLinkMethod;
    if ((getCreateExportPartLinkMethod = DictionaryServiceGrpc.getCreateExportPartLinkMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getCreateExportPartLinkMethod = DictionaryServiceGrpc.getCreateExportPartLinkMethod) == null) {
          DictionaryServiceGrpc.getCreateExportPartLinkMethod = getCreateExportPartLinkMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.CreateExportPartLinkRequest, dictionary.v1.Dictionary.CreateExportPartLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExportPartLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CreateExportPartLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CreateExportPartLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("CreateExportPartLink"))
              .build();
        }
      }
    }
    return getCreateExportPartLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DownloadDeckRequest,
      dictionary.v1.Dictionary.DownloadDeckResponse> getDownloadDeckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadDeck",
      requestType = dictionary.v1.Dictionary.DownloadDeckRequest.class,
      responseType = dictionary.v1.Dictionary.DownloadDeckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DownloadDeckRequest,
      dictionary.v1.Dictionary.DownloadDeckResponse> getDownloadDeckMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DownloadDeckRequest, dictionary.v1.Dictionary.DownloadDeckResponse> getDownloadDeckMethod;
    if ((getDownloadDeckMethod = DictionaryServiceGrpc.getDownloadDeckMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getDownloadDeckMethod = DictionaryServiceGrpc.getDownloadDeckMethod) == null) {
          DictionaryServiceGrpc.getDownloadDeckMethod = getDownloadDeckMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.DownloadDeckRequest, dictionary.v1.Dictionary.DownloadDeckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadDeck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DownloadDeckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DownloadDeckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("DownloadDeck"))
              .build();
        }
      }
    }
    return getDownloadDeckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DownloadExportPartRequest,
      dictionary.v1.Dictionary.DownloadChunk> getDownloadExportPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadExportPart",
      requestType = dictionary.v1.Dictionary.DownloadExportPartRequest.class,
      responseType = dictionary.v1.Dictionary.DownloadChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DownloadExportPartRequest,
      dictionary.v1.Dictionary.DownloadChunk> getDownloadExportPartMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DownloadExportPartRequest, dictionary.v1.Dictionary.DownloadChunk> getDownloadExportPartMethod;
    if ((getDownloadExportPartMethod = DictionaryServiceGrpc.getDownloadExportPartMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getDownloadExportPartMethod = DictionaryServiceGrpc.getDownloadExportPartMethod) == null) {
          DictionaryServiceGrpc.getDownloadExportPartMethod = getDownloadExportPartMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.DownloadExportPartRequest, dictionary.v1.Dictionary.DownloadChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadExportPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DownloadExportPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DownloadChunk.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("DownloadExportPart"))
              .build();
        }
      }
    }
    return getDownloadExportPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListCategoriesRequest,
      dictionary.v1.Dictionary.ListCategoriesResponse> getListCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCategories",
      requestType = dictionary.v1.Dictionary.ListCategoriesRequest.class,
      responseType = dictionary.v1.Dictionary.ListCategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListCategoriesRequest,
      dictionary.v1.Dictionary.ListCategoriesResponse> getListCategoriesMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.ListCategoriesRequest, dictionary.v1.Dictionary.ListCategoriesResponse> getListCategoriesMethod;
    if ((getListCategoriesMethod = DictionaryServiceGrpc.getListCategoriesMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getListCategoriesMethod = DictionaryServiceGrpc.getListCategoriesMethod) == null) {
          DictionaryServiceGrpc.getListCategoriesMethod = getListCategoriesMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.ListCategoriesRequest, dictionary.v1.Dictionary.ListCategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ListCategoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.ListCategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("ListCategories"))
              .build();
        }
      }
    }
    return getListCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateCategoryRequest,
      dictionary.v1.Dictionary.CreateCategoryResponse> getCreateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategory",
      requestType = dictionary.v1.Dictionary.CreateCategoryRequest.class,
      responseType = dictionary.v1.Dictionary.CreateCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateCategoryRequest,
      dictionary.v1.Dictionary.CreateCategoryResponse> getCreateCategoryMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.CreateCategoryRequest, dictionary.v1.Dictionary.CreateCategoryResponse> getCreateCategoryMethod;
    if ((getCreateCategoryMethod = DictionaryServiceGrpc.getCreateCategoryMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getCreateCategoryMethod = DictionaryServiceGrpc.getCreateCategoryMethod) == null) {
          DictionaryServiceGrpc.getCreateCategoryMethod = getCreateCategoryMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.CreateCategoryRequest, dictionary.v1.Dictionary.CreateCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CreateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.CreateCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("CreateCategory"))
              .build();
        }
      }
    }
    return getCreateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RenameCategoryRequest,
      dictionary.v1.Dictionary.RenameCategoryResponse> getRenameCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameCategory",
      requestType = dictionary.v1.Dictionary.RenameCategoryRequest.class,
      responseType = dictionary.v1.Dictionary.RenameCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RenameCategoryRequest,
      dictionary.v1.Dictionary.RenameCategoryResponse> getRenameCategoryMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RenameCategoryRequest, dictionary.v1.Dictionary.RenameCategoryResponse> getRenameCategoryMethod;
    if ((getRenameCategoryMethod = DictionaryServiceGrpc.getRenameCategoryMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getRenameCategoryMethod = DictionaryServiceGrpc.getRenameCategoryMethod) == null) {
          DictionaryServiceGrpc.getRenameCategoryMethod = getRenameCategoryMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.RenameCategoryRequest, dictionary.v1.Dictionary.RenameCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.RenameCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.RenameCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("RenameCategory"))
              .build();
        }
      }
    }
    return getRenameCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DeleteCategoryRequest,
      dictionary.v1.Dictionary.DeleteCategoryResponse> getDeleteCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCategory",
      requestType = dictionary.v1.Dictionary.DeleteCategoryRequest.class,
      responseType = dictionary.v1.Dictionary.DeleteCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DeleteCategoryRequest,
      dictionary.v1.Dictionary.DeleteCategoryResponse> getDeleteCategoryMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.DeleteCategoryRequest, dictionary.v1.Dictionary.DeleteCategoryResponse> getDeleteCategoryMethod;
    if ((getDeleteCategoryMethod = DictionaryServiceGrpc.getDeleteCategoryMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getDeleteCategoryMethod = DictionaryServiceGrpc.getDeleteCategoryMethod) == null) {
          DictionaryServiceGrpc.getDeleteCategoryMethod = getDeleteCategoryMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.DeleteCategoryRequest, dictionary.v1.Dictionary.DeleteCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DeleteCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.DeleteCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("DeleteCategory"))
              .build();
        }
      }
    }
    return getDeleteCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateWordCategoriesRequest,
      dictionary.v1.Dictionary.UpdateWordCategoriesResponse> getUpdateWordCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWordCategories",
      requestType = dictionary.v1.Dictionary.UpdateWordCategoriesRequest.class,
      responseType = dictionary.v1.Dictionary.UpdateWordCategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateWordCategoriesRequest,
      dictionary.v1.Dictionary.UpdateWordCategoriesResponse> getUpdateWordCategoriesMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateWordCategoriesRequest, dictionary.v1.Dictionary.UpdateWordCategoriesResponse> getUpdateWordCategoriesMethod;
    if ((getUpdateWordCategoriesMethod = DictionaryServiceGrpc.getUpdateWordCategoriesMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUpdateWordCategoriesMethod = DictionaryServiceGrpc.getUpdateWordCategoriesMethod) == null) {
          DictionaryServiceGrpc.getUpdateWordCategoriesMethod = getUpdateWordCategoriesMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.UpdateWordCategoriesRequest, dictionary.v1.Dictionary.UpdateWordCategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWordCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UpdateWordCategoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UpdateWordCategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UpdateWordCategories"))
              .build();
        }
      }
    }
    return getUpdateWordCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RemoveExportedWordsRequest,
      dictionary.v1.Dictionary.RemoveExportedWordsResponse> getRemoveExportedWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveExportedWords",
      requestType = dictionary.v1.Dictionary.RemoveExportedWordsRequest.class,
      responseType = dictionary.v1.Dictionary.RemoveExportedWordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RemoveExportedWordsRequest,
      dictionary.v1.Dictionary.RemoveExportedWordsResponse> getRemoveExportedWordsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RemoveExportedWordsRequest, dictionary.v1.Dictionary.RemoveExportedWordsResponse> getRemoveExportedWordsMethod;
    if ((getRemoveExportedWordsMethod = DictionaryServiceGrpc.getRemoveExportedWordsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getRemoveExportedWordsMethod = DictionaryServiceGrpc.getRemoveExportedWordsMethod) == null) {
          DictionaryServiceGrpc.getRemoveExportedWordsMethod = getRemoveExportedWordsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.RemoveExportedWordsRequest, dictionary.v1.Dictionary.RemoveExportedWordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveExportedWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.RemoveExportedWordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.RemoveExportedWordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("RemoveExportedWords"))
              .build();
        }
      }
    }
    return getRemoveExportedWordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UploadImageRequest,
      dictionary.v1.Dictionary.UploadImageResponse> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = dictionary.v1.Dictionary.UploadImageRequest.class,
      responseType = dictionary.v1.Dictionary.UploadImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UploadImageRequest,
      dictionary.v1.Dictionary.UploadImageResponse> getUploadImageMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UploadImageRequest, dictionary.v1.Dictionary.UploadImageResponse> getUploadImageMethod;
    if ((getUploadImageMethod = DictionaryServiceGrpc.getUploadImageMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUploadImageMethod = DictionaryServiceGrpc.getUploadImageMethod) == null) {
          DictionaryServiceGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.UploadImageRequest, dictionary.v1.Dictionary.UploadImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UploadImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UploadImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetImageRequest,
      dictionary.v1.Dictionary.GetImageResponse> getGetImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImage",
      requestType = dictionary.v1.Dictionary.GetImageRequest.class,
      responseType = dictionary.v1.Dictionary.GetImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetImageRequest,
      dictionary.v1.Dictionary.GetImageResponse> getGetImageMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetImageRequest, dictionary.v1.Dictionary.GetImageResponse> getGetImageMethod;
    if ((getGetImageMethod = DictionaryServiceGrpc.getGetImageMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetImageMethod = DictionaryServiceGrpc.getGetImageMethod) == null) {
          DictionaryServiceGrpc.getGetImageMethod = getGetImageMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetImageRequest, dictionary.v1.Dictionary.GetImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetImage"))
              .build();
        }
      }
    }
    return getGetImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UploadAudioRequest,
      dictionary.v1.Dictionary.UploadAudioResponse> getUploadAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadAudio",
      requestType = dictionary.v1.Dictionary.UploadAudioRequest.class,
      responseType = dictionary.v1.Dictionary.UploadAudioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UploadAudioRequest,
      dictionary.v1.Dictionary.UploadAudioResponse> getUploadAudioMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UploadAudioRequest, dictionary.v1.Dictionary.UploadAudioResponse> getUploadAudioMethod;
    if ((getUploadAudioMethod = DictionaryServiceGrpc.getUploadAudioMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUploadAudioMethod = DictionaryServiceGrpc.getUploadAudioMethod) == null) {
          DictionaryServiceGrpc.getUploadAudioMethod = getUploadAudioMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.UploadAudioRequest, dictionary.v1.Dictionary.UploadAudioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadAudio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UploadAudioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UploadAudioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UploadAudio"))
              .build();
        }
      }
    }
    return getUploadAudioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetAudioRequest,
      dictionary.v1.Dictionary.GetAudioResponse> getGetAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAudio",
      requestType = dictionary.v1.Dictionary.GetAudioRequest.class,
      responseType = dictionary.v1.Dictionary.GetAudioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetAudioRequest,
      dictionary.v1.Dictionary.GetAudioResponse> getGetAudioMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetAudioRequest, dictionary.v1.Dictionary.GetAudioResponse> getGetAudioMethod;
    if ((getGetAudioMethod = DictionaryServiceGrpc.getGetAudioMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetAudioMethod = DictionaryServiceGrpc.getGetAudioMethod) == null) {
          DictionaryServiceGrpc.getGetAudioMethod = getGetAudioMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetAudioRequest, dictionary.v1.Dictionary.GetAudioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAudio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetAudioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetAudioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetAudio"))
              .build();
        }
      }
    }
    return getGetAudioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetReviewQueueRequest,
      dictionary.v1.Dictionary.GetReviewQueueResponse> getGetReviewQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReviewQueue",
      requestType = dictionary.v1.Dictionary.GetReviewQueueRequest.class,
      responseType = dictionary.v1.Dictionary.GetReviewQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetReviewQueueRequest,
      dictionary.v1.Dictionary.GetReviewQueueResponse> getGetReviewQueueMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetReviewQueueRequest, dictionary.v1.Dictionary.GetReviewQueueResponse> getGetReviewQueueMethod;
    if ((getGetReviewQueueMethod = DictionaryServiceGrpc.getGetReviewQueueMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetReviewQueueMethod = DictionaryServiceGrpc.getGetReviewQueueMethod) == null) {
          DictionaryServiceGrpc.getGetReviewQueueMethod = getGetReviewQueueMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetReviewQueueRequest, dictionary.v1.Dictionary.GetReviewQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReviewQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetReviewQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetReviewQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetReviewQueue"))
              .build();
        }
      }
    }
    return getGetReviewQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SubmitReviewRequest,
      dictionary.v1.Dictionary.SubmitReviewResponse> getSubmitReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitReview",
      requestType = dictionary.v1.Dictionary.SubmitReviewRequest.class,
      responseType = dictionary.v1.Dictionary.SubmitReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SubmitReviewRequest,
      dictionary.v1.Dictionary.SubmitReviewResponse> getSubmitReviewMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SubmitReviewRequest, dictionary.v1.Dictionary.SubmitReviewResponse> getSubmitReviewMethod;
    if ((getSubmitReviewMethod = DictionaryServiceGrpc.getSubmitReviewMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getSubmitReviewMethod = DictionaryServiceGrpc.getSubmitReviewMethod) == null) {
          DictionaryServiceGrpc.getSubmitReviewMethod = getSubmitReviewMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.SubmitReviewRequest, dictionary.v1.Dictionary.SubmitReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.SubmitReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.SubmitReviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("SubmitReview"))
              .build();
        }
      }
    }
    return getSubmitReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.AddReviewBonusRequest,
      dictionary.v1.Dictionary.AddReviewBonusResponse> getAddReviewBonusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReviewBonus",
      requestType = dictionary.v1.Dictionary.AddReviewBonusRequest.class,
      responseType = dictionary.v1.Dictionary.AddReviewBonusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.AddReviewBonusRequest,
      dictionary.v1.Dictionary.AddReviewBonusResponse> getAddReviewBonusMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.AddReviewBonusRequest, dictionary.v1.Dictionary.AddReviewBonusResponse> getAddReviewBonusMethod;
    if ((getAddReviewBonusMethod = DictionaryServiceGrpc.getAddReviewBonusMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getAddReviewBonusMethod = DictionaryServiceGrpc.getAddReviewBonusMethod) == null) {
          DictionaryServiceGrpc.getAddReviewBonusMethod = getAddReviewBonusMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.AddReviewBonusRequest, dictionary.v1.Dictionary.AddReviewBonusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReviewBonus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.AddReviewBonusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.AddReviewBonusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("AddReviewBonus"))
              .build();
        }
      }
    }
    return getAddReviewBonusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.OptimizeReviewParametersRequest,
      dictionary.v1.Dictionary.OptimizeReviewParametersResponse> getOptimizeReviewParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptimizeReviewParameters",
      requestType = dictionary.v1.Dictionary.OptimizeReviewParametersRequest.class,
      responseType = dictionary.v1.Dictionary.OptimizeReviewParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.OptimizeReviewParametersRequest,
      dictionary.v1.Dictionary.OptimizeReviewParametersResponse> getOptimizeReviewParametersMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.OptimizeReviewParametersRequest, dictionary.v1.Dictionary.OptimizeReviewParametersResponse> getOptimizeReviewParametersMethod;
    if ((getOptimizeReviewParametersMethod = DictionaryServiceGrpc.getOptimizeReviewParametersMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getOptimizeReviewParametersMethod = DictionaryServiceGrpc.getOptimizeReviewParametersMethod) == null) {
          DictionaryServiceGrpc.getOptimizeReviewParametersMethod = getOptimizeReviewParametersMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.OptimizeReviewParametersRequest, dictionary.v1.Dictionary.OptimizeReviewParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptimizeReviewParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.OptimizeReviewParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.OptimizeReviewParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("OptimizeReviewParameters"))
              .build();
        }
      }
    }
    return getOptimizeReviewParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetSettingsRequest,
      dictionary.v1.Dictionary.GetSettingsResponse> getGetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSettings",
      requestType = dictionary.v1.Dictionary.GetSettingsRequest.class,
      responseType = dictionary.v1.Dictionary.GetSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetSettingsRequest,
      dictionary.v1.Dictionary.GetSettingsResponse> getGetSettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetSettingsRequest, dictionary.v1.Dictionary.GetSettingsResponse> getGetSettingsMethod;
    if ((getGetSettingsMethod = DictionaryServiceGrpc.getGetSettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetSettingsMethod = DictionaryServiceGrpc.getGetSettingsMethod) == null) {
          DictionaryServiceGrpc.getGetSettingsMethod = getGetSettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetSettingsRequest, dictionary.v1.Dictionary.GetSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetSettings"))
              .build();
        }
      }
    }
    return getGetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateSettingsRequest,
      dictionary.v1.Dictionary.UpdateSettingsResponse> getUpdateSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSettings",
      requestType = dictionary.v1.Dictionary.UpdateSettingsRequest.class,
      responseType = dictionary.v1.Dictionary.UpdateSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateSettingsRequest,
      dictionary.v1.Dictionary.UpdateSettingsResponse> getUpdateSettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateSettingsRequest, dictionary.v1.Dictionary.UpdateSettingsResponse> getUpdateSettingsMethod;
    if ((getUpdateSettingsMethod = DictionaryServiceGrpc.getUpdateSettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUpdateSettingsMethod = DictionaryServiceGrpc.getUpdateSettingsMethod) == null) {
          DictionaryServiceGrpc.getUpdateSettingsMethod = getUpdateSettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.UpdateSettingsRequest, dictionary.v1.Dictionary.UpdateSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UpdateSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UpdateSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("UpdateSettings"))
              .build();
        }
      }
    }
    return getUpdateSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetUserQuotaRequest,
      dictionary.v1.Dictionary.GetUserQuotaResponse> getGetUserQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserQuota",
      requestType = dictionary.v1.Dictionary.GetUserQuotaRequest.class,
      responseType = dictionary.v1.Dictionary.GetUserQuotaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetUserQuotaRequest,
      dictionary.v1.Dictionary.GetUserQuotaResponse> getGetUserQuotaMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetUserQuotaRequest, dictionary.v1.Dictionary.GetUserQuotaResponse> getGetUserQuotaMethod;
    if ((getGetUserQuotaMethod = DictionaryServiceGrpc.getGetUserQuotaMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetUserQuotaMethod = DictionaryServiceGrpc.getGetUserQuotaMethod) == null) {
          DictionaryServiceGrpc.getGetUserQuotaMethod = getGetUserQuotaMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetUserQuotaRequest, dictionary.v1.Dictionary.GetUserQuotaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetUserQuotaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetUserQuotaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetUserQuota"))
              .build();
        }
      }
    }
    return getGetUserQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SetUserQuotaRequest,
      dictionary.v1.Dictionary.SetUserQuotaResponse> getSetUserQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserQuota",
      requestType = dictionary.v1.Dictionary.SetUserQuotaRequest.class,
      responseType = dictionary.v1.Dictionary.SetUserQuotaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SetUserQuotaRequest,
      dictionary.v1.Dictionary.SetUserQuotaResponse> getSetUserQuotaMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.SetUserQuotaRequest, dictionary.v1.Dictionary.SetUserQuotaResponse> getSetUserQuotaMethod;
    if ((getSetUserQuotaMethod = DictionaryServiceGrpc.getSetUserQuotaMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getSetUserQuotaMethod = DictionaryServiceGrpc.getSetUserQuotaMethod) == null) {
          DictionaryServiceGrpc.getSetUserQuotaMethod = getSetUserQuotaMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.SetUserQuotaRequest, dictionary.v1.Dictionary.SetUserQuotaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.SetUserQuotaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.SetUserQuotaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("SetUserQuota"))
              .build();
        }
      }
    }
    return getSetUserQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RecalculateUserStorageRequest,
      dictionary.v1.Dictionary.RecalculateUserStorageResponse> getRecalculateUserStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecalculateUserStorage",
      requestType = dictionary.v1.Dictionary.RecalculateUserStorageRequest.class,
      responseType = dictionary.v1.Dictionary.RecalculateUserStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RecalculateUserStorageRequest,
      dictionary.v1.Dictionary.RecalculateUserStorageResponse> getRecalculateUserStorageMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.RecalculateUserStorageRequest, dictionary.v1.Dictionary.RecalculateUserStorageResponse> getRecalculateUserStorageMethod;
    if ((getRecalculateUserStorageMethod = DictionaryServiceGrpc.getRecalculateUserStorageMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getRecalculateUserStorageMethod = DictionaryServiceGrpc.getRecalculateUserStorageMethod) == null) {
          DictionaryServiceGrpc.getRecalculateUserStorageMethod = getRecalculateUserStorageMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.RecalculateUserStorageRequest, dictionary.v1.Dictionary.RecalculateUserStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecalculateUserStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.RecalculateUserStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.RecalculateUserStorageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("RecalculateUserStorage"))
              .build();
        }
      }
    }
    return getRecalculateUserStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetMyStorageRequest,
      dictionary.v1.Dictionary.GetMyStorageResponse> getGetMyStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyStorage",
      requestType = dictionary.v1.Dictionary.GetMyStorageRequest.class,
      responseType = dictionary.v1.Dictionary.GetMyStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetMyStorageRequest,
      dictionary.v1.Dictionary.GetMyStorageResponse> getGetMyStorageMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetMyStorageRequest, dictionary.v1.Dictionary.GetMyStorageResponse> getGetMyStorageMethod;
    if ((getGetMyStorageMethod = DictionaryServiceGrpc.getGetMyStorageMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetMyStorageMethod = DictionaryServiceGrpc.getGetMyStorageMethod) == null) {
          DictionaryServiceGrpc.getGetMyStorageMethod = getGetMyStorageMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetMyStorageRequest, dictionary.v1.Dictionary.GetMyStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetMyStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetMyStorageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetMyStorage"))
              .build();
        }
      }
    }
    return getGetMyStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetMySettingsRequest,
      dictionary.v1.Dictionary.GetMySettingsResponse> getGetMySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMySettings",
      requestType = dictionary.v1.Dictionary.GetMySettingsRequest.class,
      responseType = dictionary.v1.Dictionary.GetMySettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetMySettingsRequest,
      dictionary.v1.Dictionary.GetMySettingsResponse> getGetMySettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.GetMySettingsRequest, dictionary.v1.Dictionary.GetMySettingsResponse> getGetMySettingsMethod;
    if ((getGetMySettingsMethod = DictionaryServiceGrpc.getGetMySettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getGetMySettingsMethod = DictionaryServiceGrpc.getGetMySettingsMethod) == null) {
          DictionaryServiceGrpc.getGetMySettingsMethod = getGetMySettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.GetMySettingsRequest, dictionary.v1.Dictionary.GetMySettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetMySettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.GetMySettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DictionaryServiceMethodDescriptorSupplier("GetMySettings"))
              .build();
        }
      }
    }
    return getGetMySettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateMySettingsRequest,
      dictionary.v1.Dictionary.UpdateMySettingsResponse> getUpdateMySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMySettings",
      requestType = dictionary.v1.Dictionary.UpdateMySettingsRequest.class,
      responseType = dictionary.v1.Dictionary.UpdateMySettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateMySettingsRequest,
      dictionary.v1.Dictionary.UpdateMySettingsResponse> getUpdateMySettingsMethod() {
    io.grpc.MethodDescriptor<dictionary.v1.Dictionary.UpdateMySettingsRequest, dictionary.v1.Dictionary.UpdateMySettingsResponse> getUpdateMySettingsMethod;
    if ((getUpdateMySettingsMethod = DictionaryServiceGrpc.getUpdateMySettingsMethod) == null) {
      synchronized (DictionaryServiceGrpc.class) {
        if ((getUpdateMySettingsMethod = DictionaryServiceGrpc.getUpdateMySettingsMethod) == null) {
          DictionaryServiceGrpc.getUpdateMySettingsMethod = getUpdateMySettingsMethod =
              io.grpc.MethodDescriptor.<dictionary.v1.Dictionary.UpdateMySettingsRequest, dictionary.v1.Dictionary.UpdateMySettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UpdateMySettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dictionary.v1.Dictionary.UpdateMySettingsResponse.getDefaultInstance()))
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
    default void lookupWord(dictionary.v1.Dictionary.LookupWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.LookupWordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupWordMethod(), responseObserver);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    default void lookupWords(dictionary.v1.Dictionary.LookupWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.LookupWordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupWordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDictionaries lists the dictionaries, by group, with whether each is on for the caller (the system and the
     * user switches). Permission: dictionary:word:read.
     * </pre>
     */
    default void listDictionaries(dictionary.v1.Dictionary.ListDictionariesRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListDictionariesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDictionariesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    default void saveWord(dictionary.v1.Dictionary.SaveWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SaveWordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveWordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    default void listSavedWords(dictionary.v1.Dictionary.ListSavedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListSavedWordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSavedWordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CheckSavedWords tells which of up to 100 words are in the list of the user, with their categories: the lookup
     * marks the words that are saved without reading the whole list. Permission: dictionary:word:read.
     * </pre>
     */
    default void checkSavedWords(dictionary.v1.Dictionary.CheckSavedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CheckSavedWordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckSavedWordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    default void deleteSavedWord(dictionary.v1.Dictionary.DeleteSavedWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DeleteSavedWordResponse> responseObserver) {
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
    default void exportAnki(dictionary.v1.Dictionary.ExportAnkiRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ExportAnkiResponse> responseObserver) {
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
    default void createDeckLink(dictionary.v1.Dictionary.CreateDeckLinkRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateDeckLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeckLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartExport starts a job that packs a list that is too long for ExportAnki (EXPORT_USE_JOB) in parts,
     * each a deck file of at most the size limit, and marks the words of a part exported when the part is
     * done. The words are the new ones (or all, see scope), of the category or of no category. One job at a
     * time per user: another one fails with EXPORT_JOB_ACTIVE. Permission: dictionary:word:write.
     * </pre>
     */
    default void startExport(dictionary.v1.Dictionary.StartExportRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.StartExportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartExportMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetExport returns the state of a job and its parts so far. The id "latest" (or empty) is the job started
     * last by the user. NOT_FOUND when there is none. Permission: dictionary:word:write.
     * </pre>
     */
    default void getExport(dictionary.v1.Dictionary.GetExportRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetExportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExportMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelExport stops a queued or running job; the parts made so far stay downloadable until the job
     * expires. Permission: dictionary:word:write.
     * </pre>
     */
    default void cancelExport(dictionary.v1.Dictionary.CancelExportRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CancelExportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelExportMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateExportPartLink makes the download link of a part of a job (the same anonymous download as
     * CreateDeckLink, but it works many times until the job expires). Permission: dictionary:word:write.
     * </pre>
     */
    default void createExportPartLink(dictionary.v1.Dictionary.CreateExportPartLinkRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateExportPartLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExportPartLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    default void downloadDeck(dictionary.v1.Dictionary.DownloadDeckRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DownloadDeckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadDeckMethod(), responseObserver);
    }

    /**
     * <pre>
     * DownloadExportPart streams the part of an export job (see CreateExportPartLink) in chunks of at most 256 KiB, so
     * a part larger than a gRPC message travels without being held whole: the first chunk carries filename and size,
     * the next ones only data. Like DownloadDeck it takes a service token (the gateway). NOT_FOUND when the token is
     * unknown or expired.
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    default void downloadExportPart(dictionary.v1.Dictionary.DownloadExportPartRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DownloadChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadExportPartMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCategories lists the categories of the user (by name) with their word counts. Permission: dictionary:word:read.
     * </pre>
     */
    default void listCategories(dictionary.v1.Dictionary.ListCategoriesRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListCategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCategoriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCategory adds a category. Fails with ALREADY_EXISTS (CATEGORY_EXISTS) for a name the user has (case-insensitive),
     * RESOURCE_EXHAUSTED (CATEGORY_LIMIT_REACHED) at 50 categories and INVALID_ARGUMENT for a name of 0 or more
     * than 40 characters. Permission: dictionary:word:write.
     * </pre>
     */
    default void createCategory(dictionary.v1.Dictionary.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * RenameCategory renames one. NOT_FOUND for an unknown id, ALREADY_EXISTS (CATEGORY_EXISTS) for a name in use.
     * Permission: dictionary:word:write.
     * </pre>
     */
    default void renameCategory(dictionary.v1.Dictionary.RenameCategoryRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RenameCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCategory deletes the category only; its words stay in the list. NOT_FOUND for an unknown id.
     * Permission: dictionary:word:write.
     * </pre>
     */
    default void deleteCategory(dictionary.v1.Dictionary.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DeleteCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateWordCategories adds the words to some categories and takes them out of others, in one step. It does not
     * touch the card or the exported flag. NOT_FOUND for an unknown category; words that are not in the list are
     * ignored. Permission: dictionary:word:write.
     * </pre>
     */
    default void updateWordCategories(dictionary.v1.Dictionary.UpdateWordCategoriesRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateWordCategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWordCategoriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    default void removeExportedWords(dictionary.v1.Dictionary.RemoveExportedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RemoveExportedWordsResponse> responseObserver) {
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
    default void uploadImage(dictionary.v1.Dictionary.UploadImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UploadImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void getImage(dictionary.v1.Dictionary.GetImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * UploadAudio stores an audio file of a card (mp3, ogg, wav or m4a), as it is: it is not re-encoded. The
     * card refers to it in audio_uk / audio_us as dictaud:&lt;id&gt;. The same file of the same user gets the same
     * id. Fails with INVALID_ARGUMENT (AUDIO_UNSUPPORTED, AUDIO_TOO_LARGE), RESOURCE_EXHAUSTED
     * (AUDIO_QUOTA_EXCEEDED) or FAILED_PRECONDITION (AUDIO_DISABLED, no files directory).
     * Permission: dictionary:word:write.
     * </pre>
     */
    default void uploadAudio(dictionary.v1.Dictionary.UploadAudioRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UploadAudioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadAudioMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAudio returns an audio file of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void getAudio(dictionary.v1.Dictionary.GetAudioRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetAudioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAudioMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetReviewQueue returns the cards to review: the ones that are due first (earliest due first), then new
     * words (oldest first) up to the daily limit of the user, cut to limit cards. Only words still in the list.
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void getReviewQueue(dictionary.v1.Dictionary.GetReviewQueueRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetReviewQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReviewQueueMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubmitReview grades a card and schedules its next review (SM-2 or FSRS, as the user chose). NOT_FOUND when the word is not in the
     * list, INVALID_ARGUMENT for an unknown grade. Permission: dictionary:word:read.
     * </pre>
     */
    default void submitReview(dictionary.v1.Dictionary.SubmitReviewRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SubmitReviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddReviewBonus raises the daily limits of the review for the next 24 hours by the given numbers, without
     * touching the settings; a grant while a bonus runs adds up and renews the 24 hours. INVALID_ARGUMENT when a number
     * is negative or above 9999, or both are 0. Permission: dictionary:word:read.
     * </pre>
     */
    default void addReviewBonus(dictionary.v1.Dictionary.AddReviewBonusRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.AddReviewBonusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddReviewBonusMethod(), responseObserver);
    }

    /**
     * <pre>
     * OptimizeReviewParameters fits the FSRS parameters to the review history of the user and stores them when they
     * predict better than the defaults (restore_defaults = true forgets them instead). FAILED_PRECONDITION when there are too few
     * reviews, RESOURCE_EXHAUSTED when called again within a minute or while another run is going.
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void optimizeReviewParameters(dictionary.v1.Dictionary.OptimizeReviewParametersRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.OptimizeReviewParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptimizeReviewParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    default void getSettings(dictionary.v1.Dictionary.GetSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSettings changes them (all fields are written; only the ones that differ are stored). Fails with
     * INVALID_ARGUMENT when a value is out of range or no dictionary stays enabled.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    default void updateSettings(dictionary.v1.Dictionary.UpdateSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserQuota returns what a user stores (content, images, audio), the limits an administrator set for the
     * user and the limits in effect. NOT_FOUND for an unknown user. Permission: dictionary:settings:read.
     * </pre>
     */
    default void getUserQuota(dictionary.v1.Dictionary.GetUserQuotaRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetUserQuotaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserQuotaMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetUserQuota sets the own limits of a user (0 for a kind: the limit of the system again). INVALID_ARGUMENT
     * for a limit above the ceiling of the system settings. Permission: dictionary:settings:write.
     * </pre>
     */
    default void setUserQuota(dictionary.v1.Dictionary.SetUserQuotaRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SetUserQuotaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserQuotaMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecalculateUserStorage recomputes the storage counters of a user from the rows (content, images, audio, and
     * the number of words in the list) and returns them with what they were. NOT_FOUND user_not_found.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    default void recalculateUserStorage(dictionary.v1.Dictionary.RecalculateUserStorageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RecalculateUserStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecalculateUserStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyStorage returns what the user stores and the limit of each kind, own limit included.
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void getMyStorage(dictionary.v1.Dictionary.GetMyStorageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetMyStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    default void getMySettings(dictionary.v1.Dictionary.GetMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetMySettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMySettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMySettings stores the preferences of the user (kept by identity). INVALID_ARGUMENT when a value
     * is out of range, no dictionary is left enabled or the default is not an enabled one.
     * Permission: dictionary:word:read.
     * </pre>
     */
    default void updateMySettings(dictionary.v1.Dictionary.UpdateMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateMySettingsResponse> responseObserver) {
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
    public void lookupWord(dictionary.v1.Dictionary.LookupWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.LookupWordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    public void lookupWords(dictionary.v1.Dictionary.LookupWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.LookupWordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupWordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDictionaries lists the dictionaries, by group, with whether each is on for the caller (the system and the
     * user switches). Permission: dictionary:word:read.
     * </pre>
     */
    public void listDictionaries(dictionary.v1.Dictionary.ListDictionariesRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListDictionariesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDictionariesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    public void saveWord(dictionary.v1.Dictionary.SaveWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SaveWordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    public void listSavedWords(dictionary.v1.Dictionary.ListSavedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListSavedWordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSavedWordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CheckSavedWords tells which of up to 100 words are in the list of the user, with their categories: the lookup
     * marks the words that are saved without reading the whole list. Permission: dictionary:word:read.
     * </pre>
     */
    public void checkSavedWords(dictionary.v1.Dictionary.CheckSavedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CheckSavedWordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckSavedWordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    public void deleteSavedWord(dictionary.v1.Dictionary.DeleteSavedWordRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DeleteSavedWordResponse> responseObserver) {
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
    public void exportAnki(dictionary.v1.Dictionary.ExportAnkiRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ExportAnkiResponse> responseObserver) {
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
    public void createDeckLink(dictionary.v1.Dictionary.CreateDeckLinkRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateDeckLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeckLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartExport starts a job that packs a list that is too long for ExportAnki (EXPORT_USE_JOB) in parts,
     * each a deck file of at most the size limit, and marks the words of a part exported when the part is
     * done. The words are the new ones (or all, see scope), of the category or of no category. One job at a
     * time per user: another one fails with EXPORT_JOB_ACTIVE. Permission: dictionary:word:write.
     * </pre>
     */
    public void startExport(dictionary.v1.Dictionary.StartExportRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.StartExportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartExportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetExport returns the state of a job and its parts so far. The id "latest" (or empty) is the job started
     * last by the user. NOT_FOUND when there is none. Permission: dictionary:word:write.
     * </pre>
     */
    public void getExport(dictionary.v1.Dictionary.GetExportRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetExportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelExport stops a queued or running job; the parts made so far stay downloadable until the job
     * expires. Permission: dictionary:word:write.
     * </pre>
     */
    public void cancelExport(dictionary.v1.Dictionary.CancelExportRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CancelExportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelExportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateExportPartLink makes the download link of a part of a job (the same anonymous download as
     * CreateDeckLink, but it works many times until the job expires). Permission: dictionary:word:write.
     * </pre>
     */
    public void createExportPartLink(dictionary.v1.Dictionary.CreateExportPartLinkRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateExportPartLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExportPartLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    public void downloadDeck(dictionary.v1.Dictionary.DownloadDeckRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DownloadDeckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadDeckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DownloadExportPart streams the part of an export job (see CreateExportPartLink) in chunks of at most 256 KiB, so
     * a part larger than a gRPC message travels without being held whole: the first chunk carries filename and size,
     * the next ones only data. Like DownloadDeck it takes a service token (the gateway). NOT_FOUND when the token is
     * unknown or expired.
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public void downloadExportPart(dictionary.v1.Dictionary.DownloadExportPartRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DownloadChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownloadExportPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCategories lists the categories of the user (by name) with their word counts. Permission: dictionary:word:read.
     * </pre>
     */
    public void listCategories(dictionary.v1.Dictionary.ListCategoriesRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListCategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCategory adds a category. Fails with ALREADY_EXISTS (CATEGORY_EXISTS) for a name the user has (case-insensitive),
     * RESOURCE_EXHAUSTED (CATEGORY_LIMIT_REACHED) at 50 categories and INVALID_ARGUMENT for a name of 0 or more
     * than 40 characters. Permission: dictionary:word:write.
     * </pre>
     */
    public void createCategory(dictionary.v1.Dictionary.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RenameCategory renames one. NOT_FOUND for an unknown id, ALREADY_EXISTS (CATEGORY_EXISTS) for a name in use.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public void renameCategory(dictionary.v1.Dictionary.RenameCategoryRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RenameCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCategory deletes the category only; its words stay in the list. NOT_FOUND for an unknown id.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public void deleteCategory(dictionary.v1.Dictionary.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DeleteCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateWordCategories adds the words to some categories and takes them out of others, in one step. It does not
     * touch the card or the exported flag. NOT_FOUND for an unknown category; words that are not in the list are
     * ignored. Permission: dictionary:word:write.
     * </pre>
     */
    public void updateWordCategories(dictionary.v1.Dictionary.UpdateWordCategoriesRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateWordCategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWordCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    public void removeExportedWords(dictionary.v1.Dictionary.RemoveExportedWordsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RemoveExportedWordsResponse> responseObserver) {
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
    public void uploadImage(dictionary.v1.Dictionary.UploadImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UploadImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void getImage(dictionary.v1.Dictionary.GetImageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UploadAudio stores an audio file of a card (mp3, ogg, wav or m4a), as it is: it is not re-encoded. The
     * card refers to it in audio_uk / audio_us as dictaud:&lt;id&gt;. The same file of the same user gets the same
     * id. Fails with INVALID_ARGUMENT (AUDIO_UNSUPPORTED, AUDIO_TOO_LARGE), RESOURCE_EXHAUSTED
     * (AUDIO_QUOTA_EXCEEDED) or FAILED_PRECONDITION (AUDIO_DISABLED, no files directory).
     * Permission: dictionary:word:write.
     * </pre>
     */
    public void uploadAudio(dictionary.v1.Dictionary.UploadAudioRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UploadAudioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadAudioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAudio returns an audio file of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void getAudio(dictionary.v1.Dictionary.GetAudioRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetAudioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAudioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetReviewQueue returns the cards to review: the ones that are due first (earliest due first), then new
     * words (oldest first) up to the daily limit of the user, cut to limit cards. Only words still in the list.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void getReviewQueue(dictionary.v1.Dictionary.GetReviewQueueRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetReviewQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReviewQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubmitReview grades a card and schedules its next review (SM-2 or FSRS, as the user chose). NOT_FOUND when the word is not in the
     * list, INVALID_ARGUMENT for an unknown grade. Permission: dictionary:word:read.
     * </pre>
     */
    public void submitReview(dictionary.v1.Dictionary.SubmitReviewRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SubmitReviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddReviewBonus raises the daily limits of the review for the next 24 hours by the given numbers, without
     * touching the settings; a grant while a bonus runs adds up and renews the 24 hours. INVALID_ARGUMENT when a number
     * is negative or above 9999, or both are 0. Permission: dictionary:word:read.
     * </pre>
     */
    public void addReviewBonus(dictionary.v1.Dictionary.AddReviewBonusRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.AddReviewBonusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddReviewBonusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OptimizeReviewParameters fits the FSRS parameters to the review history of the user and stores them when they
     * predict better than the defaults (restore_defaults = true forgets them instead). FAILED_PRECONDITION when there are too few
     * reviews, RESOURCE_EXHAUSTED when called again within a minute or while another run is going.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void optimizeReviewParameters(dictionary.v1.Dictionary.OptimizeReviewParametersRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.OptimizeReviewParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptimizeReviewParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    public void getSettings(dictionary.v1.Dictionary.GetSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetSettingsResponse> responseObserver) {
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
    public void updateSettings(dictionary.v1.Dictionary.UpdateSettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserQuota returns what a user stores (content, images, audio), the limits an administrator set for the
     * user and the limits in effect. NOT_FOUND for an unknown user. Permission: dictionary:settings:read.
     * </pre>
     */
    public void getUserQuota(dictionary.v1.Dictionary.GetUserQuotaRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetUserQuotaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetUserQuota sets the own limits of a user (0 for a kind: the limit of the system again). INVALID_ARGUMENT
     * for a limit above the ceiling of the system settings. Permission: dictionary:settings:write.
     * </pre>
     */
    public void setUserQuota(dictionary.v1.Dictionary.SetUserQuotaRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SetUserQuotaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecalculateUserStorage recomputes the storage counters of a user from the rows (content, images, audio, and
     * the number of words in the list) and returns them with what they were. NOT_FOUND user_not_found.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    public void recalculateUserStorage(dictionary.v1.Dictionary.RecalculateUserStorageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RecalculateUserStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecalculateUserStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyStorage returns what the user stores and the limit of each kind, own limit included.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public void getMyStorage(dictionary.v1.Dictionary.GetMyStorageRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetMyStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    public void getMySettings(dictionary.v1.Dictionary.GetMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetMySettingsResponse> responseObserver) {
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
    public void updateMySettings(dictionary.v1.Dictionary.UpdateMySettingsRequest request,
        io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateMySettingsResponse> responseObserver) {
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
    public dictionary.v1.Dictionary.LookupWordResponse lookupWord(dictionary.v1.Dictionary.LookupWordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupWordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.LookupWordsResponse lookupWords(dictionary.v1.Dictionary.LookupWordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupWordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDictionaries lists the dictionaries, by group, with whether each is on for the caller (the system and the
     * user switches). Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.ListDictionariesResponse listDictionaries(dictionary.v1.Dictionary.ListDictionariesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDictionariesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.SaveWordResponse saveWord(dictionary.v1.Dictionary.SaveWordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveWordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.ListSavedWordsResponse listSavedWords(dictionary.v1.Dictionary.ListSavedWordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSavedWordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CheckSavedWords tells which of up to 100 words are in the list of the user, with their categories: the lookup
     * marks the words that are saved without reading the whole list. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.CheckSavedWordsResponse checkSavedWords(dictionary.v1.Dictionary.CheckSavedWordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckSavedWordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.DeleteSavedWordResponse deleteSavedWord(dictionary.v1.Dictionary.DeleteSavedWordRequest request) {
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
    public dictionary.v1.Dictionary.ExportAnkiResponse exportAnki(dictionary.v1.Dictionary.ExportAnkiRequest request) {
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
    public dictionary.v1.Dictionary.CreateDeckLinkResponse createDeckLink(dictionary.v1.Dictionary.CreateDeckLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeckLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartExport starts a job that packs a list that is too long for ExportAnki (EXPORT_USE_JOB) in parts,
     * each a deck file of at most the size limit, and marks the words of a part exported when the part is
     * done. The words are the new ones (or all, see scope), of the category or of no category. One job at a
     * time per user: another one fails with EXPORT_JOB_ACTIVE. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.StartExportResponse startExport(dictionary.v1.Dictionary.StartExportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartExportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetExport returns the state of a job and its parts so far. The id "latest" (or empty) is the job started
     * last by the user. NOT_FOUND when there is none. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetExportResponse getExport(dictionary.v1.Dictionary.GetExportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelExport stops a queued or running job; the parts made so far stay downloadable until the job
     * expires. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.CancelExportResponse cancelExport(dictionary.v1.Dictionary.CancelExportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelExportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateExportPartLink makes the download link of a part of a job (the same anonymous download as
     * CreateDeckLink, but it works many times until the job expires). Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.CreateExportPartLinkResponse createExportPartLink(dictionary.v1.Dictionary.CreateExportPartLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExportPartLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    public dictionary.v1.Dictionary.DownloadDeckResponse downloadDeck(dictionary.v1.Dictionary.DownloadDeckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadDeckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DownloadExportPart streams the part of an export job (see CreateExportPartLink) in chunks of at most 256 KiB, so
     * a part larger than a gRPC message travels without being held whole: the first chunk carries filename and size,
     * the next ones only data. Like DownloadDeck it takes a service token (the gateway). NOT_FOUND when the token is
     * unknown or expired.
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public java.util.Iterator<dictionary.v1.Dictionary.DownloadChunk> downloadExportPart(
        dictionary.v1.Dictionary.DownloadExportPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownloadExportPartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCategories lists the categories of the user (by name) with their word counts. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.ListCategoriesResponse listCategories(dictionary.v1.Dictionary.ListCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCategoriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCategory adds a category. Fails with ALREADY_EXISTS (CATEGORY_EXISTS) for a name the user has (case-insensitive),
     * RESOURCE_EXHAUSTED (CATEGORY_LIMIT_REACHED) at 50 categories and INVALID_ARGUMENT for a name of 0 or more
     * than 40 characters. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.CreateCategoryResponse createCategory(dictionary.v1.Dictionary.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RenameCategory renames one. NOT_FOUND for an unknown id, ALREADY_EXISTS (CATEGORY_EXISTS) for a name in use.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.RenameCategoryResponse renameCategory(dictionary.v1.Dictionary.RenameCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCategory deletes the category only; its words stay in the list. NOT_FOUND for an unknown id.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.DeleteCategoryResponse deleteCategory(dictionary.v1.Dictionary.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateWordCategories adds the words to some categories and takes them out of others, in one step. It does not
     * touch the card or the exported flag. NOT_FOUND for an unknown category; words that are not in the list are
     * ignored. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.UpdateWordCategoriesResponse updateWordCategories(dictionary.v1.Dictionary.UpdateWordCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWordCategoriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.RemoveExportedWordsResponse removeExportedWords(dictionary.v1.Dictionary.RemoveExportedWordsRequest request) {
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
    public dictionary.v1.Dictionary.UploadImageResponse uploadImage(dictionary.v1.Dictionary.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetImageResponse getImage(dictionary.v1.Dictionary.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UploadAudio stores an audio file of a card (mp3, ogg, wav or m4a), as it is: it is not re-encoded. The
     * card refers to it in audio_uk / audio_us as dictaud:&lt;id&gt;. The same file of the same user gets the same
     * id. Fails with INVALID_ARGUMENT (AUDIO_UNSUPPORTED, AUDIO_TOO_LARGE), RESOURCE_EXHAUSTED
     * (AUDIO_QUOTA_EXCEEDED) or FAILED_PRECONDITION (AUDIO_DISABLED, no files directory).
     * Permission: dictionary:word:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.UploadAudioResponse uploadAudio(dictionary.v1.Dictionary.UploadAudioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadAudioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAudio returns an audio file of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetAudioResponse getAudio(dictionary.v1.Dictionary.GetAudioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAudioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetReviewQueue returns the cards to review: the ones that are due first (earliest due first), then new
     * words (oldest first) up to the daily limit of the user, cut to limit cards. Only words still in the list.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetReviewQueueResponse getReviewQueue(dictionary.v1.Dictionary.GetReviewQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReviewQueueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubmitReview grades a card and schedules its next review (SM-2 or FSRS, as the user chose). NOT_FOUND when the word is not in the
     * list, INVALID_ARGUMENT for an unknown grade. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.SubmitReviewResponse submitReview(dictionary.v1.Dictionary.SubmitReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddReviewBonus raises the daily limits of the review for the next 24 hours by the given numbers, without
     * touching the settings; a grant while a bonus runs adds up and renews the 24 hours. INVALID_ARGUMENT when a number
     * is negative or above 9999, or both are 0. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.AddReviewBonusResponse addReviewBonus(dictionary.v1.Dictionary.AddReviewBonusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddReviewBonusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OptimizeReviewParameters fits the FSRS parameters to the review history of the user and stores them when they
     * predict better than the defaults (restore_defaults = true forgets them instead). FAILED_PRECONDITION when there are too few
     * reviews, RESOURCE_EXHAUSTED when called again within a minute or while another run is going.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.OptimizeReviewParametersResponse optimizeReviewParameters(dictionary.v1.Dictionary.OptimizeReviewParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptimizeReviewParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetSettingsResponse getSettings(dictionary.v1.Dictionary.GetSettingsRequest request) {
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
    public dictionary.v1.Dictionary.UpdateSettingsResponse updateSettings(dictionary.v1.Dictionary.UpdateSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserQuota returns what a user stores (content, images, audio), the limits an administrator set for the
     * user and the limits in effect. NOT_FOUND for an unknown user. Permission: dictionary:settings:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetUserQuotaResponse getUserQuota(dictionary.v1.Dictionary.GetUserQuotaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserQuotaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetUserQuota sets the own limits of a user (0 for a kind: the limit of the system again). INVALID_ARGUMENT
     * for a limit above the ceiling of the system settings. Permission: dictionary:settings:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.SetUserQuotaResponse setUserQuota(dictionary.v1.Dictionary.SetUserQuotaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserQuotaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecalculateUserStorage recomputes the storage counters of a user from the rows (content, images, audio, and
     * the number of words in the list) and returns them with what they were. NOT_FOUND user_not_found.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    public dictionary.v1.Dictionary.RecalculateUserStorageResponse recalculateUserStorage(dictionary.v1.Dictionary.RecalculateUserStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecalculateUserStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyStorage returns what the user stores and the limit of each kind, own limit included.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetMyStorageResponse getMyStorage(dictionary.v1.Dictionary.GetMyStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    public dictionary.v1.Dictionary.GetMySettingsResponse getMySettings(dictionary.v1.Dictionary.GetMySettingsRequest request) {
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
    public dictionary.v1.Dictionary.UpdateMySettingsResponse updateMySettings(dictionary.v1.Dictionary.UpdateMySettingsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.LookupWordResponse> lookupWord(
        dictionary.v1.Dictionary.LookupWordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupWordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LookupWords returns the entries of several words (at most 20). Words without an entry are
     * listed in not_found instead of failing the call. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.LookupWordsResponse> lookupWords(
        dictionary.v1.Dictionary.LookupWordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupWordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDictionaries lists the dictionaries, by group, with whether each is on for the caller (the system and the
     * user switches). Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.ListDictionariesResponse> listDictionaries(
        dictionary.v1.Dictionary.ListDictionariesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDictionariesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SaveWord adds a word to the user's list (an upsert; an exported word becomes new again). Fails with
     * RESOURCE_EXHAUSTED (MAX_SAVED_WORDS_REACHED) when the list is full. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.SaveWordResponse> saveWord(
        dictionary.v1.Dictionary.SaveWordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveWordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSavedWords lists the words of the list, newest first: the new ones and the exported ones that were
     * kept (remove after export is off). Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.ListSavedWordsResponse> listSavedWords(
        dictionary.v1.Dictionary.ListSavedWordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSavedWordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CheckSavedWords tells which of up to 100 words are in the list of the user, with their categories: the lookup
     * marks the words that are saved without reading the whole list. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.CheckSavedWordsResponse> checkSavedWords(
        dictionary.v1.Dictionary.CheckSavedWordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckSavedWordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSavedWord removes a word of the list. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.DeleteSavedWordResponse> deleteSavedWord(
        dictionary.v1.Dictionary.DeleteSavedWordRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.ExportAnkiResponse> exportAnki(
        dictionary.v1.Dictionary.ExportAnkiRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.CreateDeckLinkResponse> createDeckLink(
        dictionary.v1.Dictionary.CreateDeckLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeckLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartExport starts a job that packs a list that is too long for ExportAnki (EXPORT_USE_JOB) in parts,
     * each a deck file of at most the size limit, and marks the words of a part exported when the part is
     * done. The words are the new ones (or all, see scope), of the category or of no category. One job at a
     * time per user: another one fails with EXPORT_JOB_ACTIVE. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.StartExportResponse> startExport(
        dictionary.v1.Dictionary.StartExportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartExportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetExport returns the state of a job and its parts so far. The id "latest" (or empty) is the job started
     * last by the user. NOT_FOUND when there is none. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetExportResponse> getExport(
        dictionary.v1.Dictionary.GetExportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelExport stops a queued or running job; the parts made so far stay downloadable until the job
     * expires. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.CancelExportResponse> cancelExport(
        dictionary.v1.Dictionary.CancelExportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelExportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateExportPartLink makes the download link of a part of a job (the same anonymous download as
     * CreateDeckLink, but it works many times until the job expires). Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.CreateExportPartLinkResponse> createExportPartLink(
        dictionary.v1.Dictionary.CreateExportPartLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExportPartLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DownloadDeck returns the deck of a link and burns the link (it works once). It is called by the
     * gateway for the anonymous download request, so it takes a service token (client credentials)
     * and refuses user tokens. NOT_FOUND when the token is unknown, used or expired.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.DownloadDeckResponse> downloadDeck(
        dictionary.v1.Dictionary.DownloadDeckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadDeckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCategories lists the categories of the user (by name) with their word counts. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.ListCategoriesResponse> listCategories(
        dictionary.v1.Dictionary.ListCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCategory adds a category. Fails with ALREADY_EXISTS (CATEGORY_EXISTS) for a name the user has (case-insensitive),
     * RESOURCE_EXHAUSTED (CATEGORY_LIMIT_REACHED) at 50 categories and INVALID_ARGUMENT for a name of 0 or more
     * than 40 characters. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.CreateCategoryResponse> createCategory(
        dictionary.v1.Dictionary.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RenameCategory renames one. NOT_FOUND for an unknown id, ALREADY_EXISTS (CATEGORY_EXISTS) for a name in use.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.RenameCategoryResponse> renameCategory(
        dictionary.v1.Dictionary.RenameCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCategory deletes the category only; its words stay in the list. NOT_FOUND for an unknown id.
     * Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.DeleteCategoryResponse> deleteCategory(
        dictionary.v1.Dictionary.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateWordCategories adds the words to some categories and takes them out of others, in one step. It does not
     * touch the card or the exported flag. NOT_FOUND for an unknown category; words that are not in the list are
     * ignored. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.UpdateWordCategoriesResponse> updateWordCategories(
        dictionary.v1.Dictionary.UpdateWordCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWordCategoriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveExportedWords takes the exported words out of the list (the new ones stay). The dict app calls it
     * when the user answers "remove them" after remove after export came on. Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.RemoveExportedWordsResponse> removeExportedWords(
        dictionary.v1.Dictionary.RemoveExportedWordsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.UploadImageResponse> uploadImage(
        dictionary.v1.Dictionary.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetImage returns an image of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetImageResponse> getImage(
        dictionary.v1.Dictionary.GetImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UploadAudio stores an audio file of a card (mp3, ogg, wav or m4a), as it is: it is not re-encoded. The
     * card refers to it in audio_uk / audio_us as dictaud:&lt;id&gt;. The same file of the same user gets the same
     * id. Fails with INVALID_ARGUMENT (AUDIO_UNSUPPORTED, AUDIO_TOO_LARGE), RESOURCE_EXHAUSTED
     * (AUDIO_QUOTA_EXCEEDED) or FAILED_PRECONDITION (AUDIO_DISABLED, no files directory).
     * Permission: dictionary:word:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.UploadAudioResponse> uploadAudio(
        dictionary.v1.Dictionary.UploadAudioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadAudioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAudio returns an audio file of the user (NOT_FOUND for an unknown id or one of another user).
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetAudioResponse> getAudio(
        dictionary.v1.Dictionary.GetAudioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAudioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetReviewQueue returns the cards to review: the ones that are due first (earliest due first), then new
     * words (oldest first) up to the daily limit of the user, cut to limit cards. Only words still in the list.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetReviewQueueResponse> getReviewQueue(
        dictionary.v1.Dictionary.GetReviewQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReviewQueueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubmitReview grades a card and schedules its next review (SM-2 or FSRS, as the user chose). NOT_FOUND when the word is not in the
     * list, INVALID_ARGUMENT for an unknown grade. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.SubmitReviewResponse> submitReview(
        dictionary.v1.Dictionary.SubmitReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddReviewBonus raises the daily limits of the review for the next 24 hours by the given numbers, without
     * touching the settings; a grant while a bonus runs adds up and renews the 24 hours. INVALID_ARGUMENT when a number
     * is negative or above 9999, or both are 0. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.AddReviewBonusResponse> addReviewBonus(
        dictionary.v1.Dictionary.AddReviewBonusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddReviewBonusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OptimizeReviewParameters fits the FSRS parameters to the review history of the user and stores them when they
     * predict better than the defaults (restore_defaults = true forgets them instead). FAILED_PRECONDITION when there are too few
     * reviews, RESOURCE_EXHAUSTED when called again within a minute or while another run is going.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.OptimizeReviewParametersResponse> optimizeReviewParameters(
        dictionary.v1.Dictionary.OptimizeReviewParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptimizeReviewParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSettings returns the settings of the whole system. Permission: dictionary:settings:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetSettingsResponse> getSettings(
        dictionary.v1.Dictionary.GetSettingsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.UpdateSettingsResponse> updateSettings(
        dictionary.v1.Dictionary.UpdateSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserQuota returns what a user stores (content, images, audio), the limits an administrator set for the
     * user and the limits in effect. NOT_FOUND for an unknown user. Permission: dictionary:settings:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetUserQuotaResponse> getUserQuota(
        dictionary.v1.Dictionary.GetUserQuotaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserQuotaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetUserQuota sets the own limits of a user (0 for a kind: the limit of the system again). INVALID_ARGUMENT
     * for a limit above the ceiling of the system settings. Permission: dictionary:settings:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.SetUserQuotaResponse> setUserQuota(
        dictionary.v1.Dictionary.SetUserQuotaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserQuotaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecalculateUserStorage recomputes the storage counters of a user from the rows (content, images, audio, and
     * the number of words in the list) and returns them with what they were. NOT_FOUND user_not_found.
     * Permission: dictionary:settings:write.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.RecalculateUserStorageResponse> recalculateUserStorage(
        dictionary.v1.Dictionary.RecalculateUserStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecalculateUserStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyStorage returns what the user stores and the limit of each kind, own limit included.
     * Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetMyStorageResponse> getMyStorage(
        dictionary.v1.Dictionary.GetMyStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMySettings returns the preferences of the user together with the settings of the system, which
     * tell what the user may choose from. Permission: dictionary:word:read.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.GetMySettingsResponse> getMySettings(
        dictionary.v1.Dictionary.GetMySettingsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dictionary.v1.Dictionary.UpdateMySettingsResponse> updateMySettings(
        dictionary.v1.Dictionary.UpdateMySettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMySettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP_WORD = 0;
  private static final int METHODID_LOOKUP_WORDS = 1;
  private static final int METHODID_LIST_DICTIONARIES = 2;
  private static final int METHODID_SAVE_WORD = 3;
  private static final int METHODID_LIST_SAVED_WORDS = 4;
  private static final int METHODID_CHECK_SAVED_WORDS = 5;
  private static final int METHODID_DELETE_SAVED_WORD = 6;
  private static final int METHODID_EXPORT_ANKI = 7;
  private static final int METHODID_CREATE_DECK_LINK = 8;
  private static final int METHODID_START_EXPORT = 9;
  private static final int METHODID_GET_EXPORT = 10;
  private static final int METHODID_CANCEL_EXPORT = 11;
  private static final int METHODID_CREATE_EXPORT_PART_LINK = 12;
  private static final int METHODID_DOWNLOAD_DECK = 13;
  private static final int METHODID_DOWNLOAD_EXPORT_PART = 14;
  private static final int METHODID_LIST_CATEGORIES = 15;
  private static final int METHODID_CREATE_CATEGORY = 16;
  private static final int METHODID_RENAME_CATEGORY = 17;
  private static final int METHODID_DELETE_CATEGORY = 18;
  private static final int METHODID_UPDATE_WORD_CATEGORIES = 19;
  private static final int METHODID_REMOVE_EXPORTED_WORDS = 20;
  private static final int METHODID_UPLOAD_IMAGE = 21;
  private static final int METHODID_GET_IMAGE = 22;
  private static final int METHODID_UPLOAD_AUDIO = 23;
  private static final int METHODID_GET_AUDIO = 24;
  private static final int METHODID_GET_REVIEW_QUEUE = 25;
  private static final int METHODID_SUBMIT_REVIEW = 26;
  private static final int METHODID_ADD_REVIEW_BONUS = 27;
  private static final int METHODID_OPTIMIZE_REVIEW_PARAMETERS = 28;
  private static final int METHODID_GET_SETTINGS = 29;
  private static final int METHODID_UPDATE_SETTINGS = 30;
  private static final int METHODID_GET_USER_QUOTA = 31;
  private static final int METHODID_SET_USER_QUOTA = 32;
  private static final int METHODID_RECALCULATE_USER_STORAGE = 33;
  private static final int METHODID_GET_MY_STORAGE = 34;
  private static final int METHODID_GET_MY_SETTINGS = 35;
  private static final int METHODID_UPDATE_MY_SETTINGS = 36;

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
          serviceImpl.lookupWord((dictionary.v1.Dictionary.LookupWordRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.LookupWordResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_WORDS:
          serviceImpl.lookupWords((dictionary.v1.Dictionary.LookupWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.LookupWordsResponse>) responseObserver);
          break;
        case METHODID_LIST_DICTIONARIES:
          serviceImpl.listDictionaries((dictionary.v1.Dictionary.ListDictionariesRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListDictionariesResponse>) responseObserver);
          break;
        case METHODID_SAVE_WORD:
          serviceImpl.saveWord((dictionary.v1.Dictionary.SaveWordRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SaveWordResponse>) responseObserver);
          break;
        case METHODID_LIST_SAVED_WORDS:
          serviceImpl.listSavedWords((dictionary.v1.Dictionary.ListSavedWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListSavedWordsResponse>) responseObserver);
          break;
        case METHODID_CHECK_SAVED_WORDS:
          serviceImpl.checkSavedWords((dictionary.v1.Dictionary.CheckSavedWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CheckSavedWordsResponse>) responseObserver);
          break;
        case METHODID_DELETE_SAVED_WORD:
          serviceImpl.deleteSavedWord((dictionary.v1.Dictionary.DeleteSavedWordRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DeleteSavedWordResponse>) responseObserver);
          break;
        case METHODID_EXPORT_ANKI:
          serviceImpl.exportAnki((dictionary.v1.Dictionary.ExportAnkiRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ExportAnkiResponse>) responseObserver);
          break;
        case METHODID_CREATE_DECK_LINK:
          serviceImpl.createDeckLink((dictionary.v1.Dictionary.CreateDeckLinkRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateDeckLinkResponse>) responseObserver);
          break;
        case METHODID_START_EXPORT:
          serviceImpl.startExport((dictionary.v1.Dictionary.StartExportRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.StartExportResponse>) responseObserver);
          break;
        case METHODID_GET_EXPORT:
          serviceImpl.getExport((dictionary.v1.Dictionary.GetExportRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetExportResponse>) responseObserver);
          break;
        case METHODID_CANCEL_EXPORT:
          serviceImpl.cancelExport((dictionary.v1.Dictionary.CancelExportRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CancelExportResponse>) responseObserver);
          break;
        case METHODID_CREATE_EXPORT_PART_LINK:
          serviceImpl.createExportPartLink((dictionary.v1.Dictionary.CreateExportPartLinkRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateExportPartLinkResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_DECK:
          serviceImpl.downloadDeck((dictionary.v1.Dictionary.DownloadDeckRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DownloadDeckResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_EXPORT_PART:
          serviceImpl.downloadExportPart((dictionary.v1.Dictionary.DownloadExportPartRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DownloadChunk>) responseObserver);
          break;
        case METHODID_LIST_CATEGORIES:
          serviceImpl.listCategories((dictionary.v1.Dictionary.ListCategoriesRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.ListCategoriesResponse>) responseObserver);
          break;
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((dictionary.v1.Dictionary.CreateCategoryRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.CreateCategoryResponse>) responseObserver);
          break;
        case METHODID_RENAME_CATEGORY:
          serviceImpl.renameCategory((dictionary.v1.Dictionary.RenameCategoryRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RenameCategoryResponse>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY:
          serviceImpl.deleteCategory((dictionary.v1.Dictionary.DeleteCategoryRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.DeleteCategoryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORD_CATEGORIES:
          serviceImpl.updateWordCategories((dictionary.v1.Dictionary.UpdateWordCategoriesRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateWordCategoriesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_EXPORTED_WORDS:
          serviceImpl.removeExportedWords((dictionary.v1.Dictionary.RemoveExportedWordsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RemoveExportedWordsResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_IMAGE:
          serviceImpl.uploadImage((dictionary.v1.Dictionary.UploadImageRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UploadImageResponse>) responseObserver);
          break;
        case METHODID_GET_IMAGE:
          serviceImpl.getImage((dictionary.v1.Dictionary.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetImageResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_AUDIO:
          serviceImpl.uploadAudio((dictionary.v1.Dictionary.UploadAudioRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UploadAudioResponse>) responseObserver);
          break;
        case METHODID_GET_AUDIO:
          serviceImpl.getAudio((dictionary.v1.Dictionary.GetAudioRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetAudioResponse>) responseObserver);
          break;
        case METHODID_GET_REVIEW_QUEUE:
          serviceImpl.getReviewQueue((dictionary.v1.Dictionary.GetReviewQueueRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetReviewQueueResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_REVIEW:
          serviceImpl.submitReview((dictionary.v1.Dictionary.SubmitReviewRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SubmitReviewResponse>) responseObserver);
          break;
        case METHODID_ADD_REVIEW_BONUS:
          serviceImpl.addReviewBonus((dictionary.v1.Dictionary.AddReviewBonusRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.AddReviewBonusResponse>) responseObserver);
          break;
        case METHODID_OPTIMIZE_REVIEW_PARAMETERS:
          serviceImpl.optimizeReviewParameters((dictionary.v1.Dictionary.OptimizeReviewParametersRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.OptimizeReviewParametersResponse>) responseObserver);
          break;
        case METHODID_GET_SETTINGS:
          serviceImpl.getSettings((dictionary.v1.Dictionary.GetSettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetSettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SETTINGS:
          serviceImpl.updateSettings((dictionary.v1.Dictionary.UpdateSettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_QUOTA:
          serviceImpl.getUserQuota((dictionary.v1.Dictionary.GetUserQuotaRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetUserQuotaResponse>) responseObserver);
          break;
        case METHODID_SET_USER_QUOTA:
          serviceImpl.setUserQuota((dictionary.v1.Dictionary.SetUserQuotaRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.SetUserQuotaResponse>) responseObserver);
          break;
        case METHODID_RECALCULATE_USER_STORAGE:
          serviceImpl.recalculateUserStorage((dictionary.v1.Dictionary.RecalculateUserStorageRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.RecalculateUserStorageResponse>) responseObserver);
          break;
        case METHODID_GET_MY_STORAGE:
          serviceImpl.getMyStorage((dictionary.v1.Dictionary.GetMyStorageRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetMyStorageResponse>) responseObserver);
          break;
        case METHODID_GET_MY_SETTINGS:
          serviceImpl.getMySettings((dictionary.v1.Dictionary.GetMySettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.GetMySettingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MY_SETTINGS:
          serviceImpl.updateMySettings((dictionary.v1.Dictionary.UpdateMySettingsRequest) request,
              (io.grpc.stub.StreamObserver<dictionary.v1.Dictionary.UpdateMySettingsResponse>) responseObserver);
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
              dictionary.v1.Dictionary.LookupWordRequest,
              dictionary.v1.Dictionary.LookupWordResponse>(
                service, METHODID_LOOKUP_WORD)))
        .addMethod(
          getLookupWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.LookupWordsRequest,
              dictionary.v1.Dictionary.LookupWordsResponse>(
                service, METHODID_LOOKUP_WORDS)))
        .addMethod(
          getListDictionariesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.ListDictionariesRequest,
              dictionary.v1.Dictionary.ListDictionariesResponse>(
                service, METHODID_LIST_DICTIONARIES)))
        .addMethod(
          getSaveWordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.SaveWordRequest,
              dictionary.v1.Dictionary.SaveWordResponse>(
                service, METHODID_SAVE_WORD)))
        .addMethod(
          getListSavedWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.ListSavedWordsRequest,
              dictionary.v1.Dictionary.ListSavedWordsResponse>(
                service, METHODID_LIST_SAVED_WORDS)))
        .addMethod(
          getCheckSavedWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.CheckSavedWordsRequest,
              dictionary.v1.Dictionary.CheckSavedWordsResponse>(
                service, METHODID_CHECK_SAVED_WORDS)))
        .addMethod(
          getDeleteSavedWordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.DeleteSavedWordRequest,
              dictionary.v1.Dictionary.DeleteSavedWordResponse>(
                service, METHODID_DELETE_SAVED_WORD)))
        .addMethod(
          getExportAnkiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.ExportAnkiRequest,
              dictionary.v1.Dictionary.ExportAnkiResponse>(
                service, METHODID_EXPORT_ANKI)))
        .addMethod(
          getCreateDeckLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.CreateDeckLinkRequest,
              dictionary.v1.Dictionary.CreateDeckLinkResponse>(
                service, METHODID_CREATE_DECK_LINK)))
        .addMethod(
          getStartExportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.StartExportRequest,
              dictionary.v1.Dictionary.StartExportResponse>(
                service, METHODID_START_EXPORT)))
        .addMethod(
          getGetExportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetExportRequest,
              dictionary.v1.Dictionary.GetExportResponse>(
                service, METHODID_GET_EXPORT)))
        .addMethod(
          getCancelExportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.CancelExportRequest,
              dictionary.v1.Dictionary.CancelExportResponse>(
                service, METHODID_CANCEL_EXPORT)))
        .addMethod(
          getCreateExportPartLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.CreateExportPartLinkRequest,
              dictionary.v1.Dictionary.CreateExportPartLinkResponse>(
                service, METHODID_CREATE_EXPORT_PART_LINK)))
        .addMethod(
          getDownloadDeckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.DownloadDeckRequest,
              dictionary.v1.Dictionary.DownloadDeckResponse>(
                service, METHODID_DOWNLOAD_DECK)))
        .addMethod(
          getDownloadExportPartMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.DownloadExportPartRequest,
              dictionary.v1.Dictionary.DownloadChunk>(
                service, METHODID_DOWNLOAD_EXPORT_PART)))
        .addMethod(
          getListCategoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.ListCategoriesRequest,
              dictionary.v1.Dictionary.ListCategoriesResponse>(
                service, METHODID_LIST_CATEGORIES)))
        .addMethod(
          getCreateCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.CreateCategoryRequest,
              dictionary.v1.Dictionary.CreateCategoryResponse>(
                service, METHODID_CREATE_CATEGORY)))
        .addMethod(
          getRenameCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.RenameCategoryRequest,
              dictionary.v1.Dictionary.RenameCategoryResponse>(
                service, METHODID_RENAME_CATEGORY)))
        .addMethod(
          getDeleteCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.DeleteCategoryRequest,
              dictionary.v1.Dictionary.DeleteCategoryResponse>(
                service, METHODID_DELETE_CATEGORY)))
        .addMethod(
          getUpdateWordCategoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.UpdateWordCategoriesRequest,
              dictionary.v1.Dictionary.UpdateWordCategoriesResponse>(
                service, METHODID_UPDATE_WORD_CATEGORIES)))
        .addMethod(
          getRemoveExportedWordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.RemoveExportedWordsRequest,
              dictionary.v1.Dictionary.RemoveExportedWordsResponse>(
                service, METHODID_REMOVE_EXPORTED_WORDS)))
        .addMethod(
          getUploadImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.UploadImageRequest,
              dictionary.v1.Dictionary.UploadImageResponse>(
                service, METHODID_UPLOAD_IMAGE)))
        .addMethod(
          getGetImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetImageRequest,
              dictionary.v1.Dictionary.GetImageResponse>(
                service, METHODID_GET_IMAGE)))
        .addMethod(
          getUploadAudioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.UploadAudioRequest,
              dictionary.v1.Dictionary.UploadAudioResponse>(
                service, METHODID_UPLOAD_AUDIO)))
        .addMethod(
          getGetAudioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetAudioRequest,
              dictionary.v1.Dictionary.GetAudioResponse>(
                service, METHODID_GET_AUDIO)))
        .addMethod(
          getGetReviewQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetReviewQueueRequest,
              dictionary.v1.Dictionary.GetReviewQueueResponse>(
                service, METHODID_GET_REVIEW_QUEUE)))
        .addMethod(
          getSubmitReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.SubmitReviewRequest,
              dictionary.v1.Dictionary.SubmitReviewResponse>(
                service, METHODID_SUBMIT_REVIEW)))
        .addMethod(
          getAddReviewBonusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.AddReviewBonusRequest,
              dictionary.v1.Dictionary.AddReviewBonusResponse>(
                service, METHODID_ADD_REVIEW_BONUS)))
        .addMethod(
          getOptimizeReviewParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.OptimizeReviewParametersRequest,
              dictionary.v1.Dictionary.OptimizeReviewParametersResponse>(
                service, METHODID_OPTIMIZE_REVIEW_PARAMETERS)))
        .addMethod(
          getGetSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetSettingsRequest,
              dictionary.v1.Dictionary.GetSettingsResponse>(
                service, METHODID_GET_SETTINGS)))
        .addMethod(
          getUpdateSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.UpdateSettingsRequest,
              dictionary.v1.Dictionary.UpdateSettingsResponse>(
                service, METHODID_UPDATE_SETTINGS)))
        .addMethod(
          getGetUserQuotaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetUserQuotaRequest,
              dictionary.v1.Dictionary.GetUserQuotaResponse>(
                service, METHODID_GET_USER_QUOTA)))
        .addMethod(
          getSetUserQuotaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.SetUserQuotaRequest,
              dictionary.v1.Dictionary.SetUserQuotaResponse>(
                service, METHODID_SET_USER_QUOTA)))
        .addMethod(
          getRecalculateUserStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.RecalculateUserStorageRequest,
              dictionary.v1.Dictionary.RecalculateUserStorageResponse>(
                service, METHODID_RECALCULATE_USER_STORAGE)))
        .addMethod(
          getGetMyStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetMyStorageRequest,
              dictionary.v1.Dictionary.GetMyStorageResponse>(
                service, METHODID_GET_MY_STORAGE)))
        .addMethod(
          getGetMySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.GetMySettingsRequest,
              dictionary.v1.Dictionary.GetMySettingsResponse>(
                service, METHODID_GET_MY_SETTINGS)))
        .addMethod(
          getUpdateMySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dictionary.v1.Dictionary.UpdateMySettingsRequest,
              dictionary.v1.Dictionary.UpdateMySettingsResponse>(
                service, METHODID_UPDATE_MY_SETTINGS)))
        .build();
  }

  private static abstract class DictionaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DictionaryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dictionary.v1.Dictionary.getDescriptor();
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
              .addMethod(getListDictionariesMethod())
              .addMethod(getSaveWordMethod())
              .addMethod(getListSavedWordsMethod())
              .addMethod(getCheckSavedWordsMethod())
              .addMethod(getDeleteSavedWordMethod())
              .addMethod(getExportAnkiMethod())
              .addMethod(getCreateDeckLinkMethod())
              .addMethod(getStartExportMethod())
              .addMethod(getGetExportMethod())
              .addMethod(getCancelExportMethod())
              .addMethod(getCreateExportPartLinkMethod())
              .addMethod(getDownloadDeckMethod())
              .addMethod(getDownloadExportPartMethod())
              .addMethod(getListCategoriesMethod())
              .addMethod(getCreateCategoryMethod())
              .addMethod(getRenameCategoryMethod())
              .addMethod(getDeleteCategoryMethod())
              .addMethod(getUpdateWordCategoriesMethod())
              .addMethod(getRemoveExportedWordsMethod())
              .addMethod(getUploadImageMethod())
              .addMethod(getGetImageMethod())
              .addMethod(getUploadAudioMethod())
              .addMethod(getGetAudioMethod())
              .addMethod(getGetReviewQueueMethod())
              .addMethod(getSubmitReviewMethod())
              .addMethod(getAddReviewBonusMethod())
              .addMethod(getOptimizeReviewParametersMethod())
              .addMethod(getGetSettingsMethod())
              .addMethod(getUpdateSettingsMethod())
              .addMethod(getGetUserQuotaMethod())
              .addMethod(getSetUserQuotaMethod())
              .addMethod(getRecalculateUserStorageMethod())
              .addMethod(getGetMyStorageMethod())
              .addMethod(getGetMySettingsMethod())
              .addMethod(getUpdateMySettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
