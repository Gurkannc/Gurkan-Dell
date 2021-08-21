package class4;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=true;
		boolean secondDose=false;
		
		if (vaccine) {     //yes
		
			System.out.println("Let's check how many doses you got");
			
			
			if (secondDose) {
		    System.out.println("You are fully vaccinated");
		}
		}
		
		
		
		
		/*
		 * Every friday is movie day
		 * is it is the 13th --> you wamt to watch a scary movie
		 */
		
		
		int day=13;
		boolean isFriday=true;
		
		
		if (isFriday) {
			System.out.println("I am going to watch a movie");
			
			}
		    if  (day==13) {
		    System.out.println("Yay, I am watching movie");
		   	    } else {
		   	    	System.out.println("I am watching whatever is popular");
		   	    }
	
	
	}

}
