package computer;

import inheritance.Computer;

public class PC extends Computer{
	
	double windowsVersion;
	
	void pcCompute() {
		super.compute();
		System.out.println(storage);
	}
	
	
	

}
