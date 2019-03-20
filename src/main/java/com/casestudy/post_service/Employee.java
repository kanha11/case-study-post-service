package com.casestudy.post_service;

public class Employee {
	private int employeeId;
	private String email;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String email) {
		super();
		this.employeeId = employeeId;
		this.email = email;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
