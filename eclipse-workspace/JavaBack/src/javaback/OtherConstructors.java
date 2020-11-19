package javaback;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OtherConstructors {
	
	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		lst.add("abc");
		lst.add("abc");
		lst.add("efg");
		
		List <String> lst2 = new ArrayList<>(lst);
		System.out.println(lst2);
		
		Set<String> set1 = new HashSet<>(lst);
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>(lst);
		for(int i =0; i<lst.size();i++) {
			set2.add(lst.get(i));
		}
		
		
	}

}
