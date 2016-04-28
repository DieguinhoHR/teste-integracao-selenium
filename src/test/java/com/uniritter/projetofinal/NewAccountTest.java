package com.uniritter.projetofinal;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uniritter.pageObjects.HomePage;
import com.uniritter.pageObjects.SignUpPage;

public class NewAccountTest {
    protected WebDriver driver;  
	
	@Before
	public void setUp() {
	    driver = new FirefoxDriver();    
    }
	
	@Test
	public void shouldDisplayForm() {		
		HomePage onHomePage = new HomePage(driver);
		onHomePage = onHomePage.navigatePage();
		SignUpPage onContactSignUp = onHomePage.clickOnSignUp();
		onContactSignUp.fillFormWithData();
    }
		
	@After
	public void tearDown() {
	    driver.close();    
	}  
}
