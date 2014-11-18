package com.cognizant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyDeliveryAdd {
	WebDriver driver = null;

	public VerifyDeliveryAdd(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[@class='a-button-inner']/input")
	WebElement DelToAddressButton;
	
	
	@FindBy(xpath="//input[@id='addr_1'] [@type='radio']")
	WebElement SuggstAddRadioButton;
	
	@FindBy(xpath="//input[@id='addr_0'] [@type='radio']")
	WebElement OriglAddRadioButton;
	
	public FinalCheckNGotoPaymt SelectOriginalAddress(){
		OriglAddRadioButton.click();
		DelToAddressButton.click();
		return PageFactory.initElements(driver,FinalCheckNGotoPaymt.class);
	}
	
     public FinalCheckNGotoPaymt SelectSuggestedAddress(){
    	 SuggstAddRadioButton.click();
    	 DelToAddressButton.click();
    	 return PageFactory.initElements(driver,FinalCheckNGotoPaymt.class);
	}
	
}
