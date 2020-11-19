package javaback;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	
	public static void main(String[] args) {
		
		Set<Integer> numSets = new HashSet<>();
		//HashSet<Integer> numSets2 = new HashSet<>();
		numSets.add(12);
		numSets.add(122);
		numSets.add(15);
		numSets.add(123);
		numSets.add(123);
		
//		for(Integer each: numSets) {
//			System.out.println(each);
//		}
		
		Iterator<Integer> setIter = numSets.iterator();
		Integer i = setIter.next();
		while( setIter.hasNext() ) {

		if(i>100)
		setIter.remove();
		System.out.println("deleted " + i);
		}
		
		System.out.println(numSets);
	}
	}

