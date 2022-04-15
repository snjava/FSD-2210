package org.institute.controller;

import java.util.List;

import org.institute.entity.Product;
import org.institute.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		repository.save(product);
		return "Product Save Successfully...";
	}
	
	@GetMapping("/get-product")
	public List<Product> getAllProduct() {
		return repository.findAll();
	}
	
}
