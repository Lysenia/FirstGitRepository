package oca;

public class Test47 {
	
	public static void main(String[] args) {
		try {
		method1();
		} catch (MyException me) {
		System.out.print("A");
		}
		}
		public static void method1() {//line n1
		try {
		throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		} catch (RuntimeException  re) { //RuntimeE is parent of MyException
		System.out.print("B");
		}
		}
		}

