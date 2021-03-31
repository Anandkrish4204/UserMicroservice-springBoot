package com.grocery.user.service;

import com.grocery.user.entity.User;
import com.grocery.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getUserByUsername(String userName) {
        return userRepository.findUserByUsername(userName);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
