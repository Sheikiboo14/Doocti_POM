package org.dooctiadmin.test;

import org.dooctiadmin.page.UsersGroupsPage;
import org.dooctiadmin.seleniumbase.DooctiAdminBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsersGroups_Test extends DooctiAdminBase  {
	

	@BeforeTest
	public void setup() {
		
		new UsersGroupsPage(driver)
		.clickUsersGroupsPage();
		
	}
	
	@AfterTest
	public void QuitBrouwser() {
		
		driver.quit();
	}
	
	@Test(dataProvider="UserGroupData",dataProviderClass=DooctiAdminBase.class)
	public void UserGroup_Creation(String usergroupdata[]) {
		
		new UsersGroupsPage(driver)
		.clickUserGroup()
		.usergroupDetail(usergroupdata[0])
		.clickSnakbarClosebtn();
		
		
	}
	
	@Test(dataProvider="UserData",dataProviderClass=DooctiAdminBase.class)
	public void User_Creation(String userdata[]) {
		
		new UsersGroupsPage(driver)
		.clickUser()
		.clickAdd()
		.userDetails(userdata[0], userdata[1], userdata[2], userdata[3], userdata[4], userdata[5], userdata[6])
		.clickSnakbarClosebtn()
		.createAssertion(userdata[3], userdata[7]);
		
		
	}
	
	@Test(dataProvider="ChannelData",dataProviderClass=DooctiAdminBase.class)
	public void Channel_Creation(String channeldata[]) {
		
		new UsersGroupsPage(driver) 
		.clickChannel()
		.channelDetails(channeldata[0], channeldata[1])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.createAssertion(channeldata[0], channeldata[2]);
		
	}
	
	@Test(dataProvider="SourceData",dataProviderClass=DooctiAdminBase.class)
	public void Source_Creation(String sourcedata[]) {
		
		new UsersGroupsPage(driver)
		.clickSource()
		.sourceDetails(sourcedata[0], sourcedata[1])
		.clickCreatebtn()
		.clickSnakbarClosebtn()
		.createAssertion(sourcedata[0], sourcedata[2]);

		
	}
	
	@Test(dataProvider="TeamData",dataProviderClass=DooctiAdminBase.class)
	public void Team_Creation(String teamdata[]) {
		
		new UsersGroupsPage(driver)
		.clickTeam()
		.clickAdd()
		.teamDetail(teamdata[0], teamdata[1], teamdata[2], teamdata[3], teamdata[4], teamdata[5], teamdata[6])
		.clickSnakbarClosebtn()
		.createAssertion(teamdata[0], teamdata[7]);
		
	}
	
	
	@Test(dataProvider="UserGroupData",dataProviderClass=DooctiAdminBase.class)
	public void UserGroup_Updation(String usergroupdata[]) {
		
		new UsersGroupsPage(driver)
		.clickUserGroup()
		.usergroupUpdate(usergroupdata[0])
		.clickSnakbarClosebtn();
		
	
	}
	

	
	@Test(dataProvider="UserData",dataProviderClass=DooctiAdminBase.class)
	public void User_Update(String userdata[]) {
		
		new UsersGroupsPage(driver)
		.clickUser()
		.userUpdate(userdata[3], userdata[7],userdata[8],userdata[9],userdata[10],userdata[11],userdata[12])
		.clickUpdate()
		.clickSnakbarClosebtn()
		.user_UpdateAssertion(userdata[3], userdata[9], userdata[12]);
		
	}
	
	@Test(dataProvider="TeamData",dataProviderClass=DooctiAdminBase.class)
	public void Team_Update(String teamdata[]) {
		
		new UsersGroupsPage(driver)
		.clickTeam()
		.teamUpdate(teamdata[0], teamdata[8])
		.statusUpdate(teamdata[9])
		.clickUpdate()
		.clickSnakbarClosebtn()
		.refresh()
		.updateAssertion(teamdata[0],teamdata[10], teamdata[9]);
	}
	
	@Test(dataProvider="ChannelData",dataProviderClass=DooctiAdminBase.class)
	public void Channel_Update(String channeldata[]) {
		
		new UsersGroupsPage(driver)
		.clickChannel()
		.usersgroupsEdit(channeldata[0], channeldata[3])
		.statusUpdate(channeldata[4])
		.clickUpdate()
		.clickSnakbarClosebtn()
		.refresh()
		.updateAssertion(channeldata[0], channeldata[5], channeldata[4]);
	}
	
	@Test(dataProvider="SourceData",dataProviderClass=DooctiAdminBase.class)
	public void Source_Update(String sourcedata[]) {
		
		new UsersGroupsPage(driver)
		.clickSource()
		.usersgroupsEdit(sourcedata[0], sourcedata[3])
		.statusUpdate(sourcedata[4])
		.clickUpdate()
		.clickSnakbarClosebtn()
		.refresh()
		.updateAssertion(sourcedata[0], sourcedata[5], sourcedata[4]);
	}
	
	
	@Test(dataProvider="UserGroupData",dataProviderClass=DooctiAdminBase.class)
	public void UserGroup_Delete(String usergroupdata[]) {
		
		new UsersGroupsPage(driver)
		.clickUserGroup()
		.usergroupDelete(usergroupdata[0])
		.clickSnakbarClosebtn();
		
	}
	
	@Test(dataProvider = "UserData",dataProviderClass = DooctiAdminBase.class)
	public void User_Delete(String userdata[]) {
		
		new UsersGroupsPage(driver)
		.clickUser()
		.refresh()
		.usersgroupsDelete(userdata[3], userdata[7])
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(userdata[3], userdata[7]);
	}
	
	@Test(dataProvider="TeamData",dataProviderClass=DooctiAdminBase.class)
	public void Team_Delete(String teamdata[]) {
		
		new UsersGroupsPage(driver)
		.clickTeam()
		.usersgroupsDelete(teamdata[0], teamdata[8])
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(teamdata[0],teamdata[7]);
	}
	
	@Test(dataProvider="ChannelData",dataProviderClass=DooctiAdminBase.class)
	public void Channel_Delete(String channeldata[]) {
		
		new UsersGroupsPage(driver)
		.clickChannel()
		.usersgroupsDelete(channeldata[0], channeldata[3])
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(channeldata[0],channeldata[2]);
	}
	
	@Test(dataProvider="SourceData",dataProviderClass=DooctiAdminBase.class)
	public void Source_Delete(String sourcedata[]) {
		
		new UsersGroupsPage(driver)
		.clickSource()
		.usersgroupsDelete(sourcedata[0], sourcedata[3])
		.clickSnakbarClosebtn()
		.refresh()
		.deleteAssertion(sourcedata[0],sourcedata[2]);
	}
	

}
