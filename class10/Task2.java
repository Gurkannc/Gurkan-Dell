package class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	/*
	 * Create an array of countries. While retrieving all values from an array print capital for each country. 
	 * (use 2 different loops)	
	 */
		
		
			String[] countries = { "Afghanistan", "Tajikistan", "USA", "Japan" };

			String capital = " ";

			for (int i = 0; i < countries.length; i++) {

			switch(countries[i]) {

			case "Afghanistan":
			capital="Kabul";
			break;
			case "Tajikistan":
			capital="Dushanbe";
			break;
			case "USA":
			capital="DC";
			break;
			case "Japan":
			capital="Tokyo";
			break;
			}

			System.out.println("The country of " + countries[i] + " is " + capital);
			}

			System.out.println(" -------  ANOTHER WAY -------");

			capital = " ";

			for (String country : countries) {

			if (country.equals("Afghanistan")) {
			capital = "Kabul";
			} else if (country.equals("Tajikistan")) {
			capital = "Dushanbe";
			} else if (country.equals("USA")) {
			capital = "Washington DC";
			} else if (country.equals("Japan")) {
			capital = "Tokyo";
			}

			System.out.println(“The country of ” + country + ” is ” + capital);
			}

			}
		
		
		
	}

}
