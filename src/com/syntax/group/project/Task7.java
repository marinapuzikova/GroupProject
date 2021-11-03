package com.syntax.group.project;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not? 
		 * A prime number is a number that is divisible by only two numbers: 1 and itself.
		 */

		int num = 48;
		boolean condition = false;
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) { // condition for non-prime number
				condition = true;
				break;
			}
		}

		if (!condition)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
