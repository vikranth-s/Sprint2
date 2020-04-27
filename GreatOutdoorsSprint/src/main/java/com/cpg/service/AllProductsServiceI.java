  
package com.cpg.service;

import java.util.List;

import com.cpg.DTO.Product;


public interface AllProductsServiceI {
	public void create(Product product);
	public List reterive();
	public Product findById(String id);
}