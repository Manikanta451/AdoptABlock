package com.ab.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.EventsPageObjects;

public class AddCleanUps extends EventsPageObjects{

	public AddCleanUps(WebDriver driver) {
		super(driver);
	}

	public void cleanupactivity(DataInt dataInt)throws Exception{
				waitForSeconds(5);
				addcleanup.click();
				waitForSeconds(4);
				cleanupstartdate.click();
				waitForSeconds(1);
				systemdateselect();
				cleanupVolunteers.sendKeys(dataInt.getVolunteers());
				cleanupYouthunder18.sendKeys(dataInt.getYouthunder18());
				cleanupBagsofLitterTrashcollected.sendKeys(dataInt.getBagsofLitterTrash());
				cleanuptire.sendKeys(dataInt.getTires());
				cleanupStormDrains.sendKeys(dataInt.getStormDrains());
				waitForSeconds(2);
				senddescription(dataInt);
				waitForSeconds(2);
				savecleanup.click();
				waitForSeconds(3);
				checkAlert();
	
	}
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(cleanupMiscellaneousActivities);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getMiscellaneousActivitiesDescription());
				actions.build().perform();
		}
}
