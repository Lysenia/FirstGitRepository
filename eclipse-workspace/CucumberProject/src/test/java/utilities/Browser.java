package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	private static WebDriver  driver;
	
	public static WebDriver getDriver() {
	
		if(driver == null || ((RemoteWebDriver)driver).getSessionId() == null) {
		
				if(Config.getPropertyValue("browser").equalsIgnoreCase("chrome")) {
					 WebDriverManager.chromedriver().setup();
					 driver = new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				else if(Config.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				else {
					WebDriverManager.chromedriver().setup();
					 driver = new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
	}
		return driver;
	}
	
}
