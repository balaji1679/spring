package com.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductTable")
public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int pid;
	private String pname;
	private String brandname;
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, String brandname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.brandname = brandname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", brandname=" + brandname + ", price=" + price + "]";
	}

}
