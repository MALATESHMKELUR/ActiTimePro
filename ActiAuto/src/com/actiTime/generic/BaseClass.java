package com.actiTime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginPage;

public class BaseClass 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   }
   public static WebDriver driver;
   @BeforeTest
   public void openBrowser()
   {
	   Reporter.log("OPEN BROWSER",true);
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
   }
   
   @AfterTest
   public void closeBrowser()
   {
	   Reporter.log("CLOSE BROWSER",true);
	   driver.close();
   }
   
   @BeforeMethod
   public void LogIn() throws IOException
   {
	   Reporter.log("LogIn",true);
	   FileLib fl=new FileLib();
	   driver.get(fl.getPropertyData("url"));
	   LoginPage lp=new LoginPage(driver);
	   lp.setLogin(fl.getPropertyData("username"),fl.getPropertyData("password"));
   }
   
   @AfterMethod
   public void LogOut()
   {
	   Reporter.log("LogOut",true);
	   HomePage hp=new HomePage(driver);
	   hp.setLogout();
   }
}
