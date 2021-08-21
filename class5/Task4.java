package class5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	/*
	 * Write aprogram to ask user to enter value for sale: yes or no
	 * If there is no sale --> you are not going for shopping
	 * If there is sale ask you user for the item and price of the item
	 * Based on the price you have to calculate the price of the item after the discount
	 * If price is less then $20 --> apply 10%
	 * If price is between $20 & $100 --> 20%
	 * If price is between $100 & $500 --> 30%
	 * otherwise apply 50% discount
	 * 
	 * After discount ___ the price of the item reduced from __ to 
	 */
	
	
		
		Scanner scan = new Scanner(System.in);
		
		boolean sale;
		double price = 0;
		int discount = 0;
		String answer;
		System.out.println("Is there a sale now?");
		sale = scan.nextBoolean();
		if (sale) {
			System.out.println("What is the price for item?");
			price = scan.nextDouble();
			if (price < 20) {
				discount = 10;
			} else if (price >= 20 && price <100) {
				discount = 20;
			} else if (price >=100 && price <500) {
				discount = 30;
			}else if (price >500) {
				discount = 50;
			}else {
				System.out.println("Wrong price input");
			}
		} else {
			System.out.println("I am not going for shopping");
		}
		System.out.println("After discount " + discount +"% the price of the item reduced from " + price + " to " + (price-(price*discount/100)));
		
		
		
		
		
		
		
		
	}

}
