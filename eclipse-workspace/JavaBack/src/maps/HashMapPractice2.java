package maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice2 {

public static void main(String[] args) {
	
HashMap <String, String> countryMap = new HashMap<>();
countryMap.put("USA", "Washington");
countryMap.put("Spain", "Madrid");
countryMap.put("Ukraine", "Kyiv");
countryMap.put("Germany", "Berlin");


System.out.println(countryMap.size());

System.out.println("keys are: ");
for( String key:	countryMap.keySet()) {
	System.out.println(key);
}

System.out.println("values are: ");
for( String each:	countryMap.values()) {
	System.out.println(each);
}

for( Entry<String, String> eachEntry:	countryMap.entrySet()) {
	System.out.println(eachEntry);
}
}
}