package com.uniritter.projetofinal;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.uniritter.pageObjects.HomePage;

public abstract class AbstractWebDrivarTest {
	protected WebDriver driver; 
	protected HomePage homePage;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();		
		homePage = new HomePage(driver);
	}	
		
	@After
	public void tearDown() {
		driver.close();
	}
}
