package class5;

public class homeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		package com.syntax.class05;
		import java.util.Scanner;
		public class Homework3 {
			public static void main(String[] args) {
				System.out.println("Please enter 3 distinct numberbers");
				int n1, n2, n3, largest = 0;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter 1st number");
				n1 = scan.nextInt();
				System.out.println("Enter 2nd number");
				n2 = scan.nextInt();
				System.out.println("Enter 3rd number");
				n3 = scan.nextInt();
				if(n1 > n2) {
		            if(n1 > n3) {
		                largest = n1;
		            }else {
		            	largest = n3;
		            }
		        }else {
		            if(n2 > n3) {
		                largest = n2;
			}else{
				largest = n3;
			}
		        }
				System.out.println("The largest number is " + largest);
		
		
		
		
		
	}

}
