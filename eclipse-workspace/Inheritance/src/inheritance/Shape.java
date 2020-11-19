package inheritance;

public abstract class Shape {

	
	String name;
	double area;
	

	
	public Shape(String name) {
		this.name = name;
	}
	
	public Shape(String name, double area) {
		this(name);
		this.area = area;
	}
	
	public abstract void calculateArea();
}
