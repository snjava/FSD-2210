package com.company.serivce;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.converter.AnswerCoverter;
import com.company.entity.Answer;
import com.company.entity.User;
import com.company.entity.UserAnswer;
import com.company.reposity.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private AnswerCoverter coverter;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	public List<User> getAllUser() {
		return repository.findAll();
	}
	
	public User getUserById(int id) {
		return repository.findById(id).get();
	}
	
	
	public UserAnswer getUserAnswer(int id) {
		UserAnswer userAns = new UserAnswer();
		
		User user = repository.findById(id).get();
		userAns.setUser(user);
		
		//restTemplate.postForEntity(null, user, null)
		//restTemplate.put(null, user);
		//restTemplate.delete(null);
		
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/get-user-answer?id="+id, List.class);
		List<LinkedHashMap<String, String>> responseAnswer = response.getBody();
		
		userAns.setAnswers(coverter.convertAnswerList(responseAnswer));
		
		return userAns;
	}
	
	
	
	
	
	
	
	
	
}
