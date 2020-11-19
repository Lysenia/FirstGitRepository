package bs;

public class PracticeMore {

	
	public static void main(String args[]) {
		
		String actual = "About 1100,000,000 results (0,48 seconds";
		int expected = 1100000000;
		
		String []str = actual.replace(",", "").split(" ") ;
			
		
		System.out.println(str[1]);
		
		int result = Integer.valueOf(str[1]);
		
		System.out.println(result);
		
		
		String s = "I love java";
		String result1 ="";
		String [] temp = s.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result1 = temp[i] + result1;
            else
                result1 = " " + temp[i] + result1;
		
		}
		
		System.out.println(result1);
//		StringBuilder st = new StringBuilder(sentence);
//		String reversed = st.reverse().toString();
//		
//		System.out.println(reversed);
		
	}

}
