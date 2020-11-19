package abc;

public class Circle extends Shape{
	
	double radius;
	
	
	
	public Circle() {
		super("Circle");
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public static void main(String args[]) {
		
		Circle c1 = new Circle(2.3);
		c1.drow();
		double result =c1.calculateArea();
		
		System.out.println(result);
	}
	
	
@Override
public double calculateArea(){
	
	double area = Math.PI*radius; 
	return area;
}
@Override
	public  void drow(){
		System.out.println("drawing circle with radius" + radius);
	}

@Override
public  void superDraw(){
	System.out.println("super drawing");
}

}
