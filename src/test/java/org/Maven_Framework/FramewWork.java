package org.Maven_Framework;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramewWork extends BaseMethod {
public static void main(String[] args) throws InterruptedException {
	browserlaunch("edge");
	geturl("https://phptravels.com/");
	LoginPage l=new LoginPage();
	click(l.logbutton());
	String main = driver.getWindowHandle();
	Set<String> sec = driver.getWindowHandles();
	for (String sec1:sec) {
		if (!sec1.equals(main)) {
			driver.switchTo().window(sec1);
			click(l.create());
			sendkeys(l.username(),"Anil");
			sendkeys(l.lastname(),"kumar");
			sendkeys(l.email(),"anilsouth65@gmail.com");
			sendkeys(l.companyname(),"AnilTeck");
			sendkeys(l.address1(),"bv nager");
			sendkeys(l.address2(),"nanganellure chennai 600114");
			sendkeys(l.city(),"chennai");
			sendkeys(l.state(),"tamil nandu");
			sendkeys(l.pincode(),("600114"));
			Select (l.country(),"India");
			sendkeys(l.phone(),"9514391536");
			sendkeys(l.phone2(),"9514391536");
			sendkeys(l.pass2(),"Anil@6536@");
			sendkeys(l.pass3(),"Anil@6536@");
			click(l.yes());
			 		
			
			
			
			
			
			
			
			
		}
		
	
		
	}
	
	
	
	
	
	
	
}
}
