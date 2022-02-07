package com.noorteck.qa.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
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
	p4.firstname();
	p4.lastname();
	

}
}
