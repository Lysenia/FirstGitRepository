package readfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClose {
	
	public static void main(String[] args) {
		
	
// try with resources 
//		where we use {} after try and open files there, it will close the open files automatically at the end		

		try {
	FileReader fr = new FileReader("Numbers.txt");
	
	BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		

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
		
		
}
	
	

}
		
