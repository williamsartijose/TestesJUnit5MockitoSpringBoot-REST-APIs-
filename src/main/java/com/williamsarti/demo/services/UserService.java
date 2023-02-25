package com.williamsarti.demo.services;

import java.util.List;

import com.williamsarti.demo.domain.User;
import com.williamsarti.demo.domain.dto.UserDTO;

public interface UserService {
	
	User findById(Integer id);

	 List<User> findAll();
	 User create(UserDTO obj);

}
