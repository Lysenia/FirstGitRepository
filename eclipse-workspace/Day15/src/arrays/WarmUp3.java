package arrays;

import java.util.Scanner;

public class WarmUp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names [] = new String [5];
		
		System.out.println("Enter 5 names");
		int count = 0;

		for (int i = 0; i < names.length; i++) { 
			names[i] = sc.next(); 
		for (int j = 0; j < names[i].length(); j++) { 
			if (names[i].charAt(j) == 'a' || names[i].charAt(j) == 'A')
			count++;
			} 
		} 
		System.out.println("There are" + count + "a in all names");
			}
		}
	
			
	



