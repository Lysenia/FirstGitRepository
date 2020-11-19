package overriding;

public class ElectonicActivity {
	
	public static void main(String args[]) {
		
		Electronic e = new Electronic();
		e.isOn();
	
		TV tv = new TV ();
		System.out.println(tv.isOn);
		
	}

}
