package bs;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview {
	
	public static void main(String args[]) {
	ArrayList<String> names = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 names");
	
	for(int i=0; i<5; i++) {
    
	names.add(sc.nextLine());
	}
	
//	for (String name : names) { 
//System.out.println("first letter for each name: " + name.charAt(0));
//System.out.println("last letter for each name: " + name.substring(name.length()-1));	
//		
	
	for(int i=0; i<names.size();i++) {
	String item = names.get(i);
	System.out.println(item);
	System.out.println(item.charAt(0) + " " + item.charAt(item.length()-1));
	}
	
	int indexOfAdam = names.indexOf("adam");
	System.out.println("index of adam " + indexOfAdam);
	int lastIndexAdam = names.lastIndexOf("adam");
	System.out.println( "last index of adam " + lastIndexAdam);
	boolean itemExist = names.contains("adam");
	System.out.println("if adam exist in the list  " + itemExist );
	System.out.println("before deleting  " + names);
	
	
	
	names.clear();
	System.out.println("if the list is empty  " + names.isEmpty());
	
	System.out.println("after deleting  " + names);
	
	names.add("Adam");
	names.add("John");
	names.add("John");
	names.add("Dave");
	
	for(int i=0; i<names.size(); i++) {
	
	names.set(i, names.get(i).toUpperCase()); } 
	System.out.println(names);
	
	names.add(2, "ABC");
	System.out.println(names);
	
	names.remove(0);
	System.out.println("after removing the first element: " + names);
	names.remove("ADAM");
	System.out.println("after removing Adam: " + names);
	
			
	
	}
	
	

}

