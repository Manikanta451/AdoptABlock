package com.ab.testscripts;

import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.ab.pagefactory.BlockRegistration;
import com.ab.pagefactory.CommonBase;
import com.ab.pagefactory.ContactUs;
import com.ab.pagefactory.CreateEvent;
import com.ab.pagefactory.CreateNews;
import com.ab.pagefactory.DriverHome;
import com.ab.pagefactory.ForgotPassword;
import com.ab.pagefactory.Login;
import com.ab.pagefactory.Logout;
import com.ab.pagefactory.MyProfile;
import com.ab.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing
 * the TestSuite Classes
 * 
 */

public class Base {

	public DriverHome driverhome;
	public BlockRegistration adoptblock;
	public Login login;
	public CreateEvent event;
	public CreateNews news;
	public ContactUs contact;
	public MyProfile profile;
	public Logout acclogout;
	public ForgotPassword pswd;	
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;

	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			Reporter.log("=====Browser Session Started=====", true);
			driverhome = new DriverHome(browser, "test");	
		} catch (WebDriverException e) {
			e.printStackTrace();	
		}
	}

	
	@AfterTest
	public void close() throws Exception {
		try {
			Thread.sleep(5000);
		    CommonBase.emailreport1();
			//driverhome.quitDriver();
			Reporter.log("=====Browser Session End=========", true);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	
}