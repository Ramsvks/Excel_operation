package besant.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/table.html");
		WebElement tab = driver.findElement(By.xpath("//table[@cellpadding='1']"));
		List<WebElement> lis = tab.findElements(By.xpath("//table[@cellpadding='1']"));
		int i = lis.size();
		System.out.println(i);
		
	}

}
