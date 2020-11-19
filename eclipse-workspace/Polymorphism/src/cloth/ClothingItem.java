package cloth;

public class ClothingItem {

	String name;
	double price;
	
	public ClothingItem(String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "ClothingItem [name=" + name + ", price=" + price + "]";
	}
	
	
}
