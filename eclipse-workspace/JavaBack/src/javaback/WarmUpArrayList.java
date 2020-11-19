package javaback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WarmUpArrayList {
	public static void main(String[] args) {
		
	
	//List<Integer> arrList = new ArrayList<>();
	Collection <Integer> arrList = new ArrayList<>();
	System.out.println(arrList.isEmpty());
	arrList.add(1);
	arrList.add(5);
	arrList.add(55);
	arrList.add(19);
	arrList.add(4);
	
	List<Integer> lst = Arrays.asList(1,34,32,45);
	arrList.addAll(lst);
	System.out.println(arrList);
	arrList.removeAll(lst);
	
	List<Integer> lst2 = Arrays.asList(1,33);
	arrList.retainAll(lst2);
	System.out.println(arrList);
	
//	arrList.remove(3);
//	arrList.remove(0);
//	arrList.remove(new Integer(1));
//	
//	for(int i=0; i<arrList.size(); i++) {
//		System.out.println(arrList);
	}
	}


