package com.qa.stepdefinitions;



import com.qa.driverfactory.Driverfactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.*;
import junit.framework.*;

public class LoginStep {
	

LoginPage login;
private static String title;
@Given("User is on the Truepush HomePage")
public void user_is_on_the_truepush_home_page() {
	
	login = new LoginPage(Driverfactory.getDriver());
	
Driverfactory.getDriver().get("https://www.truepush.com/");	

	 title = login.getLoginPageTitle();
	
	System.out.println(title);
	}

@SuppressWarnings("deprecation")

@Given("page title should be {string}")

public void page_title_should_be(String pagetitle) {
	
Assert.assertTrue(title.contains(pagetitle)); 

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
}
@When("User clicks on Login button")

public void user_clicks_on_login_button() {
	
	login.clickOnHomeLoginButton();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

}

@When("user enters email {string}")
public void user_enters_email(String mail) {

	login.enterEmailid(mail);

}

@When("enters password {string}")
public void enters_password(String pasword) {
	
	login.enterPassword(pasword);
	
	login.clickOnLoginButton();

}

@SuppressWarnings("deprecation")
@Then("User should be navigated to Main Panel page")
public void user_should_be_navigated_to_main_panel_page() {
  
Assert.assertTrue(login.validateTruepushLogo());
}
}