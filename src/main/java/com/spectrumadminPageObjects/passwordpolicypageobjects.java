package com.spectrumadminPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Basepack.RegistrationCommonMethods;

public class passwordpolicypageobjects extends RegistrationCommonMethods {
	@FindBy(xpath = "//a[text()='Admin ']")
	WebElement admin;
	@FindBy(xpath = "//a[text()='Password Policy']")
	WebElement passwordpolicy;
	@FindBy(xpath = "//select[@formcontrolname='PlantId']")
	WebElement plant;
	@FindBy(xpath = "//option[text()='HETERO DRUGS LIMITED (UNIT-I)']")
	WebElement plantsel;
	@FindBy(xpath = "//input[@formcontrolname='PasswordExpiry']")
	WebElement passwordexpirey;
	@FindBy(xpath = "//input[@formcontrolname='InvalideAttempts']")
	WebElement invalidattempts;
	@FindBy(xpath = "//input[@formcontrolname='PasswordExpiryAlertBeforeDays']")
	WebElement passwordexbeforedays;
	@FindBy(xpath = "//input[@formcontrolname='EnforcePasswordHistory']")
	WebElement enforcepasswordexhistory;
	@FindBy(xpath = "//input[@formcontrolname='MinimumUpperCaseCharacters']")
	WebElement minupcharcters;
	@FindBy(xpath = "//input[@formcontrolname='MinimumLowerCaseCharacters']")
	WebElement minlowcharacters;
	@FindBy(xpath = "//input[@formcontrolname='MinimumSpecialCharacters']")
	WebElement minspecialcharacters;
	@FindBy(xpath = "//input[@formcontrolname='MinimumCharacters']")
	WebElement mincharacters;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement ok;
	@FindBy(xpath = "//input[@formcontrolname='MinimumDigits']")
	WebElement mindigits;
	public passwordpolicypageobjects(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void passwordpolicy(String exp, String invalid, String expbefore, String enforce, String up, String low, String digits, String special, String characters) throws InterruptedException {
		clickElement(admin);
		javawait();
		javascript(passwordpolicy);
		implicitwait();
		clickElement(plant);
		javawait();
		clickElement(plantsel);
		implicitwait();
		clickElement(update);
		clickElement(ok);
		textboxc(passwordexpirey,exp);
		javawait();
		textboxc(invalidattempts,invalid);
		javawait();
		textboxc(passwordexbeforedays,expbefore);
		javawait();
		textboxc(enforcepasswordexhistory,enforce);
		javawait();
		textboxc(minupcharcters,up);
		javawait();
		textboxc(minlowcharacters,low);
		javawait();
		textboxc(mindigits,digits);
		javawait();
		textboxc(minspecialcharacters,special);
		javawait();
		textboxc(mincharacters,characters);
        clickElement(update);
	}
}
