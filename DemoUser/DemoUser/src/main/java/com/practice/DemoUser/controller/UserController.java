package com.practice.DemoUser.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practice.DemoUser.entities.User;
import com.practice.DemoUser.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/* @GetMapping("/home")
	 public String home() {
		 return "this is home!!";
	 }*/

	// get all users 	
	@GetMapping
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
	
	// get single user
	@GetMapping("/{userId}")
	public Optional<User> getUser(@PathVariable String userId) {
		return this.userService.getUser(Long.parseLong(userId));
	}
	
	// create or save a new user
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	// update or edit user
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	
	// delete user 
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable String userId) {
	    this.userService.deleteUser(Long.parseLong(userId));
	}	

}
