package com.demo.ex2;

public class OverloadDemo {

	public void add() {
		System.out.println("Add() with no arguments..");
	}

	public int add(int a, int b) {
		System.out.println("Add(int,int) with no arguments..");
		return a + b;
	}

	public int add(int a, int b, int c) {
		System.out.println("Add(int,int,int) with no arguments..");
		return a + b + c;
	}

	/*
	 * public float add(float a, int b) {
	 * System.out.println("Add(float,int) with no arguments.."); return a + b; }
	 */

	public double add(double a, double b) {
		System.out.println("Add(double,double) with no arguments..");
		return a + b;
	}

	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		od.add();
		od.add(2, 4);
		od.add(2.2f, 2);
		od.add(2.0, 5.0);

	}

}
