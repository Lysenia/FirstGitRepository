package cal;

public class Apple {

	private String name;
	private int size;
	
	private Apple() {
		prepareSecretSliceMenu();
		System.out.println("no arg apple");
	}
	
	public Apple(String name) {
		this();
		this.name = name;
	}
	
	public Apple(String name, int size) {
		this (name);
		this.size = size;
	}
	
	public void slice() {
		prepareSecretSliceMenu();
		cutIntoSecretShape();
	}
	
	private void prepareSecretSliceMenu() {
		System.out.println("preparing the secret");
	}
	
	private void cutIntoSecretShape() {
		System.out.println("cutting the secret shape");
	}
	
	
	
	}

