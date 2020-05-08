package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CookiesTest {
	WebDriver driver;
	@Test
	public void File() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     
	     Set<Cookie>cookies=driver.manage().getCookies(); //capture all the Cookies From Browser
	     System.out.println(cookies.size());      //Print size of the cookies
	     
	     // print All cookies
	 /*    for(Cookie Cook:cookies)        //read and print all the Cookies
	     {
	    	System.out.println(Cook.getName()+" --"+Cook.getValue()); //print name and value of the cookies
	    	
	     }   */
	     
	     // print  Specific Cookie
	//  System.out.println(driver.manage().getCookieNamed("csm-hit"));
	  
	  //add new Cookie in the Browser
	  Cookie objName= new Cookie("add new cookie","123344444");
	  driver.manage().addCookie(objName);  
	  cookies=driver.manage().getCookies(); //capture all the Cookies From Browser
	  
	   System.out.println(cookies.size()); 
	  for(Cookie Cook:cookies)        //read and print all the Cookies
	     {
	    	System.out.println(Cook.getName()+" --"+Cook.getValue()); //print name and value of the cookies
	     }  
	
	  driver.manage().deleteCookie(objName);
	  cookies=driver.manage().getCookies(); //capture all the Cookies From Browser
	  System.out.println(cookies.size()); 
	  
	  
	  driver.manage().deleteAllCookies();
	  cookies=driver.manage().getCookies(); //capture all the Cookies From Browser
	  System.out.println(cookies.size()); 
	}
	
	
	
}
