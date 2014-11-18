package com.cognizant.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToBasketPage {
	
	@FindBy(xpath="//select[@id='quantity']")
	WebElement SelectQty;
	
	@FindBy(xpath="//div[@class='a-button-stack']/span/span/input")
	WebElement AddToBasketButton;
	
	WebDriver driver =null;
	public AddToBasketPage(WebDriver driver){
		this.driver = driver;		
	}
	
	
	//Select the number of Items(iphones)
	public void selectQuantity(String Items){
		SelectQty.sendKeys(Items);		
	}
	
	// Select the AddTBasket Button
	public ProceedToCheckOutPage ClickAddToBasket(){
		AddToBasketButton.click();
		return PageFactory.initElements(driver,ProceedToCheckOutPage.class);
	}

}
