package sakuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class uploadFile {
	WebDriver driver;
	@Test
	public void UPLOAD() throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		   Thread.sleep(3000);
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   driver.findElement(By.id("btnLogin")).click();
		   
		  WebElement pim= driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b"));
		  WebElement AddEmp= driver.findElement(By.xpath("//*[@id=\'menu_pim_addEmployee\']"));
		  Actions act=new Actions(driver); 
		  act.moveToElement(pim).moveToElement(AddEmp).click().build().perform();
		  Thread.sleep(3000);
		  driver.findElement(By.id("firstName")).sendKeys("ABCS");
		  Thread.sleep(3000);
	      WebElement cl=driver.findElement(By.name("photofile"));
	      act.moveToElement(cl).click().build().perform();
	      
	//      String ImageFilePath="C:\\Users\\Priya\\Pictures\\birds img\\snipping tool";
	//      String InputFilePath="C:\\Users\\Priya\\Pictures\\birds img";
	      
	      Screen s = new Screen();
	      
	      Pattern fileinputTextBox= new Pattern("C:\\Users\\Priya\\Pictures\\birds img\\snipping tool\\FileTextBox.PNG.png");
	      Pattern openFile= new Pattern("C:\\Users\\Priya\\Pictures\\birds img\\snipping tool\\OpenButton.png");
	      Thread.sleep(5000);
	      s.wait(fileinputTextBox, 20);
	      s.type(fileinputTextBox,"C:\\Users\\Priya\\Pictures\\birds img\\Peachock.jpg");
	      s.click(openFile);
	      
	      
	}

}
 