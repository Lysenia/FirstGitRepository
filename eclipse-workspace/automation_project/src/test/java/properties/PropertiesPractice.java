package properties;

import java.util.Properties;
import java.util.Map.Entry;

public class PropertiesPractice {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("apple", "green");
		prop.setProperty("tomato", "red");
		prop.setProperty("eggplant", "violet");
		prop.setProperty("orange", "orange");
	
		//prop.setProperty("orange", "orange"); - no duplicates
		
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("apple"));
		
		for( Entry<Object, Object> eachEntry:	prop.entrySet()) {
			System.out.println(eachEntry);
	}

}
}