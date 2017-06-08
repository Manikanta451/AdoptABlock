package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class LogoutObject extends CommonBase {
	
	protected LogoutObject(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[1]/div/div[1]/div[2]/div/a")
	public static WebElement Nameofadopter;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[1]/div/div[1]/div[2]/div/div/ul/li[2]/a")
	public static WebElement signout;
	
}
