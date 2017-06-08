package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class RegisteraBlockPageObjects extends CommonBase{
	
	protected RegisteraBlockPageObjects(WebDriver driver) {
		super(driver);	
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[3]/div[2]/div[2]/div[1]/div/ul/li[3]/a")	
	public static WebElement adopt;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/ul/li[1]/a/div/img")	
	public static WebElement adoptablock;

	@FindBy(how = How.XPATH, using = "//div[@id='googft-mapCanvas']/div/div/div/div[3]/div")	
	public static WebElement map;

	@FindBy(how = How.LINK_TEXT, using = "Adopt this block")	
	public static WebElement adoptthisblock;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddl_Reg_Type")	
	public static WebElement registrationtype;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Reg_Name")	
	public static WebElement individualname;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Address1")	
	public static WebElement addressline1;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Address2")	
	public static WebElement addressline2;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_City")	
	public static WebElement city;

	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddl_States")	
	public static WebElement state;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Zipcode")	
	public static WebElement zip;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_PContactName")	
	public static WebElement primarycontactname;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Title")	
	public static WebElement titleifapplicable;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Phoneno")	
	public static WebElement phonenumber;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Mobileno")	
	public static WebElement mobilenumber;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_AltContactEmail")	
	public static WebElement contactemail;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_AltContactName")	
	public static WebElement contactnameifgrouporbusiness;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_AltPhoneNo")	
	public static WebElement alternativephone;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_NewLoginEmail")	
	public static WebElement email;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_NewLoginCEmail")	
	public static WebElement confirmemail;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_NewLoginPassword")	
	public static WebElement password;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_NewLoginCPassword")	
	public static WebElement confirmpassword;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddlWhyAdoptablock")	
	public static WebElement reason;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkAgree")	
	public static WebElement checkaggre;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_chkpassage1")	
	public static WebElement checkpassage;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_Chkpassage2")	
	public static WebElement checkpassage1;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_btn_Submit")	
	public static WebElement submit;
	
	@FindBy(how = How.ID, using = "	ctl00_ContentPlaceHolder1_btn_Cancel")	
	public static WebElement cancel;
	
}