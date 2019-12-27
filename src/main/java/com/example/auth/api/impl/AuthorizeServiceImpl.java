package com.example.auth.api.impl;

import java.time.Instant;

import org.lognet.springboot.grpc.GRpcService;

import com.example.auth.api.generated.authorize.AuthorizeRequest;
import com.example.auth.api.generated.authorize.AuthorizeResponse;
import com.example.auth.api.generated.authorize.AuthorizeServiceGrpc.AuthorizeServiceImplBase;
import com.google.protobuf.Timestamp;

import io.grpc.stub.StreamObserver;

@GRpcService
public class AuthorizeServiceImpl extends AuthorizeServiceImplBase {
	@Override
	public void authorize(AuthorizeRequest request,
	        StreamObserver<AuthorizeResponse> responseObserver) {
		Instant instant = Instant.now();
		Timestamp now = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
		AuthorizeResponse reply = AuthorizeResponse.newBuilder().setAuthorized(true).setExpiredAt(now)
				.setToken("hoge").build();
		System.out.println(request);
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	    }
}
