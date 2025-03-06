package com.demo.ex2;

public class Duck {

	public static int duckCount = 0;

	String duckName;

	public Duck(String duckName) {
		this.duckName = duckName;
		duckCount++;
	}
	
	static {
		System.out.println("Ststic block executes..");
	}
	
	public static void myStaticMethod() {
		System.out.println("Static method..");
	}
}
