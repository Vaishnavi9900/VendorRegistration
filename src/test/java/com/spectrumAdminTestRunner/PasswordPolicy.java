package com.spectrumAdminTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.Basepack.SpectrumDataProvider;
import com.aventstack.extentreports.Status;
import com.spectrumadminPageObjects.passwordpolicypageobjects;
import com.spectrumadminPageObjects.smtppasswordpageobjects;
import com.spectrumadminPageObjects.usercontrolpageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class PasswordPolicy extends RegistrationCommonMethods {
	public usercontrolpageobjects ucc;
	public passwordpolicypageobjects pp;
	public usercreationpageobjects uc;
	@Test(dataProvider = "passwordpolicy", dataProviderClass = SpectrumDataProvider.class)
	public void passwordpolicyy(String exp, String invalidattempts, String expalertbefore, String enforcepass, String minupcase, String minlowcase, String mindigits, String minspecial , String mincharacters) throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		pp = new passwordpolicypageobjects(driver);
		ucc = new usercontrolpageobjects(driver);
		uc = new usercreationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		pp.passwordpolicy(exp,invalidattempts,expalertbefore,enforcepass,minupcase,minlowcase,mindigits,minspecial ,mincharacters);
		implicitwait();
		ucc.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}

}
