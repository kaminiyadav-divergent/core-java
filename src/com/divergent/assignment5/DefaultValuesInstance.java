package com.divergent.assignment5;

public class DefaultValuesInstance {
	int varInt;
	float varFloat;
	boolean varBoolean;
	long varLong;
	short varShort;
	double varDouble;
	char varChar;
	String varString;

	public static void main(String[] args) {
		DefaultValuesInstance value = new DefaultValuesInstance();
		System.out.println("Default int value: " + value.varInt);
		System.out.println("Default flaot value: " + value.varFloat);
		System.out.println("Default Double value: " + value.varDouble);
		System.out.println("Default character value: " + value.varChar);
		System.out.println("Default Boolean value: " + value.varBoolean);
		System.out.println("Default Long value: " + value.varLong);
		System.out.println("Default String value: " + value.varString);
	}
}
