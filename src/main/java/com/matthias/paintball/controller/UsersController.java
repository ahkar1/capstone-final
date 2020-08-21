package com.matthias.paintball.controller;

import java.util.Optional;

import com.matthias.paintball.dao.UserRepository;
import com.matthias.paintball.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class UsersController {
    @Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;
    
    @GetMapping("/api/users")
	public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
    }

    @GetMapping("/api/user/{id}")
    Optional<User> gun(@PathVariable int id) {

        return userRepository.findById(id);
    }
/*
	 * Post activity Endpoint
	 */
	@PostMapping("/api/users")
	User postactivity(@RequestBody User user) {
		return userRepository.save(user);
    }
    
    @DeleteMapping("/api/user/{id}")
    void deleteGun(@PathVariable int id) {
        userRepository.deleteById(id);
    }
}