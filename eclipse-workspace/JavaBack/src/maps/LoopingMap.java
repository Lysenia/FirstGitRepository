package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopingMap {

	public static void main(String[] args) {

		Map<String, String> jobMap = new HashMap<>();
		jobMap.put("SDET", "Vienna");
		jobMap.put("Manual tester", "Fairfax");
		jobMap.put("DBA", "Herdon");
		jobMap.put("Scrum Master", "Reston");
		jobMap.put("Product owner", "Fairfax");
		jobMap.put("Scrum Master", "DC");

		System.out.println(jobMap);

		Set<String> keySet = jobMap.keySet();
		
		for (String key: keySet) {
			System.out.println(key);
		}
		
		  Iterator<String> iter = keySet.iterator();
	        
	        while( iter.hasNext() ) {
	          
	            System.out.println( iter.next() );
	            
	          
	        }
		System.out.println("after deleting");
		keySet.remove("Product owner");
		System.out.println(jobMap);
		
		Collection<String> allValues = jobMap.values();
		
		 Iterator<String> iter2 = allValues.iterator();
	        
	        while( iter.hasNext() ) {
	          
	            System.out.println( iter.next() );
	            
	          
	        }
	}
}
