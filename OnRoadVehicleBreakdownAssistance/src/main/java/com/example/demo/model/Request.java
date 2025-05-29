package com.example.demo.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int userId;
	private String issueType; // "Engine failure", "Flat tire", etc.
	private double latitude;
	private double longitude;
	private String status; // "Pending", "Assigned", "On the way", "Resolved"
	private Timestamp createdAt;
	private Integer assignedMechanicId; // Nullable

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(int id, int userId, String issueType, double latitude, double longitude, String status,
			Timestamp createdAt, Integer assignedMechanicId) {
		super();
		this.id = id;
		this.userId = userId;
		this.issueType = issueType;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
		this.createdAt = createdAt;
		this.assignedMechanicId = assignedMechanicId;
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

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getAssignedMechanicId() {
		return assignedMechanicId;
	}

	public void setAssignedMechanicId(Integer assignedMechanicId) {
		this.assignedMechanicId = assignedMechanicId;
	}

}
