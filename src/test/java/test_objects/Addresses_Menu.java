package test_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Menu {

		WebDriver ldriver;
		public Addresses_Menu(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(ldriver,this);
		}
		
		@FindBy(xpath="//a[normalize-space()='New Address']")
		public WebElement new_address_link;
	
		@FindBy(id="address_first_name")
		public WebElement firstname;
	
		@FindBy(id="address_last_name")
		public WebElement lastname;
	
		@FindBy(id="address_street_address")
		public WebElement street_address;
	
		@FindBy(id="address_secondary_address")
		public WebElement secondary_address;
	
		@FindBy(id="address_city")
		public WebElement adress_city;
	
		@FindBy(id="address_state")
		public WebElement address_state;
	
		@FindBy(id="address_zip_code")
		public WebElement zipcode;
	
		@FindBy(id="address_country_us")
		public WebElement country;
	
		@FindBy(id="address_birthday")
		public WebElement birthdate;
	
		@FindBy(id="address_age")
		public WebElement age;
	
		@FindBy(id="address_website")
		public WebElement websiteurl;
	
		@FindBy(id="address_picture")
		public WebElement picture;
		
		@FindBy(id="address_phone")
		public WebElement phone;
		
		@FindBy(id="address_interest_dance")
		public WebElement dance_interest;
		
		@FindBy(id="address_note")
		public WebElement note;
		
		@FindBy(xpath="//*[@id='new_address']/div[17]/input")
		public WebElement submit;
		
		@FindBy(xpath="/html/body/div/div[1]") 
		public WebElement messege;                /* Address was successfully created.*/
		
		@FindBy(xpath="/html/body/div/div[2]/a[2]")   //  list link
		public WebElement list_link;   
		
		
		
		
		


		   


		//*[@id="navbar"]/div[1]/a[3]   // sign out

	
	
}
