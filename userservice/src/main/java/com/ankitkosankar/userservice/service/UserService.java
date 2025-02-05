package com.ankitkosankar.userservice.service;

import java.util.List;

import com.ankitkosankar.userservice.model.User;

public interface UserService {

	User createUser(User user);

	List<User> getAllUsers();

}
