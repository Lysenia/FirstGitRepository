package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySearch {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","/Users/lesia/Documents/selenium dependencies/drivers/chromedriver");
		
//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://etsy.com");
		
	
		
		String searchTerm = "fathers day gifts";
		
		WebElement input = driver.findElement(By.id("search-query"));//returns a web Element
		input.sendKeys(searchTerm+Keys.ENTER);//page refreshed
		input = driver.findElement(By.id("search-query"));//we need to locate one more time
		String actual = input.getAttribute("value");
		System.out.println(actual);
		
		if(actual.equals(searchTerm)) {
			System.out.println("PASS");
		}else {
			System.out.println("fail");
			System.out.println("expected:\t " + searchTerm);
			System.out.println("actual:\t " + actual);
		}
		
		
driver.findElement(By.className("nav-link"));
driver.findElement(By.linkText("Sell on Etsy"));
driver.findElement(By.partialLinkText("Sell on")).click();
driver.close();
		
	}

}
