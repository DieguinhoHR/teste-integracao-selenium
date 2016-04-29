package com.uniritter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	public LoginPage(WebDriver driver) {
		super(driver);		
	}
	
	public LoginPage fillFormWithData() {
		driver.findElement(By.name("email")).sendKeys("dev.diegorodrigues@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin1234");
		driver.findElement(By.name("commit")).click();		
		return new LoginPage(driver);
	}	
}
