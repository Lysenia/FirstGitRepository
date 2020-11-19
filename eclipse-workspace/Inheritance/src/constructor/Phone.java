package constructor;

public class Phone {

	private String brand;
	private double size;
	
	public String getBrand() {
		return brand;
	}
	
	public double getSize() {
		return size;
}
	public Phone() {
		
	}
	public Phone(String brand, double size) {
		this.brand  = brand;
		this.size = size;
	}
	
	protected void makeCall() {
		System.out.println("calling");
	}
}
