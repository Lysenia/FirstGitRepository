package sunday_Murodil;

import animal.Animal;

public class Family {

	public static void main(String args[]) {
		Parent dad = new Parent();
		dad.name = "Walter";
		dad.sayName();
		
		Child son = new Child();
		son.name = "Bob";
		son.sayName();
		
		Animal chettah = new Animal();
		chettah.setName( "Chitta");
		
		
	}
}
