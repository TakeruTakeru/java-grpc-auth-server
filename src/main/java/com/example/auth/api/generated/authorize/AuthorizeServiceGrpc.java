package com.example.auth.api.generated.authorize;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: authorize.proto")
public final class AuthorizeServiceGrpc {

  private AuthorizeServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthorizeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.auth.api.generated.authorize.AuthorizeRequest,
      com.example.auth.api.generated.authorize.AuthorizeResponse> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorize",
      requestType = com.example.auth.api.generated.authorize.AuthorizeRequest.class,
      responseType = com.example.auth.api.generated.authorize.AuthorizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.auth.api.generated.authorize.AuthorizeRequest,
      com.example.auth.api.generated.authorize.AuthorizeResponse> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<com.example.auth.api.generated.authorize.AuthorizeRequest, com.example.auth.api.generated.authorize.AuthorizeResponse> getAuthorizeMethod;
    if ((getAuthorizeMethod = AuthorizeServiceGrpc.getAuthorizeMethod) == null) {
      synchronized (AuthorizeServiceGrpc.class) {
        if ((getAuthorizeMethod = AuthorizeServiceGrpc.getAuthorizeMethod) == null) {
          AuthorizeServiceGrpc.getAuthorizeMethod = getAuthorizeMethod = 
              io.grpc.MethodDescriptor.<com.example.auth.api.generated.authorize.AuthorizeRequest, com.example.auth.api.generated.authorize.AuthorizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthorizeService", "Authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.auth.api.generated.authorize.AuthorizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.auth.api.generated.authorize.AuthorizeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthorizeServiceMethodDescriptorSupplier("Authorize"))
                  .build();
          }
        }
     }
     return getAuthorizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizeServiceStub newStub(io.grpc.Channel channel) {
    return new AuthorizeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorizeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorizeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthorizeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authorize(com.example.auth.api.generated.authorize.AuthorizeRequest request,
        io.grpc.stub.StreamObserver<com.example.auth.api.generated.authorize.AuthorizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.auth.api.generated.authorize.AuthorizeRequest,
                com.example.auth.api.generated.authorize.AuthorizeResponse>(
                  this, METHODID_AUTHORIZE)))
          .build();
    }
  }

  /**
   */
  public static final class AuthorizeServiceStub extends io.grpc.stub.AbstractStub<AuthorizeServiceStub> {
    private AuthorizeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizeServiceStub(channel, callOptions);
    }

    /**
     */
    public void authorize(com.example.auth.api.generated.authorize.AuthorizeRequest request,
        io.grpc.stub.StreamObserver<com.example.auth.api.generated.authorize.AuthorizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthorizeServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthorizeServiceBlockingStub> {
    private AuthorizeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.auth.api.generated.authorize.AuthorizeResponse authorize(com.example.auth.api.generated.authorize.AuthorizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthorizeServiceFutureStub extends io.grpc.stub.AbstractStub<AuthorizeServiceFutureStub> {
    private AuthorizeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.auth.api.generated.authorize.AuthorizeResponse> authorize(
        com.example.auth.api.generated.authorize.AuthorizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorizeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((com.example.auth.api.generated.authorize.AuthorizeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.auth.api.generated.authorize.AuthorizeResponse>) responseObserver);
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

  private static abstract class AuthorizeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.auth.api.generated.authorize.Authorizer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthorizeService");
    }
  }

  private static final class AuthorizeServiceFileDescriptorSupplier
      extends AuthorizeServiceBaseDescriptorSupplier {
    AuthorizeServiceFileDescriptorSupplier() {}
  }

  private static final class AuthorizeServiceMethodDescriptorSupplier
      extends AuthorizeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthorizeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizeServiceFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
