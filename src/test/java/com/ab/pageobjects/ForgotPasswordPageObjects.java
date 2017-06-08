package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class ForgotPasswordPageObjects extends CommonBase{

	protected ForgotPasswordPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div[1]/div[3]/a")
	public static WebElement Forgotpswd;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Email_ForgotPwd")
	public static WebElement Emailforgetpassword;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_GetPassword")
	public static WebElement Submitforforget;

}