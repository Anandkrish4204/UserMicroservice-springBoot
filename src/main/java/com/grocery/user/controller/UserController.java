package com.grocery.user.controller;

import com.grocery.user.entity.User;
import com.grocery.user.service.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user", produces = "application/json", consumes = "application/json")
public class UserController {

    @Autowired
    private UserRepositoryService userRepositoryService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userRepositoryService.save(user);
    }

    @GetMapping("/{userName}")
    public User fetchUserById(@PathVariable String userName){
        return userRepositoryService.getUserByUsername(userName);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepositoryService.getAllUsers();
    }

}
