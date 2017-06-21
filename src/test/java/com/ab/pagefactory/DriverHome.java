package com.ab.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ab.utilities.PropertiesFileReader;

public class DriverHome extends CommonBase {
	
	public static final String prod_url = PropertiesFileReader.readvalueOfKey("app.url");
			
	public DriverHome(WebDriver driver) {
		super(driver);

	}

	public DriverHome(String browser, String text) {
		super(prod_url, browser);
	}

	public DriverHome(String url) {
		super(url, "test");

	}

	public BlockRegistrationWithoutLogin getadoptblock(){
		return PageFactory.initElements(driver, BlockRegistrationWithoutLogin.class);
	}
	
	public BlockRegistrationWithLogin getnewblock(){
		return PageFactory.initElements(driver, BlockRegistrationWithLogin.class);
	}
	public Login getLogin(){
		return PageFactory.initElements(driver, Login.class);
	}
	
	public CreateEvent getevent(){
		return PageFactory.initElements(driver, CreateEvent.class);
	}
	
	public EditEvent geteventedit(){
		return PageFactory.initElements(driver, EditEvent.class);
	}
	
	public AddCleanUps getcleanup(){
		return PageFactory.initElements(driver, AddCleanUps.class);
	}
	
	public CreateNews getnews(){
		return PageFactory.initElements(driver, CreateNews.class);
	}
	
	public EditNews getnewsedit(){
		return PageFactory.initElements(driver, EditNews.class);
	}

	public ContactUs getcontact(){
		return PageFactory.initElements(driver, ContactUs.class);
	}
		
	public MyProfile getprofile(){
		return PageFactory.initElements(driver, MyProfile.class);
	}
		
	public Logout getacclogout (){
		return PageFactory.initElements(driver, Logout.class);
	}
	
	public ForgotPassword getpswd(){
		return PageFactory.initElements(driver, ForgotPassword.class);
	}


}