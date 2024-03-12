package org.dooctiadmin.page;

import org.doocti.seleniumbase.DooctiAdminBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class LoginPage extends DooctiAdminBase{

	public LoginPage(RemoteWebDriver driver) {

		this.driver = driver;

	}





	//Locators

	public boolean getUserNameLable(){

		return driver.findElement(By.xpath("(//div[contains(@class,'v-input v-text-field')])[1]")).isDisplayed();

	}

	public boolean getPasswordLabel(){

		return driver.findElement(By.xpath("(//div[contains(@class,'v-input v-text-field')])[2]")).isDisplayed();
	}

	public boolean getLoginButton(){

		return driver.findElement(By.xpath("//div[text()='Login']")).isDisplayed();
	}
	

	//Actions

	/**
	 * @param userName - pass the user name for login
	 * @return 
	 */

	public LoginPage enterUsername(String userName) {

		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(userName);
		return this;
	}

	/**
	 * @param Password - pass the user password for login
	 * @return 
	 */

	public LoginPage enterPassword(String pass) {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		return this;


	}


	public DashboardPage clickLogin() {

		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		boolean flag = driver.findElement(By.xpath("//div[text()='Dash Board']")).isDisplayed();
		
		Assert.assertTrue(flag);
		
		return new DashboardPage();
	}


	/**
	 * This function is used to Login 
	 * @param userName
	 * @param pass
	 */

	public void login(String userName, String pass) {

		enterUsername(userName);
		enterPassword(pass);
		clickLogin();
	}


}
