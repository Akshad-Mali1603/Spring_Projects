package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder; // Import PasswordEncoder
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Inject PasswordEncoder, not SecurityConfig

    // Find admin by email
    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Register new admin (set role as ADMIN)
    @Override
    public String registerAdmin(User admin) {
        Optional<User> existingAdmin = userRepository.findByEmail(admin.getEmail());
        if (existingAdmin.isPresent()) {
            return "Email already taken";
        }
        admin.setRole("ADMIN");
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));  // Use BCrypt to encode password
        userRepository.save(admin);
        return "Admin registered successfully";
    }
}
