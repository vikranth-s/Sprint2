package com.cg.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.cpg.DTO.Product;



public interface ProductDaoI {

	public void create(Product product);
	public List reterive();
	public Product findById(String i);
}
