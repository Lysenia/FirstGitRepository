package mo;

public class Phone {
	
	final String brand = "Apple";
	private final double size;
	public final  static String PLATFORM = "iOS";
	
	public Phone (double size) {
		this.size = size;
	}
	
//	public Phone(String brand, double size) {
//		this.brand = brand;
//		this.size = size;
//		}

	
	public static void main (String args[]) {
		
//		Phone p1 = new Phone ("iPhone", 2.0);
//		Phone Sumsung = new Phone("Sumsung", 3.0);
//		System.out.println(iPhone.size);
//		System.out.println(Sumsung.size);
		
		
		Phone p1 = new Phone(4.7);
		System.out.println(p1.brand);
		System.out.println(Phone.PLATFORM);
//		p1.brand = "sumsung"; will not compile because of final 
		
		System.out.println(Integer.MAX_VALUE);
		
	}
	

}
