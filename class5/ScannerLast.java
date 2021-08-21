package class5;



public class ScannerLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number");
	int number=scanner.nextInt();
	System.out.println("Enter name");
	String name=scanner.nextLine();
	// Use next instead of nextline
	System.out.println(name+number);
	
	
	}

}
