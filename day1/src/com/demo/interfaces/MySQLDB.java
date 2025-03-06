package com.demo.interfaces;

public class MySQLDB implements Repository{

	@Override
	public String save(String s) {
		
		return "MYSQL: Saved with Data "+s;
	}

	@Override
	public String find(int id) {
		
		return "MYSQL: Found Data for "+id;
	}

}
