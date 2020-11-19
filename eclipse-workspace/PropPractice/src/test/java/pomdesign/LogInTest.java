package pomdesign;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationpractice.ConfigLoader;
import automationpractice.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest {
	
	WebDriver driver;
	LoginPage login;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/lesia/Documents/selenium dependencies/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	@Test
	public void loginTest() {
		driver.get(ConfigLoader.getMyValue("URL"));
		login = new LoginPage(driver);
		
		login.signIn.click();
		login.emailAddress.sendKeys(ConfigLoader.getMyValue("User"));
		login.password.sendKeys(ConfigLoader.getMyValue("Password"));
		login.signIn.click();
		String expected = "There is 1 error";
		String actual = login.assertmsg.getText();
		
		
	//assertEquals(actual, expected, "login failed");
		
		
		
	}
	

}
