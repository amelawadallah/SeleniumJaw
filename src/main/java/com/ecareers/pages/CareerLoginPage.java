package com.ecareers.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.BasePage; 

public class CareerLoginPage extends  BasePage {
	

	@FindBy(id = "username") WebElement field_EmailLogin;
	@FindBy(id = "password") WebElement field_PasswordLogin;

	@FindBy(id = "submitBtn") WebElement button_login;
	@FindBy(id = "logoutDiv") public WebElement button_accept;
	@FindBy(id = "lblMsg") public WebElement Message_loginError;
//	@FindBy(id = "RequiredFieldValidator1") public WebElement Validation_Email;
//	@FindBy(id = "RequiredFieldValidator2") public WebElement Validation_Password;
//	
	public CareerLoginPage(WebDriver driver){
		super(driver) ;
		this.PAGE_TITLE = "Jawwal Career" ;
		this.PAGE_URL = "http://localhost/ecareer/#/login" ;
	}
	
	public void setText_Email(String text){
		setElementText(field_EmailLogin,text);
		
	}
	
	public void setText_Password(String text){
		setElementText(field_PasswordLogin,text);
			
	}
	
	public void loginToProfile(String email, String password){
		wait.until(ExpectedConditions.elementToBeClickable(field_EmailLogin));
		setText_Email(email);
		setText_Password(password);
		clickElement(button_login);
		
	}
	
	public boolean checkErrorMessage(String textError){
		
		try{
			return Message_loginError.getText().equals(textError) ;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	


	
}
