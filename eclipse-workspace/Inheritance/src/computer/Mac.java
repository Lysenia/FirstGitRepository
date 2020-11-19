package computer;

import inheritance.Computer;

public class Mac extends Computer {

	public double macOSversion;
	
	void macCompute() {
		this.compute();
		System.out.println(this.storage);
	}
}
