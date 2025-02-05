package com.ankitkosankar.chatservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankitkosankar.chatservice.model.Message;
import com.ankitkosankar.chatservice.model.User;

@Repository
public interface ChatRepository extends JpaRepository<Message, Long>{

	List<Message> findBySenderOrRecipient(User sender, User recipient);

    List<Message> findBySenderAndRecipient(User sender, User recipient);
	
}
