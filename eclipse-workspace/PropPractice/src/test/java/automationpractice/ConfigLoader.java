package automationpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private static Properties prop;

	static {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("config.properties");
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String getMyValue(String key) {

		return prop.getProperty(key);
	}


}
