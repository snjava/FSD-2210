package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Contact;
import com.company.repository.ContactRepository;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactRepository repository;
	
	@PostMapping("/save") // /contact/save
	public Contact save(@RequestBody Contact contact) {
		return repository.save(contact);
	}
	
	@PutMapping("/update") // /contact/update
	public Contact update(@RequestBody Contact contact) {
		return repository.save(contact);
	}
	
	@DeleteMapping("/delete/{id}") // /contact/delete/4
	public String delete(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "Record Deleted SUccessfully";
	}
	
	@GetMapping("/get-all") // /contact/get-all
	public List<Contact> getAll() {
		return repository.findAll();
	}
	
	
}
