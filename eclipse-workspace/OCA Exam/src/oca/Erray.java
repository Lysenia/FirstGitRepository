package oca;

import java.util.ArrayList;

public class Erray {
	public static void main (String args[]) {
		
		int[] array = {6,9,8};
		
ArrayList<Integer> list = new ArrayList<>();

list.add(array[0]);
list.add(array[2]);
list.set(1, array[1]);
list.remove(0);

System.out.println(list);

		
		

}
}