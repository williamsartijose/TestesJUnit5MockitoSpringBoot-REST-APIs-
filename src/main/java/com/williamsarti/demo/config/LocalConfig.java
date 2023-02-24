package com.williamsarti.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.williamsarti.demo.domain.User;
import com.williamsarti.demo.repository.UserRepository;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "William", "william@mail.com", "123");
        User u2 = new User(null, "Mateus", "tormes@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}