package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cpg.DTO.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDaoI{
      @PersistenceContext
      EntityManager em;
      @Autowired
      UserDaoI userdao;
      @Autowired
      AllProductsDaoI allproduct;
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		em.persist(product);
		
	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(String i) {
		// TODO Auto-generated method stub
		return null;
	}
}
