package com.citiustech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citiustech.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	//Employee findById(int empId);
}
