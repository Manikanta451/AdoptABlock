package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class MyProfilePageObjects extends CommonBase{
		
	protected MyProfilePageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[1]/div/div[1]/div[2]/div/a")
	public static WebElement Nameofadopter;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[1]/div/div[1]/div[2]/div/div/ul/li[1]/a")
	public static WebElement MyProfile;
	                                   
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[1]/div/a")
	public static WebElement Editprofile;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Fname")
	public static WebElement firstname;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_LName")
	public static WebElement lastname;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Address1")
	public static WebElement address1;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Address2")
	public static WebElement address2;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_City")
	public static WebElement city;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddl_States")
	public static WebElement state;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Zipcode")
	public static WebElement zip;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Phoneno")
	public static WebElement phonenumber;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_Chk_Publicphone")
	public static WebElement isphonepublic;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chk_EmailPublic")
	public static WebElement isemailpublic;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Update")
	public static WebElement update;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Cancel")
	public static WebElement cancel;
                                 
	@FindBy(how = How.XPATH, using = "/html/body/div/section[1]/div/div/form/div/div/div/div[2]/div/div/div[10]/div[1]/input")
	public static WebElement Profilesubmit;
}
