package com.divergent.assignment5;

public class ConstructorChaining {
	// These is constructor one
	// Default constructor will call another
	// constructor using this keyword from same class
	ConstructorChaining() {
		// call constructor 2
		this(7);
		System.out.println("These is Default constructor");

	}

	ConstructorChaining(int a) {
		// call constructor 3
		this(4, 6);
		System.out.println(a);
	}

	ConstructorChaining(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {

		// invokes default constructor first
		new ConstructorChaining();

	}

}
