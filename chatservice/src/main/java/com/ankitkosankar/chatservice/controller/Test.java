package com.ankitkosankar.chatservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

	@GetMapping("/test")
	public ResponseEntity<?> test()
	{
		Map<String,Object> map = new HashMap<>();
		map.put("info", "Chat Service is Working ");
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	
}
