package com.ab.pagefactory;

import org.openqa.selenium.WebDriver;
import com.ab.pageobjects.LogoutObject;

public class Logout extends LogoutObject {

	public Logout(WebDriver driver) {
		super(driver);
	}
	
	public void accountlogout() throws Exception {
			waitForSeconds(6);
			mouseOver(Nameofadopter, signout);
			waitForSeconds(2);
			signout.click();
			LOG.info("Sign Out Successfully");
	 }	
}
