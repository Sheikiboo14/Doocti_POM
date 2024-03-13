package org.dooctiAgent.page;

import java.time.Duration;
import java.util.List;

import org.doocti.seleniumbase.DooctiAgentBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dashboard_Page extends DooctiAgentBase{

	RemoteWebDriver driver =null;

	WebDriverWait wait = null;

	public Dashboard_Page(RemoteWebDriver driver) {

		this.driver = driver;
	}


	/**
	 * Locators
	 * @return 
	 */

	public Dashboard_Page isDisplayed(boolean expectedValue, String pageName) {

		boolean actualValue = driver.findElement(By.xpath("//div[text()='" +pageName+"']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Page Name  is not displayed...!");

		return this;



	}

	/**
	 * Actions
	 * @return 
	 */

	public Dashboard_Page click_DashBoard() {

		driver.findElement(By.xpath("//div[text()='dashboard']")).click();

		return this;
	}

	public Dashboard_Page click_Lead(boolean expectedValue) {

		driver.findElement(By.xpath("//div[text()='contact_page']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Leads']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Leads']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Lead Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Contact(boolean expectedValue) {

		driver.findElement(By.xpath("//div[text()='contacts']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Contacts']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Contacts']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Contact Page is Not Displayed...!");
		return this;
	}

	public Dashboard_Page click_Meeting(boolean expectedValue) {

		driver.findElement(By.xpath("//div[text()='group']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Meetings']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Meetings']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Meeting Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Ticket(boolean expectedValue) {

		driver.findElement(By.xpath("//div[text()='confirmation_number']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Tickets']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Tickets']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Ticket Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Script(boolean expectedValue) {

		driver.findElement(By.xpath("//img[contains(@class,'navbar-logo-img navbar-menu-icon')]")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Script']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Script']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Script Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Noti(boolean expectedValue) {

		driver.findElement(By.className("navbar-notification-icon")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Notifications']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Notifications']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Notification Tab is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Profile(boolean expectedValue) {

		driver.findElement(By.className("navbar-profile")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Profile']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Profile']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Profile Tab  is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Close() {

		driver.findElement(By.xpath("//span[text()='close']")).click();

		return this;
	}

	public Dashboard_Page click_Logout(boolean expectedValue) {

		driver.findElement(By.xpath("//div[text()='Log Out']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Login']")));

		boolean actualValue = driver.findElement(By.xpath("//h3[text()='Login']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Agnet is not Logout...!");


		return this;
	}

	public Dashboard_Page click_PlusIcon() {

		driver.findElement(By.xpath("//div[text()='add_circle']")).click();

		return this;
	}

	public Dashboard_Page click_Savebtn() {

		driver.findElement(By.xpath("//div[text()='save']")).click();

		return this;
	}

	public Dashboard_Page click_Okbtn() {

		driver.findElement(By.xpath("//button[text()='Ok!']")).click();

		return this;
	}
	
	public Dashboard_Page click_Createbtn() {

		driver.findElement(By.xpath("//button[text()='Create']")).click();

		return this;
	}


	public Dashboard_Page click_RefreshIcon() {

		driver.findElement(By.xpath("//div[text()='refresh']")).click();

		return this;
	}



	public Dashboard_Page leadDetails(String first_Name ,String last_Name,String phone_Number,String email ,String address,String list_Id ,String tag_Name,String alt_Number,String lead_Status,String source_Name) {

		// First Name

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='First Name']")));

		String fname = driver.findElement(By.xpath("//label[text()='First Name']")).getAttribute("class");

		//		System.out.println(fname);

		//		if(fname.equalsIgnoreCase("label_cls required")) {

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(first_Name);
		//		}

		// Last Name

		String lname = driver.findElement(By.xpath("//label[text()='Last Name']")).getAttribute("class");

		//		System.out.println(lname);

		if(lname.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//label[text()='Last Name']")).sendKeys(last_Name);
		}

		// Phone Number

		String phno = driver.findElement(By.xpath("//label[text()='Phone Number']")).getAttribute("class");

		//		System.out.println(phno);

		if(phno.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(phone_Number);
		}

		//Email

		String e_mail = driver.findElement(By.xpath("//label[text()='Email']")).getAttribute("class");

		//		System.out.println(e_mail);

		if(e_mail.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		}

		//Address

		String add = driver.findElement(By.xpath("//label[text()='Address']")).getAttribute("class");

		//		System.out.println(add);

		if(add.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys(address);
		}

		//List Id

		String list_id = driver.findElement(By.xpath("//label[text()='List Id']")).getAttribute("class");

		//		System.out.println(list_Id);

		if(list_id.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//div[text()='List ID']/following-sibling::div")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+list_Id+"']")));

			driver.findElement(By.xpath("//div[text()='"+list_Id+"']")).click();

		}

		//Tag

		String tag = driver.findElement(By.xpath("//label[text()='List Id']")).getAttribute("class");

		//		System.out.println(tag);

		if(tag.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//div[text()='Tags']/following-sibling::div")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+tag_Name+"']")));

			driver.findElement(By.xpath("//div[text()='"+tag_Name+"']")).click();

		}

		//Alternate Number

		String alt_num = driver.findElement(By.xpath("//label[text()='Alternative Number']")).getAttribute("class");

		//		System.out.println(alt_num);

		if(alt_num.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//input[@placeholder='Alternative Number']")).sendKeys(alt_Number);
		}

		//Lead_Status

		String lead_Sts = driver.findElement(By.xpath("//label[text()='Lead Status']")).getAttribute("class");

		//		System.out.println(lead_Sts);

		if(lead_Sts.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//div[text()='Lead Status']/following-sibling::div")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+lead_Status+"']")));

			driver.findElement(By.xpath("//div[text()='"+lead_Status+"']")).click();

		}

		//Source

		String source = driver.findElement(By.xpath("//label[text()='Source']")).getAttribute("class");

		//		System.out.println(source);

		if(source.equalsIgnoreCase("label_cls required")) {

			driver.findElement(By.xpath("//div[text()='source']/following-sibling::div")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+source_Name+"']")));

			driver.findElement(By.xpath("//div[text()='"+source_Name+"']")).click();

		}		

		return this;
	}


	public Dashboard_Page contactDetails(String contact_Name, String contact_Number) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		// Name

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(contact_Name);

		// Phone Number

		driver.findElement(By.xpath("//input[@placeholder='PhoneNumber']")).sendKeys(contact_Number);

		return this;

	}


	public Dashboard_Page meetingDetails(String meeting_Title,String meeting_Number,String meeting_Module,String meeting_Hours,String meeting_Min,String meeting_des,String meeting_Date) {

		//Meeting Title

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")));

		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")).click();

		driver.findElement(By.xpath("//div[text()='"+meeting_Title+"']")).click();

		//Phone Number

		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(meeting_Number);


		// Module

		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[2]")).click();

		driver.findElement(By.xpath("//div[text()='"+meeting_Module+"']")).click();

		//Time

		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[3]")).click();

		driver.findElement(By.xpath("//div[text()='"+meeting_Hours+"']")).click();

		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[4]")).click();

		driver.findElement(By.xpath("//div[text()='"+meeting_Min+"']")).click();

		driver.findElement(By.xpath("(//label[text()='Schedule Date']/following::input)[3]")).click();

		driver.findElement(By.xpath("//div[text()='"+meeting_Date+"']")).click();

		// Description

		driver.findElement(By.xpath("(//textarea[@placeholder='Enter Your Comments'])[1]")).sendKeys(meeting_des);

		// Create Meeting 

		driver.findElement(By.xpath("//button[text()='Create']")).click();


		return this;
	}
	/**
	 * Assertion
	 * @return boolean value of true or false 
	 */


	public Dashboard_Page navbar_Assert(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Dashboard']")).isDisplayed();

		return this;

	}

	public Dashboard_Page noti_Assert(boolean expectedValue) {


		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Notifications']")).isDisplayed();

		return this;

	}

	public Dashboard_Page profile_Assert(boolean expectedValue) {


		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Profile']")).isDisplayed();

		return this;

	}


	public Dashboard_Page create_Assert(String expectedValue) {


		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr//td[3]"));

		boolean flag = false;

		for(WebElement Data : Alldatas) {

			String value = Data.getText();

			if(value.contains(expectedValue)) {

				flag = true;

				break;
			}
		}

		Assert.assertTrue(flag,"Not created...!");

		return this;

	}



	public Dashboard_Page codeWait(int Seconds) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(Seconds));

		return this;
	}


}
