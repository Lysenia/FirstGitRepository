package maps;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

import compare.Student;

public class SortedMapPractice {

	public static void main(String[] args) {
		
		Comparator<Integer> iCom =  new ComparatorCity();
		
		SortedMap<Integer, String> cityMap = new TreeMap(iCom);
		cityMap.put(22303, "Washington");
		cityMap.put(23459, "Madrid");
		cityMap.put(30899, "Kyiv");
		cityMap.put(20765, "Berlin");
		
		System.out.println(cityMap);
		
		System.out.println(cityMap.subMap(22301, 30899));
		
		
		
		//Comparator<Integer> iCom2 = Comparator.comparing(num-> -num);
		
	}
}
