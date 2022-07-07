package besant.seleniumproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazonexm {
	@Test
	public static void main(String[] args) throws IOException 
	{
		

		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","D:\\chromedriver.exe");
		//object creation for webDriver and chromeDriver
		WebDriver driver= new ChromeDriver();
		//Maximizing the window
		driver.manage().window().maximize();
		//object created for properties class,to access the content of file
		   //Object created for Properties class, to access the content of properties file
	    Properties properties = new Properties();
	    //accessing properties file, by giving the path of properties file
	    properties.load(new FileInputStream(".\\properties\\config.properties"));
	    //getting url from properties file
	    driver.get(properties.getProperty("//https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\r\n"
	    		));
	    //finding the webelement in the giving url (i.e., email/username in amazon site)
	    WebElement amuname = driver.findElement(By.id("ap_ranling7798@gmail.com"));
	    
	    //sending the username directly from properties file
	    amuname.sendKeys(properties.getProperty("ranling7798@gmail.com"));
	    //finding the element (continue button) and clicking it
	    driver.findElement(By.id("continue")).click();
	    //finding the webelement in the giving url (i.e., password in amazon site)
	    WebElement ampwd = driver.findElement(By.id("ap_iconstar7"));
	    //sending the password directly from properties file
	    ampwd.sendKeys(properties.getProperty("iconstar7"));
	    
	    //same like above
	    driver.findElement(By.id("signInSubmit")).click();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    //don't consider below this, facing trouble in getting exact xpath, checkin on it. 
	    driver.findElement(By.partialLinkText("href='/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_aps_sr_pg1_1?ie=UTF8&adId=A06721433H677U4V0TF1V&url=%2FWembley'")).click();
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	    driver.findElement(By.partialLinkText("href='/gp/buy/addressselect/handlers/continue.html/'")).click();
	

	}




	
		
		
		
		

}
