package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.Mechanic;
import com.example.demo.model.User;
import com.example.demo.repository.MechanicRepository;
import com.example.demo.repository.UserRepository;

public class AuthService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MechanicRepository mechanicRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	// Login method for User/Mechanic/Admin
	public String login(String email, String password) {
		Optional<User> user = userRepository.findByEmail(email);
		if (user.isPresent()) {
			if (passwordEncoder.matches(password, user.get().getPassword())) {
				return "Login successful as " + user.get().getRole();
			} else {
				return "Invalid password for " + user.get().getRole();
			}
		}

		Optional<Mechanic> mechanic = mechanicRepository.findByEmail(email);
		if (mechanic.isPresent()) {
			if (passwordEncoder.matches(password, mechanic.get().getPassword())) {
				return "Login successful as Mechanic";
			} else {
				return "Invalid password for Mechanic";
			}
		}

		return "Email not registered";
	}
}
