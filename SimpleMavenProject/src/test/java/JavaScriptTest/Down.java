package JavaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Down {
WebDriver driver;
	
	@Test
	public void mainClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	  
		JavascriptExecutor js= (JavascriptExecutor)driver;
	//	 js.executeScript("window.scrollBy(0,600)");                   //its work
		 
		
		
		// If you want to scroll at a particular element, you need to use the following JavaScript.
	/*	WebElement ele= driver.findElement(By.xpath("//*[@id=\'benefits-grid-1\']/div[8]/div/div/div/div[2]/h4"));
		js.executeScript("arguments[0].scrollIntoView();",ele);  */
		
		WebElement element= driver.findElement(By.id("firstpassword"));
	//	element.click();
		
		
		js.executeScript("arguments[0].scrollIntoView;", element);
		
	}
	
}
