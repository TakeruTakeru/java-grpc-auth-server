package com.example.auth.api.impl;

import java.time.Instant;

import org.lognet.springboot.grpc.GRpcService;

import com.example.auth.api.generated.AuthenticationRequest;
import com.example.auth.api.generated.AuthenticationResponse;
import com.example.auth.api.generated.AuthenticationServiceGrpc;
import com.google.protobuf.Timestamp;

import io.grpc.stub.StreamObserver;

@GRpcService
public class AuthServiceImpl extends AuthenticationServiceGrpc.AuthenticationServiceImplBase {

	@Override
	public void authenticate(AuthenticationRequest request,
			StreamObserver<AuthenticationResponse> responseObserver) {
		Instant instant = Instant.now();

		Timestamp now = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
		AuthenticationResponse reply = AuthenticationResponse.newBuilder().setAuthorized(true).setExpiredAt(now)
				.setToken("hoge").build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void resetToken(AuthenticationRequest request,
			StreamObserver<AuthenticationResponse> responseObserver) {
		Timestamp now = Timestamp.getDefaultInstance();
		AuthenticationResponse reply = AuthenticationResponse.newBuilder().setAuthorized(true).setExpiredAt(now)
				.setToken("hoge").build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

}
