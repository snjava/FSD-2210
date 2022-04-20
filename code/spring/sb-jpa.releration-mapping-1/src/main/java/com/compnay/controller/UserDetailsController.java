package com.compnay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compnay.entity.UserDetails;
import com.compnay.repository.UserDetailsRepository;

@RestController
@RequestMapping("/user")
public class UserDetailsController {
	
	@Autowired
	private UserDetailsRepository repo;

	@PostMapping("/save")
	public String saveUser(@RequestBody UserDetails user) {
		repo.save(user);
		return "User Save Successfully...";
	}
	
	
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDetails user) {
		repo.save(user);
		return "User Update Successfully...";
	}
	
}
