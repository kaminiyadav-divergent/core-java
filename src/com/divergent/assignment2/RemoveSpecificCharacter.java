package com.divergent.assignment2;

import java.util.Scanner;

public class RemoveSpecificCharacter {
	

	/**
	 * 
	 * @param word
	 * @param removeWord
	 * @return
	 */

	private static String removeSpecificChar(String word, String removeWord) {

		String returnStr = "";

		word = word.toLowerCase(); // ignore the case
		removeWord = removeWord.toLowerCase(); // ignore the case

		for (int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);
			int index = removeWord.indexOf(c);

			if (index == -1) {
				returnStr += c;
			}
		}

		return returnStr;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String originalstring = sc.nextLine();
			System.out.println("please Enter unwantes characters as a String");
			String removechar = sc.nextLine();
			String output = removeSpecificChar(originalstring, removechar);
			System.out.println("Output is: " + output);
		}

	}
}
