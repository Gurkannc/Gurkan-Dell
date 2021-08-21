package homework;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	
	
	
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String a1=scanner.nextLine();
		String a2=scanner.nextLine();
		System.out.println("Please enter two numbers");
		int b1=scanner.nextInt();
		int b2=scanner.nextInt();
		if (b1==b2 && a1.equals(a2) ) {
		System.out.println("AND");
		}
		 if (b1==b2 || a1.equals(a2) ) {
		System.out.println("OR");
		 }else if (b1!=b2 && !a1.equals(a2) ){
		  System.out.println("NONE");
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
