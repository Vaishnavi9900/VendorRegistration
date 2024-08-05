package com.PageObjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class VendorPageObjects extends RegistrationCommonMethods {

	@FindBy(xpath = "//a[text()='New Registration ?']")
	WebElement newregistration;
	@FindBy(xpath = "//button[text()='Generate OTP']")
	WebElement generateotp;
	@FindBy(xpath = "//select[@formcontrolname='country']")
	WebElement countryy;
	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement emaill;
	@FindBy(xpath = "//input[@formcontrolname='mobileNumber']")
	WebElement mobile;
	@FindBy(xpath = "//input[@formcontrolname='otp']")
	WebElement enterotpp;
	@FindBy(xpath = "//button[text()=' Submit']")
	WebElement submitt;
	@FindBy(xpath = "//input[@type='email']")
	WebElement msofficeemaill;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement msofficesubmitt;
	@FindBy(xpath = "//input[@name='passwd']")
	WebElement msofficepasswordd;
	@FindBy(xpath = "(//span[@role='presentation'])[1]")
	WebElement msofficemenuu;
	@FindBy(xpath = "(//span[text()='Outlook'])[2]")
	WebElement outlookk;
	@FindBy(xpath = "//span[text()='Archive']")
	WebElement archivee;
	@FindBy(xpath = "(//span[text()='App Testing - Audree'])[1]")
	WebElement apptestt;
	@FindBy(xpath = "//*[@id=\"UniqueMessageBody_1\"]/div/div/div")
	WebElement otptextt;
	@FindBy(xpath = "//input[@placeholder='New Password']")
	WebElement newpasswordd;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement confpasswordd;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginn;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement regsubmitt;
	@FindBy(xpath = "//input[@id='companyName']")
	WebElement companynamee;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address11;
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address22;
	@FindBy(xpath = "//input[@id='city']")
	WebElement cityy;
	@FindBy(xpath = "//input[@formcontrolname='pinCode']")
	WebElement pincodee;
	@FindBy(xpath = "//select[@formcontrolname='stateId']")
	WebElement statee;
	@FindBy(xpath = "//input[@formcontrolname='contactName']")
	WebElement contactnamee;
	@FindBy(xpath = "//input[@formcontrolname='departmentName']")
	WebElement departmentt;
	@FindBy(xpath = "//input[@formcontrolname='designationName']")
	WebElement designationn;
	@FindBy(xpath = "//select[@formcontrolname='gstStatusId']")
	WebElement gststatuss;
	@FindBy(xpath = "//input[@formcontrolname='gstNumber']")
	WebElement gstnumberr;
	@FindBy(xpath = "//input[@formcontrolname='panNumber']")
	WebElement pannumberr;
	@FindBy(xpath = "//input[@value='true']")
	WebElement msmeyess;
	@FindBy(xpath = "//input[@value='false']")
	WebElement msmenoo;
	@FindBy(xpath = "//select[@formcontrolname='msmeType']")
	WebElement msmetypee;
	@FindBy(xpath = "//input[@formcontrolname='msmeNo']")
	WebElement msmenumberr;
	@FindBy(xpath = "//select[@formcontrolname='materialServices']")
	WebElement matorserr;
	@FindBy(xpath = "//span[@class='dropdown-btn']")
	WebElement matorsertypee;
	@FindBy(xpath = "//div[text()='SOLVENTS']")
	WebElement matorsertypesel11;
	@FindBy(xpath = "//div[text()='OTHER SERVICES']")
	WebElement matorsertypesel22;
	@FindBy(xpath = "//select[@formcontrolname='typeofBusinessId']")
	WebElement typeofbusinesss;
	@FindBy(xpath = "//input[@formcontrolname='yearofEstablished']")
	WebElement yearofestablishh;
	@FindBy(xpath = "//input[@formcontrolname='majorCLient']")
	WebElement majorcleintt;
	@FindBy(xpath = "(//button[text()='Add '])[2]")
	WebElement addbuttonn;
	@FindBy(xpath = "(//button[text()=' Add'])[2]")
	WebElement majoraddbutton;
	@FindBy(xpath = "//input[@id='bankName']")
	WebElement banknamee;
	@FindBy(xpath = "//input[@formcontrolname='accountNumber']")
	WebElement accountnoo;
	@FindBy(xpath = "//input[@formcontrolname='beneficiaryName']")
	WebElement benificiarynamee;
	@FindBy(xpath = "//input[@formcontrolname='branchName']")
	WebElement brachnamee;
	@FindBy(xpath = "//input[@formcontrolname='ifscswiftCode']")
	WebElement ifsccodee;
	@FindBy(xpath = "//select[@formcontrolname='documentId']")
	WebElement documentss;
	@FindBy(xpath = "//input[@formcontrolname='attachDescription']")
	WebElement uploadfilee;
	@FindBy(xpath = "//option[text()=' MSME Certificate']")
	WebElement msmecertificatee;
	@FindBy(xpath = "//option[text()=' GST Certificate']")
	WebElement gstcertificatee;
	@FindBy(xpath = "//option[text()=' PAN Card']")
	WebElement pancardd;
	@FindBy(xpath = "//option[text()=' Cancelled Cheque']")
	WebElement cancelledchequee;
	@FindBy(xpath = "//option[text()=' NEFT']")
	WebElement neftt;
	@FindBy(xpath = "//option[text()=' Declaration for GST']")
	WebElement declarationforgstt;
	@FindBy(xpath = "//textarea[@formcontrolname='fileuploadJustification']")
	WebElement justificationn;
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	WebElement justsubmitt;
	@FindBy(xpath = "//textarea[@id='comments']")
	WebElement vendorcommentss;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement vendormail;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement vendorpassword;
	@FindBy(xpath = "//input[@placeholder='Registration Code']")
	WebElement registrationcode;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement login;

	public VendorPageObjects(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	public void newregistration() {
		clickElement(newregistration);
	}
	public void generateotp() {
		clickElement(generateotp);
	}
	public void registration(String country, String email, String mobileno) {
		textbox(countryy, country);
		textbox(emaill, email);
		textbox(mobile, mobileno);
	}
	public void submit() {
		clickElement(submitt);
	}
	public void msofficemenu() {
		clickElement(msofficemenuu);
	}
	public void outlook(String mail, String outlookpass) {
		textbox(msofficeemaill, mail);
		implicitwait();
		msofficepasswordd.sendKeys(outlookpass);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    clickElement(msofficesubmitt);
	    implicitwait();
	    clickElement(msofficesubmitt);
	    implicitwait();
		clickElement(msofficemenuu);
	}
	public void mails() {
		clickElement(archivee);
		implicitwait();
		clickElement(apptestt);
		implicitwait();
		clickElement(otptextt);
		String otpp = otptextt.getText();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(otpp);
		String actualotp = otpp.substring(24, 28);
		System.out.println(actualotp);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		implicitwait();
		textbox(enterotpp, actualotp);
	}
	public void changepassword(String newpassword, String confirmpassword) {
		textbox(newpasswordd, newpassword);
		textbox(confpasswordd, confirmpassword);
		clickElement(loginn);
	}
	public void regsubmit() {
		clickElement(regsubmitt);
	}
	public void manualsubmit() {
		scrolldown(regsubmitt);
		clickElement(regsubmitt);
	}
	public void company(String Companyname) {      
		clickElement(companynamee);
		implicitwait();
		companynamee.sendKeys(Companyname);
	}
	public void address(String address1, String address2, String city) {
		textbox(address11, address1);
		implicitwait();
		textbox(address22, address2);
		implicitwait();
		textbox(cityy, city);
	}
	public void address1(String pincode, String state) {
		textbox(pincodee, pincode);
		implicitwait();
		textbox(statee, state);
	}
	public void contacts(String contactname, String department, String designation) {
		textbox(contactnamee, contactname);
		implicitwait();
		textbox(departmentt, department);
		implicitwait();
		textbox(designationn, designation);
	}
	public void gsttax(String gststatus, String pannumber, String gstnumber) {
		scrolldown(gststatuss);
		gststatuss.sendKeys(gststatus);
			textbox(pannumberr, pannumber);
	}
	public void msme() {
		clickElement(msmenoo);
	}
	public void businessdetails(String matorser,String typeofbusiness,String yearofestablish, String majorcleint) {
		scrolldown(matorserr);
		matorserr.sendKeys(matorser);
		implicitwait();
		clickElement(matorsertypee);
	    clickElement(matorsertypesel22);
		implicitwait();
		textbox(typeofbusinesss, typeofbusiness);
		implicitwait();
		textbox(yearofestablishh, yearofestablish);
		implicitwait();
		textbox(majorcleintt, majorcleint);
		clickElement(majoraddbutton);
	}
	public void bankdetails(String bankname,String accountno, String benificiaryname,String brachname, String ifsccode ) {
		textbox(banknamee, bankname);
		implicitwait();
		textbox(accountnoo, accountno);
		implicitwait();
		textbox(benificiarynamee, benificiaryname);
		implicitwait();
		textbox(brachnamee, brachname);
		implicitwait();
		textbox(ifsccodee, ifsccode);
	}
	public void documents(String documents) {
			clickElement(documentss);
			documentss.sendKeys(documents,Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			uploadfilee.sendKeys("C:\\Users\\vaishnavi.t\\eclipse-workspace\\VendorRegistration\\Resources\\DECLARATION FOR GST CERTIFICATE.pdf");
	}
	public void comments(String justcomments, String vendorcomments) {
		textbox(justificationn, justcomments);
		implicitwait();
		clickElement(justsubmitt);
		implicitwait();
		textbox(vendorcommentss, vendorcomments);
	}
	
	public void manualcomments(String justcomments) {
		textbox(justificationn, justcomments);
		implicitwait();
		clickElement(justsubmitt);
		manualsubmit();
	}
	public void reinitiation(String mail, String newpassword, String code){
		textbox(vendormail,mail);
		implicitwait();
		textbox(vendorpassword, newpassword);
		implicitwait();
		textbox(registrationcode, code);
	}
}
