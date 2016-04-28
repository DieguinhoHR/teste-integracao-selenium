package com.uniritter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {	
	public HomePage(WebDriver driver) {
		super(driver);		
	}
	
	public ContactPage clickOnContact() {
		driver.findElement(By.linkText("Contact")).click();        
		return new ContactPage(driver);
	}
	
	public ProductPage clickOnProduct() {
		driver.findElement(By.linkText("Products")).click();
		return new ProductPage(driver);
	}
	
	public SignUpPage clickOnSignUp() {
		driver.findElement(By.linkText("Sign up")).click();
		return new SignUpPage(driver);
	}
}
