package pol;

public class AnimalAction {
	
	public static void main (String args[]) {
		
		Animal[] farmAnimal = new Animal [3];
		farmAnimal[0] = new Dog();
		farmAnimal[1] = new Horse();
		farmAnimal[2] = new Cat();
		
		for(Animal each:farmAnimal) {
			each.eat();
		}
		
		Horse h1 = new Horse();
		Animal a5 = h1;
		
		Object o1 = new Horse();
		h1.eat();
		a5.eat();
		
//		h1 = (Horse) a5;
		
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		Animal a4 = new Horse();
	   
		Mammal m1 = new Animal();
	    Mammal m2 = new Dog();
	    Mammal m3 = new Cat();
	    Mammal m4 = new Horse();
	    
	    Dog d1 = new Dog();
	    Cat c1 = new Cat();
	    Horse h2 = new Horse();
	    
//	   a1.eat();
//	   m1.eat();
//	   m2.eat();
//	   d1.eat();
//	   c1.eat();
	   
	}

}
