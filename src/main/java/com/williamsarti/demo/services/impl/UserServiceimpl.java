package com.williamsarti.demo.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamsarti.demo.domain.User;
import com.williamsarti.demo.repository.UserRepository;
import com.williamsarti.demo.services.UserService;
import com.williamsarti.demo.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceimpl  implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public User findById(Integer id) {
		Optional<User> obj  = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	


}
