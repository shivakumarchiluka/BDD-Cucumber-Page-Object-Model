package com.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	private By Email = By.id("email");

	private By Password = By.id("fullname");

	private By homeLogin = By.xpath("//button[text()='Login']");
	
	private By forgotpassword = By.xpath("//a[@href=\"/home/forgot-password\"]");
	
	
	private By Login = By.xpath("//button[@routerlink=\"/home/login\"]");

	
	private By logo = By.xpath("//div[@class=\"main-wrapper\"]/following::img[1]");
	

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}

	public String getLoginPageTitle() {

	return	driver.getTitle();
	
	
	}
	
	public void clickOnHomeLoginButton() {
		
		driver.findElement(homeLogin).click();
		
	}
	 
	public boolean isForgotPasswordLinkExist() {
		
		
	return driver.findElement(forgotpassword).isDisplayed();
		
	}
	
	public void enterEmailid(String mail) {
		
	    Set<String> windowhandles = driver.getWindowHandles();
	    
	    
//		System.out.print(windowhandles);
		
	    Iterator<String>iterator = windowhandles.iterator();
	    
	    
	    String parentwindow = iterator.next();
	    
	    
	    System.out.print(parentwindow);
	    
	    
	    String childwindow = iterator.next();
	    
	    
	    driver.switchTo().window(childwindow);	

		driver.findElement(Email).sendKeys(mail);
	
	
	}
	
	public void enterPassword(String pasword) {
		
		
		driver.findElement(Password).sendKeys(pasword);
	}
	
	
	public void clickOnLoginButton() {
		
		
		driver.findElement(Login).click();
	}
	
	public boolean validateTruepushLogo() {
		
	return	driver.findElement(logo).isDisplayed();
		}
	
}
