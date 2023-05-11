package com.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="PersonDetails")

public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PersonId")
	private int Pid;
	@Column(name="PersonName")
	private String Pname;
	@Column(name="Vehiclename")
	private String Vname;
	@Column(name="PersonContactNum")
	private Long Pcon;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public Long getPcon() {
		return Pcon;
	}
	public void setPcon(Long pcon) {
		Pcon = pcon;
	}
	public Person(int pid, String pname, String vname, Long pcon) {
		super();
		Pid = pid;
		Pname = pname;
		Vname = vname;
		Pcon = pcon;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [Pid=" + Pid + ", Pname=" + Pname + ", Vname=" + Vname + ", Pcon=" + Pcon + "]";
	}
	
}
