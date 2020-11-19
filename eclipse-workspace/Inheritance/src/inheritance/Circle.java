package inheritance;

public class Circle extends Shape {
	
	double radius;
	
	public Circle() {
		super("Cirle");
	}
	
	public Circle(String name, double radious) {
		super(name);
		this.radius=radius;
		
	}
	
	@Override
	public  void calculateArea(){
//		area=Math.PI*radius*radius;
		area = Math.PI*Math.pow(radius, 2);
//		System.out.println("area is:" + area);
}

}
