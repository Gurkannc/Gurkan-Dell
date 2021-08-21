package class5;

import java.util.Scanner;

public class InitializeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	/*
	 * Ask user to enter 3 numbers
	 * then f'nd the largest
	 */
	
	Scanner scan;
		
    int num1, num2, num3;
	
	scan=new Scanner (System.in);
	System.out.println("Please enter 3 numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	num3=scan.nextInt();
	
	if (num1>num2 && num2>num3) {
		System.out.println(num1+"is largest number");
		
	}else if (num2>num1 && num2>num3) {
		System.out.println(num2+ "'s the largest number");
	}else if (num3>num1 && num3>num2) {
		System.out.println(num3+"'s the largest number");
	}else if (num1==num2 && num2==num3) {
		System.out.println("Numbers are equal");
	}
		
	
	
	
	
	
	
	
	
	
	}

}
