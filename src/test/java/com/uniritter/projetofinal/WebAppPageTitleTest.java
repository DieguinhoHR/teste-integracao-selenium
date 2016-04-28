package com.uniritter.projetofinal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebAppPageTitleTest {
	protected WebDriver driver; 
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();		
		driver.navigate().to("https://www.heroku.com/");
	}	
	
	@Test
	public void shouldHavePagePricing() {
		driver.findElement(By.id("pricing-head")).click();		
		assertTrue(driver.getTitle().equals("Pricing | Heroku"));
	}
	
	@Test
	public void shouldHavePageDocumentation() {				
		driver.findElement(By.id("doc-head")).click();			
		assertTrue(driver.getTitle().equals("Heroku Dev Center"));
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
