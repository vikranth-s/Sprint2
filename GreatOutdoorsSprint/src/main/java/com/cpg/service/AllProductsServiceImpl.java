package com.cpg.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cg.dao.AllProductsDaoI;
import com.cpg.DTO.Product;

@Service
public class AllProductsServiceImpl implements AllProductsServiceI {
    
	@Autowired 
	AllProductsDaoI allproductdao;

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		allproductdao.create(product);
	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		return allproductdao.reterive();
	}

	@Override
	public Product findById(String i) {
		// TODO Auto-generated method stub
		return allproductdao.findById(i);
	}
	
	

}