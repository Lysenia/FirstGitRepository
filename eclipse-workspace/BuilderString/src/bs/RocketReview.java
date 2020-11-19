package bs;

public class RocketReview {
	
	public static void main(String args[]) {
		
		Rocket r1 = new Rocket(100, "SpaceX", 24, false);
		Rocket r2 = new Rocket(100, "Apollo", 24, false);
		
		r1.lounch();
		r2.lounch();
		
		System.out.println(Rocket.counter);
		System.out.println(Rocket.LounchPad);
		Rocket.capsulate();
	}

}
