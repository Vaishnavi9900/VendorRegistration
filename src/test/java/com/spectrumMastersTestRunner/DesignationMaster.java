package com.spectrumMastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.Basepack.SpectrumDataProvider;
import com.aventstack.extentreports.Status;
import com.spectrumMastersPageObjects.UOM;
import com.spectrumMastersPageObjects.designationpageobjects;
import com.spectrumMastersPageObjects.salutationpageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class DesignationMaster extends RegistrationCommonMethods{
	public UOM uom;
	public usercreationpageobjects uc;
	public designationpageobjects des;
	@Test(dataProvider = "designation", dataProviderClass =  SpectrumDataProvider.class)
	public void designationmaster(String desdes, String descode, String descode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		des = new designationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		des.Designation(desdes, descode, descode1, cell7val, cell8val, cell9val, cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "designation", dataProviderClass =  SpectrumDataProvider.class)
	public void designationcreate(String saldesc, String salcode, String salcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		des = new designationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		des.designationcreation(saldesc,salcode);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "designation", dataProviderClass =  SpectrumDataProvider.class)
	public void salutationupdate(String saldesc, String salcode, String salcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell7value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		des = new designationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		des.designationupdate(salcode1,cell7val);
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
		des = new designationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		des.designationdisable(cell8val);
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
		des = new designationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		des.designationenable(cell9val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
}
