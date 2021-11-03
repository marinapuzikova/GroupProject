package com.syntax.group.project;

public class Task6 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable

		int x = 4, y = 8;
		System.out.println("Before Swapping: x= " + x + " and y= " + y);
		// Code to swap 'x' and 'y'
		x = x * y; // x now becomes 32
		y = x / y; // y becomes 4
		x = x / y; // x becomes 8
		System.out.println("After Swapping: x= " + x + " and y= " + y);
	}

}
