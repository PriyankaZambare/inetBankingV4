package PackageForMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Switch {
WebDriver driver;
@BeforeMethod
public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	
}
@Test(priority=1)
public void SwitchFrame() {
WebElement switchTo=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
WebElement frames=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
Actions act=new Actions(driver);
act.moveToElement(switchTo).moveToElement(frames).click().build().perform();
//driver.switchTo().frame(0);
//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("ABCDEFGHIJKLMNOPQRSTU");

driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
driver.switchTo().frame(1);
driver.switchTo().frame(0);
driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("ABCDER");
}



}
