package org.doocti.seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Trail_Base {
	
	protected RemoteWebDriver driver = null;
	
	String URL ="https://console-v2.doocti.com/v2.1.106/auth/login";
	
	
	@BeforeTest
	public void Setup() {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");
		
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(URL);
	}	
	
	@DataProvider(name = "Trail_Data")
	public String[][] getData() {
		
		String [][]data = new String [1][2];
		
		data[0][0] ="developv2_admin@doocti.com";
		data[0][1] ="Doocti@123";
		
		return data;
	}
	



}
