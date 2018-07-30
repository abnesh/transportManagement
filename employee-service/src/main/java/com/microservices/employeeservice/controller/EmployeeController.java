package com.microservices.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.employeeservice.model.Employee;
import com.microservices.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id){
		return employeeService.findById(id);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.findAllEmployee();
	}
	
}
