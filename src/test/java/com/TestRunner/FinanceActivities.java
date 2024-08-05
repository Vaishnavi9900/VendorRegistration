package com.TestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.ConfigurationReader;
import com.PageObjects.FinancePageObjects;
import com.PageObjects.HODPageObjects;
import com.PageObjects.PurchaseExecutiveRegistrationPageObjects;

public class FinanceActivities extends ConfigurationReader {
	ConfigurationReader cf = new ConfigurationReader();
    @Test
	public void financeapproval() {
    	FinancePageObjects fn = new FinancePageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		
		try {
			po.login(getFinance(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		fn.financeapprove(getcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test()
	public void financerejection() {
		FinancePageObjects fn = new FinancePageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getFinance(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		fn.financereject(getrejcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void financeresubmit() {
		FinancePageObjects fn = new FinancePageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getFinance(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		fn.financereturn(getreturncomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void financereinitiation() {
		FinancePageObjects fn = new FinancePageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getFinance(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		implicitwait();
		fn.financereturn(getreturncomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}

	
}
