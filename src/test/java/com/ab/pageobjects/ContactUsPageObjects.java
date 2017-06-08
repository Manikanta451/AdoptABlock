package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class ContactUsPageObjects extends CommonBase {

	protected ContactUsPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[1]/div/div[1]/div[1]/a")
	public static WebElement Contact;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Name")
	public static WebElement ContactFirstName;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Email")
	public static WebElement Contactemail;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_PhoneNo")
	public static WebElement Contactphone;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Question_Comment")
	public static WebElement Comments;
	
}