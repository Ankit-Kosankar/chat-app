package com.ankitkosankar.chatservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	public ResponseEntity<?> getUsers()
	{
		
		return ResponseEntity.ok(null);
		
	}
	
}
