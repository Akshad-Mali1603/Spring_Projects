package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "offers")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int mechanicId;
	private String title;
	private String description;
	private double price;
	private LocalDate availableDate;
	private String timeSlot; // "10:00 AM - 12:00 PM"

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offer(int id, int mechanicId, String title, String description, double price, LocalDate availableDate,
			String timeSlot) {
		super();
		this.id = id;
		this.mechanicId = mechanicId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.availableDate = availableDate;
		this.timeSlot = timeSlot;
	}

	public int getId() {
		return id;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(LocalDate availableDate) {
		this.availableDate = availableDate;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

}
