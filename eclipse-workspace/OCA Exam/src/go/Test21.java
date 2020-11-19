package go;

public class Test21 {
	
	void readCard(int cardNo) throws Exception{
		System.out.println("Reading card");
	}

	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Checking card");
	}
	
	public static void main (String args[]) throws Exception {
		Test21 ex = new Test21();
		int cardNo = 12344;
		
		ex.checkCard(cardNo);
		ex.readCard(cardNo);
		
}
}