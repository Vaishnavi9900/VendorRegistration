package com.spectrumAdminTestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Basepack.RegistrationCommonMethods;
import com.Basepack.SpectrumDataProvider;
import com.aventstack.extentreports.Status;
import com.spectrumadminPageObjects.menubasedrolepageobjects;
import com.spectrumadminPageObjects.passwordpolicypageobjects;
import com.spectrumadminPageObjects.usercontrolpageobjects;
import com.spectrumadminPageObjects.usercreationpageobjects;

public class MenuBasedRole extends RegistrationCommonMethods {
	public usercontrolpageobjects ucc;
	public menubasedrolepageobjects mb;
	public usercreationpageobjects uc;
	@Test
	public void menubased() throws IOException, InterruptedException {
		getcell0value("logins"); getcell2value("logins"); 
		mb = new menubasedrolepageobjects(driver);
		ucc = new usercontrolpageobjects(driver);
		uc = new usercreationpageobjects(driver);
		uc.userlogin(cell0val, cell2val);
		implicitwait();
		uc.dashboard();
		javawait();
		extentTest.info("Login was successful");
		mb.menubasedrole("vendorportal","tax");
		implicitwait();
		ucc.popup(cell2val);
		implicitwait();
		uc.logout();
		extentTest.log(Status.PASS, "This usercreate test is passed");
	}
}
