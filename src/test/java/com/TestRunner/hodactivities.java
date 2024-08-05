package com.TestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.ConfigurationReader;
import com.PageObjects.HODPageObjects;
import com.PageObjects.PurchaseExecutiveRegistrationPageObjects;
import com.PageObjects.VendorPageObjects;

public class hodactivities extends ConfigurationReader{
	ConfigurationReader cf = new ConfigurationReader();
	//@Test
	public void hodapproval() {
		HODPageObjects hod = new HODPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		hod.hodapprove(getcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	//@Test()
	public void hodrejection() {
		HODPageObjects hod = new HODPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		hod.hodreject(getrejcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void hodresubmit() {
		HODPageObjects hod = new HODPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		hod.hodreturn(getreturncomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
}
