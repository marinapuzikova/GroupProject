package com.syntax.group.project;

public class Task9 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int[] array = { 25, 57, 146, -89, 88, 605 };
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Max number in array= " + max);
		System.out.println("Min number in array= " + min);
	}

}
