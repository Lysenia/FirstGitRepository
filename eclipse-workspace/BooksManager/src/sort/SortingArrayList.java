package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
	public static void main(String[] args) {
	
	String str1 = "A";
    String str2 = "B";
    String str3 = "C";
    
    List<String> strs = new ArrayList<>();
    strs.add(str3);
    strs.add(str2);
    strs.add(str1);
    
    System.out.println(strs.toString());
    
    Collections.sort(strs);
    
    System.out.println(strs.toString());
    
    System.out.println(str1.compareTo(str2));
    System.out.println(str3.compareTo(str1));
    System.out.println(str3.compareTo(str3));
    
	}
}
