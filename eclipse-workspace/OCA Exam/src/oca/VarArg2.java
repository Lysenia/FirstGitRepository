package oca;

public class VarArg2 {
	
	public static void sum(Object... varArg) {
		System.out.println(varArg[0]);
		System.out.println(varArg[1]);
		System.out.println(varArg[2]);
		
		}
			
	public static void main(String args[]) {
		
		for (int i=0; i<=args.length; i++)
			System.out.println(args[i]);
		sum("java", true, 123);
	}
}
