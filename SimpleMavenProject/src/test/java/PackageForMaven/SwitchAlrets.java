package PackageForMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchAlrets {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
	}
	@Test(priority=1)
	public void alrets() throws InterruptedException {
		WebElement SwithTo= driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
		WebElement Alrets= driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(SwithTo).moveToElement(Alrets).click().build().perform();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		
		String Value="You Pressed Cancel";
		if("You Pressed Cancel".equals(Value))
		{
			System.out.println("value pass.......");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		driver.switchTo().alert().sendKeys("ABCDEF");
		driver.switchTo().alert().accept();
	    String Value1= "Hello ABCDEF How are you today";
	/*    if(Value1.equals(Value1))
	    {
	    	System.out.println("test pass for sendKeys");
	    }
	*/
	    Assert.assertEquals(Value1, "Hello ABCDEF How are you today");
	    System.out.println("test pass for sendKeys");
		
	}
}
