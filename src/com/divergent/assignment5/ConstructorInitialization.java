package com.divergent.assignment5;

public class ConstructorInitialization {
	String name;
	int id;

	public ConstructorInitialization(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		ConstructorInitialization cons = new ConstructorInitialization(11, "sajana");
		System.out.println("ID : " + cons.id);
		System.out.println("NAME : " + cons.name);

	}

}
