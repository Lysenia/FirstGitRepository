package practice;

public class UtilityApplier {
	
	public static void main(String args[]) {
		
		MyUtility my = new MyUtility();
		my.name = "Adam";
		String str = "I love Java";
		String str2 = "I love Java 123";
		String str3 = "I 12 lo23ve Java 123";
		
char [] eachChars =str.toCharArray();
for(char each:eachChars) {
System.out.print((int )each + " ");
}
			
		char myChar = 'Z';
		my.getAsciiNumber(myChar);
		System.out.print("The number is " + my.getAsciiNumber(myChar) );
		System.out.println("My name is " + my.name);
		my.displayEachCharAsciiNumber(str);
		my.printOnlyAtoZ(str);
		
		
	
		
		int num = 100;
		char myOtherChar = (char) num; 
		
		System.out.println("from A to Z  " + my.printOnlyAtoZ(str));
		System.out.println("from a to z  " + my.returnOnlyatoz(str2));
		System.out.println("numbers only  " + my.returnOnlyNumber(str3));
	}

}
