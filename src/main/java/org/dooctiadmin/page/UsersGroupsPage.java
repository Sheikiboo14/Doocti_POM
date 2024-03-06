package org.dooctiadmin.page;

import java.time.Duration;
import java.util.List;

import org.dooctiadmin.seleniumbase.DooctiAdminBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UsersGroupsPage extends DooctiAdminBase{


	WebDriverWait wait = null;

	RemoteWebDriver driver = null;

	public UsersGroupsPage (RemoteWebDriver driver) {

		this.driver = driver;
	}

	public UsersGroupsPage clickUsersGroupsPage() {

		driver.findElement(By.xpath("//div[text()='Users & Groups']")).click();

		return this;
	}

	public UsersGroupsPage clickUserGroup() {

		driver.findElement(By.xpath("//span[text()='User Group']")).click();

		return this;
	}

	public UsersGroupsPage clickUser() {

		driver.findElement(By.xpath("//span[text()='Users']")).click();

		return this;
	}
	
	public UsersGroupsPage clickTeam() {

		driver.findElement(By.xpath("//span[text()='Team']")).click();

		return this;
	}

	public UsersGroupsPage clickChannel() {

		driver.findElement(By.xpath("//span[text()='Channel']")).click();

		return this;
	}
	
	public UsersGroupsPage clickSource() {

		driver.findElement(By.xpath("//span[text()='Source']")).click();

		return this;
	}
	
	
	
	public UsersGroupsPage clickAdd() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();

		return this;
	}



	public UsersGroupsPage usergroupDetail(String ugname) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//i[text()='add_circle']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='New Group']")));

		driver.findElement(By.xpath("//input[@aria-label='New Group']")).sendKeys(ugname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Save']")));

		driver.findElement(By.xpath("//div[text()='Save']")).click();

		driver.findElement(By.xpath("//label[text()='User Group']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+ugname+"']")));

		driver.findElement(By.xpath("//div[text()='"+ugname+"']")).click();

		driver.findElement(By.xpath("(//input[@role='checkbox']/following-sibling::div)[1]")).click();

		driver.findElement(By.xpath("//i[text()='save']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Yes, Save !']")));
		
		driver.findElement(By.xpath("//div[text()='Yes, Save !']")).click();
		
		String actualvalue = driver.findElement(By.xpath("//input[@aria-label='Group']")).getAttribute("value");
		
		Assert.assertEquals(actualvalue, ugname, "Usergroup Name is Not Created...!");

		


		return this;

	}

	public UsersGroupsPage userDetails(String userid, String uname, String umob, String uemail, String upass, String urole, String ugroup) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//input[@aria-label='User Id'])[2]")).sendKeys(userid);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Name'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(uname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Mobile Number'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Mobile Number'])[2]")).sendKeys(umob);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Email Id'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Email Id'])[2]")).sendKeys(uemail);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Password']")));

		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(upass);

		WebElement editPopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(editPopup);
		new Actions(driver)
		.scrollFromOrigin(scrollOrigin, 0, 200)
		.perform();


		driver.findElement(By.xpath("(//label[text()='Role']/following-sibling::div)[3]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+urole+"'])[2]")));
		
		driver.findElement(By.xpath("(//div[text()='"+urole+"'])[2]")).click();

		driver.findElement(By.xpath("//label[text()='Group']/following-sibling::div")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+ugroup+"'])[2]")));
		
		driver.findElement(By.xpath("(//div[text()='"+ugroup+"'])[2]")).click();
		
		editPopup.click();
		
		driver.findElement(By.xpath("(//div[text()='Create'])[2]")).click();
			
		return this;
	
	}

	public UsersGroupsPage channelDetails(String cname, String cdes) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[text()='Channel']/following-sibling::button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Name'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(cname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(cdes);
		
		
		return this;
		
	}
	
	public UsersGroupsPage sourceDetails(String sname, String sdes) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[text()='Source']/following-sibling::button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Name'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(sname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(sdes);
		
		
		return this;
		
	}
	
	public UsersGroupsPage teamDetail(String tname, String tdes, String ttype, String tsource, String tchannel,String tcampaign,String tassign) {
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement Popup = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(tname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(tdes);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")));
		
		driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")).click();
		
		driver.findElement(By.xpath("(//div[text()='"+ttype+"'])[2]")).click();
		
		switch (ttype) {
		
		case "All" :
			
			driver.findElement(By.xpath("//label[text()='Lead Source']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tsource+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+tsource+"']")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("//label[text()='Channel']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tchannel+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+tchannel+"']")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("(//label[text()='Campagin']/following-sibling::div)[3]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tcampaign+"'])[2]")));
			
			driver.findElement(By.xpath("(//div[text()='"+tcampaign+"'])[2]")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("(//input[@aria-label='User Assign'])[2]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tassign+"'])[2]")));
			
			driver.findElement(By.xpath("(//div[text()='"+tassign+"'])[2]")).click();
			
			Popup.click();
			
			break ;

		case "Lead Source" :
			
			driver.findElement(By.xpath("//label[text()='Lead Source']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tsource+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+tsource+"']")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("(//label[text()='Campagin']/following-sibling::div)[3]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tcampaign+"'])[2]")));
			
			driver.findElement(By.xpath("(//div[text()='"+tcampaign+"'])[2]")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("(//input[@aria-label='User Assign'])[2]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tassign+"'])[2]")));
			
			driver.findElement(By.xpath("(//div[text()='"+tassign+"'])[2]")).click();
			
			Popup.click();
			
			break;
			
		case "Channel":
			
			driver.findElement(By.xpath("//label[text()='Channel']/following-sibling::div")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tchannel+"']")));
			
			driver.findElement(By.xpath("//div[text()='"+tchannel+"']")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("(//label[text()='Campagin']/following-sibling::div)[3]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tcampaign+"'])[2]")));
			
			driver.findElement(By.xpath("(//div[text()='"+tcampaign+"'])[2]")).click();
			
			Popup.click();
			
			driver.findElement(By.xpath("(//input[@aria-label='User Assign'])[2]")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tassign+"'])[2]")));
			
			driver.findElement(By.xpath("(//div[text()='"+tassign+"'])[2]")).click();
			
			Popup.click();

			break;
			
		}

		driver.findElement(By.xpath("//div[text()='Create']")).click();
			
		return this;
		
		
	}

	
	
	/**
	 * This function will perform assertion for creation flow
	 * @param expectedvalue = This will get the Expected Value
	 * @param assertcol = This will give the column number were the assert to take place
	 * @return
	 */
	
	public UsersGroupsPage createAssertion(String expectedvalue, String assertcol) {
		
		 List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td["+assertcol+"]"));
	
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(expectedvalue)) {
				
				flag = true;
			}
		}
	
		Assert.assertTrue(flag, "Not Created...!");
		
		return this;
	}
	
	/**
	 * This function will perform assertion for deletion flow
	 * @param expectedvalue = This will get the Expected Value
	 * @param assertcol = This will give the column number were the assert to take place
	 * @return
	 */
	
	
	public UsersGroupsPage deleteAssertion(String expectedvalue, String assertcol) {
		
		 List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//td["+assertcol+"]"));
	
		boolean flag = false;
		
		for(WebElement Data : Alldatas) {
			
			String value = Data.getText();
			
			if(value.contains(expectedvalue)) {
				
				flag = true;
				
				break;
			}
		}
	
		Assert.assertFalse(flag, "Not Deleted...!");
		
		return this;
	}
	
	











	/**
	 * This function will refresh the page 
	 * @return
	 */
	public UsersGroupsPage refresh() {
		
		driver.findElement(By.xpath("//i[@class='fas fa-refresh']")).click();
		
		return this;
	}


	/**
	 * This will click the Create Button in the page
	 * @return
	 */

	public UsersGroupsPage clickCreatebtn() {

		
		driver.findElement(By.xpath("//div[text()='Create']")).click();

		return this;
	}

	/**
	 * This will click the Close button in the Toast or Snakbar
	 * @return
	 */


	public UsersGroupsPage clickSnakbarClosebtn() 

	{

		driver.findElement(By.xpath("//div[@class='v-snack__content']//button[1]")).click();

		return this;
	}



}
