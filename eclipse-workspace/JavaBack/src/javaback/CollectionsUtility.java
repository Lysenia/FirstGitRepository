package javaback;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtility {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>arr = new ArrayList<>();
		arr.add(1);
		arr.add(4);
		arr.add(-1);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		
	//Collections.fill(arr, 4);
	//System.out.println(arr);
	Collections.shuffle(arr);
	System.out.println(arr);
	Collections.sort(arr);
	System.out.println(Collections.binarySearch(arr, 4));
	
	int freq = Collections.frequency(arr, 3);
	System.out.println(freq);
	}
}
