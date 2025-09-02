package com.tims.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.tims.model.users;
import com.tims.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<users> getAllUsers() {
        return userRepository.findAll();
    }
}
