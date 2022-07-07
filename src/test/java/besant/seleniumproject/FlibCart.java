package besant.seleniumproject;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FlibCart {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.name("a")).sendKeys("flipkart"+Keys.ENTER);
		//driver.findElement(By.xpath("//h3[.='Flipkart']")).click();
		//driver.findElement(By.className("//*[@class='_2KpZ6l _2doB4z']")).click();
		//WebDriverWait Wait = new WebDriverWait(driver, 20);
		//driver.get("https://www.demo.guru99.com/test/newtours/register.php");
		driver.get("www.google.com");
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("INDIA");
		                                                                                                                                                                                                                                                                                                                                                                           
       // Wait.until(ExpectedCondition.visibiltyOf(null));
		                                                                                                                                                                                               
		
	}

}
