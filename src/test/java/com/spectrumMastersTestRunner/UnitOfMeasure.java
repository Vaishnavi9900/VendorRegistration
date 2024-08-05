package com.spectrumMastersTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.Basepack.SpectrumDataProvider;
import com.aventstack.extentreports.Status;
import com.spectrumMastersPageObjects.UOM;
import com.spectrumadminPageObjects.usercontrolpageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class UnitOfMeasure extends RegistrationCommonMethods{
	public UOM uom;
	public usercreationpageobjects uc;
	@Test(dataProvider = "UOM", dataProviderClass = SpectrumDataProvider.class)
	public void uommaster(String uomname, String uomcode, String uomcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell7value("logins"); 
		getcell8value("logins"); getcell9value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		uom.uom(uomname, uomcode, uomcode1, cell7val, cell8val, cell9val, cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "UOM", dataProviderClass = SpectrumDataProvider.class)
	public void uomCreation(String uomname, String uomcode, String uomcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		uom.uomcreation(uomname, uomcode);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uom.enableuom(cell9val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test(dataProvider = "UOM", dataProviderClass = SpectrumDataProvider.class)
	public void uomupdate(String uomname, String uomcode, String uomcode1) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell7value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		uom.updateuom(uomcode1, cell7val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test
	public void uomdisable() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell8value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		uom.disableuom(cell8val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
	@Test
	public void uomenable() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); getcell9value("logins");
		uc = new usercreationpageobjects(driver);
		uom = new UOM(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		uom.enableuom(cell9val);
		implicitwait();
		uom.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
}
