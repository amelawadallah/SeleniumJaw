package com.ecareers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BasePage;

public class RegisterPage extends BasePage{

	@FindBy(id = "firstName") WebElement field_FirstName;
	@FindBy(id = "lastName") WebElement field_LastName;
	@FindBy(xpath = ".//*[@id='userMainDiv']/form/fieldset/div/div[4]/div/select") WebElement dropDown_IdType;
	@FindBy(id = "idNumber") WebElement field_IdNumber;
	@FindBy(id = "email") WebElement field_RegisterEmail;
	@FindBy(id = "phoneNumber") WebElement field_MobileNumber;
	@FindBy(id = "submitBtn") WebElement button_SignUp;
	@FindBy(id = "backBtn") WebElement button_Back;
	
	public RegisterPage(WebDriver driver){
		super(driver);
		this.PAGE_TITLE = "Jawwal Career" ;
		this.PAGE_URL = "http://localhost/ecareer/#/signup" ;
	}
	
	public void setText_FirstName(String text){
		setElementText(field_FirstName,text);
		
	}
	
	public void setText_LastName(String text){
		setElementText(field_LastName,text);
		
	}
	
	public void setText_IdNumber(String text){
		setElementText(field_IdNumber,text);
		
	}
	
	public void setText_RegisterEmail(String text){
		setElementText(field_RegisterEmail,text);
		
	}
	
	public void setText_MobileNumber(String text){
		setElementText(field_MobileNumber,text);
		
	}
	
	public void selectIdType(String value) {
		selectValueInList(dropDown_IdType, value);
	}


	public void clickSignUp() throws InterruptedException {
		clickButtonChrome(button_SignUp);
		clickElement(button_SignUp);
		
		
	}

	
	
	
	public void register(String firstName , String lastName, String idType, String idNumber, String email, String mobileNumber) throws InterruptedException  {
		setText_FirstName(firstName);
		setText_LastName(lastName);
		selectIdType(idType);
    	setText_IdNumber(idNumber);
    	setText_RegisterEmail(email);
    	setText_MobileNumber(mobileNumber);

    	clickSignUp();
    	Thread.sleep(25500);

	}

}
