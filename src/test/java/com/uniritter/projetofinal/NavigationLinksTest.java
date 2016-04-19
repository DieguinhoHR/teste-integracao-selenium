package com.uniritter.projetofinal;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationLinksTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://sites.code.education/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNavigationLinks() throws Exception {
    driver.get(baseUrl + "/home-code/");
    driver.findElement(By.cssSelector("a > img.full-width")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[4]")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[7]")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[2]")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[5]")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[8]")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[3]")).click();
    driver.findElement(By.xpath("(//img[contains(@src,'http://sites.code.education/wp-content/uploads/2015/10/mais-detalhes.png')])[6]")).click();
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
