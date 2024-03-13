package org.dooctiadmin.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.doocti.seleniumbase.DooctiAdminBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CRMPage extends DooctiAdminBase{


	protected RemoteWebDriver driver = null;

	WebDriverWait wait = null;

	Actions action = null;

	Robot rb = null;			


	public CRMPage (RemoteWebDriver driver) {

		this.driver = driver;
	}

	
	public CRMPage consoleLog() throws AWTException {
		
		rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);
		
		return this;
		
	}

	/**
	 * CRM Creation Flow
	 * @return 
	 */



	public CRMPage campaignCommonData(String camName, String camType, String camIndustry,String camTemplate) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[text()=' Add Campaign ']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Name'])[2]")));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(camName);

		// Campaign Process

		driver.findElement(By.xpath("(//label[text()='Process']/following-sibling::div)[3]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Leads'])[2]")));

		driver.findElement(By.xpath("(//div[text()='Leads'])[2]")).click();

		driver.findElement(By.xpath("(//div[text()='Tickets'])[2]")).click();

		driver.findElement(By.xpath("(//div[text()='Meetings'])[2]")).click();

		popupHeader.click();

		// Campaign Type

		driver.findElement(By.xpath("(//label[text()='Type']/following-sibling::div)[3]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camType+"'])[3]")));

		driver.findElement(By.xpath("(//div[text()='"+camType+"'])[3]")).click();

		popupHeader.click();

		// Campaign Industry

		driver.findElement(By.xpath("(//label[text()='Industry']/following-sibling::div)[3]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camIndustry+"'])[2]")));

		driver.findElement(By.xpath("(//div[text()='"+camIndustry+"'])[2]")).click();

		popupHeader.click();


		// Campaign Template

		driver.findElement(By.xpath("(//label[text()='Template Name']/following-sibling::div)[3]")).click();

		if(camType.equalsIgnoreCase("WHATSAPP BLAST")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camTemplate+"'])[2]")));

			driver.findElement(By.xpath("(//div[text()='"+camTemplate+"'])[2]")).click();

		}

		else {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camTemplate+"'])[3]")));

			driver.findElement(By.xpath("(//div[text()='"+camTemplate+"'])[3]")).click();

		}

		popupHeader.click();

		return this;
	}


	public CRMPage queue(String camQueue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		// Campaign Queue

		driver.findElement(By.xpath("(//input[@aria-label='Add Queue'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camQueue+"'])[2]")));

		driver.findElement(By.xpath("(//div[text()='"+camQueue+"'])[2]")).click();

		popupHeader.click();

		return this;
	}

	public CRMPage pauseCode() {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));


		// Campaign Pausecode

		driver.findElement(By.xpath("(//input[@aria-label='Pause Code'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Meeting'])[2]")));

		driver.findElement(By.xpath("(//div[text()='Meeting'])[2]")).click();

		driver.findElement(By.xpath("(//div[text()='Lunch'])[2]")).click();

		driver.findElement(By.xpath("(//div[text()='Tea Break'])[2]")).click();

		popupHeader.click();

		return this;
	}


	public CRMPage dial_dispo() {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		// Campaign Dial Status

		driver.findElement(By.xpath("(//input[@aria-label='Dial Status'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALL'])[4]")));

		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALL'])[4]")).click();

		popupHeader.click();

		// Campaign Dispo Status

		driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALL'])[3]")));

		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALL'])[3]")).click();

		popupHeader.click();

		return this;
	}



	public CRMPage bufferLevel(String camBflevel) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		driver.findElement(By.xpath("//label[text()='Buffer Level']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camBflevel+"'])[1]")));

		driver.findElement(By.xpath("(//div[text()='"+camBflevel+"'])[1]")).click();

		popupHeader.click();

		return this;
	}

	public CRMPage dialRatio(String camDialRatio) {


		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		//Dial Ratio

		driver.findElement(By.xpath("//label[text()='Dial Ratio']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camDialRatio+"'])[1]")));

		driver.findElement(By.xpath("(//div[text()='"+camDialRatio+"'])[1]")).click();

		popupHeader.click();

		return this;
	}

	public CRMPage channel(String camChannel) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));


		driver.findElement(By.xpath("(//div[@class='v-select__selections'])[24]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+camChannel+"']")));

		driver.findElement(By.xpath("//div[text()='"+camChannel+"']")).click();

		popupHeader.click();

		return this;	

	}

	public CRMPage dateTime() {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		// Start Time

		driver.findElement(By.xpath("//label[text()='Start Time']/following-sibling::input")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1'])[1]")));

		driver.findElement(By.xpath("(//span[text()='1'])[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1'])[1]")));

		driver.findElement(By.xpath("//span[text()='00']")).click();

		popupHeader.click();

		// End Time

		driver.findElement(By.xpath("//label[text()='End Time']/following-sibling::input")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1'])[1]")));

		driver.findElement(By.xpath("//span[text()='11']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1'])[1]")));

		driver.findElement(By.xpath("//span[text()='00']")).click();

		popupHeader.click();

		// Days

		driver.findElement(By.xpath("(//label[text()='Days']/following::input)[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sunday']")));

		driver.findElement(By.xpath("//div[text()='Sunday']")).click();

		driver.findElement(By.xpath("//div[text()='Monday']")).click();

		driver.findElement(By.xpath("//div[text()='Tuesday']")).click();

		driver.findElement(By.xpath("//div[text()='Wednesday']")).click();

		driver.findElement(By.xpath("//div[text()='Thursday']")).click();

		driver.findElement(By.xpath("//div[text()='Friday']")).click();

		driver.findElement(By.xpath("//div[text()='Saturday']")).click();

		popupHeader.click();


		return this;

	}

	public CRMPage whatsappData(String camWpType) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		//Whatsapp type

		driver.findElement(By.xpath("//label[text()='WhatApp Type']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+camWpType+"']")));

		driver.findElement(By.xpath("//div[text()='"+camWpType+"']")).click();

		popupHeader.click();

		//Whatsapp Template

		driver.findElement(By.xpath("//label[text()='WhatApp Template']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Text']")));

		driver.findElement(By.xpath("//div[text()='Text']")).click();

		popupHeader.click();

		//Whatsapp Language

		driver.findElement(By.xpath("//label[text()='WhatApp Language']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Text']")));

		driver.findElement(By.xpath("//div[text()='Text']")).click();

		popupHeader.click();


		return this;	

	}

	public CRMPage dialPrefix(String camDialPrefix) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		// Dial Prefix

		driver.findElement(By.xpath("(//input[@aria-label='Dial Prefix'])[2]")).sendKeys(camDialPrefix);

		popupHeader.click();

		return this;

	}

	public CRMPage script(String camScript) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//div[@class='v-toolbar__content'])[2]"));

		// Campaign Script

		driver.findElement(By.xpath("(//label[text()='Script_name']/following-sibling::div)[3]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+camScript+"'])[3]")));

		driver.findElement(By.xpath("(//div[text()='"+camScript+"'])[3]")).click();

		popupHeader.click();

		return this;

	}


	public CRMPage checkbox() {

		// On Demand Recording

		driver.findElement(By.xpath("(//label[text()='On Demand Recording'])[2]")).click();

		// DNC Check

		driver.findElement(By.xpath("(//label[text()='DNC check'])[2]")).click();

		// Call Masking

		driver.findElement(By.xpath("(//label[text()='Call Masking'])[2]")).click();

		// Timezone

		driver.findElement(By.xpath("(//label[text()='Timezone'])[2]")).click();

		return this;
	}

	
	public CRMPage listData(String listid, String listname, String listdes, String listcampaign, String listrecycle) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[text()='List']/following-sibling::button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='List ID'])[2]")));
		
		WebElement popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		
		driver.findElement(By.xpath("(//input[@aria-label='List ID'])[2]")).sendKeys(listid);
		
		driver.findElement(By.xpath("(//input[@aria-label='Name'])[2]")).sendKeys(listname);
		
		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(listdes);
		
		driver.findElement(By.xpath("(//label[text()='Campaign']/following-sibling::div)[3]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+listcampaign+"'])[3]")));
		
		driver.findElement(By.xpath("(//div[text()='"+listcampaign+"'])[3]")).click();
		
		popup.click();
		
		driver.findElement(By.xpath("(//label[text()='Recycling']/following-sibling::div)[3]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+listrecycle+"'])[2]")));
		
		driver.findElement(By.xpath("(//div[text()='"+listrecycle+"'])[2]")).click();
		
		popup.click();
		
		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[1]")).click();
		
		return this;

	}
	
	public CRMPage leadUpload(String leadlistid, String leadfilepath, boolean permission) throws AWTException {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//i[@title='Upload Leads']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='List']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+leadlistid+"'])[1]")));
		
		driver.findElement(By.xpath("(//div[text()='"+leadlistid+"'])[1]")).click();
		
		if(permission == true) {
			
			driver.findElement(By.xpath("//label[text()=' YES ']")).click();
		}
		
		else {
			
			driver.findElement(By.xpath("//label[text()=' NO ']")).click();
		}
		
		
		driver.findElement(By.className("file-dummy")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rb = new Robot();
		
		StringSelection filepath = new StringSelection(leadfilepath);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']")));
		
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Upload']")));
		
		driver.findElement(By.xpath("//span[text()='Upload']")).click();
		
		return this;
	}
	
	
	public CRMPage leadData(String lname, String lphno, String lsource) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//i[@title='Create Leads']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='First Name']")));
		
		driver.findElement(By.xpath("//input[@aria-label='First Name']")).sendKeys(lname);
				
		driver.findElement(By.xpath("//input[@aria-label='Phone Number']")).sendKeys(lphno);
		
		driver.findElement(By.xpath("//input[@aria-label='Source']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+lsource+"']")));
		
		driver.findElement(By.xpath("//div[text()='"+lsource+"']")).click();

		
		return this;
	}
	
	public CRMPage contactData(String cname,String cnum) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@aria-label='Name']")).sendKeys(cname);

		driver.findElement(By.xpath("//input[@aria-label='PhoneNumber']")).sendKeys(cnum);

		return this;
	}


	public CRMPage contactUpload(String contact_Path) throws  AWTException {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.className("file-dummy")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		rb = new Robot();
		
		StringSelection FilePath = new StringSelection(contact_Path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FilePath, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String expectedValue = driver.findElement(By.className("file-dummy")).getText();
		
		System.out.println(expectedValue);

		Assert.assertEquals("Uploaded Successfully", expectedValue,"Contact is Not Uploaded");

		if(expectedValue.equalsIgnoreCase("Uploaded Successfully")) {

			driver.findElement(By.xpath("//div[text()='Close']")).click();
		}


		return this;



	}
	public CRMPage ticketData(String tstatus, String tname, String tsubject, String tdes, String tphno, String tdate,String tpriority, String tchannel) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popup = driver.findElement(By.xpath("(//div[@class='sectionFlex']//div)[3]"));

		driver.findElement(By.xpath("//input[@aria-label='Status']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tstatus+"']")));

		driver.findElement(By.xpath("//div[text()='"+tstatus+"']")).click();

		popup.click();

		driver.findElement(By.xpath("//input[@aria-label='Account Name']")).sendKeys(tname);

		driver.findElement(By.xpath("(//input[@aria-label='Subject'])[2]")).sendKeys(tsubject);

		driver.findElement(By.xpath("//textarea[@aria-label='Description']")).sendKeys(tdes);

		driver.findElement(By.xpath("(//input[@aria-label='PhoneNumber'])[2]")).sendKeys(tphno);

		driver.findElement(By.xpath("//input[@aria-label='DueDate']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tdate+"']")));

		driver.findElement(By.xpath("//div[text()='"+tdate+"']")).click();

		driver.findElement(By.xpath("(//input[@aria-label='Priority'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+tpriority+"'])[1]")));

		driver.findElement(By.xpath("(//div[text()='"+tpriority+"'])[1]")).click();

		driver.findElement(By.xpath("(//input[@aria-label='Channel'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+tchannel+"']")));

		driver.findElement(By.xpath("//div[text()='"+tchannel+"']")).click();

		return this;
	}

	public CRMPage meetingData(String mtitle,String mdes,String mphno,String magent,String mdate,String mmodule, String mtemplate,String otitle) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));

		driver.findElement(By.xpath("//label[text()='Meeting title']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+mtitle+"']")));

		driver.findElement(By.xpath("//div[text()='"+mtitle+"']")).click();

		popup.click();

		if(mtitle.equalsIgnoreCase("Others")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Title']")));

			driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys(otitle);

		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-label='Description'])[2]")));

		driver.findElement(By.xpath("(//input[@aria-label='Description'])[2]")).sendKeys(mdes);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Phone Number']")));

		driver.findElement(By.xpath("//input[@aria-label='Phone Number']")).sendKeys(mphno);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[text()='Agent']/following-sibling::div)[3]")));

		driver.findElement(By.xpath("(//label[text()='Agent']/following-sibling::div)[3]")).click();

		driver.findElement(By.xpath("(//div[text()='"+magent+"'])[3]")).click();

		popup.click();

		driver.findElement(By.xpath("(//input[@class='vdatetime-input'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+mdate+"']")));

		driver.findElement(By.xpath("//span[text()='"+mdate+"']")).click();

		driver.findElement(By.xpath("//div[text()='Ok']")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='Ok']")).click();

		popup.click();

		driver.findElement(By.xpath("(//label[text()='Module']/following-sibling::div)[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='"+mmodule+"'])[2]")));

		driver.findElement(By.xpath("(//div[text()='"+mmodule+"'])[2]")).click();

		popup.click();

		driver.findElement(By.xpath("//label[text()='Template']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+mtemplate+"']")));

		driver.findElement(By.xpath("//div[text()='"+mtemplate+"']")).click();

		popup.click();

		return this;
	}


	
// Updation Code
	
	public CRMPage campaign_Edit(String editName, String editcol) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement popupHeader = driver.findElement(By.xpath("(//nav[contains(@class,'modal-header--sticky v-toolbar')]//div)[1]"));

		driver.findElement(By.xpath("//td[text()='"+editName+"']//following-sibling::td["+editcol+"]//i[@class='v-icon mr-4 v-icon--link material-icons theme--light blue--text']")).click();

		WebElement updatePopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[2]"));
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(updatePopup);
		new Actions(driver)
		.scrollFromOrigin(scrollOrigin, 0,350)
		.perform();

		driver.findElement(By.xpath("(//label[text()='Status']/following-sibling::div)[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='INACTIVE']")));

		driver.findElement(By.xpath("//div[text()='INACTIVE']")).click();

		popupHeader.click();

		return this;
	}

	// Deletion Code
	
	public CRMPage campaign_Delete(String delName, String delcol) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//td[text()='"+delName+"']//following-sibling::td["+delcol+"]//i[@class='v-icon mr-2 v-icon--link material-icons theme--light red--text']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Yes, Delete !']")));

		driver.findElement(By.xpath("//div[text()='Yes, Delete !']")).click();

		return this;

	}
	
	
	public CRMPage leadDelete() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[24]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Bulk Delete']")));
		
		driver.findElement(By.xpath("//i[@title='Bulk Delete']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']/following-sibling::button)[2]")));
		
		driver.findElement(By.xpath("(//button[@type='button']/following-sibling::button)[2]")).click();
		
		return this;
	}
	
	public CRMPage leadBulkDelete() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@class='v-input--selection-controls__ripple'])[24]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Bulk Delete']")));
		
		driver.findElement(By.xpath("//i[@title='Bulk Delete']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']/following-sibling::button)[1]")));
		
		driver.findElement(By.xpath("(//button[@type='button']/following-sibling::button)[1]")).click();
		
		return this;
	}
	/**
	 * Side Bar Actions
	 * 
	 */

	public CRMPage click_CRM() {

		driver.findElement(By.xpath("//div[text()='CRM']")).click();

		return this;
	}

	public CRMPage click_Campaign() {

		driver.findElement(By.xpath("//span[text()='Campaigns']")).click();

		return this;
	}

	public CRMPage click_List() {

		driver.findElement(By.xpath("//span[text()='Lists']")).click();

		return this;
	}

	public CRMPage click_Lead() {

		driver.findElement(By.xpath("//span[text()='Leads']")).click();

		return this;
	}

	public CRMPage click_Contact() {

		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

		return this;
	}
	public CRMPage click_Ticket() {

		driver.findElement(By.xpath("//span[text()='Tickets']")).click();

		return this;
	}

	public CRMPage click_Meeting() {

		driver.findElement(By.xpath("//span[text()='Meetings']")).click();

		return this;
	}


	/**
	 * Button and Icons Actions
	 * @return 
	 * @return 
	 */

	public CRMPage click_AddBtn() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();

		return this;
	}

	public CRMPage click_PlusIcon() {

		driver.findElement(By.xpath("//i[@class='fas fa-plus']")).click();

		return this;
	}
	public CRMPage click_Createbtn() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();

		return this;
	}
	public CRMPage click_Updatebtn() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')]//div)[1]")).click();

		return this;
	}

	public CRMPage click_SaveBtn() {

		driver.findElement(By.xpath("//i[contains(@class,'fa fa-floppy-o')]")).click();

		return this;
	}



	public CRMPage click_UploadBtn() {

		driver.findElement(By.xpath("//div[text()=' Upload ']")).click();

		return this;
	}


	/**
	 * This function will refresh the page 
	 * @return
	 */

	public CRMPage refresh() {

		driver.findElement(By.xpath("//i[@class='fas fa-refresh']")).click();

		return this;
	}


	/**
	 * This will click the Close button in the Toast or Snakbar
	 * @return
	 */

	public CRMPage clickSnakbarClosebtn() {

		driver.findElement(By.xpath("//div[@class='v-snack__content']//button[1]")).click();

		return this;
	}


	public CRMPage scroll(int scrollamount) {

		WebElement createPopup = driver.findElement(By.xpath("(//div[@class='v-card__text'])[3]"));
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(createPopup);
		new Actions(driver)
		.scrollFromOrigin(scrollOrigin, 0,scrollamount)
		.perform();

		return this;
	}

	/**
	 * Assertions
	 */


	public void create_CampaignAssertion(String camName) {

		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));

		boolean flag = false;

		for(WebElement Data : Alldatas) {

			String value = Data.getText();

			if(value.contains(camName)) {

				flag = true;

			}
		}

		Assert.assertTrue(flag, camName +"Canmpaign is Not Created...!");
	}

	public void edit_CampaignAssertion(String camName, String expectedValue) {

		String actualValue = driver.findElement(By.xpath("//td[text()='"+camName+"']//following-sibling::td[5]")).getText();

		Assert.assertEquals(actualValue, expectedValue, "Campaign Status is Not Updated");
	}

	public void delete_CampaignAssertion(String camName) {

		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'v-datatable')]//tr//td[1]"));

		boolean flag = false;

		for(WebElement Data : Alldatas) {

			String value = Data.getText();

			if(value.contains(camName)) {

				flag = true;

			}
		}

		Assert.assertFalse(flag, camName +"Canmpaign is Not Deleted...!");
	}
}

