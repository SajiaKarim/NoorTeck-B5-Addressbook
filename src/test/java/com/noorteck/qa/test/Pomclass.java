package com.noorteck.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pomclass {
	
		@FindBy(xpath="//a[@id='sign-in']")
		private WebElement signinlink;
		
		@FindBy(xpath="//*[@id=\"clearance\"]/div/div/form/div[4]/a")
		private WebElement signuplink;
		
		@FindBy(xpath="//input[@id='user_email']")
		private WebElement signupun;
		
		@FindBy(xpath="//input[@id='user_password']")
		private WebElement signuppwd;
		
		@FindBy(xpath="//input[@class='btn btn-primary']")
		private WebElement signupbutton;
		
		

		
		public Pomclass(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}

		public void siginlinkclick()
		{
			signinlink.click();
		}
		
		public void signuplinkclick()
		{
			signuplink.click();
		}
		
		public void signupuntextfield(String email)
		{
			signupun.sendKeys(email);
		}
		
		public void signuppwd(String pwd)
		{
			signuppwd.sendKeys(pwd);
		}
		
		public void signupbutton()
		{
			signupbutton.click();
		}
		
		
		
		@FindBy(xpath="//input[@type='email']")
		private WebElement signinun;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement signinpwd;
		
		
		@FindBy(xpath="//input[@value='Sign in']")
		private WebElement signinbutton;
		
		public void signinun(String email)
		{
			signinun.sendKeys(email);
		}
		
		
		public void signinpwd(String pwd)
		{
			signinpwd.sendKeys(pwd);
		}
		
		public void signinbutton()
		{
			signinbutton.click();
		}
		
		@FindBy(xpath ="//*[contains(text(),'Welcome to Address Book')]")
		private WebElement welcometext;
		
		public void welcometext()
		{
			boolean verifyng = welcometext.isDisplayed();
			System.out.println(verifyng);
		}
		
		

		@FindBy(xpath="//a[@href='/addresses']")
		private WebElement addresseslink;
		
		@FindBy(xpath="//a[@href='/addresses/new']")
		private WebElement newaddressedlink;
		
		@FindBy(xpath="//input[@id='address_first_name']")
		private WebElement firstname;
		
		@FindBy(xpath="//input[@id='address_last_name']")
		private WebElement lastname;
		
		@FindBy(xpath="//input[@id='address_street_address']")
		private WebElement address1;
		
		
		@FindBy(xpath="//input[@id='address_city']")
		private WebElement city;
		
		
		@FindBy(xpath="//select[@id='address_state']")
		private WebElement statedpdown;
		
		@FindBy(xpath="//input[@id='address_zip_code']")
		private WebElement pincode;
		
		@FindBy(xpath="//input[@id='address_country_us']")
		private WebElement countryradio;
		
		@FindBy(xpath="//input[@id='address_age']")
		private WebElement agefield;
		
		@FindBy(xpath="//input[@id='address_phone']")
		private WebElement phonenumber;
		
		@FindBy(xpath="//input[@id='address_interest_dance']")
		private WebElement dancigcheckbox;
		
		@FindBy(xpath="//*[@id=\"new_address\"]/div[17]/input")
		private WebElement createaddressbutton;
		
		@FindBy(xpath="//textarea[@id='address_note']")
		private WebElement notettbx;
		
		@FindBy(xpath="/html/body/div/p[1]/span[2]")
		private WebElement firtsnameverify;
		
		@FindBy(xpath="/html/body/div/p[2]/span[2]")
		private WebElement lastnameverify;
		
		public void addressesclick()
		{
			addresseslink.click();
		}
		
		public void newaddresseeclick() 
		{
			newaddressedlink.click();
		}
		
		public void firstnametextfield(String fname)
		{
			firstname.sendKeys(fname);
		}
		
		public void lastnametextfield(String lname)
		{
			lastname.sendKeys(lname);
		}
		
		
		public void addresse1(String address)
		{
			address1.sendKeys(address);
		}
		
		public void city(String cname)
		{
			city.sendKeys(cname);
		}
		
		
		public void statedpdown(int index)
		{
		Select dp=new Select(statedpdown);
		dp.selectByIndex(index);
		}
		
		public void zipcode(String code)
		{
			pincode.sendKeys(code);
		}
		
		public void countryradio()
		{
			countryradio.click();
		}
		
		
		public void agefield(String age)
		{
			agefield.sendKeys(age);
		}
		
		
		public void phonetextbox(String phno)
		{
			phonenumber.sendKeys(phno);
		}
		
		public void commonintersts()
		{
			dancigcheckbox.click();
		}
		
		public void  notetextbox(String note)
		{
			notettbx.sendKeys(note);
		}
		
		public void submitbutton()
		{
			createaddressbutton.click();
		}
		
		
		public void firtsnameverify(String fname)
		{
		
			boolean a = fname.contains("sajia");
			System.out.println("the firstname is present in the table  "+a);
		
		}
		
		public void lastnameverify(String lname)
		{
			boolean b = lname.contains("karim");
			System.out.println(" the lastname present in the table "+b);
		}
	

}
