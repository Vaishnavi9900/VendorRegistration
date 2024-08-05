package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class taxPageObjects extends RegistrationCommonMethods {
	@FindBy(xpath = "//div[text()=' Pending for Approval ']")
	WebElement pendingforapproval;
	@FindBy(xpath = "(//a[@class='btn btn-primary xsBtn'])[1]")
	WebElement editbutton;
	@FindBy(xpath = "//h3[text()='Approved Vendor ']")
	WebElement approvedvendordetails;
	@FindBy(xpath = "//h3[text()='Tax Details ']")
	WebElement taxdetails;
	@FindBy(xpath = "//h3[text()='Business Details ']")
	WebElement businessdetails;
	@FindBy(xpath = "//h3[text()='Purchase Executive Comments ']")
	WebElement purexecomments;
	@FindBy(xpath = "//h3[text()='Company Details ']")
	WebElement companydetails;
	@FindBy(xpath = "//h3[text()='Purchase Head Comments ']")
	WebElement purheadcomments;
	@FindBy(xpath = "//h3[text()='Reconcilation Account ']")
	WebElement recouncillationaccount;
	@FindBy(xpath = "//h3[text()='Finance Comments ']")
	WebElement financecomments;
	@FindBy(xpath = "//select[@formcontrolname='withTaxTypeId']")
	WebElement taxtype;
	@FindBy(xpath = "//select[@formcontrolname='withTaxCode']")
	WebElement taxcode;
	@FindBy(xpath = "(//button[@class='btn successBtn'])[1]")
	WebElement addbutton;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement taxcomments;
	@FindBy(xpath = "//button[text()=' Reject ']")
	WebElement reject;
	@FindBy(xpath = "//button[text()='Re-Submit']")
	WebElement resubmit;
	@FindBy(xpath = "//select[@formcontrolname='selectedToReturned']")
	WebElement selectedreturned;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(xpath = "//button[text()='Approve ']")
	WebElement approve;
	@FindBy(xpath = "//div[text()=' Returned List ']")
	WebElement returnlist;
	public taxPageObjects(WebDriver d) {
		driver =d;
		PageFactory.initElements(d, this);
	}
	public void taxapprove(String comments, String type, String code) {
		clickElement(pendingforapproval);
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
		clickElement(purexecomments);
		implicitwait();
		clickElement(companydetails);
		implicitwait();
		clickElement(purheadcomments);
		implicitwait();
	    clickElement(recouncillationaccount);
	    implicitwait();
	    clickElement(financecomments);
	    implicitwait();
	    textbox(taxtype, type);
	    implicitwait();
	    textbox(taxcode, code);
	    implicitwait();
	    clickElement(addbutton);
		textbox(taxcomments, comments);
		clickElement(approve);
	}
	public void taxreject(String rejcomments) {
		clickElement(pendingforapproval);
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
		clickElement(purexecomments);
		implicitwait();
		clickElement(companydetails);
		implicitwait();
		clickElement(purheadcomments);
		implicitwait();
		clickElement(recouncillationaccount);
	    implicitwait();
	    clickElement(financecomments);
	    implicitwait();
		textbox(taxcomments, rejcomments);
		clickElement(reject);
	}
	public void taxreturn(String returncomments) {
		clickElement(pendingforapproval);
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
		clickElement(purexecomments);
		implicitwait();
		clickElement(companydetails);
		implicitwait();
		clickElement(purheadcomments);
		implicitwait();
		clickElement(recouncillationaccount);
	    implicitwait();
	    clickElement(financecomments);
	    implicitwait();
		textbox(taxcomments, returncomments);
		clickElement(resubmit);
		implicitwait();
		textbox(selectedreturned,"finance");
		implicitwait();
		clickElement(submit);
	} 
	public void taxreinitiation(String comments) {
		clickElement(returnlist);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		textbox(taxcomments, comments);
		clickElement(approve);		
	}
}
