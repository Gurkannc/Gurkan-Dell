package class4;


//Shortcut to import:mac->cmd+shift    ---- Windows --> ctrl
import java.util.Scanner;

public class ExamoleOfScanner {

	public static void main(String[] args) {
		

	
	String name="Serge";
	System.out.println("Hello "+name);
	
	
	Scanner scan=new Scanner(System.in); //creating scanner
	
	System.out.println("Please enter your name");
	//capture String values and we stored inside variable value.
	String value=scan.nextLine();
	
	System.out.println("Hello "+value);
	
	//capture integer value
	System.out.println("Please enter your age");
	int age=scan.nextInt();
	System.out.println(value+" is "+age+" year old");
	
	
	}
	

}
 