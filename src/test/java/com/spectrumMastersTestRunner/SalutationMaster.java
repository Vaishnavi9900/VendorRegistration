package com.spectrumMastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.Basepack.SpectrumDataProvider;
import com.aventstack.extentreports.Status;
import com.spectrumMastersPageObjects.UOM;
import com.spectrumMastersPageObjects.salutationpageobjects;
import com.spectrumMastersPageObjects.statepageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class SalutationMaster extends RegistrationCommonMethods{
	public UOM uom;
	public usercreationpageobjects uc;
	public salutationpageobjects sl;
	@Test(dataProvider = "salutation", dataProviderClass =  SpectrumDataProvider.class)
	public void salutationmaster(String saldesc, String salcode, String salcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		sl = new salutationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		sl.salutation(saldesc, salcode, salcode1, cell7val, cell8val, cell9val, cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "salutation", dataProviderClass =  SpectrumDataProvider.class)
	public void salutationcreate(String saldesc, String salcode, String salcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		sl = new salutationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		sl.salutationcreation(saldesc,salcode);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "salutation", dataProviderClass =  SpectrumDataProvider.class)
	public void salutationupdate(String saldesc, String salcode, String salcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell7value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		sl = new salutationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		sl.salutationupdate(salcode1,cell7val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test
	public void salutationdisable() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell8value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		sl = new salutationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		sl.salutationdisable(cell8val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test
	public void salutationenable() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell9value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		sl = new salutationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		sl.salutationenable(cell9val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
}
