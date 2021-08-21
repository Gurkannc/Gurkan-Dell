package class11;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Write a java program to find the second largest number in the array?

		
		  int arr[] = { 1,2,3,4,5,6,7,8,9 };
		
		  int largest = arr[0];
		   
		  int secondLargest = arr[0];
		   
		  
		  for (int i = 0; i < arr.length; i++) {
		
		   if (arr[i] > largest) {
		   
		  	 secondLargest = largest;
		     
		  	 largest = arr[i];
		
		   } else if (arr[i] > secondLargest) {
		   	 
		    secondLargest = arr[i];
		
		   }
		  }
		
		  System.out.println("\nSecond largest number is: " + secondLargest);
			
}
}
