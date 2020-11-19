package men;

import java.util.Arrays;

public class ForEachAssignValue {

	
public static void main(String args[]) {
	
	int [] arr = new int[5];
	
	for(int i=0; i<arr.length; i++) {
		int each = arr[i];
		each =5;
		
	}
	
	for(int each: arr) {
		each=5;
	}
	
	System.out.println(Arrays.toString(arr));
}
}
