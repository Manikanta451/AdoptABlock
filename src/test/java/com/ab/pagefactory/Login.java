package com.ab.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.LoginPageObjects;

public class Login extends LoginPageObjects{
	
	public Login(WebDriver driver) {
		super(driver);
	}

	public void accountlogin(DataInt dataInt) throws Exception {
			Assert.assertTrue(driver.getTitle().contains("Account Login :: Adopt-A-Block"));
			waitForSeconds(5);
			LOG.info("Getting Values of email and password");
			Emailid.sendKeys(dataInt.getEmail());
			waitForSeconds(2);
			Password.sendKeys(dataInt.getPassword());
			waitForSeconds(2);
			Loginbutton.click();
			LOG.info("Adopter Successfully Log In in to their account");
	  }		
}