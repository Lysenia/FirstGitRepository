package comp;

public class Computer extends Electronics {
	
	static double Usb = 2.0;
	
	static void printUsbType() {
		System.out.println("Computer " + Usb);
	}
		
	int memorySize = 10;
	
	void printMemorySize() {
		System.out.println("Computer " + memorySize);
	}
	
	static void doSomething() {
		System.out.println("do computer stuff" );	
		}
}
