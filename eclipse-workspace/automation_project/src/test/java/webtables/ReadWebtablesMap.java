package webtables;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadWebtablesMap {

	/*
	 * 
	 * 1) goto https://forms.zohopublic.com/murodil/report/Applicants/reportperma/
	 * DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8 2) Create a HashMap 3) change row
	 * number to 100, read all data on first page and put uniquID as a KEY and
	 * Applicant info as a Value to a map.
	 * 
	 * applicants.put(29,"Amer, Sal-all@dsfdsf.com-554-434-4324-130000")
	 * 
	 * 4) Click on next page , repeat step 3 5) Repeat step 4 for all pages 6) print
	 * count of items in a map. and assert it is matching with a number at the
	 * buttom ======================================
	 */

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	@Test
	public void appTestMap() {
		driver.get(
				"https://forms.zohopublic.com/murodil/report/Applicants/reportperma/DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8");
		Select sl = new Select (driver.findElement(By.xpath("//select[@id='recPerPage']")));
		sl.selectByVisibleText("100");
		
		List<WebElement> lst1 = new ArrayList<>();
		List<WebElement> lst2 = new ArrayList<>();
		
		for(int i=1; i<5; i++) {
			
		
		lst1.add(driver.findElements(By.xpath("//table[@id='reportTab']//tr[" + i + "]")).get(i));
		lst2.add(driver.findElements(By.xpath("//table[@id='reportTab']//tr[" + i + "]")).get(i));
	}
		
		Map<Integer, String> applications = getMap(lst1,lst2);
		driver.findElement(By.xpath("//span[@id='showNext']/a")).click();
		
		String totalExpected = driver.findElement(By.xpath("//span[@id='total']")).getText();
	    int total = Integer.parseInt(totalExpected);
	    
	    assertEquals(applications.size(),total);
	    
	}
	
	
		
		public Map<Integer, String> getMap(List<WebElement> lst1, List<WebElement> lst2) {
			Map<Integer, String> map = new HashMap<>();

			for (int i = 0; i < lst1.size(); i++) {
				map.put(Integer.valueOf(lst1.get(i).getText().substring(0, 1)), (lst2.get(i).getText().substring(1)));
			}

			return map;
		}
		
	}

