package sts;

public class Water {
	
	static int count;
	static int countOfGetNameCall;
	private String name;
	private int age;
	
	public Water (String name,int age) {
		this.name=name;
		this.age=age;
		count++;
	}
	
	public String getName() {
		countOfGetNameCall++;
		return name;
	}
	
	public int getAge() {
		return age;
	}


	

}
