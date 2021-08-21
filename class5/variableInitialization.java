package class5;

import java.util.Scanner;

public class variableInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	
	
	/*
	 * Ask user to enter name and age
	 * based on age define who is user
	 * if age is from 0-3 --> baby
	 * if age is from 3-5 --> toddler
	 * if age is from 5-12 --> kid
	 * if age is from 12-19 --> teenager
	 * if age is from 19-65 ==> adult
	 * if age 65+ --> senior
	 */
	
	
	Scanner in=new Scanner(System.in);
	
	System.out.println("Please enter your name");
	String name=in.nextLine();
	
	System.out.println("Please enter your age");
	int age=in.nextInt();
	
	
	
	
	String whoAreYou=null; 
	
	
	if(age>=0 && age<3) {
		whoAreYou="baby";
	}else if (age>=3 && age<6) {
		whoAreYou="toddler";
	}else if (age>=6 && age<13) {
		whoAreYou="kid";
	}else if (age>=13 && age<20) {
		whoAreYou="teenager";
	}else if (age>=20 && age<65) {
		whoAreYou="adult";
	}else if (age>=65) {
		whoAreYou="senior";
	}else {
		whoAreYou="No Status";
	}
	
	
	if (whoAreYou!=null) {
	System.out.println(name+"you are "+whoAreYou);
	}
	
	
	
	}

}
