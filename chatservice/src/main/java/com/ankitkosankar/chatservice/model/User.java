package com.ankitkosankar.chatservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="user")
@Entity
public class User {

	@Id
 	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
}
