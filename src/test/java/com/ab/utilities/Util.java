package com.ab.utilities;

import java.util.LinkedList;
import org.apache.log4j.Logger;
import com.ab.datainitialization.DataInt;

public class Util {

	public static final Logger LOG = Logger.getLogger(Util.class);

	public static LinkedList<Object[]> getRegisteraBlock(String sheetName1,Xls_Reader xls) {
	LinkedList<Object[]> registerablock = new LinkedList<Object[]>();
	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;
		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			totalRows++;
		}
		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
			dataInitialization = new DataInt();
			Object obj[] = new Object[1];
			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("RegisteraBlock")) {
				dataInitialization.setIndividualName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setAddressLine1(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setAddressLine2(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setCity(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setState(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setZipCode(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setPrimaryContactName(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setTitleIfApplicable(xls.getCellData(sheetName1, 8, i));
				dataInitialization.setPhoneNumber(xls.getCellData(sheetName1, 9, i));
				dataInitialization.setMobileNumber(xls.getCellData(sheetName1, 10, i));
				dataInitialization.setContactEmail(xls.getCellData(sheetName1, 11, i));
				dataInitialization.setContactNameifgrouporbusiness(xls.getCellData(sheetName1, 12, i));
				dataInitialization.setAlternateContactPhone(xls.getCellData(sheetName1, 13, i));
				dataInitialization.setEmailforsignup(xls.getCellData(sheetName1, 14, i));
				dataInitialization.setSignuppassword(xls.getCellData(sheetName1, 15, i));
				obj[0] = dataInitialization;
				registerablock.add(obj);
			}
		}

	} catch (Exception e) {
		e.printStackTrace();
		LOG.info(e.toString());
	}
	return registerablock;
    }

	public static LinkedList<Object[]> getLoginData(String sheetName1,Xls_Reader xls) {
	LinkedList<Object[]> logindata = new LinkedList<Object[]>();
	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;
		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {	
			totalRows++;
		}
		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
			dataInitialization = new DataInt();
			Object obj[] = new Object[1];
			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Login")) {
				dataInitialization.setEmail(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setPassword(xls.getCellData(sheetName1, 2, i));
				obj[0] = dataInitialization;
				logindata.add(obj);
			}
		}

	} catch (Exception e) {
		e.printStackTrace();
		LOG.info(e.toString());
	}
	return logindata;
    }

	public static LinkedList<Object[]> getEvents(String sheetName1,Xls_Reader xls) {
	LinkedList<Object[]> events = new LinkedList<Object[]>();
	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;
		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {		
			totalRows++;
		}
		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
			dataInitialization = new DataInt();
			Object obj[] = new Object[1];
			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Events")) {
				dataInitialization.setTitleforEvent(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setTime(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setAlternativeKeywords(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setShortDescription(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setAddress(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setCity(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setState(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setZipCode(xls.getCellData(sheetName1, 8, i));
				dataInitialization.setContactNo(xls.getCellData(sheetName1, 9, i));
				dataInitialization.setFee(xls.getCellData(sheetName1, 10, i));
				dataInitialization.setWebsiteURL(xls.getCellData(sheetName1, 11, i));
				dataInitialization.setDescription(xls.getCellData(sheetName1, 12, i));				
				obj[0] = dataInitialization;
				events.add(obj);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
		LOG.info(e.toString());
	}
	return events;
    }

	public static LinkedList<Object[]> getCleanup(String sheetName1,Xls_Reader xls) {
		LinkedList<Object[]> cleanup = new LinkedList<Object[]>();
		try {
			DataInt dataInitialization = null;
			int dataStartRowNum = 3;
			int totalRows = 0;
			while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {		
				totalRows++;
			}
			for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
				dataInitialization = new DataInt();
				Object obj[] = new Object[1];
				if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Cleanup")) {
					dataInitialization.setVolunteers(xls.getCellData(sheetName1, 1, i));
					dataInitialization.setYouthunder18(xls.getCellData(sheetName1, 2, i));
					dataInitialization.setBagsofLitterTrash(xls.getCellData(sheetName1, 3, i));
					dataInitialization.setTires(xls.getCellData(sheetName1, 4, i));
					dataInitialization.setStormDrains(xls.getCellData(sheetName1, 5, i));
					dataInitialization.setMiscellaneousActivitiesDescription(xls.getCellData(sheetName1, 6, i));
					obj[0] = dataInitialization;
					cleanup.add(obj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOG.info(e.toString());
		}
		return cleanup;
	    }
	
	public static LinkedList<Object[]> getNews(String sheetName1,Xls_Reader xls) {
	LinkedList<Object[]> news = new LinkedList<Object[]>();
	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;
		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {			
			totalRows++;
		}
		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
			dataInitialization = new DataInt();
			Object obj[] = new Object[1];
			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("News")) {
				dataInitialization.setTitleforNews(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setSource(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setAlternativeKeywords(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setShortDescription(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setWebsiteURL(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setDescription(xls.getCellData(sheetName1, 6, i));
				obj[0] = dataInitialization;
				news.add(obj);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
		LOG.info(e.toString());
	}
	return news;
    }
	
	public static LinkedList<Object[]> getContactus(String sheetName1,Xls_Reader xls) {
	LinkedList<Object[]> contactus = new LinkedList<Object[]>();
	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;
		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {		
		totalRows++;
		}
		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
			dataInitialization = new DataInt();
			Object obj[] = new Object[1];
			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Contactus")) {
				dataInitialization.setContactFirstName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setContactusemail(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setContactphone(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setComments(xls.getCellData(sheetName1, 4, i));
				obj[0] = dataInitialization;
				contactus.add(obj);
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
		//LOG.info(e.toString());
	}
	return contactus;
    }

	public static LinkedList<Object[]> getMyProfile(String sheetName1,Xls_Reader xls) {
	LinkedList<Object[]> myprofile = new LinkedList<Object[]>();
	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;
		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {	
			totalRows++;
		}
		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {
			dataInitialization = new DataInt();
			Object obj[] = new Object[1];
			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("MyProfile")) {
				dataInitialization.setFirstName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setLastName(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setAddressLine1(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setAddressLine2(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setCity(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setState(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setZipCode(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setPhoneNumber(xls.getCellData(sheetName1, 8, i));
				obj[0] = dataInitialization;
				myprofile.add(obj);
			}		
		}
	} catch (Exception e) {
		e.printStackTrace();
		LOG.info(e.toString());
	}
	return myprofile;
    }

}