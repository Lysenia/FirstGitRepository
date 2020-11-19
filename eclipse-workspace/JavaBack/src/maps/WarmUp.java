package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class WarmUp {
	
	public static void main(String[] args) {
		
		List<Long> listDouplicates = new ArrayList<>();
		
		listDouplicates.add(200L);
		listDouplicates.add(30L);
		listDouplicates.add(200L);
		listDouplicates.add(60L);
		listDouplicates.add(5L);
		listDouplicates.add(200L);
		listDouplicates.add(60L);
		listDouplicates.add(5L);
		listDouplicates.add(309L);
		listDouplicates.add(2000L);
		
		System.out.println(listDouplicates);
		//Set<Long> listUnique = new HashSet<>(listDouplicates);
		Set<Long> listUnique = new HashSet<>();
		
		for(int i=0; i<listDouplicates.size(); i++) {
			listUnique.add(listDouplicates.get(i));
			
		}
		
		System.out.println(listUnique);
		
		//Collections.sort(listDouplicates);
		
		SortedSet<Long> sSet = new TreeSet<>(listUnique);
		System.out.println(sSet);
		System.out.println(sSet.subSet(102L, 105L));
		System.out.println(sSet.tailSet(104L));
		System.out.println(sSet.headSet(103L));
		
		SortedSet<Long> tail = sSet.tailSet(104L);
		tail.remove(30L);
		System.out.println(tail);
		System.out.println(sSet);

	}
	
}
