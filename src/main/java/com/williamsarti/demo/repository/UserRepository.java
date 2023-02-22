package com.williamsarti.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.williamsarti.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
