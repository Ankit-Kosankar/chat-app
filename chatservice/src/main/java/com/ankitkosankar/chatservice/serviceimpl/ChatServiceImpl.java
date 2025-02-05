package com.ankitkosankar.chatservice.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ankitkosankar.chatservice.model.Message;
import com.ankitkosankar.chatservice.model.User;
import com.ankitkosankar.chatservice.repository.ChatRepository;
import com.ankitkosankar.chatservice.repository.UserRepository;
import com.ankitkosankar.chatservice.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService {

	private final ChatRepository chatRepository;
    private final UserRepository userRepository;

    public ChatServiceImpl(ChatRepository chatRepository, UserRepository userRepository) {
        this.chatRepository = chatRepository;
        this.userRepository = userRepository;
    }

    public Message sendMessage(Long senderId, Long recipientId, String content) {
        User sender = userRepository.findById(senderId)
                .orElseThrow(() -> new IllegalArgumentException("Sender not found"));
        User recipient = userRepository.findById(recipientId)
                .orElseThrow(() -> new IllegalArgumentException("Recipient not found"));

        Message message = new Message();
        message.setSender(sender);
        message.setRecipient(recipient);
        message.setContent(content);
        message.setTimestamp(LocalDateTime.now());

        return chatRepository.save(message);
    }

    public List<Message> getConversations(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return chatRepository.findBySenderOrRecipient(user, user);
    }

    public List<Message> getConversationWithUser(Long userId, Long recipientId) {
        User sender = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Sender not found"));
        User recipient = userRepository.findById(recipientId)
                .orElseThrow(() -> new IllegalArgumentException("Recipient not found"));

        return chatRepository.findBySenderAndRecipient(sender, recipient);
    }
	
}
