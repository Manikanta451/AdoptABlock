package com.ab.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.NewsPageObjects;

public class CreateNews extends NewsPageObjects{

	public CreateNews(WebDriver driver) {
		super(driver);
	}

	public void newscreate(DataInt dataInt) throws Exception{		
				waitForSeconds(5);
				btnnews.click();
				waitForSeconds(3);
				addnewnews.click();
				waitForSeconds(4);
				posttitle.sendKeys(dataInt.getTitleforNews());
				postdate.click();
				waitForSeconds(1);
				systemdateselect();
				waitForSeconds(1);
				postexpiry.click();
				waitForSeconds(1);
				futuredateselection();
				postsource.sendKeys(dataInt.getSource());
				alternativekeywords.sendKeys(dataInt.getAlternativeKeywords());
				shortdesc.sendKeys(dataInt.getShortDescription());
				weburl.sendKeys(dataInt.getWebsiteURL());
				newsimage.click();
				waitForSeconds(1);
				fileupload(imagepath + "\\images\\newsimage.jpg");
				waitForSeconds(5);
				senddescription(dataInt);
				waitForSeconds(3);
				savenews.click();	
				waitForSeconds(3);
				checkAlert();
	}
	
	public void senddescription(DataInt dataInt)throws Exception{
				Actions actions = new Actions(driver);
				actions.moveToElement(newsdesc);
				actions.click();
				waitForSeconds(2);
				actions.sendKeys(dataInt.getDescription());
				actions.build().perform();
			}
}
