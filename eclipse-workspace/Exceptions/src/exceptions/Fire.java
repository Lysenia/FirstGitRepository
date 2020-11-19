package exceptions;

public class Fire {
	public static void main(String args[]) {
	
		Fire f = new Fire();
		
		try {
			f.playWithFire();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void playWithFire() throws Exception {
		System.out.println("d something dangerous");
	}

}
