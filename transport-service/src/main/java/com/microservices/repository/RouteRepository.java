package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.domain.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route,Integer>{

}
