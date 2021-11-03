package com.syntax.group.project;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */
		int numbers[][] = { { 15, 44, 3, 48 }, { 6, 17, 23, 56, 10 }, { 8, 14, 16 } };
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					evenSum += numbers[i][j];
				} else if (numbers[i][j] % 2 != 0) {
					oddSum += numbers[i][j];
				}
			}
		}
		System.out.println("The sum of even numbers in array is " + evenSum);
		System.out.println("The sum of odd numbers in array is " + oddSum);
		System.out.println("___________________________________________");
		evenSum = 0;
		oddSum = 0;
		for (int[] num : numbers) {
			for (int n : num) {
				if (n % 2 == 0) {
					evenSum += n;
				} else if (n % 2 != 0) {
					oddSum += n;
				}
			}

		}

		System.out.println("The sum of even numbers in array by " + evenSum);
		System.out.println("The sum of odd numbers in array is " + oddSum);

	}
}
