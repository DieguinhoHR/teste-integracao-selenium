package com.uniritter.pageObjects;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public HomePage navigatePage() {
		driver.navigate().to("https://www.heroku.com");
		return new HomePage(driver);		
	}
}
