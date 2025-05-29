package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

    List<Offer> findByMechanicId(int mechanicId);

}