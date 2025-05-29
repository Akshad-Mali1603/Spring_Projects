package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mechanic;
import com.example.demo.repository.MechanicRepository;

@Service
public class MechanicServiceImpl implements MechanicService {
	@Autowired
	private MechanicRepository mechanicRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	// Find mechanic by email
	@Override
	public Optional<Mechanic> findByEmail(String email) {
		return mechanicRepository.findByEmail(email);
	}

	// Find mechanics by service type (e.g., "Car", "Two-wheeler")
	@Override
	public List<Mechanic> findByServiceType(String serviceType) {
		return mechanicRepository.findByServiceType(serviceType);
	}

	// Register a new mechanic
	@Override
	public String registerMechanic(Mechanic mechanic) {
		Optional<Mechanic> existingMechanic = mechanicRepository.findByEmail(mechanic.getEmail());
		if (existingMechanic.isPresent()) {
			return "Email already taken";
		}
		mechanic.setPassword(passwordEncoder.encode(mechanic.getPassword()));
		mechanicRepository.save(mechanic);
		return "Mechanic registered successfully";
	}

}
