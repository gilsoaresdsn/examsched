package com.exame.agenda.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exame.agenda.entities.Candidate;
import com.exame.agenda.services.CandidateServices;


@RestController
@RequestMapping(value = "/candidates") //Mapeamento para http://localhost:8080/candidates
public class CandidateResource {
	
	@Autowired  //injeta automaticamente
	private CandidateServices service;

	@GetMapping
	public ResponseEntity<List<Candidate>> findAll(){
		
		//Candidate usr = new Candidate(1L, "Gil Soares", "gilsoares@dsn", "9999999", "12345");
		
		List<Candidate> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
	}
	
	//informa que a requisicao utilizara um ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Candidate> findById(@PathVariable Long id) {
		Candidate obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
}
