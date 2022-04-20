package com.compnay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compnay.entity.AddressDetails;
import com.compnay.repository.AddressDetailsRepository;

@CrossOrigin(origins = "localhost:4200") // Angular application can consume the Rest API
@RestController
@RequestMapping("/address")
public class AddressDetailsController {

	@Autowired
	private AddressDetailsRepository repo; 
	
	@PostMapping("/save")
	public String save(@RequestBody AddressDetails addressDetails) {
		repo.save(addressDetails);
		return "Adderss Save Successfully";
	}
	
}
