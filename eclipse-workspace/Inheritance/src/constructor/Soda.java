package constructor;

public class Soda extends Drink {
	
	
	public Soda(String name, String type, double size) {
		super("cola","light",1);
		System.out.println("three args constructor");
	}
	
	public Soda(String type, double size) {
		super("fanta",1);
		System.out.println("two args constructor");
	}
	
	public static void main(String args[]) {
		Soda cola = new Soda("Coca cola", "light", 12);
		Soda fanta = new Soda("Fanta",1);
		
		System.out.println(cola.name + cola.size + cola.type);
		System.out.println(fanta.name + fanta.size);
	}
}
