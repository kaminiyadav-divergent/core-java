package com.divergent.assignment2;

import java.util.Scanner;

public class PermutationOfString {
	public void permutation(String str, int left, int right) {
		{
			if (left == right)
				System.out.println(str);
			else {
				for (int i = left; i <= right; i++) {
					str = swap(str, left, i);
					permutation(str, left + 1, right);
					str = swap(str, left, 
							
							i);
				}
			}
		}

	}

	public String swap(String s, int i, int j) {
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			int n = str.length();
			PermutationOfString permutation = new PermutationOfString();
			permutation.permutation(str, 0, n - 1);
		}
	}
}
