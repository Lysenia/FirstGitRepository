package bs;

public class Calculation {
	
	int num;
	
	public Calculation add(int num) {
		
		this.num += num;
		System.out.println(this.num);
		return this;
	}
	
	public static void main (String args[]) {
		
		Calculation c = new Calculation();
System.out.println(c.num);
		
		c.add(12);
		c.add(12).add(13).add(16).add(123);
		//System.out.println(c.num);
		
		
//		c.add() = 12;
//		c.add() ;
//		c.add()
//		
	}

}
