package com.uniritter.projetofinal;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RandomSumTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  baseUrl = "http://eliasnogueira.com/";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRandomSum() throws Exception {
	driver.get(baseUrl + "/arquivos_blog/selenium/desafio/1desafio/");
	
	String value1 = driver.findElement(By.id("number1")).getText();
	String value2 = driver.findElement(By.id("number2")).getText();
	
	int number1 = Integer.parseInt(value1);
	int number2 = Integer.parseInt(value2);
	
	int sum = number1 + number2;

	driver.findElement(By.name("soma")).clear();
	driver.findElement(By.name("soma")).sendKeys(Integer.toString(sum));
	driver.findElement(By.name("submit")).click();
	assertEquals("CORRETO", driver.findElement(By.id("resultado")).getText());
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