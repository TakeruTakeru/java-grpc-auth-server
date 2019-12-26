package com.example.auth.api.generated;

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
    comments = "Source: authentication.proto")
public final class AuthenticationServiceGrpc {

  private AuthenticationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.auth.AuthenticationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.auth.api.generated.AuthenticationRequest,
      com.example.auth.api.generated.AuthenticationResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = com.example.auth.api.generated.AuthenticationRequest.class,
      responseType = com.example.auth.api.generated.AuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.auth.api.generated.AuthenticationRequest,
      com.example.auth.api.generated.AuthenticationResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.example.auth.api.generated.AuthenticationRequest, com.example.auth.api.generated.AuthenticationResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthenticationServiceGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getAuthenticateMethod = AuthenticationServiceGrpc.getAuthenticateMethod) == null) {
          AuthenticationServiceGrpc.getAuthenticateMethod = getAuthenticateMethod = 
              io.grpc.MethodDescriptor.<com.example.auth.api.generated.AuthenticationRequest, com.example.auth.api.generated.AuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.auth.AuthenticationService", "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.auth.api.generated.AuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.auth.api.generated.AuthenticationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("Authenticate"))
                  .build();
          }
        }
     }
     return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.auth.api.generated.AuthenticationRequest,
      com.example.auth.api.generated.AuthenticationResponse> getResetTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetToken",
      requestType = com.example.auth.api.generated.AuthenticationRequest.class,
      responseType = com.example.auth.api.generated.AuthenticationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.auth.api.generated.AuthenticationRequest,
      com.example.auth.api.generated.AuthenticationResponse> getResetTokenMethod() {
    io.grpc.MethodDescriptor<com.example.auth.api.generated.AuthenticationRequest, com.example.auth.api.generated.AuthenticationResponse> getResetTokenMethod;
    if ((getResetTokenMethod = AuthenticationServiceGrpc.getResetTokenMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getResetTokenMethod = AuthenticationServiceGrpc.getResetTokenMethod) == null) {
          AuthenticationServiceGrpc.getResetTokenMethod = getResetTokenMethod = 
              io.grpc.MethodDescriptor.<com.example.auth.api.generated.AuthenticationRequest, com.example.auth.api.generated.AuthenticationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.auth.AuthenticationService", "ResetToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.auth.api.generated.AuthenticationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.auth.api.generated.AuthenticationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("ResetToken"))
                  .build();
          }
        }
     }
     return getResetTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationServiceStub newStub(io.grpc.Channel channel) {
    return new AuthenticationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthenticationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthenticationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthenticationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authenticate(com.example.auth.api.generated.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.example.auth.api.generated.AuthenticationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void resetToken(com.example.auth.api.generated.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.example.auth.api.generated.AuthenticationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.auth.api.generated.AuthenticationRequest,
                com.example.auth.api.generated.AuthenticationResponse>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            getResetTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.auth.api.generated.AuthenticationRequest,
                com.example.auth.api.generated.AuthenticationResponse>(
                  this, METHODID_RESET_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class AuthenticationServiceStub extends io.grpc.stub.AbstractStub<AuthenticationServiceStub> {
    private AuthenticationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceStub(channel, callOptions);
    }

    /**
     */
    public void authenticate(com.example.auth.api.generated.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.example.auth.api.generated.AuthenticationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetToken(com.example.auth.api.generated.AuthenticationRequest request,
        io.grpc.stub.StreamObserver<com.example.auth.api.generated.AuthenticationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthenticationServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthenticationServiceBlockingStub> {
    private AuthenticationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.auth.api.generated.AuthenticationResponse authenticate(com.example.auth.api.generated.AuthenticationRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.auth.api.generated.AuthenticationResponse resetToken(com.example.auth.api.generated.AuthenticationRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthenticationServiceFutureStub extends io.grpc.stub.AbstractStub<AuthenticationServiceFutureStub> {
    private AuthenticationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.auth.api.generated.AuthenticationResponse> authenticate(
        com.example.auth.api.generated.AuthenticationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.auth.api.generated.AuthenticationResponse> resetToken(
        com.example.auth.api.generated.AuthenticationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;
  private static final int METHODID_RESET_TOKEN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthenticationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthenticationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((com.example.auth.api.generated.AuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.example.auth.api.generated.AuthenticationResponse>) responseObserver);
          break;
        case METHODID_RESET_TOKEN:
          serviceImpl.resetToken((com.example.auth.api.generated.AuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<com.example.auth.api.generated.AuthenticationResponse>) responseObserver);
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

  private static abstract class AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.auth.api.generated.AuthClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthenticationService");
    }
  }

  private static final class AuthenticationServiceFileDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier {
    AuthenticationServiceFileDescriptorSupplier() {}
  }

  private static final class AuthenticationServiceMethodDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthenticationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthenticationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationServiceFileDescriptorSupplier())
              .addMethod(getAuthenticateMethod())
              .addMethod(getResetTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
