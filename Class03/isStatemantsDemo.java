package Class03;

public class isStatemantsDemo {

	public static void main(String[] args) {
		
	int num1=12;
	
	int num2=20;
	if (num1<num2) {  //if block executes only when condition if true
	System.out.println(" num1 " +num1 + " + num1 + is larger than num2 " + num2);
	} 
	
	
	
	System.out.println("--------------------");
	
	
	double money =10;  
	double $priceCookies=5.99;
	
	if (money>$priceCookies) {
	System.out.println("I am buying those cookies");
	}
	
	
	
	System.out.println("End of my code !");
	 
	
	
	
	
	/*
	 * I have money and I know price
	 * if I have more money --> I will buy cookies
	 * otherwise I wýll cry
	 */
	
	double money1=10;
	double $cookie=5.99;
	
	
	if (money1>$cookie) { //if true
		
		System.out.println("I am buying those cookies");
	}
	else { // if true
		
		System.out.println("I am going to cry");
		
		
		
				}
	
	//Task
	
		double para1=40;
		double para2=30;
		
		if (para1>para2) {
	System.out.println(para1 + " is larger than " + para2);
	
		}
		
		
		else{
		System.out.println(para2 + "is smaller than " + para1);
			
		}
	
	
		double a=20;
		double b=20;
	
		if (a == b) { //condition always must be a boolean value
			System.out.println("Numbers are equal");
			System.out.println("My numbers are twins");
		}else {
			
			System.out.println("Numbers are not equal");
			System.out.println("Numbers are not twins");
			System.out.println("I am else block code ");
		}
	
	
		/*
		 * if it is a break time --> I will get a coffee
		 *                          otherwise I will focus on the class
		 *                          
		 *                         
		 */
		
		
		boolean isBreakTime=false;
		
		if (isBreakTime){
			System.out.println("I am getting my coffee");
		}else{
			System.out.println("I am focusing on the class");
		}
		
		
		/*
		 *  if you are hungry --> I will go eat
		 *                        otherwise: I will go have a tea
		 *                        
		 */
		
		
		
		boolean isHungry=true;
		
		if (isHungry) {
		System.out.println("I will go eat");
		}else {
			System.out.println("I will go have a tea");
		}
		
		
		
		
		
		//System.out.println(code starts....);
		double temp=31;
		
		if (temp<32) {
		System.out.println("Water will freeze with temperature" + temp);
		}else{
		    	System.out.println("Because it is warn outside");
		    	System.out.println("Because it is warn outside");  }
		
		/*
		 * When if statemen is used without  { } 
		 * Then java allows only 1 statement for each block 
		 * Mean 1 line for if block and 1 line for else block ONLY
		 */
	
		
		
		//	---------------------------------------------- Else --------------------------
		
		
		
		
		
		
		
		
		
		
		/*Declare a variable day and than based on the day value provide output such as 
		 * if day is equal to 1 --> Today is Monday
		 * if day is equal to 2 --> Today is Tuesday
		 *
		 */
	
	
		int day=7;
		
		if (day==1) {
			System.out.println("Today is monday");
		}else if (day==2) {
			System.out.println("Today is Tuesday");
		}else if (day==3) {
		    System.out.println("Today is Wednesday");
		}else if (day==4) {
		    System.out.println("Today is Thursday");
		}else if (day==5) {
		    System.out.println("Today is Friday");
		}else if (day==6) {
		    System.out.println("Today is Saturday");
		}else if (day==7) {
		    System.out.println("Today is Sunday");
		}
		
		
		System.out.println("End of my code....");
		
		
		
		
	}
	
}	

