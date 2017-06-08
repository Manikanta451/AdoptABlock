package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class EventsPageObjects extends CommonBase{

	protected EventsPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[8]/a[1]")	
	public static WebElement btnevents;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[1]/a[2]")	
	public static WebElement addnewevent;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_Title")	
	public static WebElement titleforevent;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_SDate")	
	public static WebElement eventstartdate;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_EDate")	
	public static WebElement eventenddate;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_Time")	
	public static WebElement eventtime;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_alt_Tags")	
	public static WebElement alternativekeyword;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_Sdesc")	
	public static WebElement sdesc;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_Location")	
	public static WebElement eventaddress;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_City")	
	public static WebElement eventcity;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_ddl_Event_State")	
	public static WebElement eventstate;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_Zip")	
	public static WebElement eventzip;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_ContactNo")	
	public static WebElement eventphno;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_Event_Fee")	
	public static WebElement eventfee;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_tx_Event_Web_Url")	
	public static WebElement eventurl;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_FUpload_Image_Event")	
	public static WebElement eventimage;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[5]/span/table")	
	public static WebElement eventdesc;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[7]/a[1]")	
	public static WebElement eventsave;

}
