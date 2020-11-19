package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATestThatCleansUp {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/lesia/Documents/selenium dependencies/drivers/chromedriver");
		driver = new ChromeDriver();
		
	}

	
	
	@Test
	public void searchGoogle() {
		
		driver.findElement(By.id("q")).sendKeys("Selenium cookbook " + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("Selenium cookbook"));
	
	}
	@Test
	public void searchAmazon() {
		
	
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fathers day gift " + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("fathers day gift"));
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	
	}
}
