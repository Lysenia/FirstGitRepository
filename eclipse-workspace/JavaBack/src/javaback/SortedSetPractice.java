package javaback;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		
		SortedSet<Integer> sSet = new TreeSet<>();
		sSet.add(123);
		sSet.add(12);
		sSet.add(2334);
		sSet.add(15);
		sSet.add(132);
		System.out.println(sSet.tailSet(123));
		System.out.println(sSet.subSet(123, 133));
		System.out.println(sSet.headSet(132));
		
		SortedSet<String> sSet2 = new TreeSet<>();
		sSet2.add("Eve");
		sSet2.add("Adam");
		sSet2.add("adam");
		sSet2.add("Katie");
		sSet2.add("Windows");
		sSet2.add("132");
		
		System.out.println(sSet2);
		System.out.println(sSet2.first());
		System.out.println(sSet2.last());
		System.out.println(sSet2.subSet("E", "V"));
		System.out.println(sSet2.headSet("A"));
		
	}
}
