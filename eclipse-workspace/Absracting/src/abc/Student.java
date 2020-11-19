package abc;


//we can not create an Object of an abstract class;
//abstract class can have or not have abstract methods;
// abstract class abstract method can not have a body;
// abstract class can have no-abstract method (with body);
// abstract class can not be final, as it meant to be extended
// abstract methods stay only in method class;
// if you have at least one abstract method, the class should be abstract to compile--------
// only abstract class can contain abstract method;

// we can have constructor in abstract class, but just to reuse the functionality in sub class by super()
// field and constructor can not be abstract, only methods and class can be abstract


public abstract class Student {

String name;
int studentID;

public Student(String name, int studentID) {
	super();
	this.name = name;
	this.studentID = studentID;
}




public abstract void createClass();
	
}
