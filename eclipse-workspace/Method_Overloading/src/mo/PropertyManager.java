package mo;

public class PropertyManager {
	public static void main(String args[]) {
		
		
	
		House h1 = new House();
		House h2 = new House(123);
		House h3 = new House("small",3,8300);
		
		System.out.println("house number is  " +  h1.getHouseNumber());
		System.out.println("house number is  " +  h2.getHouseNumber());
		System.out.println("house number is  " +  h3.getHouseNumber());
		
		House.neighborhood= "Cybertek";
		h2.neighborhood = "Cybertek 123";
		
		System.out.println(House.neighborhood);
	}

}
