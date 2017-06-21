package com.ab.pagefactory;

import org.openqa.selenium.WebDriver;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.EventsPageObjects;


public class EditEvent extends EventsPageObjects {

	public EditEvent(WebDriver driver) {
		super(driver);
	}
	
	public void eventedit(DataInt dataInt)throws Exception{
				waitForSeconds(7);
				eventedit.click();
				waitForSeconds(5);
				titleforevent.clear();
				waitForSeconds(1);
				titleforevent.sendKeys(dataInt.getTitleforEvent());
				waitForSeconds(1);
				eventstartdate.clear();
				waitForSeconds(1);
				eventstartdate.click();
				waitForSeconds(1);
				systemdateselect();
				waitForSeconds(1);
				eventenddate.clear();
				waitForSeconds(1);
				eventenddate.click();
				waitForSeconds(2);
				futuredateselection();
				waitForSeconds(1);
				eventtime.clear();
				waitForSeconds(1);
				eventtime.sendKeys(dataInt.getTime());
				alternativekeyword.clear();
				waitForSeconds(1);
				alternativekeyword.sendKeys(dataInt.getAlternativeKeywords());
				sdesc.clear();
				waitForSeconds(1);
				sdesc.sendKeys(dataInt.getShortDescription());
				eventaddress.clear();
				waitForSeconds(1);
				eventaddress.sendKeys(dataInt.getAddress());
				eventcity.clear();
				waitForSeconds(1);
				eventcity.sendKeys(dataInt.getCity());
				eventzip.clear();
				waitForSeconds(1);
				eventzip.sendKeys(dataInt.getZipCode());
				eventphno.clear();
				waitForSeconds(1);
				eventphno.sendKeys(dataInt.getContactNo());
				eventfee.clear();
				waitForSeconds(1);
				eventfee.sendKeys(dataInt.getFee());
				eventurl.clear();
				waitForSeconds(1);
				eventurl.sendKeys(dataInt.getWebsiteURL());
				waitForSeconds(4);
				eventupdate.click();
				waitForSeconds(3);
				checkAlert();		
		
	}
	
	
	

}
