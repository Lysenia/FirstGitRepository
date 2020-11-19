package overriding;

public class Mac extends Computer{
	
//	int ram; - hiding the field
	
//	int ram = 10;
	
	double ram = 10;
	
	public void printRam() {
		System.out.println(ram);
		System.out.println(super.ram);
	}
	
	@Override
	public void compute() {
		System.out.println("computing with Mac");
		super.compute();
		
	}
	@Override
	public Object getAnyObject() {
		compute();
		return 12;
	}
	
	public void printComputerRam() {
		System.out.println(ram);
	}
	
	static void computeMethod() {
		System.out.println("hiding static");
	}

	
	public static void main(String args[]) {
		 Mac mac = new Mac();
		 mac.compute();
		 System.out.println(mac.ram);
		 mac.printRam();
		 mac.printComputerRam();
		 Computer.computeMethod();
		 Mac.computeMethod();
		 
		 
	}
	
}
