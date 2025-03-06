package com.demo.ex3;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee(100, "Robin", 45000);
		
		System.out.println(emp.getDetails());
		
		TraineeEmployee te= new TraineeEmployee(102, "Kiran", 25000, "good");
		
		System.out.println(te.getDetails());
		
		
		Person p1= new Employee(1,"A",90);
		System.out.println(p1.getDetails());
		
		p1=new TraineeEmployee(2, "B", 10, "excellent");
		
		System.out.println(p1.getDetails());
		
		
		//Employee emp2=(Employee)p1;

	}

}
