package com.syntax.group.project;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?


		int[] array = { 48, 54, 133, 487, 88, 653 };
		int size = array.length;
		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max1) {
				max1 = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max2 && array[i] < max1) {
				max2 = array[i];
			}
		}

		System.out.println("The Largest number in the array is " + max1);
		System.out.println("The Second Largest number in the array is " + max2);
	}

}
