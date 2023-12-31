package com.learnautomation.base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.learnautomation.dataprovider.ConfigUtlity;
import com.learnautomation.factory.BrowserFactory;
import com.learnautomation.helper.Utility;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("LOG:INFO-Setup is running");
		driver = BrowserFactory.startBrowser(ConfigUtlity.getValue("browser"));
		driver.get(ConfigUtlity.getValue("url"));
		System.out.println("LOG:INFO-Browser is up and running");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("LOG:INFO-Teardown is running");
		BrowserFactory.closeBrowser(driver);
		// Assert.assertNull(driver);
		System.out.println("LOG:INFO-Session terminated");
	}
}
