package org.dooctiadmin.test;

import org.dooctiadmin.page.CRMPage;
import org.dooctiadmin.seleniumbase.DooctiAdminBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Test extends DooctiAdminBase {
	
	
	@BeforeTest
	public void Setup() {
		
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
	
	
	//Updation Flow
	
	@Test(dataProvider="CampaignData")
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
		.campaign_Delete(campaigndata[15], campaigndata[21])
		.clickSnakbarClosebtn()
		.delete_CampaignAssertion(campaigndata[15]);
	}

}
