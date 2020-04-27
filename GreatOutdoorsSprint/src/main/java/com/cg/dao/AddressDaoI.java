package com.cg.dao;
import java.util.List;

import com.cpg.DTO.Address;
public interface AddressDaoI {

		public void createAddress(Address address);
		public void create(Address address);
		public List reterive();
		public Address findById(int i);

	}

