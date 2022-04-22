package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.User;
import com.company.serivce.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save-user")
	public User save(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@GetMapping("/get-all-users")
	public List<User> getAll() {
		return service.getAllUser();
	}

	@GetMapping("/get-user")
	public User getUser(@RequestParam("id") int id) {
		return service.getUserById(id);
	}
	
	
}
