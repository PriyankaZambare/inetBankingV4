package DownloadFile;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class downloadfile {
	WebDriver driver;
	
		@Test
		public void File() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("http://demo.automationtesting.in/FileDownload.html");
		     driver.findElement(By.id("textbox")).sendKeys("Download file txt Using Automation Testing");
		     driver.findElement(By.id("createTxt")).click();
		     driver.findElement(By.id("link-to-download")).click();
		 
		     
		     
		     
		     driver.findElement(By.id("pdfbox")).sendKeys("Download file pdf Using Automation Testing");
		     driver.findElement(By.id("createPdf")).click();
		     driver.findElement(By.id("link-to-download")).click();
	
		
	}

}
