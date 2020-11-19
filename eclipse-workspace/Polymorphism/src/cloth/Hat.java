package cloth;

public class Hat extends ClothingItem {

	String type;
	
	public Hat(String name, double price, String type) {
		super(name,price);
		this.type = type;
		}
	
	@Override
	public String toString() {
		return "HatItem [name= " + name + ", price= " + price +  " type " + type + "]" ;
	}
	
	public void printHatInfo() {
		System.out.println(" hat name " + name + " hat price " + price + " hat type " + type );
	}
}
