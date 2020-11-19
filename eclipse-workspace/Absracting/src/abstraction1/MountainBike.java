package abstraction1;

public class MountainBike implements Bike,MotorCycle{
	
	public String name;
	public int gear;
	
	
	public MountainBike(String name, int gear){
		this.name = name;
		this.gear = gear;
	}
	
	public void stepOnPaddle(){
	System.out.println("stepping on paddle");	
	};
	
	public String changeDirection (String direction) {
		return direction;
		
	}
	
	public void speedUp() {
		System.out.println("speeding up");	
	}
	
	public void rideOnMountain() {
		System.out.println("riding on mountingBike" + Bike.BIKENAME);	
	}
	
	public static void main(String args[]) {
		
	}

}
