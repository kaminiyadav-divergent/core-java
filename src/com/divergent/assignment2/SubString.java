package com.divergent.assignment2;

import java.util.Scanner;

public class SubString {
	/**
	 * 
	 * @param str final string
	 * @param str1 it will be a string which we wants to find it contains or not
	 */
	public static void subString(String str, String str1) {
		
		// Check if str1 is present in str
		//using indexOf
		int result = str.indexOf(str1);
		if(result == -1) {
			System.out.println("Not Present"+str);
		}
		else {
			System.out.println("Substring is present"+str1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("Enter the substring which you want to find");
			String str1 = sc.nextLine();
			subString(str, str1);
		}
	}
}
