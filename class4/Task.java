package class4;

public class Task {

	public static void main(String[] args) {
		

	boolean diploma=true;
	double gpa=3.5;
	
	if (diploma) {
		System.out.println("Congratulations on the degree");
		
		if (gpa >=3.5) {
			System.out.println("You are eligible for scholarship with gpa of" + gpa);
			
		}else {
			System.out.println("You should have studied harder");
		}
		}
		
		System.out.println("----------------------------------------------------------");
		
		
		
	 double rate=4.0;
	 int price =300000;
	 
	 
	 if (rate>4.5) { 
	System.out.println("I wont buy a house with rate of" + rate);
	 }else {
		 System.out.println("I will consider buying");
		if(price>200000) {
	     System.out.println("I will take a loan to buy a house that cost" + price);
		 }else {
			 System.out.println("I will pay cash for the house costing" + price);
		 }
	
	 }
	
	 System.out.println("------------------------------------------------------------");
	
	
	int age=20;
	double weight=160;
	
	if (age>=18) {
		System.out.println("Lets check if you meet all other requirements");
		if(weight>100 ) {
			System.out.println("you can donate");
		}else {
			System.out.println("You can not donate");
		
			}//else ????????????
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	}


