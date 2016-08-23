package com.ecareer.tests;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ecareers.data.TestData;
import com.ecareers.pages.CareerLoginPage;


public class LoginTest {

	public WebDriver driver; 
	CareerLoginPage careerLoginPg; 

	
	@BeforeClass(alwaysRun = true)
	public void setup(){
		driver = new FirefoxDriver();
		careerLoginPg = PageFactory.initElements(driver, CareerLoginPage.class);
	}

	@Test(groups = { "p1", "login" } ,  dataProvider = "loginData" , dataProviderClass = TestData.class)
	public void testLoginSuccessfull (String email , String password ,String errorType) {
		careerLoginPg.loadPage();
		careerLoginPg.loginToProfile(email, password);
		
		if(!StringUtils.isBlank(errorType)){
			boolean errorResult = careerLoginPg.checkErrorMessage(errorType);
			Assert.assertTrue(errorResult, "Expected Error: " + errorType);
		}else  {
		Assert.assertTrue(careerLoginPg.button_accept.isDisplayed());
		
	}
		}
	
	@AfterClass(alwaysRun = true)
	public void teardown(){
		driver.close();
	}
}
