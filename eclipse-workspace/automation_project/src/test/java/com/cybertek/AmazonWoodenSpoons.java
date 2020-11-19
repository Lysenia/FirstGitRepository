package com.cybertek;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWoodenSpoons {

	WebDriver driver;



	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
	
	@Test
	public void getAllProducts() {
		driver.get("https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=wooden+spoon");
		List<WebElement> titles = driver.findElements(By.xpath("//h2[@class='a-size-base s-inline  s-access-title  a-text-normal']"));
		
//		for(WebElement each : titles) {
//			if(!each.getText().isEmpty())
//		            System.out.println(each.getText());
//		        }
		
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='sx-price sx-price-large']"));
		
//		for(WebElement each : prices) {
//			if(!each.getText().isEmpty())
//		            System.out.println(each.getText());
//		        }
		
		for(int i=0; i<titles.size();i++) {
		System.out.println(titles.get(i).getText());
		System.out.println(prices.get(i).getText());
			}
		
		List<WebElement> wholeItems = driver.findElements(By.xpath("//div[@class='s-item-container']"));
		System.out.println("size of all items " + wholeItems.size());
		for (int i = 0; i < wholeItems.size(); i++) {
			if(wholeItems.get(i).getText().isEmpty()) continue;
			
			String desXpath = "(//div[@class='s-item-container'])[" + (i+1) + "]//h2";
			String priceXpath = "(//div[@class='s-item-container'])[" + (i+1) + "]//span[@class='sx-price sx-price-large']";
			
			System.out.println(driver.findElement(By.xpath(desXpath)).getText());
			System.out.println(driver.findElement(By.xpath(priceXpath)).getText());
			System.out.println("------------");
			
		}
	
		
	}
	

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@BeforeMethod
	public void navigateToMockaroo() {

	}
}
