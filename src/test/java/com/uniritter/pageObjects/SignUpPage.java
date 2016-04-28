package com.uniritter.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends AbstractPage {
	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public SignUpPage fillFormWithData() {
		driver.findElement(By.id("first_name")).sendKeys("diego");
		driver.findElement(By.id("last_name")).sendKeys("henrique");
		driver.findElement(By.id("invitation_email")).sendKeys("dev.diegorodrigues@gmail.com");
		driver.findElement(By.id("company")).sendKeys("deliver it");
		       
		driver.findElement(By.cssSelector("span")).click();                   
		
		WebElement e = driver.findElement(By.name("main_programming_language"));
		            
		Select language = new Select(e);
		  
		language.selectByIndex(0);
		        
		String recebe = language.getFirstSelectedOption().getAttribute("value"); 
		
		driver.findElement(By.xpath("//input[@value='Create Free Account']")).submit();
						
		return new SignUpPage(driver);
	}
}
