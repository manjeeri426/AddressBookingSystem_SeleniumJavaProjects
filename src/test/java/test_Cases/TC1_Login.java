package test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import test_objects.Addresses_Menu;
import test_objects.Homepage;
import test_objects.Login;
import test_objects.Sign_out;

public class TC1_Login extends Base_Class {

	@Test
	public void login() throws InterruptedException {
		
	
	Login l=new Login(driver);
	l.email.sendKeys(username);
	Thread.sleep(2000);
	l.password.sendKeys(password);
	Thread.sleep(2000);
	l.submit.click();
	Thread.sleep(2000);
	
		Homepage p=new Homepage(driver);
		Thread.sleep(2000);
		
		p.addres_link.click();
		
		Addresses_Menu a=new Addresses_Menu(driver);
	   // a.new_address_link.click(); 
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='New Address']")));
address.click();

Thread.sleep(6000);
  a.firstname.sendKeys("shriya");
  Thread.sleep(2000);
  a.lastname.sendKeys("dube");
  Thread.sleep(2000);
  a.street_address.sendKeys("K.T road");
  Thread.sleep(2000);
  a.secondary_address.sendKeys("jkj");
  Thread.sleep(2000);
  a.adress_city.sendKeys("ko");
  Thread.sleep(5000);
 
 Select s= new Select(driver.findElement(By.id("address_state")));

  //Select s= new Select(a.address_state);
   
 s.selectByVisibleText("Indiana");
   Thread.sleep(3000);
   
  a.zipcode.sendKeys("8988898");
  Thread.sleep(3000);
  a.country.click();
  Thread.sleep(3000);
  JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,550)");

Thread.sleep(3000);
  a.birthdate.sendKeys("3/09/1166");
  Thread.sleep(3000);
  a.age.sendKeys("17");
  Thread.sleep(3000);
  a.websiteurl.sendKeys("https://reddif.com");
  Thread.sleep(3000);
  a.picture.sendKeys("C:\\Users\\manjeeri\\Desktop\\h2.png");
  Thread.sleep(3000);
  a.phone.sendKeys("5667777887");
  Thread.sleep(3000);
  a.dance_interest.click();
  Thread.sleep(3000);
  a.note.sendKeys("jkjjjjkj");
  Thread.sleep(3000);
  a.submit.click();

   String msg=a.messege.getText();
  Assert.assertEquals(msg,"Address was successfully created.");
  
 Thread.sleep(4000);
  jse.executeScript("window.scrollBy(0,550)");
  
  Thread.sleep(2000);
  a.list_link.click();
  
  Thread.sleep(5000);
  Sign_out d=new Sign_out(driver);
  d.sign_out.click();
  
}
}