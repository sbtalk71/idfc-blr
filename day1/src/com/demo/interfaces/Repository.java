package com.demo.interfaces;

public interface Repository {

	String repoVer="1.0.0";
	
	String save(String s);
	String find(int id);
	
	default String[] findAll() {
		doIt();
		throw new IllegalArgumentException("To be implemented");
	}
	
	public static void mystaticMethod() {
		System.out.println("static method in interface");
	}
	
	private void doIt() {
		System.out.println("private method");
	}
	
}
