package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {

	Optional<User> findByEmail(String email);

	List<User> findByRole(String role);

	String registerUser(User user);
}
