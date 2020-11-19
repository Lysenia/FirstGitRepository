package saturday;

public class StringPractice {
	public static void main(String[] args) {
		String str = "Nice Day";
		System.out.println(str.substring(0, 3)+str.substring(3, 4).toUpperCase()+" "+
		str.substring(5, 7) + str.substring(7).toUpperCase());
		
System.out.print(str.replace('e','E').replace('y', 'Y'));
//		System.out.print(str.substring(2).toUpperCase().substring(3, 5));
	}

}
