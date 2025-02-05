package com.ankitkosankar.userservice.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ankitkosankar.userservice.model.User;
import com.ankitkosankar.userservice.repo.UserServiceRepository;
import com.ankitkosankar.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	UserServiceRepository userServiceRepo;
	
	public UserServiceImpl(UserServiceRepository userServiceRepo) {
		super();
		this.userServiceRepo = userServiceRepo;
	}

	@Override
	public User createUser(User user) {
		
		return null;
	}

	@Override
	public List<User> getAllUsers()
	{
		return userServiceRepo.findAll();
	}

}
