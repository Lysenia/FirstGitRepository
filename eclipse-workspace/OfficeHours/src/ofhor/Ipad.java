package ofhor;

public class Ipad extends Tablet{

	public Ipad() {
		this(3.2);
//		super(2.1);
		System.out.println("Ipad no args constructor");
	}
	
	public Ipad(double size) {
		
		super(size);
		System.out.println("Ipad  one args constructor");
	}
	
	public static void main(String args[]) {
		
		Ipad id = new Ipad();
		System.out.println(id.size);
		
		Ipad id1 = new Ipad(6.3);
		System.out.println(id1.size);
	}
}
