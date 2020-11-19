package practice;

public class MyUtility {
	
	String name;
	
	public void displayUtility(){
		System.out.println( "My name " + name);
	}

	public int getAsciiNumber(char ch) {
		
		int asciiVal = (int) ch;
		return asciiVal;
	}
	
	public void displayEachCharAsciiNumber(String str) { 
		for (int i=0; i<str.length(); i++) { 
			int n=(int) str.charAt(i); System.out.println(n); } 
	}
	
	public void makePancake(){
		System.out.println("making a pancake");
	}
	
public void eatThePancake(){
	System.out.println("eating a pancake");
	}
public void makeAndEatPancake(){
	
	makePancake();
	eatThePancake();

	}
	
public char getChar (int num ) { 
return (char) num;
} 

	
public String printOnlyAtoZ(String str) { String result=""; 
char[] arr=str.toCharArray(); for(char a: arr) { 
	if ((int)a>=64 && (int)a<=91) result+=a; } return result;
}
public String returnOnlyatoz (String str) { String result=""; 
char[] arr=str.toCharArray(); for(char a: arr) { 
	if ((int)a>=97 && (int)a<=122) result+=a; } return result;
}
public String returnOnlyNumber (String str) { String result=""; 
char[] arr=str.toCharArray(); for(char a: arr) { 
	if ((int)a>=48 && (int)a<=57) result+=a; } return result;
}
}