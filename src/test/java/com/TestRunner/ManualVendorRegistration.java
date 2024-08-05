package com.TestRunner;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.Basepack.ConfigurationReader;
import com.PageObjects.PurchaseExecutiveRegistrationPageObjects;
import com.PageObjects.VendorPageObjects;

public class ManualVendorRegistration extends ConfigurationReader {
	@Test
	public void manualregister() {
		ConfigurationReader cf = new ConfigurationReader();
		VendorPageObjects vp = new VendorPageObjects(driver);
		PurchaseExecutiveRegistrationPageObjects po = new PurchaseExecutiveRegistrationPageObjects(driver);
		try {
			po.login(getPurExe(), getPassword());
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		po.dashboard();
		po.register();
		implicitwait();
		vp.company(getCompanyname());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		vp.address(getaddress1(), getaddress2(), getcity());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		po.country(getcountry());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		po.email(getmail());
		implicitwait();
		po.mobile(getmobileno());
		implicitwait();
		vp.address1(getpincode(), getstate());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		vp.contacts(getcontactname(), getdepartment(), getdesignation());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		vp.gsttax(getgststatus(), getpannumber(), getgstnumber());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		vp.msme();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		vp.businessdetails(getmatorser(), gettypeofbusiness(), getyearofestablish(), getmajorcleint());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		po.purpose(getpurpose());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		po.companydetails(getcompanycode(), getpaymentterms());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		po.execomments(getvendorcomments());
		vp.bankdetails(getbankname(), getaccountno(), getbenificiaryname(), getbrachname(), getifsccode());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		vp.documents(getdocuments());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		vp.manualsubmit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		vp.manualcomments(getjustcomments());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		po.popups(getPassword());
		po.initiatedlist();
		po.profile();
	}

}
