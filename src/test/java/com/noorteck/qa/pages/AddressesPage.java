package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI{


		
		public AddressesPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}

		
	
		
		@FindBy(xpath ="//*[contains(text(),'Welcome to Address Book')]")
		  WebElement welcometext;
		
		public void welcometext()
		{
			boolean verifyng = welcometext.isDisplayed();
			System.out.println(verifyng);
		}
		
		

		
		@FindBy(xpath="//a[@href='/addresses/new']")
		 WebElement newaddressedlink;
		
		@FindBy(xpath="//input[@id='address_first_name']")
		  WebElement firstname;
		
		@FindBy(xpath="//input[@id='address_last_name']")
		  WebElement lastname;
		
		@FindBy(xpath="//input[@id='address_street_address']")
		 WebElement address1;
		
		
		@FindBy(xpath="//input[@id='address_city']")
		 WebElement city;
		
		
		@FindBy(xpath="//select[@id='address_state']")
		 WebElement statedpdown;
		
		@FindBy(xpath="//input[@id='address_zip_code']")
		 WebElement pincode;
		
		@FindBy(xpath="//input[@id='address_country_us']")
		 WebElement countryradio;
		
		@FindBy(xpath="//input[@id='address_age']")
		 WebElement agefield;
		
		@FindBy(xpath="//input[@id='address_phone']")
		 WebElement phonenumber;
		
		@FindBy(xpath="//input[@id='address_interest_dance']")
		 WebElement dancigcheckbox;
		
		@FindBy(xpath="//*[@id=\"new_address\"]/div[17]/input")
		 WebElement createaddressbutton;
		
		@FindBy(xpath="//textarea[@id='address_note']")
		 WebElement notettbx;
		
		@FindBy(xpath = "//td[contains(text(),'John')]")
		WebElement verifyFirstName;
		
		@FindBy(xpath = "//td[contains(text(),'Doe')]")
		WebElement verifyLastName;
		
		
		
		
		
	
		
		public void newaddresseeclick() 
		{
			click(newaddressedlink);
		}
		
		public void firstnametextfield(String fname)
		{
			enter(firstname,fname);
		}
		
		public void lastnametextfield(String lname)
		{
			enter(lastname,lname);
		}
		
		
		public void addresse1(String address)
		{
			enter(address1,address);
		}
		
		public void city(String cname)
		{
			enter(city,cname);
		}
		
		
		public void statedpdown(int indexValueText)
		{
		Select se=new Select(statedpdown);
		se.selectByIndex(3);
		

		}
		
		
		public void zipcode(String code)
		{
			enter(pincode,code);
		}
		
		public void countryradio()
		{
			click(countryradio);
		}
		
		
		public void agefield(String age)
		{
			enter(agefield,age);
		}
		
		
		public void phonetextbox(String phno)
		{
			enter(phonenumber,phno);
		}
		
		public void commonintersts()
		{
			click(dancigcheckbox);
		}
		
		public void  notetextbox(String note)
		{
			enter(notettbx,note);
		}
		
		public void submitbutton()
		{
			click(createaddressbutton);
		}
		public String verifyFirstNameField() {
			return getText(verifyFirstName);
			
		}
		
		public String verifyLastNameField() {
			return getText(verifyLastName);
			
		}
}
	