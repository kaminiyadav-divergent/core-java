package com.divergent.assignment5;

public class InstanceInitialization {
	String name = "Kamini";
	int id = 12;

	public static void main(String[] args) {
		InstanceInitialization instance = new InstanceInitialization();
		System.out.println(instance.id);
		System.out.println(instance.name);
	}

}
