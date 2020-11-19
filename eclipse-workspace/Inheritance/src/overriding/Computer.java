package overriding;

public class Computer {
	
	int ram = 15;
	
	public Computer() {
		
	}
	
	
	public void compute() {
		System.out.println("computing");
		
	}
	
	public Object getAnyObject() {
		return "my Object";
	}
	
	public void printComputerRam() {
		System.out.println(ram);
	}
	
	static void computeMethod() {
		System.out.println("inheriting static");
	}
	
}
