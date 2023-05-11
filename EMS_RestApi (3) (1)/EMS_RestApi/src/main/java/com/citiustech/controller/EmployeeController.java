package com.citiustech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citiustech.dao.EmployeeDao;
import com.citiustech.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao empDao;
	
	@GetMapping("/display")
	public List<Employee> displayAll()
	{
		List<Employee> emplist = empDao.findAll();
		return emplist;
	}
	
	
	@GetMapping("/byId/{id}")
	public Optional<Employee> findById(@PathVariable("id") int empId)
	{
		Optional<Employee> emp = empDao.findById(empId);
		return emp;
	}
	
	
	@PostMapping("/insert")
	public Employee insert(@RequestBody Employee employee)
	{
		empDao.save(employee);
		return employee;
	}
	
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int empId )
	{
		Employee emp = empDao.getById(empId);
		String empName = emp.getEmpName();
		empDao.delete(emp);
		return (empName + " Deleted from the record");
	}
	
	@PutMapping(path = "/update", consumes = "application/json")
	public Employee update(@RequestBody Employee emp)
	{
		empDao.save(emp);
		return emp;
	}
}
