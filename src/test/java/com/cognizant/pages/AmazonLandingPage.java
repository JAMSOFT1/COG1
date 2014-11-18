package com.cognizant.pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AmazonLandingPage {

@FindBy(xpath="//div[@class='nav-searchfield-width']/div/input")
public WebElement SearchBox;

@FindBy(xpath ="//div[@class='nav-submit-button nav-sprite']/input")
public WebElement SearchSubmitButton;


WebDriver driver = null;
public AmazonLandingPage(WebDriver driver){
	this.driver=driver;	
}

public void SearchAmazon(String SearchItem){
	SearchBox.sendKeys(SearchItem);
	SearchSubmitButton.click();	
}


public AddToBasketPage ClickResltItem(WebElement ResltItem ){
	ResltItem.click();	
	return PageFactory.initElements(driver, AddToBasketPage.class);
	 
}

}