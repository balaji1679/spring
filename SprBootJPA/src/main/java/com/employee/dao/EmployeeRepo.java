package com.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

}
