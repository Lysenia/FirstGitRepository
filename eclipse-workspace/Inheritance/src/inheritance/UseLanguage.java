package inheritance;

public class UseLanguage {

	public static void main(String args[]) {
		
		Language english = new Language("EN", "US", 26);
		
		System.out.println("Region " + english.getRegion());
		
//		make field number of letter immutable = remove the setter
		
	}
}
