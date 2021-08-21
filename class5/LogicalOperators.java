package class5;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan=new Scanner(System.in);
	     System.out.println("Do you need a loan?");
	      String answer=scan.nextLine();
	      if(answer.equals("True"))
	      {System.out.println("What is you credit score?");
	      int score=scan.nextInt();
	      if (score<600)
	      {System.out.println("The eligibility is Not eligible");}
	      else if (score >600 && score <700)
	      {System.out.println("The eligibility is Maybe eligibile");}
	      else if (score >701 && score <800)
	      {System.out.println("The eligibility is Eligibile");}
	      else if (score >800)
	      {System.out.println("The eligibility is Definitely eligibile");}
	      else
	      {System.out.println("Unknown");}
	      }
	 }
	}
