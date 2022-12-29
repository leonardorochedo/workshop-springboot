package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired // tem que ter uma notation de @Componnent ou @Service se for service ou @Repository
	private ProductService service;
	
	@GetMapping // endpoint /users
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list); // 200 OK, mandando pro body
	}
	
	@GetMapping(value = "/{id}") // endpoint /users/id
	public ResponseEntity<Product> findById(@PathVariable Long id) { // pegando variaveis do path
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
