package exceptions;

import java.io.IOException;

public class Furniture {

	public void assemble() throws ArithmeticException{
		
	System.out.println("assembling furniture");
}
	
	public void sell (double price) {
		System.out.println("selling item " + price);
	}

}

class Desk extends Furniture{
	
//	@Override
//	public void assemble() throws IOException{
//		System.out.println("assembling desk");
//	}
	
	@Override
public void assemble() throws RuntimeException{
System.out.println("assembling desk");
}
	
public void sell (double price) {
		System.out.println("selling item " + price);
	}
}