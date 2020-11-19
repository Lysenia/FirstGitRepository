package comp;

public class Main {
	
	public static void main(String args[]) {
		
	Electronics e = new Computer();
		
	System.out.println(e.memorySize);
	Electronics.doSomething();
	e.printMemorySize();
	Electronics.printUsbType();
}
}