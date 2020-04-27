  
package com.cpg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AddressDaoI;
import com.cpg.DTO.Address;
@Service
public class AddressServiceImpl implements AddressServiceI {
 
	@Autowired
	AddressDaoI addressdao;
	
	@Override
	public void create(Address address) {
		// TODO Auto-generated method stub
		addressdao.create(address);

	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		return addressdao.reterive();
	}

	@Override
	public Address findById(int i) {
		// TODO Auto-generated method stub
		return addressdao.findById(i);
	}
}