package com.hibernate.webapp.controller;

import com.hibernate.webapp.entity.User;
import com.hibernate.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUser (@PathVariable int id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(user1 -> new ResponseEntity<>(user1, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestParam String name,
                                        @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        User response = userRepository.save(user);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
