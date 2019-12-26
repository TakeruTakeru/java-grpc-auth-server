package com.example.auth.api.impl;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.api.generated.AuthenticationRequest;
import com.example.auth.api.generated.AuthenticationResponse;
import com.example.auth.api.generated.AuthenticationServiceGrpc;

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

    @GetMapping("/hoge")
    public String Hoge() {
    	return "hoge";
    }


}
