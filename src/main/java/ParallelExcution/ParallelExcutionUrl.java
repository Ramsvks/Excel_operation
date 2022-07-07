package ParallelExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//test method used for the slow process in implicity 
//it is used for three url open method 

public class ParallelExcutionUrl {

	@Test(invocationCount = 3)
	public void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver","D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("//https:www.google.com");
		driver.close();

	}

}
