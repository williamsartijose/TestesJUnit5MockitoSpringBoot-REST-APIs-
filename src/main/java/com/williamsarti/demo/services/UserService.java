package com.williamsarti.demo.services;

import java.util.Collection;

import com.williamsarti.demo.domain.User;

public interface UserService {
	
	User findById(Integer id);

	Collection<User> findAll();

}
