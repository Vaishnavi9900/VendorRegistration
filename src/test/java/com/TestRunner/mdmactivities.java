package com.TestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.ConfigurationReader;
import com.PageObjects.PurchaseExecutiveRegistrationPageObjects;
import com.PageObjects.mdmPageObjects;
import com.PageObjects.taxPageObjects;

public class mdmactivities extends ConfigurationReader {
	ConfigurationReader cf = new ConfigurationReader();
    @Test
	public void mdmapproval() {
    	mdmPageObjects mdm = new mdmPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		
		try {
			po.login(getMDM(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		mdm.matmdmapprove(getcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test()
	public void mdmrejection() {
		mdmPageObjects mdm = new mdmPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getMDM(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		mdm.matmdmreject(getrejcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void mdmresubmit() {
		mdmPageObjects mdm = new mdmPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getMDM(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		mdm.matmdmreturn(getreturncomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
}
