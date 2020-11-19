package overriding;

public class Test {

	public static void main(String args[]) {
		
		Test t = new Test();
		System.out.println(t.toString());
	}
	
	@Override
	public String toString() {
		return "MY OWN MESSAGE";
	}
}
