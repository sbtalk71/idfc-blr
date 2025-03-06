package com.demo.ex2;

public class Box {
	private int length;
	private int breadth;
	private int height;
	private String color;

	public Box(int length, int breadth, int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	public Box(int length, int breadth, int height,String color) {
		this(length,breadth, height);
		this.color=color;
	}
	
	public double getVolume() {
		return length * breadth * height;
	}

	public String getColor() {
		return this.color;
	}
}
