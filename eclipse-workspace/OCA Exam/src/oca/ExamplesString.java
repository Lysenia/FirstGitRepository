package oca;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExamplesString {

	public static void main(String args[]) {
		
//		String s= "Hello";
//		String t = new String(s);
//		if("Hello".equals(s)) System.out.println("one");
//		if(t==s) System.out.println("two");
//		if(t.equals(s)) System.out.println("three");
//		if("Hello"==s) System.out.println("four");
//		if("Hello"==t) System.out.println("five");
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
//		System.out.println(sb);
//		
		
		
//		String letters ="abcdef";
//		System.out.println(letters.length());
//		System.out.println(letters.charAt(3));
//		System.out.println(letters.charAt(6));
		
//		String numbers = "012345678";
//		System.out.println(numbers.substring(1, 3));
//		System.out.println(numbers.substring(7, 7));
//		System.out.println(numbers.substring(7));
//		
//		String s = "purr";
//		s.toUpperCase();
//		s.trim();
//		s.substring(1, 3);
//		s+=" two";
//		System.out.println(s.length());
		
//		String a = "";
//		a+=2;
//		a+='c';
//		a+=false;
//		
//		if(a=="2cfalse") System.out.println("==");
//		if(a.equals("2cfalse")) System.out.println("equals");
		
//		int total = 0;
//		StringBuilder letters = new StringBuilder("abcdefg");
//		total+=letters.substring(1, 2).length();
//	
//		total+=letters.substring(6, 6).length();
//		
//		total+=letters.substring(6, 5).length();
//		System.out.println(total);
		
//		StringBuilder numbers = new StringBuilder("0123456789");
//		numbers.delete(2, 8);
//		numbers.append("-").insert(2, "+");
//		
//		System.out.println(numbers);
		
//		StringBuilder puzzle = new StringBuilder("java");
//		puzzle.reverse();
//		System.out.println(puzzle);
//		
//		int [] [] scores = new int [5][];
//		Object [][][]cubbies = new Object [3][0][5];
//		String beans = new beans [6];
//		int [][]types = new int[];
//		int [][]java = new int [][];
//		java.util.Date[] dates[] = new java.util.Date[2][1];
		
//		char [] c = new char[2];
//		int length = c.length;
//		
//		ArrayList l = new ArrayList();
//		l.remove(0);
		
//		int num [] = {1,2,3};
//		
//		int num2[] = {1,2,3};
//		if(num.equals(num2)) System.out.println("True");
//		else System.out.println("false");
		
//		
//		List<String> list = new ArrayList<String>();
//		list.add("one");
//		list.add("two");
//		list.add(7);
//		
		
//		ArrayList<Integer> values = new ArrayList<>();
//		values.add(4);
//		values.add(5);
//		values.set(1, 6);
//		values.remove(0);
//		
//		for(Integer v: values)
//			System.out.println(v);
//		
		
		
//		List<Integer> list = Arrays.asList(10,4,-1,5);
//		Collections.sort(list);
//		
//		Integer array [] = list.toArray(new Integer[4]);
//		System.out.println(array[0]);
		
//		List <String>hax = Arrays.asList("30","8","3A","FF");
//		Collections.sort(hax);
//		System.out.println(hax.toString());
//		
//		int x = Collections.binarySearch(hax, "8");
//		int y = Collections.binarySearch(hax, "3A");
//		int z = Collections.binarySearch(hax, "4F");
//		
//		

//		List<Integer> ages = new ArrayList<>();
//		ages.add(Integer.parseInt("5"));
//		ages.add(Integer.valueOf("6"));
//		ages.add(7);
//		
//		ages.add(null);
//		
//		for(int age: ages) System.out.println(age);
		
		List<String> one = new ArrayList<String>();
		
		one.add("abc");
		List<String> two = new ArrayList<String>();
		
		two.add("abc");
		
		if(one==two) 
			System.out.println("A");
			else if(one.equals(two))
				System.out.println("B");
				else 
					System.out.println("C");
			}

	
		
	}
	


