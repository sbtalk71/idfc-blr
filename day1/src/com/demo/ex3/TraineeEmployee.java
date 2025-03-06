package com.demo.ex3;

public class TraineeEmployee extends Employee {
	private String performance;

	public TraineeEmployee(int id, String name, double salary, String performance) {
		super(id, name, salary);
		this.performance = performance;

	}

	@Override
	public String getDetails() {

		return super.getDetails() + " " + this.performance;
	}

}
