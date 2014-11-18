package com.cognizant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOutPage {
	
	WebDriver driver = null;
	
	public ProceedToCheckOutPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[@id='hlb-ptc-btn']/span/a")
	WebElement ProceedButton;

	
	public NewUserLoginPage ClickProceedToCheckOut(){
		ProceedButton.click();
		return PageFactory.initElements(driver, NewUserLoginPage.class);
	}
}
