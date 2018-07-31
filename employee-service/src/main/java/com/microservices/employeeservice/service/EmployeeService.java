package com.microservices.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.employeeservice.model.Employee;
import com.microservices.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	EmployeeService(){}

	public Employee findById(int id){
		return employeeRepository.findById(id).get();
	}

	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		if(employeeRepository.findById(employee.getId()).isPresent())
			return employeeRepository.findById(employee.getId()).get();
		else
			return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
		if(employeeRepository.findById(employee.getId()).isPresent())
			return employeeRepository.save(employee);
		else
			return null;
	} 
	
	public void deleteEmployee(int id) {
		if(employeeRepository.findById(id).isPresent())
			employeeRepository.deleteById(id);
	}
}
