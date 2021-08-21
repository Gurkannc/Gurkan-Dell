package class4;

public class AnotherNestedIf {

	public static void main(String[] args) {
		

	/*
	 * We have test --> Yes or No
	 * 
	 * If you done test then I want to check the score
	 * 
	 * Score is more then 90 --> A student
	 * Score is more then 80 --> B student
	 * Score is more then 70 --> C student
	 * 
	 * Otherwise : You should study more fore test
	 */
	
	boolean isCompleted=false;
	int score=95;
	
	if (isCompleted) {
		System.out.println("Let's check your grade");
		
	   if(score>90) {
		   System.out.println("A Student");
	   }else if(score>80) {
		   System.out.println("B Student");
	   }else if(score>90) {
		   System.out.println("C Student");
	   }else {
		   System.out.println("Please study more before taking the test");
	   }
	}else {
		System.out.println("You should have taken the test");
	}
	
	
	
	
	
	
	
	
	
	}

}
