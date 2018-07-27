package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.domain.Stop;

@Repository
public interface StopRepository extends JpaRepository<Stop,Integer>{

	
}
