package inheritance;

public class ShapeTest {
	
	public static void main(String args[]) {
		
		Circle c = new Circle("Circle",4);
		c.calculateArea();
		System.out.println(c.name);
		System.out.println(c.radius);
		System.out.println(c.area);
		
		Rectangle r = new Rectangle("Rectangle",3,4);
		r.calculateArea();
	}

}
