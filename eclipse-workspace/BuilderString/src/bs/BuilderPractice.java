package bs;

public class BuilderPractice {

	public static void main (String args[]) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ABC");
		sb.append("EFG");
		sb.append("OP");
		sb.append(123);
		sb.append(true);
		
		String content = sb.toString();
		
		System.out.println(content);
		
		StringBuilder sb1 = new StringBuilder("ABCDEFG").append("dcf");
		System.out.println(sb1.toString());
		
		sb1.deleteCharAt(4);
		System.out.println(sb1.toString());
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append("I").append("LOVE").append("JAVA").append("I").append("WILL").append("TAKE").append("OCA").append("EXAM").
		append("IN").append("3 month");
		
//		sb3.delete(0, 3);
//		System.out.println(sb3.toString());
		
		
		StringBuilder sb4 = new StringBuilder();
		sb4.append("ready for the OCA? ").append(true).append("  When? ").append(" in ").append(3).append(" months ");
		System.out.println(sb4.toString());
		
		System.out.println (sb4.length());
//		 sb4.setLength(2);
		
		sb4.delete(0, 5);
		System.out.println(sb4.toString());
		System.out.println (sb4.length());
		
		sb4.insert(0, true);
		System.out.println(sb4.indexOf("OCA"));
		
		sb4.insert(16, "exam");
		System.out.println(sb4.toString());
		System.out.println("----------------");
		
		StringBuilder sb5 = new StringBuilder();
		sb5.append("I will learn Java and get certified");
		int index = sb5.indexOf("and");
		sb5.insert(index, "hard ");
		System.out.println(sb5.toString());
		sb5.replace(0, 1, "Lesia");
		int index2 = sb5.indexOf("get");
		sb5.insert(index2, "Lesia will ");
		System.out.println(sb5.toString());
		int last = sb5.lastIndexOf("Lesia");
        System.out.println(last);
//        sb5.setCharAt(8, 'l');
//        System.out.println(sb5.toString());
        sb5.reverse();
        System.out.println(sb5.toString());
		System.out.println(sb5.replace(0, sb5.length(), "<(^-^)>"));

		
		StringBuilder sb6 = new StringBuilder();
		sb6.append(3).append(8).append(20).append(1);
		sb6.reverse();
		System.out.println(sb6.toString());
		
		}
	
	
	
}
