package abs;

public class InstanceOfPractice {
	
	public static void main(String[] args) {
		
		Object o = new Person("John",54);
		Person p;
		
		if(o instanceof Person) {
		p = (Person)o;
		System.out.println("cast sucessful");
		}
		else {
			System.out.println("could not cast");
		}
		
		Object o2 = new Object();
        Person p1;
		
		if(o2 instanceof Person) {
		p1 = (Person)o;
		System.out.println("cast sucessful");
		}
		else {
			System.out.println("could not cast");
		}
		
		
		
//		boolean b1 = o instanceof Person;
//		boolean b2 = o instanceof Object;
//		boolean b3 = o instanceof Engineer;
//		boolean b4 = o instanceof Smarty;
//		boolean b5 = o instanceof Duck;
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		System.out.println(b4);
//		System.out.println(b5);
	}

}
