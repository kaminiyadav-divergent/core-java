package com.divergent.assignment5;

public class SaticBlock {
	static String s = " ";
	static {
		s = "Hello I am Static Block";
	}

	public static void main(String[] args) {

		System.out.println("The value for s is :" + s);
	}

}
