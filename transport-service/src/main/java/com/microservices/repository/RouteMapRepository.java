package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.domain.RouteMap;

@Repository
public interface RouteMapRepository extends JpaRepository<RouteMap, String>{

}
