package race;

public class Car {
	import java.util.Arrays;

	
	String make;
	String model;
	int year;
	double currentSpeed;
	boolean isRunning;
	
	public void start(){
		System.out.println("car is starting ");
		isRunning = true;
	}
	
	public void stop(){
		System.out.println("car is stopping ");
		isRunning = false;
	}
	
	public void accelerate(int targetSpeed) {
		if (currentSpeed>targetSpeed) {
	System.out.println("you are already running more than current speed");	
	return;
		}
		while(currentSpeed<=targetSpeed) {
			System.out.print(currentSpeed + ",");
			currentSpeed++;
			
}
		System.out.println();
	}
 
public void slowDown (int targetSpeed) {
	if (currentSpeed<targetSpeed) {
		System.out.println("you are already running less than current speed");	
		return;
			}
			while(currentSpeed>=targetSpeed) {
				System.out.print(currentSpeed + ",");
				currentSpeed--;
				
	}
			System.out.println();
		}

public String getCarInfo() {
return make + model + year;
}

public void roadDirections(String d1, String d2, String d3) {
System.out.print(" you are running direction 1 " + d1);
System.out.print(" you are running direction 2 " + d2);
System.out.print("you are running direction 3 " + d3);
}

public long getTotalDistance (long distanceArr []) {
long sum = 0;
for (int i=0; i<distanceArr.length; i++) {
sum =+ distanceArr[i];
}
return sum;
}

public long getMaxDistance(long [] distanceArr) {
long max = distanceArr[0];
for (int i=0; i<distanceArr.length; i++) {
if (distanceArr[i]>max) {
	max = distanceArr[i];
}
}
return max;
	
}

public long[] removeEdgeDistances(long distanceArr[]){
long newArr [] = new long[distanceArr.length-2];
Arrays.sort(distanceArr);
System.out.println(Arrays.toString(distanceArr));
for (int i =1; i<newArr.length-1; i++) {
newArr[i-1] = distanceArr[i];
}
return newArr;
}
}


}
