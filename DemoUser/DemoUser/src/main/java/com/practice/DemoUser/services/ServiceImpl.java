package com.practice.DemoUser.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.practice.DemoUser.entities.User;
import com.practice.DemoUser.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements UserService {
	
	@Autowired
	 private UserRepository userRepository;

	@Override
	public List<User> getUsers() {		
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(long userId) {
		return userRepository.findById(userId);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(long parseLong) {
		User one = userRepository.getOne(parseLong);
		userRepository.delete(one);
	}

}
