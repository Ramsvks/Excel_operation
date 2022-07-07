package besant.seleniumproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class chrome {

	private static final CharSequence Enter = null;

	//private static Object getTitle;

	//private static final String Child = null;
	//private static final String Handle = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.partialLinkText("Go to Home Page")).click();
		driver.findElement(By.id("wp-categories-icon svg-image")).sendKeys(Enter);
		//driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		//driver.quit();
		//enter a search term
		//driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER);
		
		/*driver.get("https://www.amazon.com");
		driver.findElement(By.name("
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Head Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-image")).click();*/
		
		//String s = driver.getTitle();
		//System.out.println(s);
		//driver.close();	
       /* System.out.println(driver.getTitle());
        Object windowType;
		driver.switchTo().newWindow(WindowType.TAB);
		Set <String> handle=driver.getWindowHandles();
		
	    List<String> ls1 = new ArrayList<String>(handle);
       
        String ParentWindowId = ls1.get(0);
        
		
        String childWindowId=ls1.get(1);
		System.out.println("parent Id");
		System.out.println("child Id");*/
		
		
		
       
      
	}

	
	}
