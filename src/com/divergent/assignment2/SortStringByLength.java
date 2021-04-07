package com.divergent.assignment2;

import java.util.Scanner;

public class SortStringByLength {

	static void sort(String[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			String word = arr[i];
			int in = i - 1;
			while (in >= 0 && word.length() < arr[in].length()) {
				arr[in + 1] = arr[in];
				in--;
			}
			arr[in + 1] = word;
		}
	}

	// Function to print the sorted array of string
	static void printArraystring(String str[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
	}

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = (String) sc.nextLine();
			String[] arr = str.split(" ");
			int arrLen = arr.length;
			sort(arr);

			for (int i = 0; i < arrLen; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
