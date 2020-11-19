package abs;

public class BadCasting {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Vik",12);
//Engineer e1 = (Engineer)p1; class Cast exception
		
Object o = new Object();
//		String s = (String)o;
//		
Person p2 = new Engineer("Sam",45,34);
//		Engineer e2 = (Engineer)p2;
		
//		Person p3 = new Person("Bob",34);
//		Engineer e3 = (Engineer) p3;
		
		boolean b1 = o instanceof Person;
		System.out.println(b1);
		boolean b2 = o instanceof Object;
		System.out.println(b2);
		boolean b3 = o instanceof Duck;
		System.out.println(b3);
		boolean b4 = p2 instanceof Engineer;
		System.out.println(b4);
	}

}
