package com.ankitkosankar.userservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


	@GetMapping
	public ResponseEntity<?> test()
	{
		Map<String,Object> map = new HashMap<>();
		map.put("info", "This is the Test API Call");
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
    
}