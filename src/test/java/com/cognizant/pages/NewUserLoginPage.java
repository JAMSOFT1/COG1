package com.cognizant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserLoginPage {
	
	WebDriver driver = null;
	public NewUserLoginPage(WebDriver driver){
		this.driver=driver;
	}
	
@FindBy(xpath="//input[@id='ap_signin_create_radio']")
WebElement NewUserRadioButton;
	
@FindBy(xpath="//span[@class='ap_col2 ap_left']/input")
WebElement NewUserEmailField;

@FindBy(xpath="//span[@id='signInSubmit']/span/input")
WebElement SignInButton1;

public void SelectNewCust(){
	NewUserRadioButton.click();
}

public NewUserRegistrationPage newCustSignIn(String newCustEmail){
	NewUserEmailField.sendKeys(newCustEmail);
	SignInButton1.click();
	return PageFactory.initElements(driver,NewUserRegistrationPage.class);
}



}
