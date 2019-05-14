package com.phincon.spice.model;

import java.util.Date;

public class Employee {

	private Long id;
	
	private String name;
	
	private String email;
	
	private Date dateOfBirth;
	
	private int remainingDaysOff;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getRemainingDaysOff() {
		return remainingDaysOff;
	}

	public void setRemainingDaysOff(int remainingDaysOff) {
		this.remainingDaysOff = remainingDaysOff;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
