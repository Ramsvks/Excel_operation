package besant.seleniumproject;

import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.cachestorage.model.Header;


public class WebTable {

	

	public static void main(String[] args) {
		// WebTable Section
		
		System.setProperty("Webdriver.Chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
	    WebElement tab=driver.findElement(By.xpath("//div[@class='rt-table']"));
	    List<WebElement>header=tab.findElements(By.xpath("//div[@class='rt-table']"));
	    for(WebElement yes:header)
	    {
	    	String text=yes.getText();
	    	System.out.println(text);
	    }
	   // for(int i=0;i<header.size();i++)
	

	
		// TODO Auto-generated method stub
		
	}

}
