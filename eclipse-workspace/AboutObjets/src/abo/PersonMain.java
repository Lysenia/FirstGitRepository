package abo;

import java.util.Scanner;

public class PersonMain {
	public static void main(String args[]) {
		Person p1 = new Person();
		p1.name = "Adam";
		p1.age = 20;
		p1.gender ='M' ;		
		
		System.out.println(p1.name);
		p1.eat();
		
		
		p1.read();
		
Person p2 = new Person();
p2.name = "Eva";
p2.age = 20;
p2.gender ='F' ;	
System.out.println("Person has the name of  " + p2.name + "  and she is  " + p2.age +  "Her gender is " 
		+ p2.gender);

p2.eat();
p2.read();
p2.run();
p2.sayHelloTo(p2.name);
p2.sayHelloTo("John");
p2.goHome("2611 Lackawanna Street", 10);
double result = p2.add2Numbers(1.1, 2.2, 3.3);
System.out.println("Result is " + result);
Scanner scanner =  new Scanner(System.in);


char initial = p2.getInitial();
System.out.println("Person has the name of  " + p2.name + "  and her initial is  " + initial);
System.out.println(p2.name + "  was born in " + p2.getBirthYear());
		
	}

}
 