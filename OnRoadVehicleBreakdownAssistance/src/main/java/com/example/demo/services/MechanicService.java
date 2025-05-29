package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Mechanic;

public interface MechanicService {

	Optional<Mechanic> findByEmail(String email);

	List<Mechanic> findByServiceType(String serviceType);

	String registerMechanic(Mechanic mechanic);
}
