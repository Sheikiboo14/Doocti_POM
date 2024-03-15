package org.dooctiAgent.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.doocti.seleniumbase.DooctiAgentBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dashboard_Page extends DooctiAgentBase{

	RemoteWebDriver driver =null;

	WebDriverWait wait = null;
	
	Actions action = null;
	
	Robot rb = null;

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
	 * @return 
	 */



	public Dashboard_Page meeting_Filter(String meetingStatus) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//span[text()='tune']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Select...']/following-sibling::div)[2]")));

		driver.findElement(By.xpath("(//div[text()='Select...']/following-sibling::div)[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+meetingStatus+"']")));

		driver.findElement(By.xpath("//div[text()='"+meetingStatus+"']")).click();

		driver.findElement(By.xpath("//button[text()='Apply Filter']")).click();

		return this;

	}
	public Dashboard_Page click_Lead(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//div[text()='contact_page']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Leads']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Leads']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Lead Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Contact(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//div[text()='contacts']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Contacts']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Contacts']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Contact Page is Not Displayed...!");
		return this;
	}

	public Dashboard_Page click_Meeting(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//div[text()='group']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Meetings']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Meetings']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Meeting Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Ticket(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//div[text()='confirmation_number']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Tickets']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Tickets']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Ticket Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Script(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//img[contains(@class,'navbar-logo-img navbar-menu-icon')]")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Script']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Script']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Script Page is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Noti(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.className("navbar-notification-icon")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Notifications']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Notifications']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Notification Tab is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_Profile(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.className("navbar-profile")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Profile']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()='Profile']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Profile Tab  is Not Displayed...!");

		return this;
	}

	public Dashboard_Page click_PauseBtn(boolean expectedValue, String pauseCode) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//span[text()='pause']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown-menu show']")));

		boolean actualValue = driver.findElement(By.xpath("//div[@class='dropdown-menu show']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Pause Code  is Not Displayed...!");

		driver.findElement(By.xpath("//a[contains(text(),'"+pauseCode+"')]")).click();

		String actualPauseCode= driver.findElement(By.tagName("p")).getText();

		boolean flag = false;

		if(actualPauseCode.equalsIgnoreCase(pauseCode)) {

			flag = true;

		}

		Assert.assertTrue(flag,"Agent is not paused...!");

		driver.findElement(By.xpath("(//button[@type='button']//span)[1]")).click();

		actualPauseCode= driver.findElement(By.tagName("p")).getText();

		System.out.println(actualPauseCode);

		flag = false;

		if(actualPauseCode.equalsIgnoreCase("Available")) {

			flag = true;

		}
		Assert.assertTrue(flag,"Agent Not Resumed...!");


		return this;
	}


	public Dashboard_Page click_Menu(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar-menu-container")));

		boolean actualValue = driver.findElement(By.className("navbar-menu-container")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();


		return this;      


	}

	public Dashboard_Page click_MenuLead(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//div[text()='contact_page'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Leads']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Leads']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();


		return this;      


	}

	public Dashboard_Page click_MenuMeeting(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//div[text()='group'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Meetings']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Meetings']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		return this;      


	}

	public Dashboard_Page click_MenuTicket(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//div[text()='confirmation_number'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Tickets']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Tickets']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		return this;      


	}

	public Dashboard_Page click_MenuContact(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//div[text()='contacts'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Contacts']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Contacts']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		return this;      


	}

	public Dashboard_Page click_MenuVoicemail(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//div[text()='voicemail'])[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Voicemail']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Voicemail']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		return this;      


	}

	public Dashboard_Page click_MenuScript(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//img[contains(@class,'navbar-logo-img navbar-menu-icon')])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Script'])[2]")));

		boolean actualValue = driver.findElement(By.xpath("(//div[text()='Script'])[2]")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		return this;      


	}

	public Dashboard_Page click_MenuDashboard(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dropdown-menu show'])[1]")));

		WebElement menuList = driver.findElement(By.xpath("(//div[@class='dropdown-menu show'])[1]"));

		menuList.findElement(By.xpath("(//div[text()='dashboard'])[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Dashboard']")));

		boolean actualValue = driver.findElement(By.xpath("//div[text()=' Dashboard']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue);

		driver.findElement(By.xpath("//button[contains(@class,'logout dropdown-toggle')]//div[1]")).click();

		return this;      


	}

	public Dashboard_Page click_Logout(boolean expectedValue) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.xpath("//div[text()='Log Out']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Login']")));

		boolean actualValue = driver.findElement(By.xpath("//h3[text()='Login']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Agnet is not Logout...!");


		return this;
	}





	public Dashboard_Page leadDetails(String first_Name ,String last_Name,String phone_Number,String email ,String address,String list_Id ,String tag_Name,String alt_Number,String lead_Status,String source_Name) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

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

		action =new Actions(driver);
		
		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr"));

		int ini_Count = Alldatas.size();

		//Meeting Title

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")));

		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")).click();

		driver.findElement(By.xpath("//div[text()='"+meeting_Title+"']")).click();

		//Phone Number
		
		WebElement meetingNum = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		
		meetingNum.sendKeys(meeting_Number);
		
		action.doubleClick(meetingNum)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys(meeting_Number)
		.build().perform();

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='refresh']")));

		driver.findElement(By.xpath("//div[text()='refresh']")).click();

		try {

			Thread.sleep(3000);
		}

		catch(Exception e) {

			System.err.println(e.getMessage());
		}
		// Verifiction

		Alldatas = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr"));

		int count = Alldatas.size();

		System.out.println("Actual Count = "+count);

		boolean flag = false;

		if(ini_Count<count) {

			flag = true;
		}

		Assert.assertTrue(flag,"Meeting is not Created...!");



		return this;

	}

	public Dashboard_Page ticketDetails(String status ,String account_Name,String subject_Name,String description ,String phone_Number,String ticket_Priority ,String ticket_Channel,String ticket_Date) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		// Status

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")));


		driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")).click();

		driver.findElement(By.xpath("//div[text()='"+status+"']")).click();

		// Account Name

		driver.findElement(By.xpath("(//input[@placeholder='Account_name'])[1]")).sendKeys(account_Name);

		// Subject

		driver.findElement(By.xpath("(//input[@placeholder='Subject'])[1]")).sendKeys(subject_Name);

		// Description

		driver.findElement(By.xpath("(//textarea[@placeholder='Description'])[1]")).sendKeys(description);

		// Phone Number

		driver.findElement(By.xpath("(//input[@placeholder='PhoneNumber'])[1]")).sendKeys(phone_Number);

		// Due Date

		driver.findElement(By.xpath("(//input[@placeholder='DueDate'])[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='react-datepicker'])[1]")));

		driver.findElement(By.xpath("//div[text()='"+ticket_Date+"']")).click();

		//Priority

		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[3]")).click();

		driver.findElement(By.xpath("//div[text()='"+ticket_Priority+"']")).click();

		WebElement ticket_Form = driver.findElement(By.xpath("//div[@class='Customform-catagory']/following-sibling::div[1]"));

		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(ticket_Form);

		new Actions(driver)
		.scrollFromOrigin(scrollOrigin, 0, 200)
		.perform();

		// Channel

		driver.findElement(By.xpath("//div[text()='Channel']/following-sibling::div")).click();

		driver.findElement(By.xpath("//div[text()='"+ticket_Channel+"']")).click();




		return this;
	}

	public Dashboard_Page dialCall(String dialNumber) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		boolean callBtn = driver.findElement(By.xpath("//button[contains(@class,'callnow ')]")).isEnabled();

		Assert.assertFalse(callBtn);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Dial Pad']/following::input)[1]")));

		driver.findElement(By.xpath("(//span[text()='Dial Pad']/following::input)[1]")).sendKeys(dialNumber);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'callnow ')]")));

		driver.findElement(By.xpath("//button[contains(@class,'callnow ')]")).click();	




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


	public Dashboard_Page create_Assert(String expectedValue,String assertCol) {


		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		List<WebElement> Alldatas = driver.findElements(By.xpath("//table[contains(@class,'lead table')]//tr//td["+assertCol+"]"));

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


	public Dashboard_Page isDisplaydialpadIcon() {
		
		boolean dialPad = driver.findElement(By.xpath("//a[contains(text(),'dialpad')]")).isDisplayed();
			
		Assert.assertTrue(dialPad,"DialPad Icon is Not Displayed...!");
		
		driver.findElement(By.xpath("//a[contains(text(),'dialpad')]")).click();
		
		WebElement callScreen = driver.findElement(By.xpath("(//div[@class='callscreen-flx-top']//div)[1]"));
		
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(callScreen);

		new Actions(driver)
		.scrollFromOrigin(scrollOrigin, 0, 600)
		.perform();
		
		boolean subdialPad = driver.findElement(By.xpath("(//div[@class='dialpad_sub_container']//div)[2]")).isDisplayed();
		
		Assert.assertTrue(subdialPad, "Sub Dial Pad is Not Displayed...!");
		
		driver.findElement(By.xpath("//a[contains(text(),'dialpad')]")).click();

		
		return this;
	}
	
	public Dashboard_Page isDisplaymuteIcon() {
		
		boolean muteIcon = driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).isDisplayed();
			
		Assert.assertTrue(muteIcon,"Mute Icon is Not Displayed...!");
		
//		driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).click();
//		
//		try {
//			
//			Thread.sleep(1000);
//		}
//		
//		catch(Exception e) {
//			
//			System.err.println(e.getMessage());
//		}
//		boolean muteSelect = driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).isEnabled();
		
//		System.out.println(muteSelect);
//		
//		Assert.assertTrue(muteSelect,"Mute Icon is Not Selected..!");
//		
//		driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).click();

		
		return this;

	}
	
	public Dashboard_Page isDisplayholdIcon() {
		
		boolean holdIcon = driver.findElement(By.xpath("//a[contains(text(),'pause')]")).isDisplayed();
			
		Assert.assertTrue(holdIcon,"Hold Icon is Not Displayed...!");
		
//		driver.findElement(By.xpath("//a[contains(text(),'pause')]")).click();
//		
//		boolean holdSelect = driver.findElement(By.xpath("//a[contains(text(),'pause')]")).isSelected();
//		
//		Assert.assertTrue(holdSelect,"Hold Icon is Not Selected..!");
//		
//		driver.findElement(By.xpath("//a[contains(text(),'pause')]")).click();

		
		return this;

	}
	
	public Dashboard_Page isDisplaytransferIcon() {
		
		boolean transferIcon = driver.findElement(By.xpath("//a[contains(text(),'phone_forwarded')]")).isDisplayed();
			
		Assert.assertTrue(transferIcon,"Call Transfer Icon is Not Displayed...!");
		
//		driver.findElement(By.xpath("//a[contains(text(),'phone_forwarded')]")).click();
//		
//		boolean transferSelect = driver.findElement(By.xpath("//a[contains(text(),'phone_forwarded')]")).isSelected();
//		
//		Assert.assertTrue(transferSelect,"Call Transfer Icon is Not Selected..!");
//		
//		driver.findElement(By.xpath("//a[contains(text(),'phone_forwarded')]")).click();

		
		return this;

	}
	
	public Dashboard_Page isDisplayconfrenceIcon() {
		
		boolean confrenceIcon = driver.findElement(By.xpath("//a[contains(text(),'people')]")).isDisplayed();
			
		Assert.assertTrue(confrenceIcon,"Confrence Icon is Not Displayed...!");
		
//		driver.findElement(By.xpath("//a[contains(text(),'people')]")).click();
//		
//		boolean confrenceSelect = driver.findElement(By.xpath("//a[contains(text(),'people')]")).isSelected();
//		
//		Assert.assertTrue(confrenceSelect,"Confrence Icon is Not Selected..!");
//		
//		driver.findElement(By.xpath("//a[contains(text(),'people')]")).click();
		
		return this;

	}

	public Dashboard_Page isDisplaydescriptionIcon() {
		
		boolean descriptionIcon = driver.findElement(By.xpath("//a[contains(text(),'description')]")).isDisplayed();
			
		Assert.assertTrue(descriptionIcon,"Description Icon is Not Displayed...!");
		
		return this;

	}
	
	public Dashboard_Page page_Refresh() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.navigate().refresh();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Get Start']")));
		
		driver.findElement(By.xpath("//button[text()='Get Start']")).click();
		
		return this;
	}
	
	public Dashboard_Page click_DashBoard() {

		driver.findElement(By.xpath("//div[text()='dashboard']")).click();

		return this;
	}
	
	public Dashboard_Page click_Logo() {

		driver.findElement(By.xpath("//img[@class='navbar-logo-img left_logoimge']")).click();

		return this;
	}
		
	

	public Dashboard_Page click_CallIcon(String calldata) {

		driver.findElement(By.xpath("//p[text()='"+calldata+"']//following::span[text()='phone']")).click();

		return this;
	}

	public Dashboard_Page click_DialPad() {

		driver.findElement(By.xpath("//span[text()='Dial Pad']")).click();

		return this;
	}
	

	public Dashboard_Page callDisconnect() {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));



		if(driver.findElement(By.xpath("//a[contains(text(),'mic_off')]")).isDisplayed()==false) {

			driver.findElement(By.xpath("//span[text()='call_end']")).click();


		}

		else {
			
			WebElement callScreen = driver.findElement(By.xpath("(//div[@class='callscreen-flx-top']//div)[1]"));

			WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(callScreen);

			new Actions(driver)
			.scrollFromOrigin(scrollOrigin, 0, 200)
			.perform();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'mic_off')]")));
			
			new Dashboard_Page(driver)
			.isDisplaydialpadIcon()
			.isDisplaymuteIcon()
			.isDisplaytransferIcon()
			.isDisplayconfrenceIcon()
			.isDisplaydescriptionIcon();
			

			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {

				System.err.println(e.getMessage());
			}

			driver.findElement(By.xpath("//span[text()='call_end']")).click();

		}

		return this;
	}
	

	public Dashboard_Page callDispo(String pageName,String dispo ,String sourceName) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		switch (pageName) {

		case "Leads":

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")));

			driver.findElement(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")).click();

			break;

		case "Contacts":

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")));

			driver.findElement(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Ok!']")));

			driver.findElement(By.xpath("//button[text()='Ok!']")).click();

			break;

		case "Meetings":

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")));

			driver.findElement(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")).click();

			break;

		case "Tickets":

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")));

			driver.findElement(By.xpath("//div[text()='"+dispo+"']//following-sibling::div[text()='check']")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Ok!']")));

			driver.findElement(By.xpath("//button[text()='Ok!']")).click();

			break;

		default :

			System.err.println("Wronge Page Name");

			break;

		}


		return this;
	}
	

	public Dashboard_Page click_Close() {

		driver.findElement(By.xpath("//span[text()='close']")).click();

		return this;
	}
	
	
	public Dashboard_Page click_PlusIcon() {

		driver.findElement(By.xpath("//div[text()='add_circle']")).click();

		return this;
	}

	public Dashboard_Page click_Savebtn() {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='save']")));
		
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
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='refresh']")));

		driver.findElement(By.xpath("//div[text()='refresh']")).click();

		return this;
	}

	public Dashboard_Page click_FilterIcon() {

		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='tune']")));
		
		driver.findElement(By.xpath("//span[text()='tune']")).click();

		return this;
	}





	public Dashboard_Page consoleLog() throws AWTException {

		rb = new Robot();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_J);

		return this;

	}


	public Dashboard_Page codeWait(int Seconds) {

		wait = new WebDriverWait(driver,Duration.ofSeconds(Seconds));

		return this;
	}


}
