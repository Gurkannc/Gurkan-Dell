package class7;

import java.util.Scanner;

public class Lotterey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	/*
	 * We have a secret number (any number from 1 till 20)
	 * Ask user to guess your secret number
	 * Continue guessing a number UNTILL user enter your secret number
	 */
	
	
		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in=new Scanner(System.in); 
		
		do {
		System.out.println("Please guess my secret number");
		userNumber=in.nextInt();
		} while(userNumber != secretNumber);
		
		
	System.out.println("Congratulations you got it");
	
	
	
	
	}

}
