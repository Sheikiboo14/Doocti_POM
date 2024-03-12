package org.dooctiAgent.test;

import org.doocti.seleniumbase.AgentLogin_TestData;
import org.dooctiAgent.page.AgentLogin_Page;
import org.testng.annotations.Test;

public class LoginTest  extends AgentLogin_TestData{

	@Test(dataProvider = "Tc01Data",dataProviderClass = AgentLogin_TestData.class)
	public void login01Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(false)
		.inputClear();
	}

	@Test(dataProvider = "Tc02Data",dataProviderClass = AgentLogin_TestData.class)
	public void login02Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(false)
		.inputClear();



	}

	@Test(dataProvider = "Tc03Data",dataProviderClass = AgentLogin_TestData.class)
	public void login03Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(false)
		.inputClear();



	}

	@Test(dataProvider = "Tc04Data",dataProviderClass = AgentLogin_TestData.class)
	public void login04Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.errorAssert(true)
		.inputClear();



	}

	@Test(dataProvider = "Tc05Data",dataProviderClass = AgentLogin_TestData.class)
	public void login05Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.errorAssert(true)
		.inputClear();



	}

	@Test(dataProvider = "Tc06Data",dataProviderClass = AgentLogin_TestData.class)
	public void login06Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.isDisplayed(true);

	}
	
	@Test(dataProvider = "Tc06Data",dataProviderClass = AgentLogin_TestData.class)
	public void login07Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.isDisplayed(true)
		.submitBtn()
		.campaign_ErrorAssert(true);

	}
	
	@Test(dataProvider = "Tc06Data",dataProviderClass = AgentLogin_TestData.class)
	public void login08Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.isDisplayed(true)
		.campaign_Selection(logindata[2])
		.submitBtn()
		.campaign_Assert(true);


	}
	
	@Test(dataProvider = "Tc06Data",dataProviderClass = AgentLogin_TestData.class)
	public void login09Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.isDisplayed(true)
		.campaign_Selection(logindata[2])
		.submitBtn()
		.campaign_Assert(true)
		.saveBtn()
		.queue_ErrorAssert(true);


	}

	@Test(dataProvider = "Tc06Data",dataProviderClass = AgentLogin_TestData.class)
	public void login10Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.isDisplayed(true)
		.campaign_Selection(logindata[2])
		.submitBtn()
		.campaign_Assert(true)
		.saveBtn()
		.queue_ErrorAssert(true)
		.logoutBtn()
		.queue_Logout(true);


	}
	
	@Test(dataProvider = "Tc06Data",dataProviderClass = AgentLogin_TestData.class)
	public void login11Test(String logindata[]) {

		new AgentLogin_Page(driver)
		.userEmail(logindata[0])
		.userPassword(logindata[1])
		.isEnabled(true)
		.submitBtn()
		.isDisplayed(true)
		.campaign_Selection(logindata[2])
		.submitBtn()
		.campaign_Assert(true)
		.queue_Selection(logindata[3])
		.saveBtn()
		.queue_Assert(true);

	}
}
