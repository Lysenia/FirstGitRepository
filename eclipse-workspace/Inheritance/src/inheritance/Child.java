package inheritance;

public class Child extends Parent {

	private int i = addNum() ;   //optional assignment with method
	public static int j = addStaticNum();  //optional assignment with method
	public static final int CONSTANT ; 
	
	public static void main(String[] args) {
		
		Child child = new Child(); 
		Child child2 = new Child(); 
	}
	public Child() {
		System.out.println("Child constructor");	
	}
	{System.out.println("Child instance block 1 ");}
	{System.out.println("Child instance block 2");}
	static {System.out.println("Child static block 1"); CONSTANT = 15 ; }
	static {System.out.println("Child static block 2");}
	
	public int addNum(){
		System.out.println("Child addNum to child instance field i ");
		return 5; 
	}
	public static int addStaticNum(){
		System.out.println("Child addStaticNum to child static field j ");
		return 6; 
	}	
}




