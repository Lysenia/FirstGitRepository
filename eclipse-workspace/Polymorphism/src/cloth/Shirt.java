package cloth;

public class Shirt extends ClothingItem {
	
	char size;
	String name;
	
	public Shirt(String name, double price, char size) {
	super(name,price);
	this.size = size;
	}
	
	@Override
	public String toString() {
		return "ShirtItem [name= " + name + " , price= " + price + "size=  " + size +  "]";
	}
	
	public void printShirtInfo() {
		System.out.println("shirt name " + name + " shirt price " + price + " shirt size " + size );
	}

}
