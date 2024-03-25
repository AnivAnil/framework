package org.Maven_Framework;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseMethod {
	
	public  LoginPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//a[text()='Login'])[2]")
	private WebElement logbutton;
	 
	@FindBy(xpath="//a[text()='Create account']")
	private WebElement create	;
	
	@FindBy(xpath="//input[@name='firstname']")
	private  WebElement username;
	
	@FindBy(id="inputLastName")
	private WebElement lastname;
	
	public WebElement logbutton() {
		return logbutton;
	
	}
	public WebElement create() {
		return create;
		
	}
	public WebElement username () {
		return username;
		
	}
	public WebElement lastname(){
		return lastname;
	
		
	}
	@FindBy(id="inputEmail")
	private WebElement email;
	 
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="inputCompanyName")
	private WebElement companyname;
		
	public WebElement companyname() {
		return companyname;
		
	}
	@FindBy(id="inputAddress1")
	private WebElement address1;
	
	public WebElement address1() {
		return address1;
	
	
	}
	@FindBy(id="inputAddress2")
	private WebElement address2;
	
	public WebElement address2() {
		return address2;
		
	}
	
    @FindBy(id="inputCity")
    private WebElement city;
    
    public WebElement city() {
		return city;
    	
    }
    @FindBy(id="stateinput")
    private WebElement state;
    
    public WebElement state() {
		return state;
    	
    }
	@FindBy(id="inputPostcode")
	private WebElement pincode;
	
	public WebElement pincode() {
		return pincode;
		
	}
	@FindBy(id="inputCountry")
	private WebElement country;
	
	public WebElement country() {
		return country;
		
	}
	@FindBy(id="inputPhone")
	private WebElement phone;
	
	public WebElement phone() {
		return phone;
		
	}
	@FindBy(id="customfield2")
	private WebElement phone2;
	
	public WebElement phone2() {
		return phone2;
		
	}
	@FindBy(id="inputNewPassword1")
	private WebElement pass2;
	
	public WebElement pass2() {
		return pass2;
		
	}
	@FindBy(id="inputNewPassword2")
	private WebElement pass3;
	
	public WebElement pass3() {
		return pass3;
	
	}
	@FindBy(xpath="//span[text()='Yes']")
	private WebElement yes;
	
	public WebElement yes() {
		return yes;
		
	}
	
	@FindBy(xpath="//span[@aria-checked='false']")
	private WebElement robot;
	
	public WebElement robot() {
		return robot;
		
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement regester;
	
	public WebElement regester() {
		return regester;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}