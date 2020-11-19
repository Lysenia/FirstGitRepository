package readfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFileOldDay {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		FileReader fr = null;
		BufferedReader br = null; 
		
try {
	fr = new FileReader("Numbers.txt");
	
		 br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
//		for(int i=1; i<=100; i++) {
//			System.out.println( i + " " +  br.readLine());
//		}
		
		String line =null;
		
		while((line = br.readLine())!= null) {
			System.out.println(line);
		}
}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
           catch(IOException e) {
	       e.printStackTrace();
}
		
		finally {
			
		
		br.close();
		fr.close();
	}
}
	
	

}
