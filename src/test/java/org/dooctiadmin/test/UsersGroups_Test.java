package org.dooctiadmin.test;

import org.dooctiadmin.page.UsersGroupsPage;
import org.dooctiadmin.seleniumbase.DooctiAdminBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsersGroups_Test extends DooctiAdminBase  {
	

	@BeforeTest
	public void setup() {
		
		new UsersGroupsPage(driver)
		.clickUsersGroupsPage();
		
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
	
	
	
	
	
	

}
