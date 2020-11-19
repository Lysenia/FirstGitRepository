package exceptions;

public class PlayWithFire {
	
	static void playWithFire() throws Exception{
		System.out.println("play with fire");
		throw new Exception();
	}
	
	static void playWithWater() throws RuntimeException{
		System.out.println("play with water");
		throw new RuntimeException();
	}
	
public static void main(String args[]) throws Exception {
	
	playWithFire();
	playWithWater();
	
}
}
