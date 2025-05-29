package com.example.demo.services;

import java.util.Optional;

import com.example.demo.model.User;

public interface AdminService {

	Optional<User> findByEmail(String email);
    String registerAdmin(User admin);
}
