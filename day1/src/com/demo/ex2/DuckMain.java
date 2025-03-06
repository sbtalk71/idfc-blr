package com.demo.ex2;

public class DuckMain {

	public static void main(String[] args) {

		Duck d1 = new Duck("mini");
		Duck d2 = new Duck("Johny");
		Duck d3 = new Duck("Sinni");
		Duck d4 = new Duck("tony");
		Duck d5 = new Duck("piku");

		System.out.println(Duck.duckCount);
		Duck.myStaticMethod();

	}

}
