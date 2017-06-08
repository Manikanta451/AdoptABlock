package com.ab.pagefactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.MyProfilePageObjects;

public class MyProfile extends MyProfilePageObjects {

	public MyProfile(WebDriver driver) {
		super(driver);
	}
	
	public void updateprofile(DataInt dataInt) throws Exception {
			waitForSeconds(6);
			mouseOver(Nameofadopter, MyProfile);
			waitForSeconds(3);
			MyProfile.click();
			waitForSeconds(4);
			Assert.assertTrue(driver.getTitle().contains("User Dash Board :: Adopt-A-Block"));
			Editprofile.click();
			LOG.info("Updateing profile details");
			waitForSeconds(4);
			firstname.clear();
			firstname.sendKeys(dataInt.getFirstName());
			lastname.clear();
			lastname.sendKeys(dataInt.getLastName());
			address1.clear();
			address1.sendKeys(dataInt.getAddressLine1());
			address2.clear();
			address2.sendKeys(dataInt.getAddressLine2());
			city.clear();
			city.sendKeys(dataInt.getCity());
			state.clear();
			state.sendKeys(dataInt.getState());
			zip.clear();
			zip.sendKeys(dataInt.getZipCode());
			phonenumber.clear();
			phonenumber.sendKeys(dataInt.getPhoneNumber());
			phandemailforpublic(isphonepublic);
			phandemailforpublic(isemailpublic);
			//Profilesubmit.click();
			LOG.info("Profile details has been updated successfully");
	}	
	
	public void phandemailforpublic(WebElement element)throws Exception {
		if (element.isSelected()) {
			element.click();	
		}else{
			element.click();	
		}		
	}

}