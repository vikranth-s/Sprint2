package com.cpg.service;

import java.util.List;

import com.cpg.DTO.User;

public interface UserServiceI {
	public void create(User user);
	public List reterive();
	public User findById(String id);
	
}