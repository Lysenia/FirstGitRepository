package webtables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SdetWebtableMap {
	
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
	
	@Test
	public void applicantsData() {
		driver.get("https://forms.zohopublic.com/murodil/report/Applicants/reportperma/DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8");
		
		printTableData("reportTab");
	
	}
	
	public void printTableData(String id) {
		int rowsCount = driver.findElements(By.xpath("//table[@id='"+id+"']/tbody/tr")).size();
		int colsCount = driver.findElements(By.xpath("//table[@id='"+id+"']/thead/tr/th")).size();
		
		System.out.println("===============");
		
		for(int rowNum = 1; rowNum <= rowsCount; rowNum++) {
			for(int col = 1; col <= colsCount; col++) {
				String xpath = "//table[@id='"+id+"']/tbody/tr["+rowNum+"]/td["+col+"]";
				String tdData = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(tdData +"  \t");
			}
			System.out.println();
		}
	}
	

}

