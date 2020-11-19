package constructor;

public class Child extends Parent {

	// by default, first line of any sub class constructor a call to super() no args constructor by super();	
	int age;
	
	public Child() {
		super("random name");
		System.out.println("child constructor message");
	}
	
//	public Child (int age) {
//		this.age = age;
//	}
//	
	public static void main(String args[]) {
		
		Child c = new Child();
	}

}
