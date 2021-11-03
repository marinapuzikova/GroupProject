package com.syntax.group.project;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */
		int numbers[][] = { { 15, 44, 3, 48 }, { 6, 17, 23, 56, 10 }, { 8, 3, 5 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j] + " ");

				}
			}
		}
		System.out.println();
		System.out.println("___________________________________");
		for (int[] num : numbers) {
			for (int n : num) {
				if (n % 2 == 0) {
					System.out.print(n + " ");
				}
			}
		}
	}
}
