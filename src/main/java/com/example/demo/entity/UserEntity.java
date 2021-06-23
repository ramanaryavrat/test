package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UserEntity {
   
	@JsonInclude(Include.NON_NULL)
	private String name;
	
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public UserEntity(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserEntity(String age) {
		super();
		this.age = age;
		
	}
	
}
