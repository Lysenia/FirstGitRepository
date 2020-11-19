package zoo;

public class Animal {
	
	
	String name;
	
	public void makeNoise() {
		System.out.println("making noize");
	}
	
	public void eat() {
		System.out.println("eating...");
	}

	public String getAnimalName() {
	return "Animal";
	}
	
	public void printNumberOfLegs(int legs) {
		System.out.println("print number of legs");
	}
	
	public int add() {
		return 9;
	}
	
}

