package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {

    List<Request> findByUserId(int userId);

    List<Request> findByAssignedMechanicId(int mechanicId);

    List<Request> findByStatus(String status);

}