package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Map.Entry;

public class Config2Loader {
	
	
		
		public static void main(String[] args) {
			Properties prop = new Properties();
			
			try {
				FileInputStream fis = new FileInputStream("./config2.properties");
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			for( Entry<Object, Object> eachEntry:	prop.entrySet()) {
				System.out.println(eachEntry);
		}
		}

	}



