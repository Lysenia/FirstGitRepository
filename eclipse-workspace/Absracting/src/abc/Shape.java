package abc;

public abstract class Shape extends SuperShape {
	
	String name;
	double area;
	
	public abstract double calculateArea();
	
	public abstract void drow();
	
	public Shape() {
	
	}
	
	public Shape(String name) {
		this.name = name;
	}
	

}
