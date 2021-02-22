package com.karna.maven_testng_sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginTestCase {
	private WebDriver driver;
	
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Demo Guru99 Page")); 		
	}
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized"); // open Browser in maximized mode
	  options.addArguments("disable-infobars"); // disabling infobars
	  options.addArguments("--disable-extensions"); // disabling extensions
	  //options.addArguments("--disable-gpu"); // applicable to windows os only
	  options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	  options.addArguments("--no-sandbox"); // Bypass O
	  driver = new ChromeDriver(options);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
