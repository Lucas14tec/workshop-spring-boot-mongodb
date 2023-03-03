package com.alves.restful.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alves.restful.domain.User;
import com.alves.restful.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        String lucas = "lucas";
        List<User> list = service.findALL();
        return ResponseEntity.ok().body(list);
    }
}
