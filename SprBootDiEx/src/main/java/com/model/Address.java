package com.model;

import org.springframework.stereotype.Component;

@Component("add")

public class Address {

	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void getEmpAdr() {
		System.out.println("virat is from banglore");
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}
