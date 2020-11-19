package zoo;

public class Tiger extends Animal{

	
	public static void main(String args[]) {
		
		Tiger t = new Tiger();
		t.makeNoise();
		System.out.println(t.getAnimalName());
	}
	
	String name;
	@Override
	public void makeNoise() {
//		eat() - can be used also;
//		this.eat(); - can be used
		super.eat();
		super.makeNoise();
//		makeNoise(); will call itself and never come to the print statement
		System.out.println("Tiger ROAR!!!");
		
		
	}
	public String getAnimalName() {
		return super.getAnimalName() + "  Tiger  ";
}
//	 
//	public void printNumberOfLegs(Integer legs) { - is not overriding
//		System.out.println("print number of legs");

@Override
public int add() {
	return 9;
}
}

