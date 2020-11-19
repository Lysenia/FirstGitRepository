package automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//a[@class='login']")
		public WebElement signIn;
		
		@FindBy(xpath="//input[@id='email']")
		public WebElement emailAddress;
		
		@FindBy(xpath="//input[@id='passwd']")
		public WebElement password;
		
		@FindBy(xpath="//button[@id='SubmitLogin']")
		public WebElement logIn;
		
		@FindBy(xpath="//div[@class='alert alert-danger']")
		public WebElement assertmsg;
		
		//alert alert-danger
	}


