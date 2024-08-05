package com.spectrumMastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.Basepack.SpectrumDataProvider;
import com.aventstack.extentreports.Status;
import com.spectrumMastersPageObjects.UOM;
import com.spectrumMastersPageObjects.statepageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class StateMaster extends RegistrationCommonMethods {
	public UOM uom;
	public usercreationpageobjects uc;
	public statepageobjects st;
	@Test(dataProvider = "state", dataProviderClass =  SpectrumDataProvider.class)
	public void statemaster(String country, String statename, String statecode, String statecode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell7value("logins");
		getcell8value("logins"); getcell9value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		st = new statepageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		st.state(country, statename, statecode,statecode1, cell7val, cell8val, cell9val, cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "state", dataProviderClass =  SpectrumDataProvider.class)
	public void statecreate(String country, String statename, String statecode, String statecode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		st = new statepageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		st.statecreation(country,statename,statecode);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "state", dataProviderClass =  SpectrumDataProvider.class)
	public void stateupdate(String country, String statename, String statecode, String statecode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell7value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		st = new statepageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		st.stateupdate(statecode1,cell7val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test
	public void statedisable() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell8value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		st = new statepageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		st.statedisable(cell8val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test
	public void stateenable() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell9value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		st = new statepageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		st.stateenable(cell9val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
}
