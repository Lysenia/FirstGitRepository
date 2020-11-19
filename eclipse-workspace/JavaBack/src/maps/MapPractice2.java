package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice2 {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Adam", "Adam", "Bob", "Steve", "Bob", "Eve");
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		
		for(String each: names) {
			if(!frequencyMap.containsKey(each)) {
			frequencyMap.put(each, 1);
		}
		else {
			int existingCount = frequencyMap.get(each);
			frequencyMap.put(each, existingCount +1);
		}
		
		System.out.println(frequencyMap);
		
	}

	}
}
