package com.cognizant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserRegistrationPage {
		WebDriver driver = null;
		public NewUserRegistrationPage(WebDriver driver){
			this.driver=driver;
		}
	// NEW CUSTOMER NAME TEXT FIELD	
	@FindBy(xpath="//div[@id='ap_register_name_input']/input")
	WebElement NewCustName;
	//NEW CUSTOMER EMAIL TEXT FIELD (PRE-POPULATED)	
	@FindBy(xpath="//div[@id='ap_email_input']/input")
	WebElement NewCustEmailField;
	// RE-TYPE NEW CUSTOMER EMAIL
	@FindBy(xpath="//div[@id='ap_email_check_input']/input")
	WebElement NewCustEmailField2;
	 
	// CUSTOMER MOBILE NUMBER (OPTIONAL)
	@FindBy(xpath="//div[@id='ap_register_phone_number_input']/input")
	WebElement NewCustMobileNo;
	
	// NEW PASSWORD TEXT FIELD
	@FindBy(xpath="//input[@id='ap_password'] [@type='password']")
	WebElement NewCustPwd;
	
	// RE-ENTER PASSWORD TEXT FIELD
	@FindBy(xpath="//input[@id='ap_password_check'] [@type='password']")
	WebElement RetypeNewCustPwd;

  // REGISTRATIN SUBMIT BUTTON
	@FindBy(xpath="//div[@id='ap_register_buttons']/span/span/input")
	WebElement RegButton2;



	public DelAddressPage newCustRegistration(String newCustName,String newCustEmail, String MobNum, String pwd){
		NewCustName.sendKeys(newCustName);
		NewCustEmailField2.sendKeys(newCustEmail);
		NewCustMobileNo.sendKeys(MobNum);
		NewCustPwd.sendKeys(pwd);
		RetypeNewCustPwd.sendKeys(pwd);
		RegButton2.click();
		return PageFactory.initElements(driver,DelAddressPage.class);
	}




}
