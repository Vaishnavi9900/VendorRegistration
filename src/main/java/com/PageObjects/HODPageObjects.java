package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class HODPageObjects extends RegistrationCommonMethods {

	@FindBy(xpath = "//div[text()=' Pending for Approvals ']")
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
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement hodcomments;
	@FindBy(xpath = "//button[text()='Reject ']")
	WebElement reject;
	@FindBy(xpath = "//button[text()='Re-Submit ']")
	WebElement resubmit;
	@FindBy(xpath = "//select[@formcontrolname='selectedToReturned']")
	WebElement selectedreturned;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(xpath = "//button[text()='Approve']")
	WebElement approve;

	public HODPageObjects(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	public void hodapprove(String comments) {
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
		textbox(hodcomments, comments);
		clickElement(approve);
	}
	public void hodreject(String rejcomments) {
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
		textbox(hodcomments, rejcomments);
		clickElement(reject);
	}
	public void hodreturn(String returncomments) {
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
		textbox(hodcomments, returncomments);
		clickElement(resubmit);
		implicitwait();
		textbox(selectedreturned,"purchaseexe");
		implicitwait();
		clickElement(submit);
	}

}
