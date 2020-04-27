package com.cpg.service;

import java.util.List;

import com.cpg.DTO.Address;

public interface AddressServiceI {
	public void create(Address address);
	public List reterive();
	public Address findById(int i);
}