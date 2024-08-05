package com.TestRunner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.ConfigurationReader;
import com.PageObjects.FinancePageObjects;
import com.PageObjects.PurchaseExecutiveRegistrationPageObjects;
import com.PageObjects.taxPageObjects;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class taxactivities extends ConfigurationReader {
	ConfigurationReader cf = new ConfigurationReader();
	ExtentTest test;
    @Test
	public void taxapproval() {
    	taxPageObjects tx = new taxPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		
		try {
			po.login(getTax(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.info("Login to application successfully");
		implicitwait();
		tx.taxapprove(getcomments(), gettype(), getcode());
		implicitwait();
		po.popups(getPassword());
		po.profile();
		test.log(Status.PASS, "This taxapproval test is passed");
	}
	@Test
	public void taxrejection() {
		taxPageObjects tx = new taxPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getTax(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.info("Login to application successfully");
		implicitwait();
		tx.taxreject(getrejcomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void taxresubmit() {
		taxPageObjects tx = new taxPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getTax(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.info("Login to application successfully");
		implicitwait();
		tx.taxreturn(getreturncomments());
		implicitwait();
		po.popups(getPassword());
		po.profile();
	}
	@Test
	public void taxreinitiation() {
		taxPageObjects tx = new taxPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getTax(),getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.info("Login to application successfully");
		implicitwait();
		tx.taxreinitiation(getcomments());
		implicitwait();
		po.popups(getPassword());
		try {
			javawait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		po.profile();
	}
}
