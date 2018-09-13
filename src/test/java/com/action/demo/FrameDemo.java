package com.action.demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameDemo {
	
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @Test(enabled=false)
  public void switchToFrameDemo1() {
	  driver.get("http://jqueryui.com/dialog/");
	  WebElement frameElement = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	  driver.switchTo().frame(frameElement);
	  driver.findElement(By.xpath("//button[@title='Close']")).click();
	  driver.switchTo().defaultContent();
  }
  
  @Test
  public void verifyForMultipleFrames() {
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	  int size = driver.findElements(By.tagName("iframe")).size();
	  System.out.println("total frames: "+size);
	 // WebElement parentFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	  driver.switchTo().frame(0);
	  int size1 = driver.findElements(By.tagName("iframe")).size();
	  System.out.println("total frames1: "+size1);
	  driver.switchTo().frame(0);
	  System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try {
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\screenshot1.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  driver.switchTo().defaultContent();
	  driver.switchTo().defaultContent();
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
