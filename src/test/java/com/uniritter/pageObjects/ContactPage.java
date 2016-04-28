package com.uniritter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {	
	public ContactPage(WebDriver driver) {
		super(driver);		
	}

	public ContactPage fillFormWithData() {
		driver.findElement(By.id("newsletter_signup_email")).clear();	    
		driver.findElement(By.id("newsletter_signup_email")).sendKeys("dev.diegorodrigues@gmail.com");
		return new ContactPage(driver);		
	}
	
	public ContactResultPage submitForm() {
		driver.findElement(By.id("commit")).click();
		return new ContactResultPage(driver);		
	}
	
	
}
