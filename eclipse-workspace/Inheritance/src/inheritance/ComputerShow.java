package inheritance;

import computer.Mac;
import computer.PC;

public class ComputerShow {

	public static void main(String args[]) {
		
	
		Mac mac = new Mac();
		mac.storage =5.2;
		mac.ramType ="SolidState";
		mac.macOSversion=11.1;
		mac.compute();
		mac.display();
	}
}
