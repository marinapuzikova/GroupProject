package com.syntax.group.project;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		int numbers[][] = { { 15, 44, 3, 48 }, { 6, 17, 23, 56, 10 } };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];

			}

		}
		System.out.println("The sum of numbers in 2D array is " + sum);
		System.out.println("___________________________________");
		sum = 0;
		for (int[] num : numbers) {
			for (int n : num) {
				sum += n;
			}
		}
		System.out.println("The sum of numbers in 2D array is " + sum);
		
	}
}