package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private BCryptPasswordEncoder passwordEncoder;

	    // Find user by email
	    @Override
	    public Optional<User> findByEmail(String email) {
	        return userRepository.findByEmail(email);
	    }

	    // Find users by role (Admin, Mechanic, or User)
	    @Override
	    public List<User> findByRole(String role) {
	        return userRepository.findByRole(role);
	    }

	    // Register new user
	    @Override
	    public String registerUser(User user) {
	        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
	        if (existingUser.isPresent()) {
	            return "Email already taken";
	        }
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        userRepository.save(user);
	        return "User registered successfully";
	    }

}
