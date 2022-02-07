package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignupPage extends CommonUI {

	@FindBy(xpath="//*[@id=\"clearance\"]/div/div/form/div[4]/a")
	 WebElement signuplink;
	
	@FindBy(xpath="//input[@id='user_email']")
	 WebElement signupun;
	
	@FindBy(xpath="//input[@id='user_password']")
	 WebElement signuppwd;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	 WebElement signupbutton;
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void signuplinkclick()
	{
		click(signuplink);
	}
	
	public void signupuntextfield(String email)
	{
		enter(signupun, email);
	}
	
	public void signuppwd(String pwd)
	{
		enter(signuppwd, pwd);
	}
	
	public void signupbutton()
	{
		click(signupbutton);
	}
	
}
