package go;

public class Test37_2 {
	
	int x;
	int y;
	
	public void doStuff(int x, int y) {
		this.x = x;
		y = this.y;
	}
	
	public void display() {
	System.out.println("x:" + x + "y:" + y);	
	}

	public static void main(String args[]) {
		
		
	

		Test37_2 m1 = new Test37_2 ();
		m1.x = 100;
		m1.y=200;
		
		Test37_2 m2 = new Test37_2 ();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
	}
}
