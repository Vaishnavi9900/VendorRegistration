package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;

public class FinancePageObjects extends RegistrationCommonMethods {
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
	@FindBy(xpath = "//select[@formcontrolname='reconcilationAccount']")
	WebElement recouncillation;
	@FindBy(xpath = "//option[text()=' 11111111-International Vendor-AIPL']")
	WebElement recounsel;
	@FindBy(xpath = "(//button[@class='btn successBtn'])[1]")
	WebElement addbutton;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement fincomments;
	@FindBy(xpath = "//button[text()='Reject']")
	WebElement reject;
	@FindBy(xpath = "//button[text()='Re-Submit']")
	WebElement resubmit;
	@FindBy(xpath = "//select[@formcontrolname='selectedToReturned']")
	WebElement selectedreturned;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	@FindBy(xpath = "//button[text()='Approve']")
	WebElement approve;
	@FindBy(xpath = "//div[text()=' Returned List ']")
	WebElement returnlist;

	public FinancePageObjects(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	public void financeapprove(String comments) {
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
	    clickElement(recouncillation);
	    clickElement(recounsel);
	    implicitwait();
	    clickElement(addbutton);
		textbox(fincomments, comments);
		clickElement(approve);
	}
	public void financereject(String rejcomments) {
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
		textbox(fincomments, rejcomments);
		clickElement(reject);
	}
	public void financereturn(String returncomments) {
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
		textbox(fincomments, returncomments);
		clickElement(resubmit);
		implicitwait();
		textbox(selectedreturned,"purchaseexe");
		implicitwait();
		clickElement(submit);
	}
	public void financereinitiation(String comments) {
		clickElement(returnlist);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		textbox(fincomments, comments);
		clickElement(approve);		
	}
}
