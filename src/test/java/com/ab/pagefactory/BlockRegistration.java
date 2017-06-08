package com.ab.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.RegisteraBlockPageObjects;

public class BlockRegistration extends RegisteraBlockPageObjects{

	public BlockRegistration(WebDriver driver) {
		super(driver);
	}

	public void blockadoption(DataInt dataInt) throws Exception {
			waitForSeconds(5);
			adopt.click();
			waitForSeconds(3);
			adoptablock.click();
			waitForSeconds(8);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)","");
			waitForSeconds(3);
			map.click();
			waitForSeconds(6);
			adoptthisblock.click();
			waitForSeconds(7);
			Select regtype = new Select(registrationtype);
			regtype.selectByVisibleText("Individual");
			individualname.sendKeys(dataInt.getIndividualName());
			addressline1.sendKeys(dataInt.getAddressLine1());
			addressline2.sendKeys(dataInt.getAddressLine2());
			city.sendKeys(dataInt.getCity());
			state.sendKeys(dataInt.getState());
			zip.sendKeys(dataInt.getZipCode());
			primarycontactname.sendKeys(dataInt.getPrimaryContactName());
			titleifapplicable.sendKeys(dataInt.getTitleIfApplicable());
			phonenumber.sendKeys(dataInt.getPhoneNumber());
			mobilenumber.sendKeys(dataInt.getMobileNumber());
			contactemail.sendKeys(dataInt.getContactEmail());
			contactnameifgrouporbusiness.sendKeys(dataInt.getContactNameifgrouporbusiness());
			alternativephone.sendKeys(dataInt.getAlternateContactPhone());
			email.sendKeys(dataInt.getEmailforsignup());
			confirmemail.sendKeys(dataInt.getEmailforsignup());
			password.sendKeys(dataInt.getSignuppassword());
			confirmpassword.sendKeys(dataInt.getSignuppassword());
			Select reasonforadopt = new Select(reason);
			reasonforadopt.selectByIndex(3);
			checkaggre.click();
			checkpassage.click();
			checkpassage1.click();
			waitForSeconds(2);
			//submit.click();
	    }
}
