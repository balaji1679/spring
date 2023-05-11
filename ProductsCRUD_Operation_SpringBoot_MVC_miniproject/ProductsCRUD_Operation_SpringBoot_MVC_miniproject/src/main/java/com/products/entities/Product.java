package com.products.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Details_Project")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_Id;
	private String product_Name;
	private String product_Description;
	private String product_Brand;
	private double product_Price;
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}
	public double getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(double product_Price) {
		this.product_Price = product_Price;
	}
	public String getProduct_Brand() {
		return product_Brand;
	}
	public void setProduct_Brand(String product_Brand) {
		this.product_Brand = product_Brand;
	}
	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Description="
				+ product_Description + ", product_Brand=" + product_Brand + ", product_Price=" + product_Price + "]";
	}
	public Product(int product_Id, String product_Name, String product_Description, String product_Brand,
			double product_Price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Description = product_Description;
		this.product_Brand = product_Brand;
		this.product_Price = product_Price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



}
