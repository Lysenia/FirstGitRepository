package maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WarmUp2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			names.add(input.nextLine());
		}

		Set<String> set = new HashSet<>(names);
		System.out.println(set.size());

		// int aaaFrequency = Collections.frequency(names, "AAA");

		// for(String eachSet: set) {
		// int count=0;
		// for(String each: names) {
		// if(eachSet.equals(each)) {
		// count++;
		// }
		// }
		// System.out.println("String:"+eachSet+" count: "+count);
	}

}
