package car;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getColor(){
		return color;
		
	}
	

	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public Car() {
//		this.make = "unknown";
//		this.model = "toBeDecided";
//		this.year = 2020;
		this("unknown","toBeDecided", 2020);
		
		System.out.println("No argument constructor");
	}
	
	public Car(String name, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("3 argument Constructor");
}
	
	
	public Car(String name, String model, int year,String color, double price) {
        this(name,model,year);
//		this.make = make;
//		this.model = model;
//		this.year = year;
		this.color = color;
		this.price = price;
		System.out.println("5 arguments Constructor");
	}


	public Car(String name, String model, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		System.out.println("Constructor for car 5");
}
	
	public void Display() {
		System.out.println(make + " " + model + " "  + year +  " " + color + " " + price) ;
	}
	}
