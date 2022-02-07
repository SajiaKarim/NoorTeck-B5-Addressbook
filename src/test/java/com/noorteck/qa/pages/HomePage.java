package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath="//a[@href='/addresses']")
	 WebElement addresseslink;
	
	@FindBy(xpath="//a[@id='sign-in']")
	 WebElement signinlink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void siginlinkclick()
	{
	click(signinlink);
	}
	
	public void addressesclick()
	{
	click(addresseslink);
	}
}
