package com.example.auth.api.impl;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.api.generated.authenticate.AuthenticationRequest;
import com.example.auth.api.generated.authenticate.AuthenticationResponse;
import com.example.auth.api.generated.authenticate.AuthenticationServiceGrpc;
import com.example.auth.api.generated.authorize.AuthorizeRequest;
import com.example.auth.api.generated.authorize.AuthorizeResponse;
import com.example.auth.api.generated.authorize.AuthorizeServiceGrpc;
import com.example.auth.api.generated.authorize.AuthorizeServiceGrpc.AuthorizeServiceBlockingStub;
import com.google.protobuf.Timestamp;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@RestController
public class AuthClient {

    @GetMapping("/grpc")
    public String Hello() {
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

    	AuthenticationServiceGrpc.AuthenticationServiceBlockingStub stub = AuthenticationServiceGrpc.newBlockingStub(channel);

    	AuthenticationRequest req = AuthenticationRequest.newBuilder().setPassword("Hello").setUsername("123").build();

    	AuthenticationResponse reply = stub.authenticate(req);

        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochSecond(reply.getExpiredAt().getSeconds()), ZoneId.systemDefault());
        System.out.println(ldt);
        return "hoge!";
    }

    @GetMapping("/grpc2")
    public String Hello2() {
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

    	AuthorizeServiceBlockingStub stub = AuthorizeServiceGrpc.newBlockingStub(channel);

    	Instant instant = Instant.now();
		Timestamp now = Timestamp.newBuilder().setSeconds(instant.getEpochSecond()).build();
    	AuthorizeRequest req = AuthorizeRequest.newBuilder().setToken("Hello").setExpiredAt(now).build();

    	AuthorizeResponse reply = stub.authorize(req);
    	System.out.println(reply);
        return "hoge2!";
    }

    @GetMapping("/hoge")
    public String Hoge() {
    	return "hoge";
    }


}
