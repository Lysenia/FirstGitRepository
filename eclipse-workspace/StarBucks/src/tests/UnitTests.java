package tests;

import org.junit.Test;

import beans.Coffee;
import beans.Drinks;
import beans.Tea;


public class UnitTests {
	
	@Test
	public void coffeeTests() {
		
		Coffee coffee = new Coffee("FRESHLY BREWED COFFEE","toll",5,1.75);
		System.out.println(coffee.toString());
		
		Drinks water = new Drinks("TEA","toll",5,1.75);
		System.out.println(water.toString());
	}
		
		@Test
		public void teaTests() {
			
			Tea tea = new Tea("PEACH GREEN TEA LEMONADE","grande",130, 3.25);
			System.out.println(tea.toString());
			
			
	}
	

}
