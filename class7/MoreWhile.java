package class7;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	 * Ask name and age from a user 3 times
	 * Print name + age
	 */
	
	Scanner scan;
	String name;
	int age;
	
	scan=new Scanner(System.in);
	
	int i=1;
	
	while (i <= 3) {
	
	
	System.out.println("Please enter your name");
	name=scan.next();
	
	System.out.println(name +" Please enter you age");
	age=scan.nextInt();
	
	System.out.println(name+ " is " +age+ " years old");
	i++;
	}
	
	
	}

}
