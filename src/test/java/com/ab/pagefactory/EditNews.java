package com.ab.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.ab.datainitialization.DataInt;
import com.ab.pageobjects.NewsPageObjects;

public class EditNews extends NewsPageObjects {

	public EditNews(WebDriver driver) {
		super(driver);
	}
		
	public void updatingnews(DataInt dataInt)throws Exception{
				waitForSeconds(4);
				editnews.click();
				waitForSeconds(4);
				posttitle.clear();
				waitForSeconds(1);
				posttitle.sendKeys(dataInt.getTitleforNews());
				postdate.clear();
				waitForSeconds(1);
				postdate.click();
				waitForSeconds(1);
				systemdateselect();
				waitForSeconds(1);
				postexpiry.clear();
				waitForSeconds(1);
				postexpiry.click();
				waitForSeconds(1);
				futuredateselection();
				postsource.clear();
				waitForSeconds(1);
				postsource.sendKeys(dataInt.getSource());
				alternativekeywords.clear();
				waitForSeconds(1);
				alternativekeywords.sendKeys(dataInt.getAlternativeKeywords());
				shortdesc.clear();
				waitForSeconds(1);
				shortdesc.sendKeys(dataInt.getShortDescription());
				weburl.clear();
				waitForSeconds(1);
				weburl.sendKeys(dataInt.getWebsiteURL());
				//ClearAndSetText(By.xpath("/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[3]/span/table"), "TExt");
				senddescription(dataInt);
				waitForSeconds(3);
				updatenews.click();
				waitForSeconds(3);
				checkAlert();
			
		
	}
	
	public void senddescription(DataInt dataInt)throws Exception{
			//Actions actions = new Actions(driver);
			waitForSeconds(2);
			 WebElement element = driver.findElement(By.xpath("/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[3]/span/table"));
			    Actions navigator = new Actions(driver);
			    navigator.click(element)
			        .sendKeys(Keys.END)
			        .keyDown(Keys.SHIFT)
			        .sendKeys(Keys.HOME)
			        .keyUp(Keys.SHIFT)
			        .sendKeys(Keys.BACK_SPACE)
			        .sendKeys(dataInt.getDescription())
			        .perform();
			    navigator.build().perform();
			//actions.sendKeys(dataInt.getDescription());
			//actions.build().perform();
	}
	
	public void ClearAndSetText(By by, String text){
		waitForSeconds(3);
	    WebElement element = driver.findElement(by);
	    Actions navigator = new Actions(driver);
	    navigator.click(element)
	        .sendKeys(Keys.END)
	        .keyDown(Keys.SHIFT)
	        .sendKeys(Keys.HOME)
	        .keyUp(Keys.SHIFT)
	        .sendKeys(Keys.BACK_SPACE)
	        .sendKeys(text)
	        .perform();
		}
}
