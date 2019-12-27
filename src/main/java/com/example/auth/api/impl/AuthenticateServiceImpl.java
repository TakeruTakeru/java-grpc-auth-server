package com.example.auth.api.impl;

import java.time.Instant;
import java.util.List;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.auth.api.generated.authenticate.AuthenticationRequest;
import com.example.auth.api.generated.authenticate.AuthenticationResponse;
import com.example.auth.api.generated.authenticate.AuthenticationServiceGrpc;
import com.example.auth.data.model.Users;
import com.example.auth.data.repo.UserDao;
import com.google.protobuf.Timestamp;

import io.grpc.stub.StreamObserver;

@GRpcService
public class AuthenticateServiceImpl extends AuthenticationServiceGrpc.AuthenticationServiceImplBase {
	@Autowired
	UserDao userDaoRepository;

	@Override
	public void authenticate(AuthenticationRequest request,
			StreamObserver<AuthenticationResponse> responseObserver) {
		AuthenticationResponse reply;

		List<Users>res = userDaoRepository.findAll();
		System.out.println(res);
		Instant instant = Instant.now();
		Timestamp now = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
		String username = request.getUsername();
		String password = request.getPassword();
		if (username.equals("takeru") && password.equals("123")) {
			reply = AuthenticationResponse.newBuilder().setAuthorized(true).setExpiredAt(now)
					.setToken("ok").build();
		} else {
			reply = AuthenticationResponse.newBuilder().setAuthorized(false).setExpiredAt(now)
					.setToken("hoge").build();
		}

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
