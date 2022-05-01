package com.exame.agenda.config;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exame.agenda.entities.Candidate;
import com.exame.agenda.repositories.CandidaterRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	@Autowired //O Spring resolve a dependencia e associa a CandidaterRepository
	private CandidaterRepository candidaterRepository;

	@Override
	public void run(String... args) throws Exception {
		// Quando o programa for iniciado...
		
		Candidate u1 = new Candidate(null, "Gil Soares", "gil@gmail.com", "988888888", "123456"); 
		Candidate u2 = new Candidate(null, "Jacque", "jacque@gmail.com", "977777777", "123456");
		
		candidaterRepository.saveAll(Arrays.asList(u1,u2));
		
		
	}

}
