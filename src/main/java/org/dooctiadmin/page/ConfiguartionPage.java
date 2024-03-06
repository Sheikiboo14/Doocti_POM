package org.dooctiadmin.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.dooctiadmin.seleniumbase.DooctiAdminBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ConfiguartionPage extends DooctiAdminBase {

	WebDriverWait wait = null;

	Actions action = null;

	Robot robot = null;
	public ConfiguartionPage (RemoteWebDriver driver) {

		this.driver = driver;
	}

	/**
	 * Loacate
	 */


	/**
	 * Actions 
	 * This will display the list of Sub Module of Configuration
	 * @return 
	 */
	public ConfiguartionPage click_Config() {

		driver.findElement(By.xpath("//div[text()='Configurations']")).click();

		return this;
	}

	/**
	 * This will open the Queue page in  Configuration
	 * @return
	 */

	public ConfiguartionPage click_Queue() {

		driver.findElement(By.xpath("//span[text()='Queues']")).click();

		return this;
	}

	/**
	 * This will open the Dispositions page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_Disposition() {

		driver.findElement(By.xpath("//span[text()='Dispositions']")).click();

		return this;
	}

	/**
	 * This will open the Sub-Dispositions page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_SubDisposition() {

		driver.findElement(By.xpath("//span[text()='Sub-Dispositions']")).click();

		return this;
	}
	/**
	 * This will open the Ticket Status page in  Configuration
	 * @return
	 */

	public ConfiguartionPage click_TicketStatus() {

		driver.findElement(By.xpath("//span[text()='Ticket Status']")).click();

		return this;
	}
	/**
	 * This will open the Pause Code page in  Configuration
	 * @return
	 */

	public ConfiguartionPage click_Pausecode() {

		driver.findElement(By.xpath("//span[text()='Pause Codes']")).click();

		return this;
	}

	/**
	 * This will open the Audio Store page in  Configuration
	 * @return
	 */

	public ConfiguartionPage click_AudioStore() {

		driver.findElement(By.xpath("//span[text()='Audio Store']")).click();

		return this;
	}

	/**
	 * This will open the Block List page in  Configuration
	 * @return
	 */

	public ConfiguartionPage click_BlockList() {

		driver.findElement(By.xpath("//span[text()='Block List']")).click();

		return this;
	}

	/**
	 * This will open the DID Number page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_DIDNumber() {

		driver.findElement(By.xpath("//span[text()='DID Number']")).click();

		return this;
	}
	/**
	 * This will open the Tags page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_Tag() {

		driver.findElement(By.xpath("//span[text()='Tags']")).click();

		return this;
	}
	/**
	 * This will open the Announcements page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_Announcement() {

		driver.findElement(By.xpath("//span[text()='Announcements']")).click();

		return this;
	}
	/**
	 * This will open the Scripts page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_Script() {

		driver.findElement(By.xpath("//span[text()='Scripts']")).click();

		return this;
	}
	/**
	 * This will open the Inbound Route page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_InboundRoute() {

		driver.findElement(By.xpath("//span[text()='Inbound Route']")).click();

		return this;
	}
	/**
	 * This will open the Timezone page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_Timezone() {

		driver.findElement(By.xpath("//span[text()='Timezone']")).click();

		return this;
	}
	/**
	 * This will open the Meeting Title page in  Configuration
	 * @return
	 */
	public ConfiguartionPage click_MeetingTitle() {

		driver.findElement(By.xpath("//span[text()='Meeting Title']")).click();

		return this;
	}

// Configuration Creation 

/**
 * 
 * @param qname = This will get the Queue Name 
 * @return
 */

	public ConfiguartionPage queueName(String qname) {

		driver.findElement(By.xpath("(//input[@aria-label='Queues'])[2]")).sendKeys(qname);

		return this;

	}
	
	/**
	 * 
	 * @param dname = This will get the Disposition Name 
	 * @param ddes = This will get the Disposition Description 
	 * @return
	 */

	public ConfiguartionPage dispoDetails(String dname, String ddes) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//input[@aria-label='Disposition'])[2]")).sendKeys(dname);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(ddes);

		return this;

	}

	/**
	 * 
	 * @param dname = This will get the Disposition Name
	 * @param sdname = This will get the Sub Disposition Name
	 * @param sddes = This will get the Sub Disposition Description
	 * @return
	 */

	public ConfiguartionPage subdispoDetails(String dname, String sdname, String sddes) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//i[text()='arrow_drop_down'])[3]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+dname+"'])[2]")));

		driver.findElement(By.xpath("(//div[text()='"+dname+"'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@aria-label='Sub-Disposition']")));

		driver.findElement(By.xpath("//input[@aria-label='Sub-Disposition']")).sendKeys(sdname);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(sddes);

		return this;



	}

