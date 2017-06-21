package com.ab.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.ForgotPasswordPageObjects;

public class ForgotPassword  extends ForgotPasswordPageObjects{

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	public void forgottenpassword(DataInt dataInt) throws Exception {
			waitForSeconds(7);
			Forgotpswd.click();
			waitForSeconds(4);
			Assert.assertTrue(driver.getTitle().contains("Account Login :: Adopt-A-Block"));
			Emailforgetpassword.sendKeys("mani6747@gmail.com");
			LOG.info("Entering registerd email address");
			Submitforforget.click();
			waitForSeconds(3);
			checkAlert();
			LOG.info("Password has been sent successfully to registered email address");
       }
}