package com.williamsarti.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamsarti.demo.domain.User;
import com.williamsarti.demo.domain.dto.UserDTO;
import com.williamsarti.demo.repository.UserRepository;
import com.williamsarti.demo.services.UserService;
import com.williamsarti.demo.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceimpl  implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Autowired
    private ModelMapper mapper;
	
	@Override
	public User findById(Integer id) {
		Optional<User> obj  = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	@Override
    public User create(UserDTO obj) {
        return repository.save(mapper.map(obj, User.class));
    }

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
