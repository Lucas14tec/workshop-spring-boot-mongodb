package com.alves.restful.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alves.restful.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        String lucas = "lucas";
        User maria = new User("1" , "Maria Silva" , "maria@gmaiç.com");
        User alex = new User("2" , "Alex Green" , "alex@gmaiç.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }
}
