package com.microservices.employeeservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.employeeservice.model.Employee;
import com.microservices.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	private List<Employee> empList = new ArrayList<>();
	
	EmployeeService(){
		Employee e1 = new Employee(101,"Employee101","emp1@gmail.com","employee.1",'M',9999912345L);
		Employee e2 = new Employee(102,"Employee102","emp2@gmail.com","employee.2",'M',9999912345L);
		Employee e3 = new Employee(103,"Employee103","emp3@gmail.com","employee.3",'F',9999912345L);
		Employee e4 = new Employee(104,"Employee104","emp4@gmail.com","employee.4",'F',9999912345L);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
	}
	
	public Employee getById(int id) {
		Optional<Employee> emp = empList.stream()
				.filter((e)-> e.getId() == id)
				.findFirst();
		
		if(emp.isPresent())
			return emp.get();
		else
			return null;
	}

	public Employee findById(int id){
		return employeeRepository.findById(id);
	}
}
