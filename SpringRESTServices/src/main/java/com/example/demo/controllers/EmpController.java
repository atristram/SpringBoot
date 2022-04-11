package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmpRepo;

@RestController
public class EmpController {

	@Autowired
	EmpRepo repo;
	
	@GetMapping(path="/employee" , produces= {"application/xml"})
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}
	
	@GetMapping("/employee/{eid}")
	public Optional<Employee> getEmployeeById(@PathVariable("eid") int id){
		return repo.findById(id);
	}
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee e){
		if(repo.existsById(e.getEid())) 
			return "Sorry, Employee alread exists";
			
			repo.save(e);
			return "Employee added successfully";
		}
	
	@PutMapping("/employee")
	public String putEmployee(@RequestBody Employee e){
		if(!repo.existsById(e.getEid())) 
			return "Sorry, Employee record not found";
			
			repo.save(e);
			return "Employee updated successfully";
		}
	
	@DeleteMapping("/employee/{id}")
	public String removeEmployee(@PathVariable int id){
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Successfully removed the record";

		}
			
			return "Employee record not found";
		}
	}

