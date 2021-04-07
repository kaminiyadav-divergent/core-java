package com.divergent.assignment2;

import java.util.Scanner;

public class ConcateGivenString {
	/**
	 * 
	 * @param str input string
	 * @param n is a number for how ,any strings we wants to concatinate
	 */
	public static void concateString(String str, int n) {
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < n; i++) {
			
			//It is used to append the given string in a present String
			st.append(str);
		}
		System.out.println("New String: " + st.toString());
	}
	/**
	 * 
	 * @param srgs
	 */
	public static void main(String[] srgs) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the string: ");
			String s = in.nextLine();
			System.out.println("Enter value for n: ");
			int n = in.nextInt();
			concateString(s, n);

		}
	}
}
