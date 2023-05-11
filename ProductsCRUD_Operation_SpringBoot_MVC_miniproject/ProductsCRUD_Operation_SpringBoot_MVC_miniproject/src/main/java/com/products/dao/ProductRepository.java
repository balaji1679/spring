package com.products.dao;


import org.springframework.data.repository.CrudRepository;

import com.products.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{
	public Product findById(int id);
}
