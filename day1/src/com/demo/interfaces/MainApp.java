package com.demo.interfaces;

public class MainApp {

	public static void main(String[] args) {
		Repository repository=new OracleDB();
		
		System.out.println(repository.save("Tiger"));
		System.out.println(repository.find(123));
		//repository.findAll();
		
		Repository.mystaticMethod();
		

	}

}
