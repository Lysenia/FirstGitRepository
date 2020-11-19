package iframespopups;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestsDependOnEachOther extends TestBase {

	@Test
	public void opensThePage() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void types() {
		driver.findElement(By.name("q")).sendKeys("abdcggde");
	}
}
