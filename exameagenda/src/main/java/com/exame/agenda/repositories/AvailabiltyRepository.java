package com.exame.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exame.agenda.entities.Availability;

public interface AvailabiltyRepository extends JpaRepository<Availability, Long>{

}
