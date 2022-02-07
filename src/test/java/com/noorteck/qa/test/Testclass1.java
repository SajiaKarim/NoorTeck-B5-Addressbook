package com.noorteck.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SigninPage;
import com.noorteck.qa.pages.SignupPage;

public class Testclass1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./se/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		SignupPage p1=new SignupPage(driver);
		SigninPage p2=new SigninPage(driver);
		HomePage p3=new HomePage(driver);
		AddressesPage p4=new AddressesPage(driver);
		p1.signupuntextfield("Sajia14132@gmail.com");
		p1.signuppwd("karim");
		p1.signupbutton();
		p2.signinun("sajii1413@gmail.com");
		p2.signinpwd("karim");
		p2.signinbutton();
		p3.addressesclick();
		p4.newaddresseeclick();
		p4.firstnametextfield("sajia");
		p4.lastnametextfield("karim");
		p4.agefield("123");
		p4.city("verginia");
		p4.commonintersts();
		p4.addresse1("abc ifsd werf");
		p4.zipcode("1235");
		p4.countryradio();
		p4.phonetextbox("12345");
		p4.statedpdown(3);
		p4.submitbutton();

		String expFirstName = "John";
		String actFirstName = addressbookObj.verifyFirstNameField();

		if(actFirstName.equals(expFirstName)) {
			
			System.out.println("Test case 1 passed");
			
		} else {
			
			System.out.println("Test case 1 failed");
		}
	

		String expLastName = "Doe";
		String actLastName = addressbookObj.verifyLastNameField();

		if(actLastName.equals(expLastName)){
			
			System.out.println("Test case 2 passed");
			
		} else {
			
			System.out.println("Test case 2 failed");
		}
