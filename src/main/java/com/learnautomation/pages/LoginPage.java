package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver driver;
	
	  	
	public LoginPage(WebDriver driver) 
	{
		  this.driver=driver;
	}
 
	By username=By.name("username");	
	By password=By.name("password");
	By loginButton=By.xpath("//button[@type='submit']");	
	
	public Dashboard loginToApplication(String uname,String pass)
	{
		//driver.findElement(username).sendKeys(uname);
		
		driver.findElement(username).sendKeys(uname);	
		driver.findElement(password).sendKeys(pass);	
		driver.findElement(loginButton).click();
		
		// Without PageFactory
		//Dashboard dash=new Dashboard(driver);
		
		//with pagefactory
		Dashboard dash=PageFactory.initElements(driver, Dashboard.class);		
		return dash;
		
	}
	
	
}

