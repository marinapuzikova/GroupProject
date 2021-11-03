package com.syntax.group.project;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner and calculate the sum of all
		 * stored elements in that array.
		 */

		// Scanner class object to read input
		Scanner scan = new Scanner(System.in);

		// declare variables
		int size = 0; // size of array
		double[] array = null;
		double sum = 0.0;

		// read number of elements
		System.out.print("How many numbers in your array: ");
		size = scan.nextInt();
		// declare array
		array = new double[size];

		// initializing array
		System.out.println("Enter " + array.length + " numbers:");
		for (int i = 0; i < array.length; i++) {
			// read input
			array[i] = scan.nextDouble();
			sum += array[i];
		}

		System.out.println("The sum of numbers in array is " + sum); // display sum value
	}
}