package test_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

		WebDriver ldriver;
		public Homepage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(ldriver,this);
		}
		@FindBy(css="#navbar > div.navbar-nav.mr-auto > a:nth-child(2)")
		public WebElement addres_link;
		
		
		
}
