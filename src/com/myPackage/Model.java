package com.myPackage;

public class Model {
	String name1;
	String name2;

	// contructor
	public Model(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

}
