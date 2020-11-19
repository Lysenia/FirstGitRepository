package cloth;

public class Wardrobe {
	
	public static void main(String args[]) {
		
		
		ClothingItem cl1 = new Shirt("Polo",10.00,'L');
		ClothingItem cl2 = new Hat("hat",8.00,"cup");
		
		System.out.println(cl1.name);
		
		ClothingItem cl4 = new ClothingItem("jeans",13.99);
		System.out.println(cl4.toString());
		System.out.println(cl1.toString());
		System.out.println(cl2.toString());
		
//		cl1.printShirtInfo(); - not visible, does not compile
//		cl2.printHatInfo(); - not visible, does not compile
		
		Shirt sh = new Shirt("V-neck",33.00,'M');
		
		ClothingItem cl3 = sh;
		
		Hat h = new Hat("hat",8.00,"winter hat");
		System.out.println(sh.toString());
		System.out.println(h.toString());
		sh.printShirtInfo();
		h.printHatInfo();
	}

}
