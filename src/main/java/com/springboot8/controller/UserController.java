package com.springboot8.controller;



import org.springframework.web.bind.annotation.*;

import com.springboot8.demo.User;


@RestController
public class UserController {

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return "User received: " + user.getFirstName();
    }
}


/*

*/