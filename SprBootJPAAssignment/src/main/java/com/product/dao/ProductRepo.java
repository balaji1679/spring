package com.product.dao;

import org.springframework.data.repository.CrudRepository;

import com.product.model.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{
	

}
