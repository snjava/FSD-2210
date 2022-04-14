package org.institute.controller;

import java.util.List;

import org.institute.bean.Contact;
import org.institute.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactRepository repository;

	//===========Get Data Using Request Body JSON=================
	@PostMapping("/save")
	public String saveContact(@RequestBody Contact contact) {
		int value = repository.saveContact(contact);
		if (value > 0) {
			return "Contact Ceated Successfully";
		} else {
			return "Contact Creation Failed";
		}	
	}

	@PutMapping("/update")
	public String updateContact(@RequestBody Contact contact) {
		int value = repository.updateContact(contact);
		if (value > 0) {
			return "Contact updated Successfully";
		} else {
			return "Contact updation Failed";
		}
	}

	//=========Get Data Using request Parameter=================
	@DeleteMapping("/delete") // delete?id=1
	public String deleteContact(@RequestParam("id") int id) {
		int value = repository.deleteContact(id);
		if (value > 0) {
			return "Contact Deleted Successfully";
		} else {
			return "Contact Deletion Failed";
		}
	}
	
	//=========Get Data Using path variable=================
	@DeleteMapping("/delete/{id}") // delete/3
	public String deleteContactByVariable(@PathVariable("id") int id) {
		int value = repository.deleteContact(id);
		if (value > 0) {
			return "Contact Deleted Successfully";
		} else {
			return "Contact Deletion Failed";
		}
	}

	@GetMapping("/get-contact-list")
	public List getAllContactList() {
		return repository.getAllContactByList();
	}
	  
	
	@GetMapping("/get-all-contact")
	public List<Contact> getAllContact() {
	  return repository.getAllContact();
	}
	
	 

}
