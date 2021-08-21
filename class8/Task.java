package class8;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Print numbers from 1 to 50 except thoese that are divisible by 3
	
	for(int i=1; i<=50; i++) {
		if (i%3==0) {
	     continue;
		}
	     
		System.out.println(i+" ");
	}
		
		
		
		
		
		
	//Create a program that will keep asking user to apply for a credit card. As soon ypu get "yes" from a user program should stop asking.
     

	Scanner scan= new Scanner(System.in);
	String credit;
	
	do {
		System.out.println("Would you like to apply for credit card?");
		credit = scan.next();
		if (credit.equalsIgnoreCase("yes")){
		     break;
	}
	
	}  while(true);   
     
	System.out.println("Congratulation on selecteing credit card!");

	
	System.out.println("----------------------------------");
	
	
	for(int i=1; i<=5; i++) {
	System.out.println(i+" ");
	}
	 
	
	 /*
	  * Write a program that reads a range of integers from (start and point) from a user 
	  * and then from that range prints the sum of the even and odd integers 
	  */
	
	

	int start, end, evenSum, oddSum;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter starting integer");
	start=scan.nextInt();
	System.out.println("Please enter ending integer");
	end=scan.nextInt();
	
	for(int i=start;i<=end; i++) {
	
	 if (i%2==0) {
       evenSum+=i;
	    }else {
	      oddSum+=i;
	    }
	 }
	System.out.println("Sum of even numbers from range"+start+"till"+end+"equals to"+evenSum);
	System.out.println("Sum of even numbers from range"+start+"till"+end+"equals to"+oddSum);
	
	
	
	
	}

}
