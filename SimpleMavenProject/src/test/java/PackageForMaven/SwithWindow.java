package PackageForMaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwithWindow {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
}
	@Test
	public void SwitchWin() throws InterruptedException {
		WebElement SwithchTO=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
		WebElement Windows=driver.findElement(By.xpath("//a[@href='Windows.html']"));
		Actions act=new Actions(driver);
		act.moveToElement(SwithchTO).moveToElement(Windows).click().build().perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Set<String> s= driver.getWindowHandles();
		
		for(String i:s)
		{
	String url1 =driver.switchTo().window(i).getCurrentUrl();
	System.out.println(url1);
	if(url1.contains("http://www.sakinalium.in/"))
	{
		driver.close();
	}
			
		}
		
	}
}
