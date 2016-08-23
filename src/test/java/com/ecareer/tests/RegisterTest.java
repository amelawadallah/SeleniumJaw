package com.ecareer.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ecareers.pages.RegisterPage;;

public class RegisterTest {

	public WebDriver driver; 
	RegisterPage registerPg;

	WebDriverWait wait;
	
	
	@BeforeClass(alwaysRun = true)
	public void setup(){
	//	driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		registerPg = PageFactory.initElements(driver, RegisterPage.class);
	}
	
	@Parameters({"browserType"})
	@Test
	public void testSignUp(@Optional("justtrying ioption params") String browserType) throws InterruptedException {
		System.out.println("browser is ##@@@#@" + browserType);
       registerPg.loadPage();
       registerPg.register("Amy", "David", "2", "787878787878", "amal.awadallah@jawwal.ps", "05997877878");
    }
	
	@AfterClass(alwaysRun = true)
	public void teardown(){
		driver.close();
	}
}
