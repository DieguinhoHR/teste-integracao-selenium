package com.uniritter.projetofinal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uniritter.pageObjects.ContactPage;
import com.uniritter.pageObjects.ContactResultPage;
import com.uniritter.pageObjects.HomePage;

public class ContactMessageTest {
	WebDriver driver; 
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();		
	}	
		
	@Test
	public void shouldSendContactMessage() {
		HomePage onHomePage = new HomePage(driver);
		onHomePage = onHomePage.navigatePage();
		ContactPage onContactPage = onHomePage.clickOnContact();
//		ContactResultPage onResultPage = onContactPage.fillFormWithData().submitForm();
//		
//		assertTrue(onResultPage.getConfirmationMessage().contains("Check your email now to confirm your sign-up."));		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
