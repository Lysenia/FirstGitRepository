package timefortherace;

import java.util.Arrays;

public class RoadTest {
	
public static void main(String[] args) {
		
		Car car = new Car(); 
		car.make = "BMW" ; 
		car.model = "X6";
		car.year = 2019 ;
		car.isRunning = true ; 
		car.currentSpeed = 15; 
		
		car.accelerate(100);
		car.slowDown(25);
		
		
		long[] arr = {1,2,3,4,555,666,7,78};
		System.out.println(Arrays.toString(car.removeEdgeDistance(arr)));
		long[] distanceArr = {1,2,3,4,555,666,7,78};
		
		
		System.out.println( " current speed is " + car.currentSpeed);
		System.out.println(car.isRunning);
		System.out.println(" This is my car info: " + car.getCarInfo());
		System.out.println(" Maximum distance is " + car.getMaxDistance(distanceArr));
		System.out.println(" total distance is " + car.getTotalDistance(distanceArr));
		System.out.println(" edge distance is " + Arrays.toString(car.removeEdgeDistance(distanceArr)));
		
		
		///create a Car class
		// it has 5 attributes. fields called make , model , year, currentSpped, isRunning
				// type  :                   String  String   int , double,      boolean 
		// it has few methods as below 
		
		// 1, start take no parameter and return nothing, it will make isRunning = true 
		// 2, stop take no parameter and return nothing  it will make isRunning = false 
		// 3, accelerate will take 1 parameter as int as target speed return nothing
				// if you have current speed of 10 and target speed of 20 , it will print 10,11,12,13-----20
		// 4, slowDown will take 1 parameter as int as target speed return nothing
			// if you have current speed of 100 and target speed of 20 , it will print 100,99,98,97-----20
		
		// 5 , getCarInfo  will take no parameter and return make , model , year as one String 
		
		// 6 , readDirection take 3 string parameters and return nothing 
					// inside method print the isntruction : 
					// if your 3 String have value or left right right , it should output as below
					// turning left and turning right and turning right according to the parameters
		// 7 , getTotalDistance have 1 parameter as long array 
					//and it will return the sum of the long values
		// 8 , getMaxDistance take 1 parameter as long array and it will return maximum distance 
		// 9 , removeEdgeDistances take 1 paremeter as long array 
						//--> sort the array and remove the longest distance and shortest distance 
						// and return new array without them
		
		
		
		

	}

}



