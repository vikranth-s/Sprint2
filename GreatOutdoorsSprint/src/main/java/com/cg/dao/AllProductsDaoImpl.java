package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.cpg.DTO.Product;
@Repository
@Transactional
public class AllProductsDaoImpl implements AllProductsDaoI {
    @PersistenceContext
    EntityManager entitymanager;
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
       entitymanager.persist(product);
       System.out.println("Product inserted in ALLPRODUCT Table");
	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		String str="SELECT allproducts FROM AllProducts allproducts";
		TypedQuery<Product> query=entitymanager.createQuery(str,Product.class);
		return query.getResultList();
		
	}

	@Override
	public Product findById(String id) {
		// TODO Auto-generated method stub
		return entitymanager.find(Product.class, id);
	}

	

}