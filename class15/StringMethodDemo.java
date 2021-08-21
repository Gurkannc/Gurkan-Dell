package class15;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	String str="I am a good tester. I am a good person";
	System.out.println(str.replace("a", "A"));
	System.out.println(str.replace("good", "Naughty"));
	
	String str2="askdGSGSDSRSSHSjasajeaksejaesje!@#@$%#$%#";	
	System.out.println(str2.replaceAll("[0-9]","+")); //Will replace all the numbers form 0-9 in the string
	System.out.println(str2.replaceAll("[A-Z]", "")); //Will remove all the upper case letters from the original string 
	System.out.println(str2.replaceAll("[a-z]", "")); //Will remove all the lower case letters 
	System.out.println(str2.replaceAll("[a-z0-9]","")); //Will remove all the uper case and lower case and numbers in the range
	System.out.println(str2.replaceAll("[a-z5-9A-Z]", ""));
	System.out.println(str2.replaceAll("[^a-z5-9A-Z]", ""));
	System.out.println(str2.replaceAll("^", ""));
	  str2="";
	
	
	}

}
