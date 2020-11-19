package oca;

public class ProductTest43 {
	
	int id;
	String name;
	
	public ProductTest43(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		
		
		ProductTest43 p1 = new ProductTest43(101,"Pen");
		ProductTest43 p2 = new ProductTest43(101,"Pen");
		boolean ans1 = p1==p2;
		boolean ans2 = p1.name.equals(p2.name);
		System.out.println(ans1 + " " + ans2);
	}
	

}
