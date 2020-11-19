package inheritance;

public class Rectangle extends Shape {
	
	double width;
	double height;
	
	public Rectangle() {
		super("Rectangle");
	}
	
	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public  void calculateArea(){
		area=width*height;
		System.out.println("area is:" + area);
}

}