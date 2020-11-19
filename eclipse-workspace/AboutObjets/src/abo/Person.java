package abo;

public class Person {

	String name;
	int age;
	char gender;
	
public void eat() {
System.out.println(name +"  is eating");
}

public void sayHelloTo(String target){
	System.out.println("Hello, " + target );
	
}

public void goHome(String target, int destination){
	System.out.println("I go to " + target + "adress is" + "destination" );
}

public double add2Numbers(double n1, double n2, double n3){
	return n1 + n2 + n3;
}
public void read() {
System.out.println(name+ " is reading Agile and " + age+ " years old" ); 

if(gender =='M') {System.out.println("he");
}
else if(gender =='F') {
System.out.println("she");
}
}
public void run() {
	}
		
public char getInitial() { 
	char c = name.charAt(0); 
	return c;

}
public int getBirthYear() {
	
	return 2018 -age;
}
}