package array_class;

import java.util.Arrays;

public class Array_Classes {
	public static void main (String args[]) {
		
		
		char[] arr2 = {'A', 'G', 'E', 'B', 'C'};
		Arrays.sort(arr2);
		System.out.println(arr2);
		String names [] = {"Anna", "Zee", "John","Bob"};
		Arrays.sort(names);
		System.out.println(names);
		
		double arr [] = {2.3, 0.2, 4.3, 0.6};
		System.out.println("Sorting");
		Arrays.sort(arr);
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		System.out.println("Binary Search");
		int index = Arrays.binarySearch(arr, 4.3);
		System.out.println(index);
		
		int[] targetArrayObject = {11,4,6};
		
//		for (int i =0; i<targetArrayObject.length; i++) {
//			if(targetArrayObject[i]==4) {
//				System.out.println(i);
		
		
			}
		}
	

