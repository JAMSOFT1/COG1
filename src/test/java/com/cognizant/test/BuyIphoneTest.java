package com.cognizant.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.pages.AddToBasketPage;
import com.cognizant.pages.DelAddressPage;
import com.cognizant.pages.FinalCheckNGotoPaymt;
import com.cognizant.pages.NewUserLoginPage;
import com.cognizant.pages.NewUserRegistrationPage;
import com.cognizant.pages.ProceedToCheckOutPage;
import com.cognizant.pages.VerifyDeliveryAdd;
import com.cognizant.pages.AmazonLandingPage;
import com.cognizant.utils.Constants;

public class BuyIphoneTest {
    	
	
	@Test  
	public void buyIphone() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	  driver.get(Constants.URL);
	  AmazonLandingPage lp = PageFactory.initElements(driver,AmazonLandingPage.class);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  // SEARCH FOR IPHONE 6
	  lp.SearchAmazon(Constants.SearchIphone6);
	  List<WebElement> iphonelist = driver.findElements(By.xpath(Constants.Iphone6));
	  //  RETURN THE 3rd IPHONE FROM LIST
      WebElement Ilink = iphonelist.get(Constants.PickNthIphone);
	  //  CLICK ON THE 3rd IPHONE
	  AddToBasketPage AddToBask = lp.ClickResltItem(Ilink);
	  //  UPDATE THE QUATITY OF IPHONE TO 3
	  AddToBask.selectQuantity(Constants.NumberOfIphons);
	  //  CLICK ON ADD TO BASKET BUTTON 
	  ProceedToCheckOutPage ProToCOut = AddToBask.ClickAddToBasket();
	  //  CLICK PROCEED TO CHECKOUT BUTTON
	  NewUserLoginPage CustLogin = ProToCOut.ClickProceedToCheckOut();
	  CustLogin.SelectNewCust();
	  //  PROCESS NEW CUSTOMER SIGN-IN PAGE	   
	  NewUserRegistrationPage NURegist = CustLogin.newCustSignIn(Constants.newCustEmail);
	  //  PROCES NEW CUSTOMER REGISTRATION PAGE
	  DelAddressPage SetDelAdd = NURegist.newCustRegistration(Constants.newCustName,Constants.newCustEmail,Constants.MobNum,Constants.pwd);
	  // ENTER DELIVERY ADDRESS  
	  VerifyDeliveryAdd CheckDelAdd = SetDelAdd.SetDeliveryAddress(Constants.Fname,Constants. Address1,Constants. Address2,Constants. Twncity,Constants. Cnwty,Constants. Pcode,Constants. NameOfCountry,Constants.PhNum);
	  // FINAL ADDRESS CHECK - AND PROCEED TO PAYMENT
	  FinalCheckNGotoPaymt gotoPaymnt = CheckDelAdd.SelectSuggestedAddress();
	  // PROCEED TO PAYMENT PAGE
	  gotoPaymnt.goToPayment();
	  // QUIT APPLICATION FROM PAYMENT PAGE
	  Thread.sleep(2000l);
	  driver.close();
	}

}


