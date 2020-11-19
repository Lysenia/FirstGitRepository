package overriding;

public class Eater {
	
	public Fruit buyFruit() {
		Fruit f = new Fruit(5);
		return f;
	}

	public Object returnSomething() {
		return null;
	}
}
