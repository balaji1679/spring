package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.ems.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@RequestMapping("/display")
	public ModelAndView display()
	{
		String url = "http://localhost:8080/display";
		Employee[] emparr = restTemplate.getForObject(url, Employee[].class);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("emparr", emparr);
		mv.setViewName("display");
		return mv;
	}
	
	
	@RequestMapping("/search")
	public String search()
	{
		return "search";
	}
	
	@RequestMapping("/searchToEdit")
	public ModelAndView searchEmployee(@RequestParam int empId)
	{
		String url = "http://localhost:8080/byId/"+empId;
		
		Employee emp = restTemplate.getForObject(url, Employee.class);
		System.out.println(emp);
		
		ModelAndView mv = new ModelAndView();
		
		if(emp!=null)
		{
			mv.addObject("employee", emp);
			mv.setViewName("search");
		}
		else {
			String errmsg = "No record found!";
			mv.addObject("errMsg", errmsg);
			mv.setViewName("search");
		}
		
		return mv;
	}
	
	@RequestMapping("/edit")	
	public ModelAndView edit(@RequestParam("empId") int empId, @RequestParam("empName") String empName,
			@RequestParam("phone") long phone, @RequestParam("dept") String dept)
	{
		String url = "http://localhost:8080/update/";
		Employee emp = new Employee(empId, empName, phone, dept);
		
		restTemplate.put(url, emp);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", emp);
		mv.addObject("editSuccessMsg", "Record Updated Successfully!");
		mv.setViewName("result");
		return mv;
	}
	
	

	@RequestMapping("/delete")
	public String delete()
	{
		return "delete";
	}
		
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmp(@RequestParam int empId)
	{
		String url = "http://localhost:8080/delete/"+empId;
		
		ModelAndView mv = new ModelAndView();

		try {
			
			restTemplate.delete(url);
			mv.addObject("deleteSuccessMsg", "Record Deleted Successfully!");
		}
		catch(Exception e)
		{
			mv.addObject("errMsg", "No record found");

		}
		
		mv.setViewName("delete");
				
		return mv;
	}	
	
	
	
	@RequestMapping("/")
	public String insert()
	{
		return "insert";
	}
	
	@RequestMapping("/insertEmployee")
	public ModelAndView insertEmployee(@RequestParam("empName") String empName,
			@RequestParam("phone") long phone, @RequestParam("dept") String dept)
	{
		Employee emp = new Employee();
		emp.setEmpName(empName);
		emp.setPhone(phone);
		emp.setDept(dept);
		
		String url = "http://localhost:8080/insert/";
		restTemplate.postForObject(url, emp, Employee.class);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("successMsg", "Record Inserted Successfully!");
		mv.setViewName("insert");
		return mv;
	}
}
