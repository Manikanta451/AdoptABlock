package com.ab.testscripts;

import java.util.Iterator;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ab.pageobjects.ExcelSheetObjects;
import com.ab.testscripts.SetupEnvironment;
import com.ab.datainitialization.DataInt;
import com.ab.utilities.Util;
import com.ab.utilities.Xls_Reader;

public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")+ "\\src\\main\\java\\com\\ab\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);

  /* @Test(description = "BlockRegistrationWithoutLogin", dataProvider = "getRegisteraBlock", priority = 0)
	public void BlockRegistrationWithoutLogin(DataInt dataInt) throws Exception {
		try {
			adoptblock=driverhome.getadoptblock();
			adoptblock.blockadoption(dataInt);
			adoptblock.registrationtype(dataInt);
			adoptblock.addressinformation(dataInt);
			adoptblock.contactinformation(dataInt);
			adoptblock.logininformation(dataInt);
			adoptblock.reasonandtermsandconditions(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.BlockRegistrationWithoutLogin, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.BlockRegistrationWithoutLogin, "TestCases");
			e.printStackTrace();
		}
					
	}*/
   
   @Test(description = "Login", dataProvider = "getLogin", priority = 1)
	public void Login(DataInt dataInt) throws Exception {
		try {
			login= driverhome.getLogin();
			login.accountlogin(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.LoginWithValidCredentials, "TestCases");
			e.printStackTrace();
		}
					
	}
		
/*   @Test(description = "BlockRegistrationWithLogin", dataProvider = "getRegisteraBlock", priority = 2)
  	public void BlockRegistrationWithLogin(DataInt dataInt) throws Exception {
  		try {
  			newblock=driverhome.getnewblock();
  			newblock.newblockregistration(dataInt);
  			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.BlockRegistrationWithLogin, "TestCases");
  		} catch (Exception e) {
  			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.BlockRegistrationWithLogin, "TestCases");
  			e.printStackTrace();
  		}
  					
  	}
   		
	@Test(description = "CreateEvent", dataProvider = "getEvents", priority = 2)
	public void CreateEvent(DataInt dataInt) throws Exception {
		try {
			event=driverhome.getevent();
			event.eventcreate(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateEvent, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateEvent, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "EditEvent", dataProvider = "getEvents", priority = 3)
	public void EditEvent(DataInt dataInt) throws Exception {
		try {
			eventedit=driverhome.geteventedit();
			eventedit.eventedit(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditEvent, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditEvent, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "AddCleanUps", dataProvider = "getCleanup", priority = 4)
	public void AddCleanUps(DataInt dataInt) throws Exception {
		try {
			cleanup=driverhome.getcleanup();
			cleanup.cleanupactivity(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.AddCleanUps, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.AddCleanUps, "TestCases");
			e.printStackTrace();
		}
					
	}
*/	
	/*@Test(description = "CreateNews", dataProvider = "getNews", priority = 2)
	public void CreateNews(DataInt dataInt) throws Exception {
		try {
			news=driverhome.getnews();
			news.newscreate(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.CreateNews, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.CreateNews, "TestCases");
			e.printStackTrace();
		}
					
	}
	
	@Test(description = "EditNews", dataProvider = "getNews", priority = 3)
	public void EditNews(DataInt dataInt) throws Exception {
		try {
			newsedit=driverhome.getnewsedit();
			newsedit.updatingnews(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.EditNews, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.EditNews, "TestCases");
			e.printStackTrace();
		}
					
	}*/
	
	/*@Test(description = "ContactUsForm", dataProvider = "getContactus" , priority = 8)
	public void ContactUs(DataInt dataInt) throws Exception {
		try {
			contact=driverhome.getcontact();
			contact.contactformfilling(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ContactUsForm, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ContactUsForm, "TestCases");
			e.printStackTrace();
		}
		
				
	}
		
	@Test(description = "ProfileUpdate",dataProvider= "getMyProfile", priority = 9)
	public void Updateingprofile(DataInt dataInt) throws Exception {
		try {
			profile=driverhome.getprofile();
			profile.updateprofile(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.ProfileUpdate, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.ProfileUpdate, "TestCases");
			e.printStackTrace();
		}
		
	}
		
	@Test(description = "AccountLogout",  priority = 10)
	public void AccLogout() throws Exception {
		try {
			acclogout=driverhome.getacclogout();
			acclogout.accountlogout();
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.AccountLogout, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.AccountLogout, "TestCases");
			e.printStackTrace();
		}
		
	}
		
	@Test(description = "Forgotpassword", dataProvider = "getContactus", priority = 11)
	public void ForgotPassword(DataInt dataInt) throws Exception {
		try {
			pswd=driverhome.getpswd();
			pswd.forgottenpassword(dataInt);
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.Forgotpassword, "TestCases");
		} catch (Exception e) {
			SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_FAIL,ExcelSheetObjects.Forgotpassword, "TestCases");
			e.printStackTrace();
		}
		
	}
	
	*/
	
	
	
	@DataProvider
	public Iterator<Object[]> getRegisteraBlock(){
	        return Util.getRegisteraBlock("RegisteraBlock", xls).iterator();
	    }
		     	
	@DataProvider
	public Iterator<Object[]> getLogin() {
			return Util.getLoginData("Login", xls).iterator();
		}
	
	@DataProvider
	public Iterator<Object[]> getEvents(){
			return Util.getEvents("Events", xls).iterator();

		}	
	
	@DataProvider
	public Iterator<Object[]>getCleanup(){
		   return Util.getCleanup("Cleanup", xls).iterator();
	}
	
	@DataProvider
	public Iterator<Object[]> getNews(){
			return Util.getNews("News", xls).iterator();

		}	
	
	@DataProvider
	public Iterator<Object[]> getContactus() {
			return Util.getContactus("Contactus", xls).iterator();

			}		
			
	@DataProvider
	public Iterator<Object[]> getMyProfile() {
			return Util.getMyProfile("MyProfile", xls).iterator();

			}	
		
}