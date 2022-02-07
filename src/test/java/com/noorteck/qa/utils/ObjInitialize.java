package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SigninPage;
import com.noorteck.qa.pages.SignupPage;

public class ObjInitialize extends Constants {
	
	
	
	public static void initializeClassObj() {
		//initialize each page class objects here..
		signUpObj = new SignupPage();
		signInObj = new SigninPage();
		homeObj = new HomePage();
		addressbookObj = new AddressesPage();
		

}
}