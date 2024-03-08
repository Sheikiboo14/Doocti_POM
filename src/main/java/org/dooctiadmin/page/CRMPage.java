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

public class CRMPage extends DooctiAdminBase{


	protected RemoteWebDriver driver = null;

	WebDriverWait wait = null;

	Actions action = null;


	public CRMPage (RemoteWebDriver driver) {

		this.driver = driver;
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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")));

		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[4]")).click();

		popupHeader.click();

		// Campaign Dispo Status

		driver.findElement(By.xpath("(//input[@aria-label='Dispo Status'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[3]")));

		driver.findElement(By.xpath("(//div[@class='v-list__tile__title'][normalize-space()='CALLBACK'])[3]")).click();

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
	 */

	public CRMPage click_Createbtn() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')])[2]")).click();

		return this;
	}
	public CRMPage click_Updatebtn() {

		driver.findElement(By.xpath("(//button[contains(@class,'v-btn theme--light')]//div)[1]")).click();

		return this;
	}
	
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
	
	public CRMPage campaign_Delete(String delName, String delcol) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//td[text()='"+delName+"']//following-sibling::td["+delcol+"]//i[@class='v-icon mr-2 v-icon--link material-icons theme--light red--text']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Yes, Delete !']")));
		
		driver.findElement(By.xpath("//div[text()='Yes, Delete !']")).click();
		
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

