package class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
	
	
		int[][] arr2 = { { 1, 2, 3, 4 }, { 10, 9, 8, 7 }, { 6, 5 }, };
		
		for (int i = 0; i < arr2.length; i++) {
	    for (int j = 0; j < arr2[i].length; j++) {
	    if (arr2[i][j] % 2 == 0) {
	    System.out.println(arr2[i][j]);
	
	    }
	    
	    }
	    
		}
	
	
	
	
	
	
	}

}
