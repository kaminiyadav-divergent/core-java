package com.divergent.assignment2;

import java.util.Scanner;
public class RemoveSpaces {

	public void removeSpace(){
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println(str);
			
			//for eliminate leading and
			//trailing spaces of string
			System.out.println(str.trim());
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveSpaces rm = new RemoveSpaces();
		rm.removeSpace();
	}
}
