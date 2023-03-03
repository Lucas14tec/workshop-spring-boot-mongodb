package com.alves.restful.services;

import com.alves.restful.domain.User;
import com.alves.restful.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findALL(){
        return repo.findAll();
    }
}
