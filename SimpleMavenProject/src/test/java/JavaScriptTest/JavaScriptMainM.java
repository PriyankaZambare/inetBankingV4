package JavaScriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptMainM {

	WebDriver driver;
	
	@Test
	public void mainClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		
		//Flashing
		WebElement joinFree= driver.findElement(By.linkText("HOME"));
		UtilityClassForJs.flash(joinFree, driver);
	//	UtilityClassForJs.drawBorder(joinFree, driver);
	}
}
