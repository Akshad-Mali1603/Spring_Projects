package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance_bookings")
public class MaintenanceBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int userId;
	private int offerId;
	private int mechanicId;
	private LocalDate bookingDate;
	private String status; // "Scheduled", "Completed", "Cancelled"

	public MaintenanceBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaintenanceBooking(int id, int userId, int offerId, int mechanicId, LocalDate bookingDate, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.offerId = offerId;
		this.mechanicId = mechanicId;
		this.bookingDate = bookingDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
