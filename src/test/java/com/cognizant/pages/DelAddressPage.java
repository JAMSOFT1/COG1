package com.cognizant.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DelAddressPage {
	
	WebDriver driver = null;
	public DelAddressPage(WebDriver driver){
		this.driver = driver;
	}
 // FULL NAME 
 @FindBy(xpath="//input[@id='enterAddressFullName']")
 WebElement FullName;
 // ADDRESS LINE 1
 @FindBy(xpath="//input[@id='enterAddressAddressLine1']")
 WebElement AddrsLine1;
 //ADDRESS LINE 2 Optional
 @FindBy(xpath="//input[@id='enterAddressAddressLine2']")
 WebElement AddrsLine2;
 //TOWN CITY
 @FindBy(xpath="//input[@id='enterAddressCity']")
 WebElement TownCity;

 //COUNTY
 @FindBy(xpath="//input[@id='enterAddressStateOrRegion']")
 WebElement County;

 //POST CODE
 @FindBy(xpath="//input[@id='enterAddressPostalCode']")
 WebElement PostCode;

 //COUNTRY
 @FindBy(xpath="//select[@id='enterAddressCountryCode']")
 WebElement Country;

 @FindBy(how=How.ID,using = "enterAddressCountryCode")
 WebElement Country1;


 @FindBy(how=How.TAG_NAME, using = "select")
 WebElement Country2;

 //PHONE NUMBER
 @FindBy(xpath="//input[@id='enterAddressPhoneNumber']")
 WebElement PhoneNumber;


 //CONFIRM INVOICE ADDRESS RADIO BUTTON (select Yes)
 @FindBy(xpath="//input[@class='no-style'] [@type='radio']")
 WebElement IsInvoiceAdd;


 //SELECT CONTINUE BUTTON
 @FindBy(xpath="//input[@class='a-button-text submit-button-with-name']")
 WebElement ContinueButton;


public VerifyDeliveryAdd SetDeliveryAddress(String Fname, String Address1, String Address2, String Twncity,String Cnwty,String Pcode, String NameOfCountry, String PhNum){
	Select Country = new Select(driver.findElement(By.tagName("select")));
	
	FullName.sendKeys(Fname);
	AddrsLine1.sendKeys(Address1);
	AddrsLine2.sendKeys(Address2);
	TownCity.sendKeys(Twncity);
	County.sendKeys(Cnwty);
	PostCode.sendKeys(Pcode);
	Country.selectByVisibleText(NameOfCountry);
	PhoneNumber.sendKeys(PhNum);
	IsInvoiceAdd.click();
	ContinueButton.click();
	return PageFactory.initElements(driver,VerifyDeliveryAdd.class);
	
	
}

}


