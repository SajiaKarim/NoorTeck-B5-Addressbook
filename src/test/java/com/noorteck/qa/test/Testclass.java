package com.noorteck.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./sel/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Pomclass s1=new Pomclass(driver);
		s1.signupuntextfield("sajiakarim34@gmail.com");
		s1.signuppwd("Sajiakarim123#");
		s1.signupbutton();
	s1.welcometext();
	
		
		
	}

}


