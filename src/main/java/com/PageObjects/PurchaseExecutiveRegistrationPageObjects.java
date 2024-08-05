package com.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class PurchaseExecutiveRegistrationPageObjects extends RegistrationCommonMethods {
	@FindBy(xpath = "//input[@placeholder='User ID']")
	WebElement userid;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement login;
	@FindBy(xpath = "//p[text()='Termination']")
	WebElement term;
	@FindBy(xpath = "//button[text()='Terminate Other Login']")
	WebElement termother;
	@FindBy(xpath = "//div[text()=' Manual Vendor Registration ']")
	WebElement manualregistrationtab;
	@FindBy(xpath = "//button[text()='Register']")
	WebElement registerbutton;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement countryy;
	@FindBy(xpath = "//input[@formcontrolname='emailId']")
	WebElement emaill;
	@FindBy(xpath = "//input[@formcontrolname='mobileNumber']")
	WebElement mobile;
	@FindBy(xpath = "//textarea[@formcontrolname='purpose']")
	WebElement purposee;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement execomments;
	@FindBy(xpath = "//select[@formcontrolname='companyCode']")
	WebElement companycodee;
	@FindBy(xpath = "//select[@formcontrolname='paymentTerms']")
	WebElement paymenttermss;
	@FindBy(xpath = "(//button[@class='btn successBtn ml-2'])[1]")
	WebElement add1;
	@FindBy(xpath = "(//button[@class='btn successBtn ml-2'])[3]")
	WebElement add2;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement Yesbutton;
	@FindBy(xpath = "(//button[text()='No'])[3]")
	WebElement Nobutton;
	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement esignpass;
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement ok;
	@FindBy(xpath = "//a[text()='Initiated List']")
	WebElement initiatedlist;
	@FindBy(xpath = "(//a[@class='btn btn-primary xsBtn'])[1]")
	WebElement view;
	@FindBy(xpath = "//span[@class='avatarIcon']")
	WebElement profile;
	@FindBy(xpath = "//a[text()=' Quit']")
	WebElement quit;
	@FindBy(xpath = "//a[text()='Yes']")
	WebElement quityes;
	@FindBy(xpath = "//button[text()='No']")
	WebElement quitno;
	@FindBy(xpath = "//div[text()=' Pending for Approvals ']")
	WebElement pendingforapprovalstab;
	@FindBy(xpath = "(//a[@class='btn btn-primary xsBtn'])[1]")
	WebElement editbutton;
	@FindBy(xpath = "//h3[text()='Approved Vendor ']")
	WebElement approvedvendordetails;
	@FindBy(xpath = "//h3[text()='Tax Details ']")
	WebElement taxdetails;
	@FindBy(xpath = "//h3[text()='Business Details ']")
	WebElement businessdetails;
	@FindBy(xpath = "//h3[text()='Bank Details ']")
	WebElement bankdetails;
	@FindBy(xpath = "//h3[text()='Vendors Comments ']")
	WebElement vendorcomments;
	@FindBy(xpath = "//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(xpath = "//button[text()='Re-Submit ']")
	WebElement resubmit;
	@FindBy(xpath = "//button[text()='Approve ']")
	WebElement approve;
	@FindBy(xpath = "//select[@formcontrolname='selectedToReturned']")
	WebElement selectedreturned;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(xpath = "(//button[@class='btn successBtn'])[1]")
	WebElement compaddbutton;
	@FindBy(xpath = "(//button[@class='btn successBtn'])[3]")
	WebElement paymentadd;
	@FindBy(xpath = "//div[text()=' Returned List ']")
	WebElement returnlist;
	@FindBy(xpath = "//a[text()='Returned List']")
	WebElement manualreturnlist;
	public PurchaseExecutiveRegistrationPageObjects(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	public void login(String id, String pass) throws InterruptedException, IOException {
		textbox(userid, id);
		implicitwait();
		textbox(password, pass);
	}

	public void dashboard() {
		javascript(manualregistrationtab);
	}

	public void register() {
		clickElement(registerbutton);
	}

	public void country(String country) {
		textbox(countryy, country);
	}

	public void email(String mail) {
		textbox(emaill, mail);
	}

	public void mobile(String mobileno) {
		textbox(mobile, mobileno);
	}

	public void purpose(String purpose) {
		textbox(purposee, purpose);
	}

	public void execomments(String vendorcomments) {
		textbox(execomments, vendorcomments);
	}

	public void companydetails(String companycode, String paymentterms) {
		textbox(companycodee, companycode);
		clickElement(add1);
		implicitwait();
		textbox(paymenttermss, paymentterms);
		clickElement(add2);
	}

	public void popups(String Password) {
		clickElement(Yesbutton);
		implicitwait();
		textbox(esignpass, Password);
		implicitwait();
		clickElement(ok);
	}

	public void profile() {
		clickElement(profile);
		implicitwait();
		clickElement(quit);
		implicitwait();
		clickElement(quityes);
	}

	public void initiatedlist() {
		clickElement(initiatedlist);
		implicitwait();
		clickElement(view);
	}

	public void vendorcompanydetails(String companycode, String paymentterms) {
		textbox(companycodee, companycode);
		clickElement(compaddbutton);
		implicitwait();
		textbox(paymenttermss, paymentterms);
		clickElement(paymentadd);
	}

	public void exeapprove(String comments, String companycode, String paymentterms) {
		clickElement(pendingforapprovalstab);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		clickElement(approvedvendordetails);
		implicitwait();
		clickElement(taxdetails);
		implicitwait();
		scrolldown(businessdetails);
		clickElement(businessdetails);
		implicitwait();
		clickElement(bankdetails);
		implicitwait();
		clickElement(vendorcomments);
		implicitwait();
		vendorcompanydetails(companycode, paymentterms);
		implicitwait();
		textbox(execomments, comments);
		clickElement(approve);
	}

	public void exereject(String rejcomments) {
		clickElement(pendingforapprovalstab);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		clickElement(approvedvendordetails);
		implicitwait();
		clickElement(taxdetails);
		implicitwait();
		scrolldown(businessdetails);
		clickElement(businessdetails);
		implicitwait();
		clickElement(bankdetails);
		implicitwait();
		clickElement(vendorcomments);
		implicitwait();
		textbox(execomments, rejcomments);
		clickElement(reject);
	}

	public void exereturn(String returncomments) {
		clickElement(pendingforapprovalstab);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		clickElement(approvedvendordetails);
		implicitwait();
		clickElement(taxdetails);
		implicitwait();
		scrolldown(businessdetails);
		clickElement(businessdetails);
		implicitwait();
		clickElement(bankdetails);
		implicitwait();
		clickElement(vendorcomments);
		implicitwait();
		textbox(execomments, returncomments);
		clickElement(resubmit);
		implicitwait();
		textbox(selectedreturned, "vendor");
		implicitwait();
		clickElement(submit);
	}
	public void exereinitiation(String comments) {
		clickElement(pendingforapprovalstab);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		textbox(execomments, comments);
		clickElement(approve);
	}
	public void exemanualreinitiation(String comments) {
		clickElement(pendingforapprovalstab);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		textbox(execomments, comments);
		clickElement(approve);
	}
}