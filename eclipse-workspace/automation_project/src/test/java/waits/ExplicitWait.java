package waits;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}
	
	@Ignore
	@Test
	public void oneWhereImplicitDoesNotWork() {
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.tagName("button")).click();

		WebElement message = driver.findElement(By.cssSelector("#finish h4"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(message));

		Assert.assertEquals(message.getText(), "Hello World!");

	}
	
	@Test
	public void waitForDissapear() {
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.tagName("button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
		
		assertTrue(driver.findElement(By.cssSelector("#finish h4")).isDisplayed());
	}

}
