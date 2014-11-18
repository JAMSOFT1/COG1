package com.cognizant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalCheckNGotoPaymt {
	WebDriver driver = null;

	public FinalCheckNGotoPaymt(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[@class='a-button-inner']/input")
	WebElement ContToPaymntButton;
	
	public void goToPayment(){
		ContToPaymntButton.click();
	}
	
}
