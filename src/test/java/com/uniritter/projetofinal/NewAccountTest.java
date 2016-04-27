package com.uniritter.projetofinal;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class NewAccountTest {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewAccount() throws Exception {
    driver.get("https://signup.heroku.com/?c=70130000001x9jFAAQ");
    
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("diego");
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("henrique");
    driver.findElement(By.id("invitation_email")).clear();
    driver.findElement(By.id("invitation_email")).sendKeys("dev.diegorodrigues@gmail.com");
    driver.findElement(By.id("company")).clear();
    driver.findElement(By.id("company")).sendKeys("deliver it");
           
    driver.findElement(By.cssSelector("span")).click();                   

    WebElement e = driver.findElement(By.name("main_programming_language"));
    
    Select language = new Select(e);
            
    language.selectByIndex(0);
    language.getFirstSelectedOption().getAttribute("value");
            
    driver.findElement(By.xpath("//input[@value='Create Free Account']")).click();    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
