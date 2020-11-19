package rev;

public class DogReview {
	
	public static void main(String args[]) {
		
		Dog d1 = new Dog();
		d1.name = "Daizy";
		d1.size = 13;
		
		Dog d2 = new Dog();
		d2.name = "Lucky";
		d2.size = 8;
		
		Dog d3 = new Dog();
		d3.name = "Barkie";
		d3.size = 33;
		
		String location = "park";
		
		Dog [] manyDogs = {d1, d2, d3};
		
		for(int i=0; i<manyDogs.length; i++) {
			manyDogs[i].bark();
			
		}
		
		
//		my.bark();
//		System.out.println( my.name + " " + my.play(location));
//		
//		your.bark();
//		System.out.println( your.name + " " + my.play(location));
//		
//		his.bark();
//		System.out.println( his.name + " " + his.play(location));
		
	}

}
