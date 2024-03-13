package org.dooctiAgent.test;

import org.doocti.seleniumbase.DooctiAgentBase;
import org.dooctiAgent.page.Dashboard_Page;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Dashboard extends DooctiAgentBase  {
	
	
	@Test
	public void Navbar_Test() {
		
		new Dashboard_Page(driver)
		.click_Lead(true)
		.click_DashBoard()
		.navbar_Assert(true)
		.click_Contact(true)
		.click_DashBoard()
		.navbar_Assert(true)
		.click_Meeting(true)
		.click_DashBoard()
		.navbar_Assert(true)
		.click_Ticket(true)
		.click_DashBoard()
		.navbar_Assert(true)
		.click_Script(true)
		.click_DashBoard()
		.navbar_Assert(true)
		.click_Noti(true)
		.click_Close()
		.noti_Assert(false)
		.click_Profile(true)
		.click_Close()
		.profile_Assert(false);
		
	}
	

	
	@Test(dataProvider="LeadData",dataProviderClass=DooctiAgentBase.class)
	public void lead_Create(String leaddata[]) {
		
		new Dashboard_Page(driver)
		.click_Contact(true)
		.click_PlusIcon()
		.isDisplayed(true,leaddata[10])
		.leadDetails(leaddata[0], leaddata[1], leaddata[2], leaddata[3], leaddata[4], leaddata[5], leaddata[6], leaddata[7], leaddata[8], leaddata[9])
		.click_Savebtn()
		.click_DashBoard()
		.click_Lead(true)
		.create_Assert(leaddata[0]);
		
	}
	
	
	@Test(dataProvider="ContactData",dataProviderClass=DooctiAgentBase.class)
	public void contact_Create(String contactdata[]) {
		
		new Dashboard_Page(driver)
		.click_Contact(true)
		.click_PlusIcon()
		.isDisplayed(true,contactdata[2])
		.contactDetails(contactdata[0], contactdata[1] )
		.click_Savebtn()
		.click_DashBoard()
		.click_Contact(true)
		.click_RefreshIcon()
		.create_Assert(contactdata[1]);
		
	}
	
	@Test(dataProvider="MeetingData",dataProviderClass=DooctiAgentBase.class)
	public void meeting_Create(String meetingdata[]) {
		
		new Dashboard_Page(driver)
		.click_Meeting(true)
		.click_PlusIcon()
		.isDisplayed(true,meetingdata[7])
		.meetingDetails(meetingdata[0], meetingdata[1], meetingdata[2], meetingdata[3], meetingdata[4], meetingdata[5], meetingdata[6])
		.click_Createbtn()
		.click_DashBoard()
		.click_Meeting(true)
		.click_RefreshIcon();
		
	}
	@AfterTest
	public void Quit() {
		
//		new Dashboard_Page(driver)
//		.click_Profile(true)
//		.click_Logout(true);
//		driver.quit();
	}

}
