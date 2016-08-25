package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
//testing github
	// differences test
	 public enum BrowserType{
		 FIREFOX,
		 CHROME,
		 IE
	 }
	 
	 public static WebDriver getDriver(BrowserType type){
		 WebDriver driver = null ;
		 switch(type){
		 	case FIREFOX:
		 		driver = new FirefoxDriver();
		 	
		 	case CHROME:
		 		break;
		 	default:
		 		driver = new FirefoxDriver();
		 	
		 }
		 return driver;
	 }
}
