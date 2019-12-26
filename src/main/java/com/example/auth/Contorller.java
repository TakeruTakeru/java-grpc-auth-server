package com.example.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Contorller {

	@RestController
	@RequestMapping("api")
	public class WebApiController {

	    @RequestMapping("hello")
	    private String hello() {
	        return "SpringBoot!";
	    }

	}
}
