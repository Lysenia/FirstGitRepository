package iframespopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}
//	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	public void switchByTitle(String title) {
	String original = driver.getWindowHandle();	
	
	for(String handle: driver.getWindowHandles()) {
		//driver.switchTo().window(handle);
		//if(!firstWindow)
		
	}
	}
}
