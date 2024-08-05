package com.spectrumAdminTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.aventstack.extentreports.Status;
import com.spectrumadminPageObjects.usercontrolpageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class UserControl extends RegistrationCommonMethods {
	public usercontrolpageobjects ucc;
	public usercreationpageobjects uc;
	@Test
	public void usercontrolactivity() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		uc = new usercreationpageobjects(driver);
		ucc = new usercontrolpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		ucc.usercontrols("998800");
		implicitwait();
		ucc.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}

}
