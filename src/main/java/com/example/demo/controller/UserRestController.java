package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.user;

@RestController
public class UserRestController {

	private Map<Integer, user> dataMap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody user use) {
		System.out.println(use);
		dataMap.put(use.getId(), use);
		System.out.println(dataMap);
		return new ResponseEntity<String>("User Saved", HttpStatus.CREATED);
	}

}