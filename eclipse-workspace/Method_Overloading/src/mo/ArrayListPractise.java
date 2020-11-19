package mo;

import java.util.ArrayList;

public class ArrayListPractise {

	
	public static ArrayList<String> lst;
	
	static{
		lst = new ArrayList<>();
		lst.add("apple");
		lst.add("orange");
		lst.add("banana");
	}
	
	public static void main(String args[]) {
		System.out.println(lst);
	}
}

