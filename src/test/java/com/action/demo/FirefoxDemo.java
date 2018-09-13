package com.action.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxDemo {
  
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		/**
		 * adding profile
		 */
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("general.useragent.override",	"iphone");
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\geckodriver.exe");
		driver = new FirefoxDriver(profile);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void f() {
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void afterTest() {
	  //driver.quit();
	}
}
