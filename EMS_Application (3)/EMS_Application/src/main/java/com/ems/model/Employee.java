package com.ems.model;

public class Employee {

	private int empId;
	private String empName;
	private long phone;
	private String dept;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Employee(int empId, String empName, long phone, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phone = phone;
		this.dept = dept;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phone=" + phone + ", dept=" + dept + "]";
	}
	
}
