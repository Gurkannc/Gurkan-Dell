package class5;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * define a day
 * if day is Monday or Friday -- No Class
 * if day is Tuesday or Wednesday -- Manual Class
 * if day is Thursday -- Review Class
 * is day is Sat or Sunday -- Java Class
 */
		
		
		
		String day="Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")){
			System.out.println("We have no class at Syntax");
		
		}else if (day.equals("Tuesday")||day.equals("Wednesday")) {
		   System.out.println("Today is manuel class");
		   
		}else if (day.equals("Thursday")) {
			System.out.println("Today is our revþew class");
		
		}else if (day.equals("Saturday")) {
		    System.out.println("Today is my favorite Java Class");
		
		}else {
	        System.out.println("Please specify valid day");
		}
	
	
	}

}

