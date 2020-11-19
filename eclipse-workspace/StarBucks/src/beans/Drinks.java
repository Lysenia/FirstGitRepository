package beans;

import java.util.Arrays;
/**
 * This class is a super Class for any type of Drink classes
 * @author lesia
 *
 */
public class Drinks {
	
	private String name;
	private String size;
	private int calories;
	private double price;

	public Drinks(String name, String size, int calories, double price) {
		super();
		setName(name);
		setSize(size);
		this.calories = calories;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		if(size.equals("tall")|| size.equals("grande")||size.equals("venti") ) {
		this.size = size;
	}
		else {
		System.out.println("wrong size");	
		}
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drinks [name=" + name + ", size=" + size + 
				", calories=" + calories + ", price="
				+ price + "]";
	}
	
}
