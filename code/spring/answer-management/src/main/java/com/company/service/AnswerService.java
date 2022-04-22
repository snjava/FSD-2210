package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Answer;
import com.company.repo.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository repository;
	
	public Answer saveAnswer(Answer answer) {
		return repository.save(answer);
	}
	
	public List<Answer> getUserAnswer(int id) {
		return repository.getuserAnswers(id);
	}
}
