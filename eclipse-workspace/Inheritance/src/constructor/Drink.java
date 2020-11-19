package constructor;

public class Drink {
	
	String name;
	String type;
	double size;
	
	
//	public Drink() {
//		
//	}
	public Drink(String name, String type, double size) {
		this.name = name;
		this.type = type;
		this.size = size;
		System.out.println("Parent three args constructor");
	}
	
	public Drink(String type, double size) {
		super();
		this.type=type;
		this.size=size;
		System.out.println("Parent two args constructor");
	}
}
