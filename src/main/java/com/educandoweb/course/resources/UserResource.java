package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired // tem que ter uma notation de @Componnent ou @Service se for service ou @Repository
	private UserService service;
	
	@GetMapping // endpoint /users
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list); // 200 OK, mandando pro body
	}
	
	@GetMapping(value = "/{id}") // endpoint /users/id
	public ResponseEntity<User> findById(@PathVariable Long id) { // pegando variaveis do path
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
