package com.ab.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.ContactUsPageObjects;

public class ContactUs extends ContactUsPageObjects{

	public ContactUs(WebDriver driver) {
		super(driver);
	}

	public void contactformfilling(DataInt dataInt) throws Exception {
			waitForSeconds(4);
			Contact.click();
			waitForSeconds(5);
			Assert.assertTrue(driver.getTitle().contains("Contact :: Adopt-a-Block"));
			LOG.info("Filling contact information");
			ContactFirstName.sendKeys(dataInt.getContactFirstName());
			Contactemail.sendKeys(dataInt.getContactusemail());
			Contactphone.sendKeys(dataInt.getContactphone());
			waitForSeconds(1);
			Comments.sendKeys(dataInt.getComments());
			waitForSeconds(5);
			LOG.info("Successfully filled contact details");
	   }		
}
