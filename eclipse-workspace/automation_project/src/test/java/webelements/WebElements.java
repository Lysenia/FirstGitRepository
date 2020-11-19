package webelements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
		@Test
		public void myLinks() {
			driver.get("https://github.com");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int numberOfLinks = links.size();
			System.out.println(numberOfLinks);
			
					for(WebElement each : links) {
						if(!each.getText().isEmpty())
					            System.out.println(each.getText());
					        }
	
		List<String>list = new ArrayList<>();
		for(WebElement each : links) {
			if(!each.getText().isEmpty())
				list.add(each.getText());
			System.out.println(list);
		
}
		}
	
		
		
}
