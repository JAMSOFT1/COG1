package com.cognizant.utils;

import org.openqa.selenium.WebDriver;

public class Constants {
	WebDriver driver = null;
	
// URL NAME 
public static String URL="https://amazon.co.uk";
	
// SERACH ITEM 
public static String SearchIphone6 ="Iphone 6";	
//  SEARCH RESULT XPATHS
public static String Iphone6 = "//div[@class='a-row a-spacing-small']/a/h2";

// SELECT FROM THE SEARCH RESULT
public static int PickNthIphone=2;

 // NUMBER OF IPHONES TO BUY
public static String NumberOfIphons="3";

//New Customer Information
public static String newCustEmail="User.Amazon121@gmail.com"; 
public static String newCustName ="AmazonCust"; 
public static String MobNum ="07898848483"; 
public static String pwd ="SecureCust"; 

// Confirm Delivery Address Information
public static String Fname = "Loyal Cust";
public static String Address1 = "74 Alma street"; 
public static String Address2 = "xxxxxxxxxx"; 
public static String Twncity = "Enfield";
public static String Cnwty = "Enfield";
public static String Pcode = "En3 4uq"; 
public static String NameOfCountry ="United Kingdom"; 
public static String PhNum = "07898848483";

}
