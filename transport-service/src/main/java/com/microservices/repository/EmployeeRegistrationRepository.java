package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.domain.EmployeeRegistration;

@Repository
public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeRegistration,Integer> {

}
