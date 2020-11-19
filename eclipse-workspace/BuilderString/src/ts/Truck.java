package ts;

public class Truck {
	
	private String name;
	private int year;
	private double price;
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYaer(int year) {
		this.year = year;
	}
	
	public void setPrice(double d) {
		this.price = d;
	}
	
	public Truck(String name) {
		this.name = name;
	}
	
	public Truck(String name, int year, double price) {
		this.name = name;
		this.year = year;
		this.price = price;
	}
	
	public String toString() {
		return "[Truck name " + name + " year: "+ year+ " price " + price;
	}
	
	public void doMonsterThing() {
		System.out.println("jump through the river");
		System.out.println("deliver pizza");
		System.out.println("Do some nice monster stuff");
	}
}
