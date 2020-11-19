package maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		
		HashMap <Integer, String> cityMap = new HashMap<>();
		cityMap.put(22303, "Washington");
		cityMap.put(23459, "Madrid");
		cityMap.put(30899, "Kyiv");
		cityMap.put(20765, "Berlin");
		
			for( Integer key:	cityMap.keySet()) {
				System.out.println(key);
			}
			
			for( String each:	cityMap.values()) {
				System.out.println(each);
			}
			
			for( Entry<Integer, String> eachEntry:	cityMap.entrySet()) {
				System.out.println(eachEntry);
			}
	}

}
