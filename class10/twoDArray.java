package class10;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int a;
	int[] b=new int [3];
	
	//creating a 2d Array
	
	int[] [] c=new int [3] [4];
	
	//1 row
	
	c[0] [0]=11;
	c[0] [0]=12;
	c[0] [0]=13;
	c[0] [0]=14;

	//2 row or 2 array
	
	c[1] [0]=20;
	c[1] [1]=30;
	c[1] [2]=40;
	c[1] [3]=50;

    //3 row or 3 array 	
	
	c[2] [0]=100;
	c[2] [1]=200;
	c[2] [2]=300;
	c[2] [3]=400;
	
	System.out.println(c[1] [3]);   //50 //to access specify from which row index and column index
	System.out.println(c[2] [1]);   //200 // to access specify from which index array and what element index
	
	
	
	System.out.println("  -------  Another way of creating a 2D array ------  ");
	
	int [] [] myArray= {
	
			{11, 12, 13, 14, 15}, //1 array
			{20, 30, 40}, //2 array
			{100, 200, 300, 400} //3 array
	                                  };
			
	
			
	System.out.println(myArray[0][4]); //15
	System.out.println(); //20
	
	
	
	
	
	
	
			
			
	
	}

}
