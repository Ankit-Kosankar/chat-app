package com.ankitkosankar.chatservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class Message {

	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "sender_id")
	    private User sender;

	    @ManyToOne
	    @JoinColumn(name = "recipient_id")
	    private User recipient;

	    private String content;

	    private LocalDateTime timestamp;
	
}
