package org.dooctiadmin.test;

import java.awt.AWTException;

import org.doocti.seleniumbase.DooctiAdminBase;
import org.dooctiadmin.page.CRMPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Test extends DooctiAdminBase {
	
	
	@BeforeTest
	public void Setup() {
		
		new CRMPage(driver)
		.click_CRM();
	}
	
	@AfterTest
	public void Quit() {
		
		new CRMPage(driver)
		.click_CRM();

	}
	
	@Test(dataProvider="CampaignData")
	public void PreviewCampaign_Create(String campaigndata[]) {
		
		
		new CRMPage(driver)
		.click_Campaign()
		.campaignCommonData(campaigndata[0], campaigndata[1], campaigndata[2], campaigndata[3])
		.queue(campaigndata[4])
		.pauseCode()
		.dial_dispo()
		.script(campaigndata[8])
		.checkbox()
		.click_Createbtn()
		.clickSnakbarClosebtn()
		.create_CampaignAssertion(campaigndata[0]);
		
		
	}
	
	@Test(dataProvider="CampaignData")
	public void PredictiveCampaign_Create(String campaigndata[]) {
		
		
		new CRMPage(driver)
		.click_Campaign()
		.campaignCommonData(campaigndata[11], campaigndata[12], campaigndata[2], campaigndata[3])
		.queue(campaigndata[4])
		.pauseCode()
		.dial_dispo()
		.bufferLevel(campaigndata[5])
		.dialRatio(campaigndata[6])
		.dialPrefix(campaigndata[7])
		.script(campaigndata[8])
		.checkbox()
		.click_Createbtn()
		.clickSnakbarClosebtn()
		.create_CampaignAssertion(campaigndata[11]);
		
	}
	
	@Test(dataProvider="CampaignData")
	public void InboundCampaign_Create(String campaigndata[]) {
		
		
		new CRMPage(driver)
		.click_Campaign()
		.campaignCommonData(campaigndata[13], campaigndata[14], campaigndata[2], campaigndata[3])
		.queue(campaigndata[4])
		.pauseCode()
		.dial_dispo()
		.script(campaigndata[8])
		.checkbox()
		.click_Createbtn()
		.clickSnakbarClosebtn()
		.create_CampaignAssertion(campaigndata[13]);
		
		
	}
	
	@Test(dataProvider="CampaignData")
	public void PowerCampaign_Create(String campaigndata[]) {
		
		
		new CRMPage(driver)
		.click_Campaign()
		.campaignCommonData(campaigndata[15], campaigndata[16], campaigndata[2], campaigndata[3])
		.queue(campaigndata[4])
		.pauseCode()
		.dial_dispo()
		.bufferLevel(campaigndata[5])
		.dialRatio(campaigndata[6])
		.dialPrefix(campaigndata[7])
		.script(campaigndata[8])
		.checkbox()
		.click_Createbtn()
		.clickSnakbarClosebtn()
		.create_CampaignAssertion(campaigndata[15]);
		
	}
	
	@Test(dataProvider="CampaignData")
	public void VoiceBlastCampaign_Create(String campaigndata[]) {
		
		
		new CRMPage(driver)
		.click_Campaign()
		.campaignCommonData(campaigndata[17], campaigndata[18], campaigndata[2], campaigndata[3])
		.queue(campaigndata[4])
		.pauseCode()
		.dial_dispo()
		.bufferLevel(campaigndata[5])
		.scroll(350)
		.channel(campaigndata[9])
		.dateTime()
		.dialPrefix(campaigndata[7])
		.script(campaigndata[8])
		.checkbox()
		.click_Createbtn()
		.clickSnakbarClosebtn()
		.create_CampaignAssertion(campaigndata[17]);
		
	}
	
	@Test(dataProvider="CampaignData")
	public void WhatsBlastCampaign_Create(String campaigndata[]) {
		
		
		new CRMPage(driver)
		.click_Campaign()
		.campaignCommonData(campaigndata[19], campaigndata[20], campaigndata[2], campaigndata[3])
		.dateTime()
		.dialPrefix(campaigndata[7])
		.whatsappData(campaigndata[10])
		.click_Createbtn()
		.clickSnakbarClosebtn()
		.create_CampaignAssertion(campaigndata[19]);
		
	}
	
	@Test(dataProvider="ListData",dataProviderClass=DooctiAdminBase.class)
	public void List_Creation(String listdata[]) {
		
		new CRMPage(driver)
		.click_List()
		.listData(listdata[0], listdata[1], listdata[2], listdata[3], listdata[4])
		.clickSnakbarClosebtn();
	}
	
	
	@Test(dataProvider="LeadData",dataProviderClass=DooctiAdminBase.class)
	public void Lead_Upload(String leaddata[]) throws AWTException {
		
		new CRMPage(driver)
		.click_Lead()
		.leadUpload(leaddata[0], leaddata[1], false);
	}
	
	@Test(dataProvider="LeadData",dataProviderClass=DooctiAdminBase.class)
	public void Lead_Creation(String leaddata[])  {
		
		new CRMPage(driver)
		.click_Lead()
		.leadData(leaddata[2], leaddata[3], leaddata[4])
		.click_SaveBtn()
		.click_Createbtn();
		
	}
	
	
	@Test(dataProvider="ContactData",dataProviderClass=DooctiAdminBase.class)
	public void Contact_Creation(String contactdata[] ) {
		
		new CRMPage(driver)
		.click_Contact()
		.click_PlusIcon()
		.contactData(contactdata[0],contactdata[1])
		.click_SaveBtn()
		.click_Createbtn();
	
	}
	
	
	@Test(dataProvider="ContactData",dataProviderClass=DooctiAdminBase.class)
	public void Contact_Upload(String contactdata[]) throws AWTException {
		
		new CRMPage(driver)
		.click_Contact()
		.click_UploadBtn()
		.contactUpload(contactdata[2]);
		
	
	}
	@Test(dataProvider="TicketData",dataProviderClass=DooctiAdminBase.class)
	public void Ticket_Creation(String ticketdata[] ) {
		
		new CRMPage(driver)
		.click_Ticket()
		.click_PlusIcon()
		.ticketData(ticketdata[0], ticketdata[1], ticketdata[2], ticketdata[3], ticketdata[4], ticketdata[5], ticketdata[6], ticketdata[7])
		.click_SaveBtn();
	
	}
	
	@Test(dataProvider="MeetingData",dataProviderClass=DooctiAdminBase.class)
	public void Meeting_Creation(String meetingdata[]) {
		
		new CRMPage(driver)
		.click_Meeting()
		.click_AddBtn()
		.meetingData(meetingdata[0],meetingdata[1],meetingdata[2],meetingdata[3],meetingdata[4],meetingdata[5],meetingdata[6],meetingdata[7])
		.click_Createbtn()
		.clickSnakbarClosebtn();
		
		
	}
	
	
	//Updation Flow
	
	@Test(dataProvider="CampaignData",dataProviderClass= DooctiAdminBase.class)
	public void Campaign_Update(String campaigndata[]) {
		
		new CRMPage(driver)
		.click_Campaign()
		.campaign_Edit(campaigndata[0], campaigndata[21])
		.click_Updatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.edit_CampaignAssertion(campaigndata[0], campaigndata[22]);
		

	}
	
	
	// Deletion Flow
	
	@Test(dataProvider="CampaignData")
	public void Campaign_Delete(String campaigndata[]) {
		
		new CRMPage(driver)
		.click_Campaign()
		.campaign_Delete(campaigndata[0], campaigndata[21])
		.clickSnakbarClosebtn()
		.delete_CampaignAssertion(campaigndata[15]);
	}
	
	@Test
	public void Lead_Delete() {
		
		new CRMPage(driver)
		.click_Lead()
		.leadDelete()
		.clickSnakbarClosebtn();
	}
	
	@Test
	public void Lead_BulkDelete() {
		
		new CRMPage(driver)
		.click_Lead()
		.leadBulkDelete()
		.clickSnakbarClosebtn();
	}
	

}
