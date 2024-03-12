package org.dooctiAgent.page;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.doocti.seleniumbase.AgentLogin_TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AgentLogin_Page extends AgentLogin_TestData {
	
	RemoteWebDriver driver = null;
	
	WebDriverWait wait = null;
	
	Actions action = null;
	
	public AgentLogin_Page(RemoteWebDriver driver) {
		
		this.driver = driver;
	}
	
	
	/**
	 * 
	 * Locators
	 */
	
	public AgentLogin_Page isEnabled(boolean expecedValue) {
		
		boolean actualValue = driver.findElement(By.xpath("//button[text()='Submit']")).isEnabled();
		
		Assert.assertEquals(actualValue, expecedValue);
		
		
		return this;
		
	}
	
	public AgentLogin_Page isDisplayed(boolean expecedValue) {
		
		boolean actualValue = driver.findElement(By.xpath("//h3[text()='Select Campaign']")).isDisplayed();
		
		Assert.assertEquals(actualValue, expecedValue);

		return this;
	}
	
	
	/**
	 * 
	 * Actions
	 * 
	 */
	
	public AgentLogin_Page userEmail(String email) {
		
		action = new Actions(driver);
				
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);

		return this;
	}
	
	public AgentLogin_Page userPassword(String password) {
		
		action = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
				
		return this;
	}
	
	public AgentLogin_Page submitBtn() {
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		return this;
	}
	
	public AgentLogin_Page saveBtn() {
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		return this;
	}
	
	public AgentLogin_Page logoutBtn() {
		
		driver.findElement(By.xpath("//span[text()='logout']")).click();
		
		return this;
	}
		
		
	public AgentLogin_Page inputClear() {
		
		action = new Actions(driver);
		
		WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
		
		action.click(emailInput)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.sendKeys(Keys.BACK_SPACE)
		.build().perform();
		
		WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
		
		action.click(passwordInput)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.sendKeys(Keys.BACK_SPACE)
		.build().perform();
		
		
		return this;
	}
	
	public AgentLogin_Page campaign_Selection(String camName) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[text()='Select Campaign']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+camName+"']")));
		
		driver.findElement(By.xpath("//div[text()='"+camName+"']")).click();
		
		return this;

		
	}
	
	public AgentLogin_Page queue_Selection(String queueName) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[text()='Please Select']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+queueName+"']")));
		
		driver.findElement(By.xpath("//div[text()='"+queueName+"']")).click();
		
		return this;

		
	}
	
	
	/**
	 * Assertion
	 * @return 
	 */

	public AgentLogin_Page errorAssert(boolean expectedValue) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Invalid Email Or Password']")));
		
		boolean actualValue = driver.findElement(By.xpath("//strong[text()='Invalid Email Or Password']")).isDisplayed();
		
		Assert.assertEquals(actualValue, expectedValue);
	
		
		return this;
	}
	
	
	public AgentLogin_Page campaign_ErrorAssert(boolean expectedValue) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Unable To Fetch Campaign Data']")));
		
		boolean actualValue = driver.findElement(By.xpath("//strong[text()='Unable To Fetch Campaign Data']")).isDisplayed();
		
		Assert.assertEquals(actualValue, expectedValue,"Campaign Error Message is Not Displayed...!");
		
		return this;
	}
	
	public AgentLogin_Page campaign_Assert(boolean expectedValue) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Select Queue']")));
		
		boolean actualValue = driver.findElement(By.xpath("//div[text()='Select Queue']")).isDisplayed();
		
		Assert.assertEquals(actualValue, expectedValue,"Queue Selection Popup is not displayed..!");
		
		return this;
	}
	
	public AgentLogin_Page queue_ErrorAssert(boolean expectedValue) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Please fill required fields']")));
		
		boolean actualValue = driver.findElement(By.xpath("//span[text()='Please fill required fields']")).isDisplayed();
		
		Assert.assertEquals(actualValue, expectedValue,"Queue Error Message is Not Displayed...!");
		
		return this;
	}
	
	public AgentLogin_Page queue_Logout(boolean expectedValue) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Login']")));
		
		boolean actualValue = driver.findElement(By.xpath("//h3[text()='Login']")).isDisplayed();
		
		Assert.assertEquals(actualValue, expectedValue,"Logout button is not working...!");
		
		return this;
	}
	public AgentLogin_Page queue_Assert(boolean expectedValue) {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Agent Ready Successfully']")));
		
		boolean actualValue = driver.findElement(By.xpath("//strong[text()='Agent Ready Successfully']")).isDisplayed();

		Assert.assertEquals(actualValue, expectedValue,"Agent is not login...!");
		
		return this;
	}
	

}
