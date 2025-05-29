package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Mechanic;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Integer> {

    Optional<Mechanic> findByEmail(String email);

	List<Mechanic> findByServiceType(String serviceType);

}
