package com.exame.agenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.exame.agenda.repositories.CandidaterRepository;

import com.exame.agenda.entities.Candidate;

@Service //Registro de servico no mecanismo de injecao de independencia
public class CandidateServices {
	@Autowired
	private CandidaterRepository repository;
	
	//Camada de servico para implemento do findAll
	public List<Candidate> findAll(){
		return repository.findAll();
	}
	
	public Candidate findById(Long id) {
		Optional<Candidate> obj = repository.findById(id);
		return obj.get();
	}
	
	
	

}
