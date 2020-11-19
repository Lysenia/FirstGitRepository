package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/lesia/Documents/selenium dependencies/drivers/chromedriver");
		
		//WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
		driver.get("http://the-internet.herokuapp.com/checkboxes");
//		WebElement firstOne = driver.findElement(By.tagName("input"));
//		WebElement firstOne = driver.findElement(By.xpath("input[@type = 'checkbox']")) ;
		WebElement firstOne = driver.findElement(By.cssSelector("input[type='checkbox']"));
		
		WebElement secondOne = driver.findElement(By.xpath("input[@type = 'checkbox'][2]")) ;
		
		//css = E[A='t']; input[type='checkbox']
		System.out.println(firstOne.isSelected());
		firstOne.click();
		System.out.println(firstOne.isSelected());
		System.out.println(secondOne.isSelected());
		System.out.println(secondOne.isSelected());
		secondOne.click();
		driver.close();
		
	}
	
}
