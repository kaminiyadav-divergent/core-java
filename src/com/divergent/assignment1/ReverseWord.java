package com.divergent.assignment1;

import java.util.*;
import java.util.Scanner;
/**
 * 
 * @author Dell
 *
 */
public class ReverseWord {
	
	/**
	 * 
	 * @param str 
	 */
	//Reverse individual word of a String
	public static void reverseWord(String str) {
		
		//Using Stack 
		Stack<Character> st = new Stack<Character>();
		
		// Traverse given String and push all
		//the characters to stack until we see a space
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				st.push(str.charAt(i));
			
			//When we see a space, we print content of stack
			else {
				while (st.empty() == false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		
		//There may not be space after last word
		while (st.empty() == false) {
			System.out.print(st.pop());
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the string : ");

		// Take a input
		try (Scanner sc = new Scanner(System.in)) {

			// Assign the value into str
			String str = sc.nextLine();

			reverseWord(str);

		}
	}
}
