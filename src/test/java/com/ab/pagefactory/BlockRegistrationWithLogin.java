package com.ab.pagefactory;

import org.openqa.selenium.WebDriver;
import com.ab.datainitialization.DataInt;

public class BlockRegistrationWithLogin extends BlockRegistrationWithoutLogin {

	public BlockRegistrationWithLogin(WebDriver driver) {
		super(driver);
	}

	
	public void newblockregistration(DataInt dataInt) throws Exception{
				waitForSeconds(3);
				newblockregistration.click();
				waitForSeconds(4);
				map.click();
				waitForSeconds(5);
				adoptthisblock.click();
				registrationtype(dataInt);
				addressinformation(dataInt);
				contactinformation(dataInt);
				reasonandtermsandconditions(dataInt);
	
	        }
	
}
