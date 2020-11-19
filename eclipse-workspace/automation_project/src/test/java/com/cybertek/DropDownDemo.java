package com.cybertek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	
		public static void main(String[] args) {
			
			//System.setProperty("webdriver.chrome.driver","/Users/lesia/Documents/selenium dependencies/drivers/chromedriver");
			
			WebDriverManager.chromedriver().setup();
					
					WebDriver driver = new ChromeDriver();
					
			driver.get("https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu/");
			
			WebElement selectTag = driver.findElement(By.name("my_html_select_box"));
			Select list = new Select(selectTag);
			WebElement selected = list.getFirstSelectedOption();
			
			System.out.println(selected.getText());
			// System.out.println(list.getFirstSelectedOption().getText()); - can be also printed directly
			
		  List<WebElement> options =list.getOptions();
	    	System.out.println("from list :");
	    for (WebElement eachOption : options) {
	    
			System.out.println(eachOption.getText());
		}
		//select using the visible text
	    System.out.println("_________________");
	    
	    list.selectByVisibleText("Madrid");
	    System.out.println("selected by text :\t" + list.getFirstSelectedOption().getText());
		
		
		//select by using index
	    
	    list.selectByIndex(0);
	    System.out.println("selected by index:\t" + list.getFirstSelectedOption().getText());
		
		//select by useing a value: might be similar to the actual text or different
	    
//		list.selectByValue("");
	    
//	    list.deselectAll();
//	    list.deselectByIndex(2);
//	    list.deselectByValue("avc");
//	    list.deselectByVisibleText("Madrid");
	    
	    System.out.println("*********************");
Select secondList = new Select (driver.findElement(By.cssSelector("select[multiple='yes']")));

secondList.deselectByVisibleText("New York");
secondList.deselectByVisibleText("Madrid");

List<WebElement> allSelectedOptions = secondList.getAllSelectedOptions();
for( WebElement webElement:allSelectedOptions ) {
	System.out.println(webElement.getText());
}

System.out.println(allSelectedOptions.size());
secondList.deselectAll();
allSelectedOptions = secondList.getAllSelectedOptions();
System.out.println(allSelectedOptions.size());

	    driver.close();
		
	}


			
			

}