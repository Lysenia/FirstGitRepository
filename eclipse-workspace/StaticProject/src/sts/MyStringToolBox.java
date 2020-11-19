package sts;

import java.util.ArrayList;

public class MyStringToolBox {

	public String targetString;
	
	public MyStringToolBox() {
		System.out.println("no args");
	}
		

	public MyStringToolBox(String targetString) {
		this.targetString = targetString;
	}
	
	public int calculateSum() {
		int sum=0;
		for(int i=0; i<targetString.length(); i++) {
         if (Character.isDigit(targetString.charAt(i))) {
//        	 String s = "" + targetString.charAt(i);
        	 String s = String.valueOf(targetString.charAt(i));
        	 sum = sum + Integer.parseInt(s);
         }
		}
		return sum;
}




public ArrayList<Character> getList(){
	ArrayList<Character> list = new ArrayList<Character>();
	for(int i=0; i<targetString.length();i++)
		if (Character.isAlphabetic(targetString.charAt(i))) {
			list.add(targetString.charAt(i));
		}
		
	
return list;

}
}

