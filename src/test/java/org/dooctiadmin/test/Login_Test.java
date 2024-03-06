package org.dooctiadmin.test;

import org.dooctiadmin.page.Login_Page;
import org.dooctiadmin.seleniumbase.Trail_Base;
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
