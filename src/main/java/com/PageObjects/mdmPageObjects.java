package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class mdmPageObjects extends RegistrationCommonMethods {
	@FindBy(xpath = "//div[text()=' Pending for Review MDM ']")
	WebElement pendingforreviewmdm;
	@FindBy(xpath = "(//a[@class='btn btn-primary xsBtn'])[1]")
	WebElement editbutton;
	@FindBy(xpath = "//button[text()=' Export Excel']")
	WebElement exporttoexcel;
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
	@FindBy(xpath = "//h3[text()='TDS Tax Code ']")
	WebElement tdstaxcode;
	@FindBy(xpath = "//h3[text()='TDS Tax Comments ']")
	WebElement tdstaxcomments;
	@FindBy(xpath = "//input[@formcontrolname='vendorCode']")
	WebElement vendorcode;
	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	WebElement mdmcomments;
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

	public mdmPageObjects(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	public void sermdmapprove(String comments) {
		clickElement(pendingforreviewmdm);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		clickElement(exporttoexcel);
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
		clickElement(tdstaxcode);
		implicitwait();
		clickElement(tdstaxcomments);
		textbox(vendorcode, "987782822");
		implicitwait();
		textbox(mdmcomments, comments);
		clickElement(approve);
	}
	public void matmdmapprove(String comments) {
		clickElement(pendingforreviewmdm);
		implicitwait();
		clickElement(editbutton);
		implicitwait();
		clickElement(exporttoexcel);
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
		textbox(vendorcode, "987782822");
		implicitwait();
		textbox(mdmcomments, comments);
		clickElement(approve);
	}
	public void sermdmreject(String rejcomments) {
		clickElement(pendingforreviewmdm);
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
		clickElement(tdstaxcode);
		implicitwait();
		clickElement(tdstaxcomments);
		implicitwait();
		textbox(mdmcomments, rejcomments);
		clickElement(reject);
	}
	public void matmdmreject(String rejcomments) {
		clickElement(pendingforreviewmdm);
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
		textbox(mdmcomments, rejcomments);
		clickElement(reject);
	}
	public void sermdmreturn(String returncomments) {
		clickElement(pendingforreviewmdm);
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
		clickElement(tdstaxcode);
		implicitwait();
		clickElement(tdstaxcomments);
		implicitwait();
		textbox(mdmcomments, returncomments);
		clickElement(resubmit);
		implicitwait();
		textbox(selectedreturned, "tax");
		implicitwait();
		clickElement(submit);
	}
	public void matmdmreturn(String returncomments) {
		clickElement(pendingforreviewmdm);
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
		textbox(mdmcomments, returncomments);
		clickElement(resubmit);
		implicitwait();
		textbox(selectedreturned, "tax");
		implicitwait();
		clickElement(submit);
	}

}
