package str;

import java.util.Arrays;

public class LearningString {
	
	public static void main (String args[]) {
		
		String str = "Cybertek";
		int len = str.length();
		System.out.println("get the length of string  " + len);
		
		char c = str.charAt(5);
		System.out.println("get the character at index 5 :"+ c);
		
				
		int indexOfT = str.indexOf("T");
		int indexOfT2 = str.indexOf('t');
		System.out.println("index of t :"+ indexOfT2);
		
		String index1to5 = str.substring(1,5);
		System.out.println("sub string index 1- 5 "+index1to5 );

		String index3toThRest = str.substring(3);
		System.out.println("sub string index 3 till end "+index3toThRest );

		// upper case and lower case 
		System.out.println( str.toUpperCase());
		System.out.println( str.toLowerCase());
		
		// trim beginning and end of String 
		System.out.println("Orgininal STring <"+str+">  | after trim <"+
		str.trim() + ">");
		
		// Check String contains certain String or character
		
		System.out.println(" if a string has a certain string  " + str.contains("T"));
		
		boolean startWithCy = str.startsWith(" Cy");
		System.out.println(" if a string starts with  " + startWithCy);
		System.out.println("String end with k: " + str.endsWith("k"));
		
		char[] chars = str.toCharArray();
		System.out.println(Arrays.toString(chars));
		
		String str2 = "";
		System.out.println ("checking if the string is empty  " + str2.isEmpty());
		
		System.out.println("checking if two strings are equal" + str.equals(str2));
		
		String str3 = "aa";
		String str4 = "Ab";
		
		int compareToResult = str3.compareTo(str4);
		System.out.println("Compare to Result " + compareToResult);
	}
	

}
