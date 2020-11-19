package oca;

import subp.SuperDuper;

public class SubClass extends SuperDuper {

	public static void main(String args[]) {
		
		SubClass sb = new SubClass();
		System.out.println(sb.x);
//		only subclass object can access in different package
		
		SuperDuper sup = new SuperDuper();
//		for superclass object the protected fields are not accessible
	}
}
