package class9;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
	     *Create an array of words: Java, Saturday, day, coding, is.
	     *Print the following sentence using elements of array:"Saturday is Java coding day". 
	     */
	
	char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
	int size=grades.length; //gives the size -> how many elements in that array
	System.out.println(size);
	
	
	System.out.println(grades[1]);
	
	int i=0;
	System.out.println(grades[i]);
	
	i++;
	System.out.println(grades[i]);

	System.out.println("-------- Retrieveing all values using for loop --------");
	
	
	for(int j=0; j<grades.length; j++) {
	
		System.out.println(grades[j]);
	}
	
	
	
	System.out.println("   ---------------------------------------------------------   ");
	
	
	
	String[] names= {"Jose", "Sule", "Blake", "Enes", "Ana", "Andrei", "Burju", "Gurkan"};
	
	
	
	
	for(int i=0;i<names.length; i++ ) {
		
		System.out.println(names[a]);
	}
	
	
	
	
	
	
	
	
	
	
	}

}
