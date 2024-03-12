package org.dooctiadmin.test;

import org.doocti.seleniumbase.Trail_Base;
import org.dooctiadmin.page.Login_Page;
import org.testng.annotations.Test;

public class Login_Test extends Trail_Base {
	
	@Test(dataProvider = "Trail_Data",dataProviderClass = Trail_Base.class)
	public void LoginTest(String data[]) {

		new Login_Page(driver)
		.enterUserName(data[0])
		.enterPassword(data[1])
		.clickLogin();
		
	}

}
