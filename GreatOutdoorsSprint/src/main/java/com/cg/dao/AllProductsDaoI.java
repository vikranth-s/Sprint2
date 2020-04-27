package com.cg.dao;

import java.util.List;

import com.cpg.DTO.Product;
public interface AllProductsDaoI {
	public void create(Product product);
	public List reterive();
	public Product findById(String id);
}