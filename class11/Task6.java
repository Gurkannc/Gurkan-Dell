package class11;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		
		int a,b,c; 
		a=0;
		b=1;
		
	
		   
		 for(int i=0;i<=10;i++)  {  
			 
			 System.out.print(a+" ");
		  
			 c=a+b;
			 a=b;
			 b=c;
		
		 }
		
		
		
	}

}
