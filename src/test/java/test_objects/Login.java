package test_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver ldriver;
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(id="session_email")
	public WebElement email;
	
	@FindBy(id="session_password")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='commit']")
	public WebElement submit;
	
	
	
}
