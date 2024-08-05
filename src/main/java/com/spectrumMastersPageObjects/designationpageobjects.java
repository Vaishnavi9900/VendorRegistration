package com.spectrumMastersPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class designationpageobjects extends RegistrationCommonMethods {
	@FindBy(xpath = "//a[text()='Masters ']")
	WebElement masters;
	@FindBy(xpath = "//a[text()='Designation']")
	WebElement designation;
	@FindBy(xpath = "//button[text()=' Create']")
	WebElement create;
	@FindBy(xpath = "//button[text()='Create']")
	WebElement createbutton;
	@FindBy(xpath = "//input[@formcontrolname='DesignationDescription']")
	WebElement desdes;
	@FindBy(xpath = "//input[@formcontrolname='DesignationCode']")
	WebElement descode;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yes;
	@FindBy(xpath = "(//button[text()='No'])[2]")
	WebElement no;
	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement esignpass;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement ok;
	@FindBy(xpath = "(//span[@class='fa fa-pencil'])[1]")
	WebElement edit;
	@FindBy(xpath = "//textarea[@formcontrolname='Comments']")
	WebElement comments;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement enablechbox;
	public designationpageobjects(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void popup(String pass) throws InterruptedException {
		clickElement(yes);
    	javawait();
    	textbox(esignpass, pass);
    	javawait();
    	clickElement(ok);
	}
	public void Designation(String desc, String code, String code1, String comm,String comm1, String comm2, String pass) throws InterruptedException {
		clickElement(masters);
//    	javawait();
//    	javascript(designation);
//    	javawait();
//    	javascript(create);
//    	javawait();
//    	clickElement(createbutton);
//    	javawait();
//    	textbox(desdes, desc);
//    	javawait();
//    	textbox(descode, code);
//    	javawait();
//    	popup(pass);
    	javawait();
    	javascript(edit);
    	javawait();
    	clickElement(update);
    	javawait();
    	textboxc(descode, code1);
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
    	javawait();
    	popup(pass);
    	javawait();
    	clickElement(edit);
    	javawait();
    	clickElement(enablechbox);
    	javawait();
    	textbox(comments, comm1);
    	javawait();
    	clickElement(update);
    	javawait();
    	popup(pass);
    	javawait();
    	clickElement(edit);
    	javawait();
    	clickElement(enablechbox);
    	javawait();
    	textbox(comments, comm2);
    	javawait();
    	clickElement(update);
    	javawait();
    	popup(pass);	
	}
	
	public void designationcreation(String desc, String code) throws InterruptedException {
		clickElement(masters);
    	javawait();
    	javascript(designation);
    	javawait();
    	javascript(create);
    	javawait();
    	clickElement(createbutton);
    	javawait();
    	textbox(desdes, desc);
    	javawait();
    	textbox(descode, code);
	}
	public void designationupdate(String code, String comm) throws InterruptedException {
		clickElement(masters);
    	javawait();
    	javascript(designation);
    	javawait();
    	javascript(edit);
    	javawait();
    	clickElement(update);
    	javawait();
    	textboxc(descode, code);
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
	}
	public void designationdisable(String comm) throws InterruptedException {
		clickElement(masters);
    	javawait();
    	javascript(designation);
    	javawait();
    	clickElement(edit);
    	javawait();
    	clickElement(enablechbox);
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
	}
	public void designationenable(String comm) throws InterruptedException {
		clickElement(masters);
    	javawait();
    	javascript(designation);
    	javawait();
    	clickElement(edit);
    	javawait();
    	clickElement(enablechbox);
    	javawait();
    	textbox(comments, comm);
    	javawait();
    	clickElement(update);
	}
	}
