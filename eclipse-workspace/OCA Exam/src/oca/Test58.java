package oca;

public class Test58 {
	public static void main(String[] args) {
		int []intArr = {15,30,45,50,65};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		
		for(int each:intArr) {
			
		System.out.println(each);
	}
	}

}
