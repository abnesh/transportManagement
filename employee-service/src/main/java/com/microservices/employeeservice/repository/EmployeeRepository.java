package com.microservices.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.employeeservice.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	public Employee findById(int id);
}
