package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.company.entity.Task;
import com.company.repo.TaskRepo;

@SpringBootApplication
public class SbJpa2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbJpa2Application.class, args);
		
		TaskRepo repo = ctx.getBean(TaskRepo.class);
		Task task = repo.getById(3);
		
		
		System.out.println(task.getId());
		System.out.println(task.getTitle());
		System.out.println(task.getDescription());
		System.out.println(task.getStatus());
		System.out.println(task.getUid());
		
	}

}
