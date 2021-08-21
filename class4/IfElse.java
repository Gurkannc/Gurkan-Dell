package class4;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String storedUserName = "Gurkan";
		String storedPassword = "pass123";
		Scanner scanner = new scanner(System.in);
		System.out.println("Please Enter your UserName");
		String userName = scanner.nextLine();
		System.out.println("Please Enter your Password");
		String password = scanner.nextLine();
		// == operator only works with primitive data types
		// for non primitive data types we should use equals methods
		if (storedUserName.equals(password)) {
		System.out.println("COrrect username");
		
		  if(storedPassword.equals(password)) {
			  System.out.println("Password is also correct");
		  }else {
			  System.out.println("Username is correct but password is not");
		  
		  }

		 else {
			 System.out.println("Username is not correct");
		
		  }
		
		
		}

	}

}
