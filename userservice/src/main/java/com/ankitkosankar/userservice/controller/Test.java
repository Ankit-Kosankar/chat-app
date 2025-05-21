package com.ankitkosankar.userservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Test {


	@GetMapping("/test")
	public ResponseEntity<?> test()
	{
		Map<String,Object> map = new HashMap<>();
		map.put("info", "User Service Working ...");
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
    
}