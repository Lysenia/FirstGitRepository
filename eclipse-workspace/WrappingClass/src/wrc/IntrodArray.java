package wrc;

import java.util.ArrayList;

public class IntrodArray {
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();


		
		list1.add("Adam");
		list1.add(0, "Eve");
		list1.add("Heaven");
		list1.add("Together");
		list1.remove("Eve");
		String index = list1.get(0);
		
		System.out.println("arrayList   " + list1);
		System.out.println("index  " + index);
		
for(int i =0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
}
System.out.println("for each loop");

for (String each: list1) {
			System.out.println(each);
		}
		
ArrayList<Integer> list2 = new ArrayList<Integer>();
//Integer num1 = new Integer(2);
list2.add(123);
list2.add(12);
list2.add(12333);
list2.add(345268);
list2.add(0, 777);
list2.remove(4);



System.out.println(list2);
		
ArrayList<Double> list3 = new ArrayList<>();
	}

}

