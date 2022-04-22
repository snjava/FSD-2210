package com.company.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.User;
import com.company.reposity.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository; 
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	public List<User> getAllUser() {
		return repository.findAll();
	}
	
	public User getUserById(int id) {
		return repository.findById(id).get();
	}
	
}
