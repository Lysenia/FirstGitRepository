package inheritance;

public class Computer {

	protected double storage;
	protected String ramType;
	
	public Computer() {
		
	}
	
	public Computer(double storage, String ramType) {
		this.storage=storage;
		this.ramType = ramType;
		
	}
	
	protected void compute () {
		System.out.println("computing");
	}
	
	protected void display() {
		System.out.println("comuter info:  " + storage + "  ramType: " + ramType);
	}
}

