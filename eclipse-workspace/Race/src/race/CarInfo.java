package race;


public class CarInfo {
	
public void main (String args[]) {
		
		Car car = new Car();
		car.make = "Toyota"; 
		car.model = "X7";
		car.year = 2018;		car.currentSpeed = 15.00;
		boolean isRunning = true;
		
		car.accelerate(100);
		car.slowDown(25);
		car.getCarInfo();
//		car.roadDirections(d1, d2, d3);

}
}
