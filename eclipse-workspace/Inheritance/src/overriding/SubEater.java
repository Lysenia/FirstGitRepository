package overriding;

public class SubEater extends Eater {
	
	
//	@Override
//	public Fruit buyFruit() {
//		Fruit f = new Fruit(5);
//		return f;
//	}

//	@Override
//	public Apple buyFruit() {
//		Apple a = new Apple(3);
//		return a;
//	}
	
	public Integer returnSomething() {
		return null;
	}

	@Override
	public Orange buyFruit() {
		Orange o = new Orange(2);
		return o;
	}
}
