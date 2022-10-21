package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	private WebDriver driver;
	
	private By AppName = By.id("name");
	
	private By NewEmail = By.id("email");
	
	private By NewPassword = By.name("password");
	
	private By PrivacyPolicy = By.xpath("//input[@type='checkbox']/following::span[1]");
	
	private By RegisterButton = By.linkText("Register");	
	
	
	public RegistrationPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}

	
	public void userRegistration(String appname,String email,String password) {
		
		driver.findElement(AppName).sendKeys(appname);
		
	
		driver.findElement(NewEmail).sendKeys(email);
		
		driver.findElement(NewPassword).sendKeys(password);
		
		driver.findElement(RegisterButton).click();
		
		driver.findElement(PrivacyPolicy).click();
	}
	
}
