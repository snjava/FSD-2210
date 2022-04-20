package com.compnay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.compnay.entity.UserDetails;
import com.compnay.repository.UserDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		UserDetailsRepository repo = ctx.getBean("userRepo", UserDetailsRepository.class);
		
		UserDetails user = new UserDetails();
		user.setId(2);
		user.setName("Xyz");
		
		repo.save(user);
		
	}

}
