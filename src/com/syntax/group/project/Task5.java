package com.syntax.group.project;

public class Task5 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print
		// capital for each country.
		// (use 2 different loops).

		String[][] CountryCapitals = { { "Russia", "USA", "Italy", "Canada", "France" },
				{ "Moscow", "Washinghton", "Rome", "Toronto", "Paris" }, };

		for (int i = 0; i < CountryCapitals.length / 2; i++) {
			for (int j = 0; j < CountryCapitals[i].length; j++) {
				System.out.println(CountryCapitals[i][j] + " - " + CountryCapitals[i + 1][j]);
			}
		}
		System.out.println("*************************************");
		int i = 0;
		int j = 0;
		while (i < CountryCapitals.length / 2) {
			while (j < CountryCapitals[i].length) {
				System.out.println(CountryCapitals[i][j] + " - " + CountryCapitals[i + 1][j]);
				j++;
			}
			i++;
		}

	}

}
