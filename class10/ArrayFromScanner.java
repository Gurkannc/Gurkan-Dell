package class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Using scanner create an array of integer elements;
		 */
		
		
		int[] array= {13};
		//array[1]=12;
			
		System.out.println(array.length);
	
		Scanner scan=new Scanner(System.in);
		System.out.println("How many element do you want to store inside an array");
		int size=scan.nextInt();
		
        int[] numbers=new int [size];
		
        for (int i=0; i<size;i++) {
		     
		     numbers[i]=scan.nextInt();
	    
        }
        
        System.out.println("   DISPLAY ALL ELEMENTS FROM AN ARRAY    ");
        
        for (int num:numbers) {
        	System.out.println(num+"  ");
        }
        
		}

}
