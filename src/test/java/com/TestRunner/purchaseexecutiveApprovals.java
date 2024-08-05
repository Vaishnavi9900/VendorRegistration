package com.TestRunner;

import java.io.IOException;
import org.testng.annotations.Test;
import com.Basepack.ConfigurationReader;
import com.PageObjects.HODPageObjects;
import com.PageObjects.PurchaseExecutiveRegistrationPageObjects;
import com.PageObjects.mdmPageObjects;

public class purchaseexecutiveApprovals extends ConfigurationReader {
	ConfigurationReader cf = new ConfigurationReader();
    @Test
	public void exeapproval() {
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		
		try {
			po.login(getMDM(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		po.exeapprove(getcomments(),getcompanycode(), getpaymentterms());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
    @Test()
	public void exerejection() {
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		po.exereject(getrejcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void exeresubmit() {
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		po.exereturn(getreturncomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void exereinitiation1() {
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		po.exereinitiation(getcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void exemanualreinitiation1() {
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getHOD(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		po.exereinitiation(getcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
}
