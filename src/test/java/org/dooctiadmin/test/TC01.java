package org.dooctiadmin.test;

import org.doocti.seleniumbase.DooctiAdminBase;
import org.dooctiadmin.page.LoginPage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends DooctiAdminBase{
	

	
	@Test(dataProvider ="LoginData",
			dataProviderClass = DooctiAdminBase.class)
	public void loginTest(String data[]) {

		/*
		LoginPage lp = new LoginPage();
		lp.enterUsername("developv2_admin@doocti.com");
		lp.enterUsername("Doocti@123");  
		lp.clickLogin();
		 */
		
		LoginPage lp = new LoginPage(driver);
		
		boolean userNameLable = lp.getUserNameLable();
		Assert.assertTrue(userNameLable);
		
		boolean passLable = lp.getPasswordLabel();
		Assert.assertTrue(passLable);
		
		boolean loginButton = lp.getLoginButton();
		Assert.assertTrue(loginButton);
		

		new LoginPage(driver)
		.enterUsername(data[0])
		.enterPassword(data[1])
		.clickLogin();
		
		
		System.out.println(data[0]);
		System.out.println(data[1]);
	}




}
