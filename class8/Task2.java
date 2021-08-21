package class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	 * Write a program to ask a user to enter item they want to buy and the price of 
	 * that item. Every time user enters money, accumulate the amount and tell the user
	 * how much is left to pay off. If user give more money program should retuna change.
	 * Whenever a user done with payments program should say
	 * "Thank you for shopping"
	 */
	
	
	Scanner scan;
	String item;
	double price, money, total, change;
	
	scan=new Scanner(System.in);
	System.out.println("What item do you want to buy?");
	item = scan.nextLine();
	
	System.out.println("Whats the proce of the item?");
	price = scan.nextDouble();
	
	
	do {
		System.out.println("Please pay for the item");
		money=scan.nextDouble();
	
	
     	total+=money;
	
	if (total>price) {
		change=total-price;
		System.out.println("Here is your change"+change);
	}else if (total<price) {
	    
	   System.out.println("Please give more");
	}
	}
	}
}
