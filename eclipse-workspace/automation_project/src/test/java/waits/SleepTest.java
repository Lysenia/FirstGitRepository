package waits;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SleepTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.tagName("button")).click();
		WebElement message = driver.findElement(By.xpath("//h4[.='Hello World!']"));
		//Thread.sleep(5000);
		//new Actions(driver).pause(5000);//same as tread.sleep - but depreciated selenium thing, 
		//not used anymore
		
		assertTrue(message.isDisplayed(), "Message not displayed");

	}

}
