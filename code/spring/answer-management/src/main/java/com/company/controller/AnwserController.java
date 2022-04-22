package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Answer;
import com.company.service.AnswerService;

@RestController
public class AnwserController {

	@Autowired
	private AnswerService service;
	
	@PostMapping("/save-answer")
	public Answer save(@RequestBody Answer ans) {
		return service.saveAnswer(ans);
	}
	
	@GetMapping("/get-user-answer")
	public List<Answer> getUser(@RequestParam("id") int id) {
		return service.getUserAnswer(id);
	}
}
