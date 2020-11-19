package javaback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collection_Practice {


		public static void main(String[] args) {
	        /// Create 2 list of String with Reference Type Collection
	        /// merge 2 lists 
	        /// create 3rd list and remove all the items in merged lst if 3rd lst have them
	        /// creare 4th list and retain whatever is common
			
			String[] fruits = {"apple", "tomato", "orange", "pear", "grapes", "cucumber", "apricot", "kivi"};
			
			Collection<String> fruits1 = new ArrayList<>();
			Collection<String> fruits2 = new ArrayList<>();
			
			for (int i = 0; i < fruits.length / 2; i++) {
				fruits1.add(fruits[i]);
				fruits2.add(fruits[fruits.length / 2 + i]);
			}
			
			System.out.println("fruits1: " + fruits1);
			System.out.println("fruits2: " + fruits2);
			
			Collection<String> allFruits = new ArrayList<>();
			allFruits.addAll(fruits1);
			allFruits.addAll(fruits2);
			System.out.println("\n- merge fruits1 and fruits2");
			System.out.println("allFruits: " + allFruits);
			
			Collection<String> vegetables = Arrays.asList(new String[] {"tomato", "cucumber"});
			System.out.println("\nvegetables: " + vegetables);
			System.out.println("\n- remove vegetables from allFruits");
			allFruits.removeAll(vegetables);
			System.out.println("allFruits: " + allFruits);
			
			System.out.println("\n- retain elements of allFruits that are common with fruits1");
			allFruits.retainAll(fruits1);
			System.out.println("allFruits: " + allFruits);
		}
	}