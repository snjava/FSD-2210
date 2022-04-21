package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.User;
import com.company.repo.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo userRepo;

	@PostMapping("/save-user")
	public String saveUser(@RequestBody User user) {
		userRepo.save(user);
		return "User Created Successfully.....";
	}
	
	@PostMapping("/save-many-users")
	public String saveManyUsers(@RequestBody List<User> user) {
		userRepo.saveAll(user);
		return "User Created Successfully.....";
	}
	
}
