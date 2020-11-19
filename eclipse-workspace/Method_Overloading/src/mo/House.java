package mo;

public class House {
	
	private String type;
	private int houseNumber;
	private double price;
	
	static String neighborhood;
	
	public String getType() {
		return type;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}

	public double getPrice() {
		return price;
	}

	

	
	
	public House() {
		System.out.println("creating empty house");
	}
	
	public House(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public House(String type, int houseNumber,double price ) {
		this(houseNumber);
		this.type = type;
		this.price = price;
	}

}
