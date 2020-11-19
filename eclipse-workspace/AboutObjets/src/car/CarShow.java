package car;

public class CarShow {
	
	public static void main(String args[]) {
		
		Car c1 = new Car();
		Car c2 = new Car("Mazda", "Toyota", 2018);
		Car c3 = new Car("BMW", "bmw", 2017, "blue", 20000);
		Car c4 = new Car("Lucky", "Toyota", 2008, "green", 24000);
		Car c5 = new Car("Wix", "Honda", 22000);
		
		c5.setPrice(1000);
		
		Car[] allCars = {c1, c2, c3, c4, c5};
		for(Car eachCar: allCars) {
			eachCar.Display();
		}
	}

}
