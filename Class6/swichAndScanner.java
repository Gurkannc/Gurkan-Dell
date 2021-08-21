package Class6;

import java.util.Scanner;

public class swichAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * I want to ask where you are from?
		 * Based on the country we will define traditional?
		 */
		
		
		
		Scanner in;
		String Country,traditionalFood = null;
		
		Scanner scanner = in=new Scanner(System.in);
		System.out.println("Hey, where are you from?");
		Country=in.nextLine();
		
        switch(Country) {
        
        case "USA":
        	traditionalFood="burger";
        	break;
        case "Afgananistan":
        	traditionalFood="Quabeli Palaw";
        	break;
        case "Peru":
        	traditionalFood="ceviche";
        	break;
        case "Italy":
        	traditionalFood="pasta";
        	break;
        case "Tajikistan":
        	traditionalFood="kuruto";
        	break;
        case "Ukraine":
        	traditionalFood="borshh";
        	break;
        case "Kazakhstan":
        	traditionalFood="beshbarnak";
        	break;
        case "Turkey":
        	traditionalFood="doner";
        	break;
        }
		
		
		System.out.println("You are from "+Country+" and your traditional food is "+ traditionalFood);
		
		
		
		
	}

}
