package iframespopups;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TabsWindows extends TestBase {

//	@Test
	public void switchToWindow() {
		
		driver.get("http://the-internet.herokuapp.com/windows");
        System.out.println(driver.getTitle());
       
        
        driver.findElement(By.linkText("Click Here")).click();
		//windowsHandle=>id provided by selenium for current open tabs
        //getWindowHandle()==> this method gets the handle, id of the current window
        String firstWindow = driver.getWindowHandle();
        System.out.println("current window " + firstWindow);
        
        //driver.getWindowHandle()-->returns handles of all the current tabs.
         Set<String> windowHandles = driver.getWindowHandles();
         //we will go thru the list of all handles, 
         //if we find one that is not equal to the current, we will switch to it.
         for (String each : windowHandles) {
			System.out.println(each);
			//switchTo().window(each)-->used to switch to new tab/window
			if(firstWindow.equals(each)) {
				driver.switchTo().window(each);
			}
		}
         System.out.println(driver.getTitle());
       
	}
	
	@Test
	public void switchByTitleTest() {
		driver.get("http://the-internet.herokuapp.com/windows");
		  driver.findElement(By.linkText("Click Here")).click();
		String expectedTitle= "New Window";
		switchByTitle(expectedTitle);
		
		assertEquals(driver.getTitle(),expectedTitle,"Title did not match");
		
		
	}

}