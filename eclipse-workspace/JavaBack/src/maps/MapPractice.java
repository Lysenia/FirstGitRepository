package maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	
	public static void main(String[] args) {
		
		//HashMap<Integer, String> myMap = new HashMap<>();
		
	Map<Integer, String> myMap = new HashMap<>();
	myMap.put(1, "soccer");
	myMap.put(3, "basketball");
	myMap.put(2, "ping-pong");
	
	System.out.println(myMap);
	
	Map<Double,String> newMap = new HashMap<>();
	newMap.put(1.0, "apple");
	newMap.put(2.0, "banana");
	newMap.put(1.0, "orange");
	newMap.put(3.0, "banana");
	newMap.put(1.0, "orange");
	
	System.out.println(newMap);
	
	System.out.println(newMap.get(2.0));//get value at the key
	
	System.out.println(newMap.containsKey(17.0));//to check if we have the exact key
	
	System.out.println(newMap.containsValue("banana"));//to check if we have the exact value
	
	System.out.println(myMap.size());//to check number of elements in the list
	
	//System.out.println(newMap.remove(1.0)); // prints corresponding value
	
	System.out.println(newMap.remove(3.0, "banana"));//if no such element, prints null
	
	
	System.out.println(newMap.replace(2.0, "banana", "mango"));
	
	System.out.println(newMap.replace(3.0, "juice"));
	
	System.out.println(newMap.getOrDefault(17, "orange"));//gives default value if the key does not exist
	
	newMap.putIfAbsent(6.0, "brocolli");//check if we have the element with this key and then puts it
	
	System.out.println(newMap);
	
	
	
	}

}
