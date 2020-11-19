package rev;

public class Dog {
	
String name;
int size;

public void bark() {
	if(size >20) {
		System.out.println( name + " " + "woof woof woof");
	}
	else if (size >10) {
		System.out.println(name + " " + "ruff ruff");
	}
	else {
		System.out.println(name + " " +  "no barking today");
		
	}
}
public int play(String location) {
	if(location.equalsIgnoreCase("park")) {
		return 1;
	}
	else {
		return 0;
	}
}
}
