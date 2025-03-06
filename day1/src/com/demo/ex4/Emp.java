package com.demo.ex4;

import java.util.Objects;

public class Emp {
	private int empId;
	private String empName;
	private double salary;

	private Emp() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empId == other.empId;
	}

	/*
	 * public Emp(int empId, String empName, double salary) { this.empId = empId;
	 * this.empName = empName; this.salary = salary; }
	 */

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return this.empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
