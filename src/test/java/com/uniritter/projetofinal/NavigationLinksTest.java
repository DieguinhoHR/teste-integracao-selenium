package com.uniritter.projetofinal;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uniritter.pageObjects.HomePage;

public class NavigationLinksTest {
  private WebDriver driver;

  @Before
  public void setUp() {
      driver = new FirefoxDriver();     
  }

  @Test
  public void shouldHaveNavigateProducts() {
	  HomePage onHomePage = new HomePage(driver);
	  onHomePage = onHomePage.navigatePage();
	  onHomePage.clickOnProduct();
	  onHomePage.clickOnSignUp();    
  } 
  
  @After
  public void tearDown() {
	  driver.close();   
  } 
}
