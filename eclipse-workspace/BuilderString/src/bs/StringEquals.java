package bs;

import java.util.ArrayList;

public class StringEquals {
	
	public static void main (String args[]) {
		
		String s1 = "Hello";
		String s2 = s1;
		
		System.out.println(s1==s2);
		
		String s3 = "Hello";
		System.out.println(s3==s1);
		
		String s4 = new String("Hello");
		
		System.out.println(s1==s4);
		
		System.out.println(s1.equals(s4));
		
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		System.out.println(sb1==sb2);
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		
		StringEquals obj1 = new StringEquals();
		System.out.println(obj1);
		
		System.out.println(sb1.equals(s1));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(22);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(22);
		
		System.out.println(list1==list2);
		System.out.println(list1.equals(list2));
		
		String[] st = {"hello"};
		String[]st1 = {"hello"};
				System.out.println(st.equals(st1));
		
		
		
		
	}

}