/**
 * 
 * @param tname = This will get the TicketStatus Name
 * @param tdes= This will get the TicketStatus Description
 * @return
 */
	public ConfiguartionPage ticketStatusDetails(String tsname, String tsdes) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(tsname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(tsdes);

		return this;

	}
	
	/**
	 * 
	 * @param pcname = This will get the Pause Code Name
	 * @param pcdes = This will get the Pause Code Description
	 * @param pchour= This will get the Pause Code Hour
	 * @param pcmin = This will get the DPause Code Minutes
	 * @return
	 */

	public ConfiguartionPage pausecodeDetails(String pcname, String pcdes, String pchour, String pcmin) {


		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")).sendKeys(pcname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(pcdes);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Time'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Time'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+pchour+"']")));

		driver.findElement(By.xpath("//span[text()='"+pchour+"']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+pcmin+"']")));

		driver.findElement(By.xpath("//span[text()='"+pcmin+"']")).click();

		return this;

	}

	/**
	 * 
	 * @param audiodes = This will get the Audio Description
	 * @param filepath = This will get the Audio File Patnh
	 * @return
	 */
	public ConfiguartionPage audioDetails(String audiodes, String filepath) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[1]")).sendKeys(audiodes);

		driver.findElement(By.xpath("(//div[@class='flex xs12']/following-sibling::div)[1]")).click();

		try {
			robot = new Robot();

			StringSelection Path = new StringSelection(filepath);

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Path, null);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		boolean actualvalue = driver.findElement(By.xpath("//div[text()=' Uploaded Successfully ']")).isDisplayed();

		Assert.assertTrue(actualvalue);

		return this;

	}

	/**
	 * 
	 * @param filepath = This will get the BlockList File Path
	 * @return
	 */
	public ConfiguartionPage blocklistDetail(String filepath) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//div[@class='container grid-list-md']//div)[1]")).click();


		try {
			robot = new Robot();

			StringSelection Path = new StringSelection(filepath);

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Path, null);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		boolean actualvalue = driver.findElement(By.xpath("//div[text()=' Uploaded Successfully ']")).isDisplayed();

		Assert.assertTrue(actualvalue);

		return this;

	}

	/**
	 * 
	 * @param did_Num = This will get the DID Number
	 * @param did_Trunk = This will get the DID Trunk
	 * @return
	 */
	public ConfiguartionPage didNumberDetails(String did_Num,String did_Trunk) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]")).sendKeys(did_Num);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Trunk']")));

		driver.findElement(By.xpath("//input[@aria-label='Trunk']")).sendKeys(did_Trunk);

		return this;

	}

	/**
	 * 
	 * @param tname = This will get the Tag Name
	 * @param tdes = This will get the Tag Description
	 * @return
	 */
	public ConfiguartionPage tagDetails(String tname , String tdes) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("//div[text()='Tag Management']/following-sibling::button")).click();

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(tname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(tdes);

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')]//div)[3]")).click();

		return this;
	}
	
	/**
	 * 
	 * @param aname = This will get the Announcement Name
	 * @param amessage = This will get the Announcement Message
	 * @param acampaign = This will get the Announcement Campaign
	 * @return
	 */

	public ConfiguartionPage announcementDetails(String aname, String amessage, String acampaign) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		action = new Actions(driver);

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(aname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//textarea[@aria-label='Announcement'])[2]")));

		driver.findElement(By.xpath("(//textarea[@aria-label='Announcement'])[2]")).sendKeys(amessage);

		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();

		WebElement campaignList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));

		campaignList.findElement(By.xpath("(//div[text()='"+acampaign+"'])[2]")).click();

		action.click().build().perform();

		return this;


	}
	
	/**
	 * 
	 * @param sname = This will get the Script Name
	 * @param sdes = This will get the Script Description
	 * @param surl = This will get the Script URL
	 * @param stext = This will get the Script Test
	 * @param stype = This will get the Script Type 
	 * @return
	 */

	public ConfiguartionPage scriptDetails(String sname, String sdes, String surl, String stext, String stype) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@aria-label='Script_name']")).sendKeys(sname);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(sdes);



		switch (stype) {

		case "Url" :

			driver.findElement(By.xpath("//label[text()='URL']")).click();

			driver.findElement(By.xpath("(//input[@aria-label='URL'])[2]")).sendKeys(surl);

			break;

		case "Text" :

			driver.findElement(By.xpath("//label[text()='Text']")).click();

			driver.findElement(By.xpath("//textarea[@placeholder='Text here...']")).sendKeys(stext);

			break;

		default :

			System.err.println("Invalid Type");

			break;

		}

		return this;


	}

	/**
	 * 
	 * @param did_Num = This will get the DID Number
	 * @param did_Name = This will get the DID Name
	 * @param des_Name = This will get the Inbound Destination
	 * @param des_Value = This will get the Inbount Destination Value
	 * @return
	 */

	public ConfiguartionPage inboundrouteDetails(String did_Num, String did_Name, String des_Name, String des_Value ) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		action = new Actions (driver);

		driver.findElement(By.xpath("(//input[@aria-label='DID Number'])[2]")).sendKeys(did_Num);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='DID Name'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='DID Name'])[2]")).sendKeys(did_Name);

		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[3]")).click();

		WebElement desNameList = driver.findElement(By.xpath("(//div[@role='list'])[6]"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='queue'])[3]")));

		desNameList.findElement(By.xpath("(//div[text()='"+des_Name+"'])[3]")).click();

		action.click().build().perform();

		driver.findElement(By.xpath("//label[text()='Destination Value']/following-sibling::div")).click();

		WebElement desValueList = driver.findElement(By.xpath("(//div[@role='list'])[5]"));

		desValueList.findElement(By.xpath("(//div[text()='"+des_Value+"'])[2]")).click();

		action.click().build().perform();

		return this;


	}
	
	/**
	 * 
	 * @param tzname = This will get the Timezone Name
	 * @param tzdes = This will get the Timezone Description 
	 * @param sthour = This will get the Timezone Start time Hour
	 * @param stmin = This will get the Timezone Start time Minute
	 * @param ethour = This will get the Timezone End time Hour
	 * @param etmin = This will get the Timezone End time Minute
	 * @param tzstatus = This will get the Timezone Status
	 * @return
	 */

	public ConfiguartionPage timezoneDetail(String tzname, String tzdes, String sthour, String stmin , String ethour, String etmin, String tzstatus) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		action = new Actions (driver);

		driver.findElement(By.xpath("(//input[@aria-label='Zone Name'])[2]")).sendKeys(tzname);

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(tzdes);

		driver.findElement(By.xpath("(//input[@aria-label='Start Time'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+sthour+"']")));

		driver.findElement(By.xpath("//span[text()='"+sthour+"']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+stmin+"']")));

		driver.findElement(By.xpath("//span[text()='"+stmin+"']")).click();

		driver.findElement(By.xpath("(//input[@aria-label='End Time'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+ethour+"']")));

		driver.findElement(By.xpath("//span[text()='"+ethour+"']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+etmin+"']")));

		driver.findElement(By.xpath("//span[text()='"+etmin+"']")).click();

		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='list'])[4]")));

		WebElement statusList = driver.findElement(By.xpath("(//div[@role='list'])[4]"));

		statusList.findElement(By.xpath("(//div[text()='Active'])[3]")).click();

		action.click().build().perform();

		driver.findElement(By.xpath("(//button[@type='button']/following-sibling::button)[2]")).click();

		return this;
	}
	
	/**
	 * 
	 * @param mtname = This will get the Meeting Title Name
	 * @param mtsubtitle = This will get the Meeting Title Sub Title Name
	 * @param mtdes = This will get the Meeting Title Description Name
	 * @return
	 */

	public ConfiguartionPage meetingTitleDetails(String mtname,String mtsubtitle, String mtdes) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		action = new Actions (driver);

		driver.findElement(By.xpath("(//input[@aria-label='Meeting Title'])[2]")).sendKeys(mtname);

		if(mtsubtitle !=null) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Meeting Sub Title']")));

			driver.findElement(By.xpath("//input[@aria-label='Meeting Sub Title']")).sendKeys(mtsubtitle);

		}

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@aria-label='Description'])[3]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[3]")).sendKeys(mtdes);

		return this;


	}
	
	/**
	 * 
	 * @param deletename = This will get the name of the data which will be deleted
	 * @param deletecol = This will get the column number were the delete icon is present
	 * @return
	 */

	public ConfiguartionPage configDelete(String deletename, String deletecol) {
		
		driver.findElement(By.xpath("//td[text()='"+deletename+"']//following-sibling::td["+deletecol+"]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light red--text']")).click();
		
		return this;
	}
	
// Configuration Updation
	
	public ConfiguartionPage configEdit(String editname, String editcol) {
		
		driver.findElement(By.xpath("//td[text()='"+editname+"']//following-sibling::td["+editcol+"]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();
		
		return this;
	}
	
	/**
	 * 
	 * @param qwtime = This will get the Queue WaitTimeOut value
	 * @return
	 */
	
	public ConfiguartionPage updateQueue(String qwtime) {
		

		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		action = new Actions (driver);
		
		WebElement inputField = driver.findElement(By.xpath("(//input[@aria-label='Wait TimeOut'])[1]"));
		
		action.doubleClick(inputField)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys(qwtime)
		.build().perform();
		
		return this;
	}
	
	
	public ConfiguartionPage updateDispo(String dstatus) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//label[text()='Status']/following-sibling::div)[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+dstatus+"'])[2]")));
				
		driver.findElement(By.xpath("(//div[text()='"+dstatus+"'])[2]")).click();
		
		
		return this;
		
		
		
	}
	
	
	public ConfiguartionPage updateSubDispo(String sdstatus) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//label[text()='Status']/following-sibling::div)[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+sdstatus+"'])[2]")));
				
		driver.findElement(By.xpath("(//div[text()='"+sdstatus+"'])[2]")).click();
		
		
		return this;
		
		
		
	}
	
	/**
	 * This function will perform assertion for creation flow
	 * @param expectedvalue = This will get the Expected Value
	 * @param assertcol = This will give the column number were the assert to take place
	 * @return
	 */
	
	public ConfiguartionPage createAssertion(String expectedvalue, String assertcol) {
		
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
	
	
	public ConfiguartionPage deleteAssertion(String expectedvalue, String assertcol) {
		
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
	 * This will click the Add Button in Page
	 * @return
	 */
	public ConfiguartionPage click_Add() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();

		return this;
	}
	
	/**
	 * This will click the Add button in Script Page
	 * @return
	 */

	public ConfiguartionPage click_Add1() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[3]")).click();

		return this;
	}

/**
 * This click the Plus icon in the DID Number page 
 * @return
 */

	public ConfiguartionPage click_Plusicon() {

		driver.findElement(By.xpath("//i[contains(@class,'v-icon addWidget')]")).click();

		return this;
	}
	
	/**
	 * This will click the upload button in Audio Store , BlockList and DID Number Page
	 * @return
	 */
	public ConfiguartionPage click_Uplode() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[3]")).click();

		return this;
	}

	/**
	 * This will click the Ok button in Clock Popup
	 */
	public ConfiguartionPage ClickClockOkbtn() {

		driver.findElement(By.xpath("//div[text()=' OK ']")).click();

		return this;
	}
	
	/**
	 * This will click the Create Button in the page
	 * @return
	 */

	public ConfiguartionPage clickCreatebtn() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();

		return this;
	}

	public ConfiguartionPage statusDropdown(String status) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='Status']/following-sibling::div)[1]")).click();
				
		WebElement statusList = driver.findElement(By.xpath("(//div[@role='list'])[3]"));
		
		wait.until(ExpectedConditions.visibilityOf(statusList));
		
		statusList.findElement(By.xpath("(//div[text()='"+status+"'])[2]")).click();
		
		return this;
		
	}
	/**
	 * This will click the Close button in the upload popup
	 * @return
	 */
	public ConfiguartionPage clickUplodeClosebtn() {

		driver.findElement(By.xpath("(//div[text()='Close'])[1]")).click();

		return this;
	}
	
	
	public ConfiguartionPage clickUpdatebtn() {
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		return this;
	}
	
	/**
	 * This will click the Delete Button in the Delete Popup
	 * @return
	 */
	public ConfiguartionPage Deletebtn() {
		
		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[1]")).click();
		
		return this;
	}
	
	/**
	 * This will click the Delete Button in the DID ,Script Delete Popup
	 * @return
	 */
	
	public ConfiguartionPage Deletebtn1() {
		
		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();
		
		return this;
	}

	
	/**
	 * This function will refresh the page 
	 * @return
	 */
	public ConfiguartionPage refresh() {
		
		driver.findElement(By.xpath("//i[@class='fas fa-refresh']")).click();
		
		return this;
	}
	
	
	/**
	 * This will click the Close button in the Toast or Snakbar
	 * @return
	 */
	public ConfiguartionPage clickSnakbarClosebtn() {

		driver.findElement(By.xpath("//div[@class='v-snack__content']//button[1]")).click();

		return this;
	}


}
