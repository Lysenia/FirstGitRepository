package ready;

public class Forest {
	
	public long treeCount;
	
	public Forest() {
		this.treeCount = treeCount +2;
		
	}
	

	public int chooseWisely(int choice) {
		return 5;
	}
	

	public int chooseWisely(long choice) {
		return 11;
	}
	
	public int chooseWisely(short choice) {
		return 2;
	}
	
public static void main(String []path) {
	System.out.println(new Forest().chooseWisely((byte) 2+1));
}
}
