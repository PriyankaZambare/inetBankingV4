package PackageForMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dataDrivernTest {

WebDriver driver;
	
@BeforeMethod
public void LaunchB() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
		
}
@AfterClass
public void CLoseB() {
	driver.close();
}

@Test
public void Inf0FIll() throws FileNotFoundException {
	FileInputStream fis= new java.io.FileInputStream("C:\\Users\\Priya\\Desktop\\ExcelSheets\\Automation.testing.xlsx");
	
}
}
