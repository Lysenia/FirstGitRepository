package constructor;

public class Parent {
	
	String name;
	
	public Parent() {
		System.out.println("parent constructor message");
	}
	
	public Parent(String name) {
		this.name = name;
		System.out.println("one arg constructor from parent");
	}

}
