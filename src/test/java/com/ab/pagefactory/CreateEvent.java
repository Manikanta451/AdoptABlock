package com.ab.pagefactory;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.EventsPageObjects;

public class CreateEvent extends EventsPageObjects{

	public CreateEvent(WebDriver driver) {
		super(driver);
	}

	public void eventcreate(DataInt dataInt) throws Exception{		
		waitForSeconds(5);
		btnevents.click();
		waitForSeconds(3);
		addnewevent.click();
		Assert.assertTrue(driver.getTitle().contains("Events"));
		waitForSeconds(3);
		titleforevent.sendKeys(dataInt.getTitleforEvent());
		waitForSeconds(1);
		eventstartdate.click();
		waitForSeconds(1);
		systemdateselect();
		waitForSeconds(1);
		eventenddate.click();
		waitForSeconds(2);
		futuredateselection();
		waitForSeconds(2);
		eventtime.sendKeys(dataInt.getTime());
		alternativekeyword.sendKeys(dataInt.getAlternativeKeywords());
		sdesc.sendKeys(dataInt.getShortDescription());
		eventaddress.sendKeys(dataInt.getAddress());
		eventcity.sendKeys(dataInt.getCity());
		Select stateSelect = new Select(eventstate);
		stateSelect.selectByVisibleText(dataInt.getState());
		eventzip.sendKeys(dataInt.getZipCode());
		eventphno.sendKeys(dataInt.getContactNo());
		eventfee.sendKeys(dataInt.getFee());
		eventurl.sendKeys(dataInt.getWebsiteURL());
		eventimage.click();
		waitForSeconds(2);
		fileupload(imagepath + "\\images\\eventimage.jpg");
		waitForSeconds(5);
		senddescription(dataInt);
		waitForSeconds(3);
		eventsave.click();
		waitForSeconds(3);
		checkAlert();
	}
	
	public void senddescription(DataInt dataInt)throws Exception{
		Actions actions = new Actions(driver);
		actions.moveToElement(eventdesc);
		actions.click();
		waitForSeconds(2);
		actions.sendKeys(dataInt.getDescription());
		actions.build().perform();
	}
	
}