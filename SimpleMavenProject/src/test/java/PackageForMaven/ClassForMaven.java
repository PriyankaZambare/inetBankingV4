package PackageForMaven;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassForMaven {

	WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@Test(priority=1)
	public void FIRSTLAST() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("RIANSHI");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("PATIL");
	//	driver.navigate().refresh();
	//	Thread.sleep(3000);
	}
	@Test(priority=2)
	public void radioButton() {
	List<WebElement> radio =	driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(radio.size());
	
	for(WebElement e:radio) {
		System.out.println(e.getText());
	}
	
	}
	@Test(priority=3)
	public void CheckBox() {
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkbox.size());
	
	for(WebElement Check: checkbox)
	{
	System.out.println(Check.getText());
	}
	}
	@Test(priority=4)
	public void counties() {
		WebElement country= driver.findElement(By.xpath("//select[@id='countries']"));
    		Select s= new Select(country);
	         List list=new ArrayList();
	         List<WebElement> obj=s.getOptions();
	         System.out.println(s.getOptions().size());
	         
	         for(WebElement select:obj)
	         {
	        	 list.add(select.getText());
	         }
	         System.out.println(list);
	         
}
}
