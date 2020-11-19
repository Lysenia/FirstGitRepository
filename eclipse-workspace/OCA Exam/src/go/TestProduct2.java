package go;

public class TestProduct2 {
	
	public void updatePrice(Product2 product, double price) {
		price = price*2;
		product.price = product.price+price;
		
	}
	
	public static void main(String args[]) {
		
		Product2 prt = new Product2();
		prt.price=200;
		double newPrice = 100;
		
		TestProduct2 t = new TestProduct2();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + ":" + newPrice);
	}

}
