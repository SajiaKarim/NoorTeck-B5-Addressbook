package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SigninPage extends CommonUI {
	@FindBy(xpath="//input[@type='email']")
	 WebElement signinun;
	
	@FindBy(xpath="//input[@type='password']")
	 WebElement signinpwd;
	
	
	@FindBy(xpath="//input[@value='Sign in']")
	 WebElement signinbutton;
	
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void signinun(String email)
	{
		enter(signinun, email);
	}
	
	
	public void signinpwd(String pwd)
	{
		enter(signinpwd, pwd);
	}
	
	public void signinbutton()
	{
		click(signinbutton);
	}
}
