package com.action.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
  @Test
  public void f() {
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium hq");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  //driver.findElement(By.name("q")).sendKeys(Keys.TAB);
	
	 /* WebElement element = driver.findElement(By.name("btnk"));
	  
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", element);*/
	
	  //executor.executeScript("window.scrollBy(0,400);");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
