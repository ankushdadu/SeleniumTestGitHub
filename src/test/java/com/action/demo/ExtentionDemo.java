package com.action.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentionDemo {
	
WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		/**
		 * adding extentions in firefox
		 */
		/*FirefoxProfile profile = new FirefoxProfile();
		String json = "";
		profile.addExtension(new File("C:\\Selenium Advance\\seleniumIDE.xpi"));		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\geckodriver.exe");
		driver = new FirefoxDriver(profile);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		
		/**
		 * adding extentions in chrome
		 */ 
		
		/*ChromeOptions chrome = new ChromeOptions();
		chrome.addExtensions(new File("C:\\Selenium Advance\\KatalonChrome.crx"));
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver.exe");
		driver = new ChromeDriver(chrome);*/
		
		/**
		 * accessing profile in firefox
		 */
		ProfilesIni firefoxp = new ProfilesIni();
		FirefoxProfile newfp = firefoxp.getProfile("Manual");		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\geckodriver.exe");
		driver = new FirefoxDriver(newfp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
    public void f() {
	  
    }
    
    @AfterTest
	public void afterTest() {
	  //driver.quit();
	}
}
