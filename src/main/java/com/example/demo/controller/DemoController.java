package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;

@RestController
public class DemoController {


	@GetMapping("/")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/user")
	public UserEntity hello1() {
		return new UserEntity(null,"As");
	}
	@GetMapping("/demouser")
	public UserEntity hello2() {
		return new UserEntity("As");
	}
	
}
