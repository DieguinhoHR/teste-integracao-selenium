package com.uniritter.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {	
	public HomePage(WebDriver driver) {
		super(driver);
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public ContactPage clickOnContact() {
		driver.findElement(By.linkText("Contact")).click();        
		return new ContactPage(driver);
	}
	
	public ProductPage clickOnProduct() {
		driver.findElement(By.linkText("Products")).click();
		return new ProductPage(driver);
	}
	
	public LoginPage clickOnLogin() {
		driver.findElement(By.linkText("Log in")).click();
		return new LoginPage(driver);
	}
}
