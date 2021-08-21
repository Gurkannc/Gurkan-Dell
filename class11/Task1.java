package class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] a = {
				   {10,20,30},
				   {1,3,2}
				    };
			
				
				int sum=0;
				
				for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
				 sum=sum+a[i][j];
				}
				}
				System.out.println(sum);
			
			
			
		
		
		
		
		
		
	}

}
