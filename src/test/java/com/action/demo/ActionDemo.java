package com.action.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionDemo {
 
	private WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  
  }

  @Test(enabled = false)
  public void moveCursorToDigitalText() {
	  driver.get("https://www.homeshop18.com/");
	  WebElement digital = driver.findElement(By.xpath("//a[text()=\"Digital\"]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(digital).perform();
  }
  
  @Test(enabled = false)
  public void openLinkInNewTab() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  WebElement guj = driver.findElement(By.xpath("//div[@id=\"SIvCob\"]/a[6]"));
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.CONTROL).click(guj).build().perform();
	  
  }
  
  @Test(enabled = false)
  public void rightClickElement() throws InterruptedException {
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  WebElement rightClick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
	  Actions act = new Actions(driver);
	  //Context click means right click
	  //we used here ARROW_DOWN two times because we want to click on 2nd link from drop down
	  act.contextClick(rightClick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  Alert alert = driver.switchTo().alert();	  
		alert.accept();	  
  }
  
  @Test(enabled = false)
  public void dragAndDropOperation() throws InterruptedException{
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
	  WebElement draggedTo = driver.findElement(By.xpath("//div[@id='droppable']"));
	  Actions action = new Actions(driver);
	  action.dragAndDrop(draggable, draggedTo).perform();
  }
  
  @Test
  public void resizableOperation() throws InterruptedException {
	  driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	  WebElement resizeableElement = driver.findElement(By.xpath("//div[@id='resizable']/div[1]"));
	  Actions action = new Actions(driver);
	  action.dragAndDropBy(resizeableElement, 400, 200).perform();
  }
  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
