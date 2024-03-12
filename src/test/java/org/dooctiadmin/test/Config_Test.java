package org.dooctiadmin.test;

import org.doocti.seleniumbase.DooctiAdminBase;
import org.dooctiadmin.page.ConfiguartionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Config_Test  extends DooctiAdminBase{
	
	
	
	@BeforeTest
	public void Setup() {
		
		new ConfiguartionPage(driver)
		.click_Config();
	}

// Creation FLow
	
	@Test(dataProvider="QueueData", dataProviderClass = DooctiAdminBase.class)
	public void Queue_Creation(String qdata[]) {
		
		// Add Popup
		
		new ConfiguartionPage(driver)
		.click_Queue()
		.click_Add()
		.queueName(qdata[0])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(qdata[0],qdata[2]);
		
	}
	
	@Test(dataProvider = "DispoData", dataProviderClass = DooctiAdminBase.class)
	public void Dispo_Creation(String ddata[]) {
		
		new ConfiguartionPage(driver)
		.click_Disposition()
		.click_Add()
		.dispoDetails(ddata[0],ddata[1])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(ddata[0],ddata[3]);
	}
	
	@Test(dataProvider = "SubDispoData", dataProviderClass = DooctiAdminBase.class)
	public void SubDispo_Creation(String sddata[]) {
		
		new ConfiguartionPage(driver)
		.click_SubDisposition()
		.click_Add()
		.subdispoDetails(sddata[0],sddata[1],sddata[2])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(sddata[1], sddata[2]);
		
	}
	
	@Test(dataProvider = "TicketStatusData", dataProviderClass = DooctiAdminBase.class)
	public void TicketStatus_Creation(String tsdata[]) {
		
		new ConfiguartionPage(driver)
		.click_TicketStatus()
		.click_Add()
		.ticketStatusDetails(tsdata[0],tsdata[1])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(tsdata[0], tsdata[3]);
		
	}
	
	@Test(dataProvider = "PausecodeData", dataProviderClass = DooctiAdminBase.class)
	public void Pausecode_Creation(String pcdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Pausecode()
		.click_Add()
		.pausecodeDetails(pcdata[0], pcdata[1], pcdata[2], pcdata[3])
		.ClickClockOkbtn()
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(pcdata[0], pcdata[5]);
		
	}
	
	
	/**
	 * @todo : Check the flow
	 * @param audiodata
	 */
	@Test(dataProvider = "AudioData", dataProviderClass = DooctiAdminBase.class)
	public void Audio_Creation(String audiodata[]) {
		
		new ConfiguartionPage(driver)
		.click_AudioStore()
		.click_Uplode()
		.audioDetails(audiodata[0],audiodata[1])
		.clickUplodeClosebtn();
		
	}
	
	@Test(dataProvider = "BlocklistData", dataProviderClass = DooctiAdminBase.class)
	public void BlockList_Creation(String blocklistdata[]) {
		
		new ConfiguartionPage(driver)
		.click_BlockList()
		.click_Uplode()
		.blocklistDetail(blocklistdata[0])
		.clickUplodeClosebtn();
		
	}
	
	@Test(dataProvider = "DidData", dataProviderClass = DooctiAdminBase.class)
	public void ManualDid_Creation(String diddata[]) {
		
		new ConfiguartionPage(driver)
		.click_DIDNumber()
		.click_Plusicon()
		.didNumberDetails(diddata[0], diddata[1])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(diddata[0], diddata[3]);
		
	}
	
	@Test(dataProvider = "TagData", dataProviderClass = DooctiAdminBase.class)
	public void Tag_Creation(String tagdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Tag()
		.tagDetails(tagdata[0], tagdata[1])
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(tagdata[0], tagdata[3]);
		
	}
	
	@Test(dataProvider = "AnnouncementData", dataProviderClass = DooctiAdminBase.class)
	public void Announcement_Creation(String announcementdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Announcement()
		.click_Add()
		.announcementDetails(announcementdata[0], announcementdata[1], announcementdata[2])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(announcementdata[0], announcementdata[4]);
		
	}
	
	
	@Test(dataProvider = "ScriptData", dataProviderClass = DooctiAdminBase.class)
	public void Script_Creation(String scriptdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Script()
		.click_Add1()
		.scriptDetails(scriptdata[0], scriptdata[1], scriptdata[2], scriptdata[3], scriptdata[4])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(scriptdata[0], scriptdata[6]);
		
	}
	
	@Test(dataProvider = "InboundData", dataProviderClass = DooctiAdminBase.class)
	public void InboundRoute_Creation(String inbounddata[]) {
		
		new ConfiguartionPage(driver)
		.click_InboundRoute()
		.click_Add()
		.inboundrouteDetails(inbounddata[0], inbounddata[1], inbounddata[2], inbounddata[3])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(inbounddata[0], inbounddata[5]);
		
	}
	
	@Test(dataProvider = "TimezoneData", dataProviderClass = DooctiAdminBase.class)
	public void Timezone_Creation(String timezonedata[]) {
		
		new ConfiguartionPage(driver)
		.click_Timezone()
		.click_Add()
		.timezoneDetail(timezonedata[0], timezonedata[1], timezonedata[2], timezonedata[3], timezonedata[4], timezonedata[5], timezonedata[6])
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(timezonedata[0], timezonedata[8]);
		
	}
	
	@Test(dataProvider = "MeetingTitleData", dataProviderClass =DooctiAdminBase.class)
	public void MeetingTitle_Creation(String meetingtitleedata[]) {
		
		new ConfiguartionPage(driver)
		.click_MeetingTitle()
		.click_Add()
		.meetingTitleDetails(meetingtitleedata[0], meetingtitleedata[1], meetingtitleedata[2])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.createAssertion(meetingtitleedata[0], meetingtitleedata[4]);
		
		
	}
	
// Updation Flow
	
	@Test(dataProvider = "QueueData",dataProviderClass= DooctiAdminBase.class)
	public void Queue_Update(String qdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Queue()
		.configEdit(qdata[0], qdata[1])
		.updateQueue(qdata[2])
		.clickUpdatebtn();
	}
	
	@Test(dataProvider = "DispoData",dataProviderClass= DooctiAdminBase.class)
	public void Dispo_Update(String ddata[]) {
		
		new ConfiguartionPage(driver)
		.click_Disposition()
		.configEdit(ddata[0], ddata[2])
		.statusDropdown(ddata[4])
		.clickUpdatebtn()
		.clickSnakbarClosebtn();
	}
	
	@Test(dataProvider = "SubDispoData",dataProviderClass= DooctiAdminBase.class)
	public void SubDispo_Update(String sddata[]) {
		
		new ConfiguartionPage(driver)
		.click_SubDisposition()
		.configEdit(sddata[1], sddata[3])
		.updateSubDispo(sddata[5])
		.clickUpdatebtn()
		.clickSnakbarClosebtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// Deletion Flow

	@Test(dataProvider ="QueueData", dataProviderClass=DooctiAdminBase.class)
	public void Queue_Delete(String qdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Queue()
		.configDelete(qdata[0],qdata[1])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(qdata[0],qdata[2]);

		
	}
	
	@Test(dataProvider="DispoData", dataProviderClass = DooctiAdminBase.class)
	public void Dispo_Delete(String ddata[]) {
		
		new ConfiguartionPage(driver)
		.click_Disposition()
		.configDelete(ddata[0], ddata[2])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(ddata[0],ddata[3]);
	}
	
	@Test(dataProvider="SubDispoData", dataProviderClass = DooctiAdminBase.class)
	public void SubDispo_Delete(String sddata[]) {
		
		new ConfiguartionPage(driver)
		.click_SubDisposition()
		.configDelete(sddata[1], sddata[3])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(sddata[1], sddata[2]);
		
	}
	
	@Test(dataProvider="TicketStatusData", dataProviderClass = DooctiAdminBase.class)
	public void TicketStatus_Delete(String tsdata[]) {
		
		new ConfiguartionPage(driver)
		.click_TicketStatus()
		.configDelete(tsdata[0], tsdata[2])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(tsdata[0], tsdata[3]);

		
	}
	
	@Test(dataProvider="PausecodeData", dataProviderClass = DooctiAdminBase.class)
	public void Pausecode_Delete(String pcdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Pausecode()
		.configDelete(pcdata[0], pcdata[4])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(pcdata[0], pcdata[5]);
		
		
	}
	
	
	@Test(dataProvider="DidData", dataProviderClass = DooctiAdminBase.class)
	public void DIDNumber_Delete(String diddata[]) {
		
		new ConfiguartionPage(driver)
		.click_DIDNumber()
		.configDelete(diddata[0], diddata[2])
		.Deletebtn1()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(diddata[0], diddata[3]);
		
		
	}
	
	@Test(dataProvider="TagData", dataProviderClass = DooctiAdminBase.class)
	public void Tag_Delete(String tagdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Tag()
		.configDelete(tagdata[0], tagdata[2])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(tagdata[0], tagdata[3]);
		
		
	}
	
	@Test(dataProvider="AnnouncementData", dataProviderClass = DooctiAdminBase.class)
	public void Announcement_Delete(String announcementdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Announcement()
		.configDelete(announcementdata[0], announcementdata[3])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(announcementdata[0], announcementdata[4]);
		
	}
	
	@Test(dataProvider="ScriptData", dataProviderClass = DooctiAdminBase.class)
	public void Script_Delete(String scriptdata[]) {
		
		new ConfiguartionPage(driver)
		.click_Script()
		.configDelete(scriptdata[0], scriptdata[5])
		.Deletebtn1()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(scriptdata[0], scriptdata[6]);
		
	}
	
	@Test(dataProvider="InboundData", dataProviderClass = DooctiAdminBase.class)
	public void Inbound_Delete(String inbounddata[]) {
		
		new ConfiguartionPage(driver)
		.click_InboundRoute()
		.configDelete(inbounddata[0], inbounddata[4])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(inbounddata[0], inbounddata[5]);
		
	}
	
	@Test(dataProvider="TimezoneData", dataProviderClass = DooctiAdminBase.class)
	public void Timezone_Delete(String timezonedata[]) {
		
		new ConfiguartionPage(driver)
		.click_Timezone()
		.configDelete(timezonedata[0], timezonedata[7])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(timezonedata[0], timezonedata[8]);
		
	}
	
	@Test(dataProvider="MeetingTitleData", dataProviderClass = DooctiAdminBase.class)
	public void MeetingTitle_Delete(String meetingtitledata[]) {
		
		new ConfiguartionPage(driver)
		.click_MeetingTitle()
		.configDelete(meetingtitledata[0], meetingtitledata[3])
		.Deletebtn()
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(meetingtitledata[0], meetingtitledata[4]);
		
	}
}
