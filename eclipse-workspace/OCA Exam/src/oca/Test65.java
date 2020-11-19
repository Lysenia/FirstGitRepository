package oca;

class MyString {
String msg;

MyString(String msg) {
this.msg = msg;
}
}


public class Test65 {

public static void main(String[] args) {
	
System.out.println("Hello" + new StringBuilder("Hello " + "Java SE 8"));
System.out.println("Hello" + new MyString("Hello " +"Java SE 8"));
}

}