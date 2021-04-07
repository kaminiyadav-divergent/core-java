package com.divergent.assignment5;

import java.util.Scanner;

public class FinalMethodInstance {
	int id = getId();
	String name = getName();
	static Scanner sc = new Scanner(System.in);

	private static final int getId() {
		System.out.println("Enter the Id");
		return sc.nextInt();

	}

	private static final String getName() {
		System.out.println("Enter the name : ");
		return sc.next();
	}

	public void display() {
		System.out.println("View Name and Value: ");
		System.out.println(this.id);
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		FinalMethodInstance ins = new FinalMethodInstance();
		ins.display();

	}
}
