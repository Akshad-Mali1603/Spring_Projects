package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MaintenanceBooking;

@Repository
public interface MaintenanceBookingRepository extends JpaRepository<MaintenanceBooking, Integer> {

	List<MaintenanceBooking> findByUserId(int userId);

	List<MaintenanceBooking> findByMechanicId(int mechanicId);

	List<MaintenanceBooking> findByStatus(String status);

}
