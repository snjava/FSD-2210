package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Task;
import com.company.repo.TaskRepo;

@RestController
public class TaskController {
	
	@Autowired
	private TaskRepo taskRepo;

	@PostMapping("/save-task")
	public String saveTask(@RequestBody Task task) {
		taskRepo.save(task);
		return "Task Created Successfully.....";
	}
	
	@PostMapping("/save-tasks")
	public String saveTasks(@RequestBody List<Task> task) {
		taskRepo.saveAll(task);
		return task.size() + " Task Created Successfully.....";
	}
	
	@GetMapping("/get-task")
	public Task getTaskForId(@RequestParam("id") int id) {
		System.out.println("============= Id : " + id);
		return taskRepo.getById(id);
	}
	
	
}











