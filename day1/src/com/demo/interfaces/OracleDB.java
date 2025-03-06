package com.demo.interfaces;

public class OracleDB implements Repository{

	@Override
	public String save(String s) {
		
		return "Oracle: Saved with Data "+s;
	}

	@Override
	public String find(int id) {
		
		return "Oracle: Found Data for "+id;
	}

}
