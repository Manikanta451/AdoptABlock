package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class LoginPageObjects extends CommonBase{
	
	protected LoginPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[1]/div/div[1]/div[2]/a")	
	public static WebElement btnlogIn;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Login_Username")	
	public static WebElement Emailid;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Login_Password")	
	public static WebElement Password;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Submit")			  
	public  static WebElement Loginbutton;
}