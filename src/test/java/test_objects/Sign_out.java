package test_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_out {

	
	WebDriver ldriver;
	public Sign_out(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div[1]/a[3] ")
	public WebElement sign_out;

	
	

	


	   


	  
}
