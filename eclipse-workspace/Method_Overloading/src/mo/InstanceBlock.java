package mo;

public class InstanceBlock {
//	static block
	
	public final int num;
	int num1;
	int num2;
	static {
		System.out.println("static block");
	}
//	instance block
	
	{
		num = 123;
	System.out.println("Instance Block");
	}
	
	public InstanceBlock(int i, int j) {
		this.num1=i;
		this.num2 = j;
		System.out.println("no argument constructor");
	}
	
	public static void main(String args[]) {
		System.out.println("Main started");
		InstanceBlock IB = new InstanceBlock(3,5);
		InstanceBlock IB1 = new InstanceBlock(4,5);
		System.out.println("Main ended");
		
	}

}
