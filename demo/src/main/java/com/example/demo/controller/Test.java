package com.example.demo.controller;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;

@RestController
public class Test {
	
	@RequestMapping("/test")
	@GET
	public Student test() {
		return new Student();
	}

}
