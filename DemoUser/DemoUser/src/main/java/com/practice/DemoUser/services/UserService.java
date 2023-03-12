package com.practice.DemoUser.services;

import java.util.List;
import java.util.Optional;

import com.practice.DemoUser.entities.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public Optional<User> getUser(long userId);

    public User saveUser(User user);
    
    public User updateUser(User user);
    
    public void deleteUser(long parseLong);
    
}
