package mo;

public class Overloading {

	public static void main(String args[]) {
		
		doSomething(15);
		doSomething(new Long("12344"));
	}
	
	static void doSomething(long l) {
		System.out.println("primitive long");
	}
	
	static void doSomething(Integer inte) {
		System.out.println("integer type");
	}
	static void doSomething(Long l) {
		System.out.println("wrapper Long");
	}
}
