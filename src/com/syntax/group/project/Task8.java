package com.syntax.group.project;

public class Task8 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series
		int a = 10;
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println("The first 10 numbers of Fibonacci series:");
		for (int i = 1; i <= a; i++) {
			System.out.print(firstNumber + " ");
			int nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}

}
