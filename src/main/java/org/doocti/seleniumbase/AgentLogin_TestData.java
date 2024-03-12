package org.doocti.seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AgentLogin_TestData {
	
	
	protected RemoteWebDriver driver = null;
	
	String URL = "https://web-v2.doocti.com/v2.1.106/";
	
	@BeforeTest
	public void Setup() {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
	
		driver.get(URL);
	}
	
	@AfterTest
	public void Quit() {
		
//		driver.quit();
	}

	@DataProvider (name= "Tc01Data")
	public String[][] Tc01data() {
		
		String [][]logindata = new String[1][2];
		
		logindata[0][0] ="developv2_agent04@doocti";
		logindata[0][1] ="Doocti@123";
		
		
		return logindata;
		
	}
	
	@DataProvider (name= "Tc02Data")
	public String[][] Tc02data() {
		
		String [][]logindata = new String[1][2];
		
		logindata[0][0] ="developv2_agent04@";
		logindata[0][1] ="Doocti@123";
		
		return logindata;
		
	}
	
	@DataProvider (name= "Tc03Data")
	public String[][] Tc03data() {
		
		String [][]logindata = new String[1][2];
		
		logindata[0][0] ="developv2_agent04";
		logindata[0][1] ="Doocti@123";
		
		
		return logindata;
		
	}
	
	@DataProvider (name= "Tc04Data")
	public String[][] Tc04data() {
		
		String [][]logindata = new String[1][2];
		
		logindata[0][0] ="developv2_agent00@doocti.com";
		logindata[0][1] ="Doocti@123";
		
		
		
		return logindata;
		
	}
	
	@DataProvider (name= "Tc05Data")
	public String[][] Tc05data() {
		
		String [][]logindata = new String[1][2];
		
		logindata[0][0] ="developv2_agent04@doocti.com";
		logindata[0][1] ="doocti@123";
		
		
		
		return logindata;
		
	}
	
	@DataProvider (name= "Tc06Data")
	public String[][] Tc06data() {
		
		String [][]logindata = new String[1][4];
		
		logindata[0][0] ="developv2_agent04@doocti.com";
		logindata[0][1] ="Doocti@123";
		logindata[0][2] ="Preview Campaign";
		logindata[0][3] ="developv2_8633537660";
		
		
		return logindata;
		
	}
}
