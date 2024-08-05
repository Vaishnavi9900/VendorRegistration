package com.TestRunner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Basepack.ConfigurationReader;
import com.PageObjects.VendorPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VendorRegister extends ConfigurationReader {
	ConfigurationReader cf = new ConfigurationReader();
	@Test
	public void register() {
		VendorPageObjects vp = new VendorPageObjects(driver);
		driver.navigate().to("http://172.16.5.167/Registration/Vendor/");
		vp.newregistration();  
		vp.generateotp();		
		implicitwait(); 
		vp.registration(getcountry(), getmail(), getmobileno());		
		vp.generateotp();		
        driver.switchTo().newWindow(WindowType.TAB);        
        driver.get(getmsofficeurl());        
        System.out.println(driver.getWindowHandle());
        implicitwait();        
        vp.outlook(getmail(), getoutlookpass());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(getoutlookurl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));         
        vp.mails();       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));       
        vp.submit();
        vp.changepassword(getnewpassword(), getconfirmpassword());
        vp.regsubmit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
        vp.company(getCompanyname());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.address(getaddress1(), getaddress2(), getcity());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.address1(getpincode(), getstate());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.contacts(getcontactname(), getdepartment(), getdesignation());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.gsttax(getgststatus(), getCompanyname(), getgstnumber());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.msme();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.businessdetails(getmatorser(),gettypeofbusiness(), getyearofestablish(), getmajorcleint());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.bankdetails(getbankname(), getaccountno(), getbenificiaryname(), getbrachname(), getifsccode());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.documents(getdocuments());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        vp.comments(getjustcomments(), getvendorcomments());
	}
	@Test
	public void vendorReinitiation() {
		VendorPageObjects vp = new VendorPageObjects(driver);
		vp.reinitiation(getmail(), getnewpassword(), "200123");
		implicitwait();
		vp.comments(getjustcomments(), getvendorcomments());
	}
}
