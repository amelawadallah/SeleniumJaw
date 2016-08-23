package com.ecareers.data;

import org.testng.annotations.DataProvider;

public class TestData {
	
	
	//args are urls and titles
	@DataProvider(name = "websites")
	public  Object[][] pages() {
		
		return new Object[][] {
				{"https://ecareer.jawwal.ps", "Palestine Cellular Communication LTD Jawwal - Job Application Form - Wellcome"},
				{"https://www.google.com", "Google"},
				{"https://www.facebook.com", "Facebook - Log In or Sign Up"}
		};
	}
	
	@DataProvider(name = "loginData")
	public  static Object[][] loginData() {
		
		return new Object[][] {
				{"amel@gmail.com", "I4lu5cLHr4", null},
			//	{"fghga_abozcc_wesam@hotmail.com", "123456", "اسم المستخدم أو كلمة المرور خاطئة" },
//				{"", "123456", "يجب ادخال اسم المستخدم" },
//				{"test@test.com", "", "يجب ادخال كلمة المرور" }
//				
				
		};
	}
	
}
