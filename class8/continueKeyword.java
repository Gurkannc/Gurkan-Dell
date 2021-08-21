package class8;

public class continueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	for(int i=0; i<=3; i++) {
        	
	if (i==1) {
		continue;
	}
	
	
	
	System.out.println("I am inside the loop");
	System.out.println(i);
	
	}
		
	// I want to print all numbers from 1 till 10 except number 5 	
	
	
	for(int i=1; i<=10; i++) {
		  if (i==5 || i==9) {
			  continue;
		  }
		System.out.print(i+" ");
	}
	
	
	System.out.println();
	
	for(int i=1; i<=10; i++) {
		  if (i==5 && i==9) {
			  continue;
		  }
		System.out.print(i+" ");
	}
	
	
	int x=0;
	for(int i=0;i<10;i++) {
		x=i;
		while(x<5) {
			System.out.println(x);
		    x++;
		
		}
	}
	
	
	
	}

}
