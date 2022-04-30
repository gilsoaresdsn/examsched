package com.exame.agenda.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exame.agenda.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User usr = new User("Gil Soares", "gilsoares@dsn", "9999999", "12345");
		
		return ResponseEntity.ok().body(usr);
		
	}
}
