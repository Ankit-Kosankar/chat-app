package com.ankitkosankar.chatservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "message")
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
