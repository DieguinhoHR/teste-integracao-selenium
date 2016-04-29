package com.uniritter.projetofinal;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uniritter.pageObjects.LoginPage;

public class LoginPageTest extends AbstractWebDrivarTest {	
	@Before
	public void testSetUp() {
		homePage.navigatePage();
	}
	
	@Test
	public void shouldLoginPage() {
//		LoginPage loginPage = homePage.clickOnLogin();
//		loginPage.fillFormWithData();
	}

}
