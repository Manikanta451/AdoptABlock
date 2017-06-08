package com.ab.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.ab.pagefactory.CommonBase;

public class NewsPageObjects extends CommonBase {

	protected NewsPageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[8]/a[2]")	
	public static WebElement btnnews;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[1]/div/a[2]")	
	public static WebElement addnewnews;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_Title")	
	public static WebElement posttitle;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_Postdate")	
	public static WebElement postdate;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_Expiredate")	
	public static WebElement postexpiry;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_Source")	
	public static WebElement postsource;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_AltTags")	
	public static WebElement alternativekeywords;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_SDesc")	
	public static WebElement shortdesc;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_txt_News_WebUrl")	
	public static WebElement weburl;
	
	@FindBy(how = How.ID, using = "ctl00_ContentPlaceHolder1_FUpload_News")	
	public static WebElement newsimage;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[3]/span/table")	
	public static WebElement newsdesc;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[4]/div[2]/div[1]/div/div[2]/div[4]/a[1]")	
	public static WebElement savenews;

}
