package org.dooctiadmin.page;

import org.dooctiadmin.seleniumbase.Trail_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login_Page extends Trail_Base {

	
//	RemoteWebDriver driver = null;
	
	public Login_Page (RemoteWebDriver driver) {
		
		this.driver = driver;
		
	}
	
	/**
	 * Locator
	 */
	
	
	
	
	/**
	 * Actions
	 * @return 
	 */
	
	public Login_Page enterUserName(String email) {
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(email);
		
		return this;
		
		
	}
	
	public Login_Page enterPassword(String password) {
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		return this;

	}
	
	public Login_Page clickLogin() {
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		return this;

	}
	
	public void AdminLogin(String email, String password) {
		
		enterUserName(email);
		enterPassword(password);
		clickLogin();
	}
}
