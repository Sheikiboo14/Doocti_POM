package org.doocti.seleniumbase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DooctiAgentBase {

	protected RemoteWebDriver driver = null ;

	WebDriverWait wait = null;

	String URL = "https://web-v2.doocti.com/v2.1.106/";

	String userEmail ="developv2_agent04@doocti.com";

	String userPassword ="Doocti@123";

	String campaign ="Preview Campaign";

	String queueName ="developv2_8633537660";

	@BeforeTest
	public void Setup() {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("use-fake-ui-for-media-stream","--incognito");

		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

		driver.get(URL);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userEmail);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(userPassword);

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[text()='Select Campaign']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+campaign+"']")));

		driver.findElement(By.xpath("//div[text()='"+campaign+"']")).click();

		driver.findElement(By.xpath("//button[text()='Submit']")).click();


		wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[text()='Please Select']/following-sibling::div")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='"+queueName+"']")));

		driver.findElement(By.xpath("//div[text()='"+queueName+"']")).click();

		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}


	@DataProvider(name="LeadData")
	public String[][] leaddata() {

		String[][] leaddata= new String[1][12];

		leaddata[0][0] = "Test Lead4";
		leaddata[0][1] = "Testing";
		leaddata[0][2] = "9514380497";
		leaddata[0][3] = "test@gmail.com";
		leaddata[0][4] = "Tevatel Company";
		leaddata[0][5] = "124";
		leaddata[0][6] = "Test Tag";
		leaddata[0][7] = "9087654321";
		leaddata[0][8] = "Callssss";
		leaddata[0][9] = "testing";
		leaddata[0][10] = " Lead Information";
		leaddata[0][11] = "NOT INTERESTED";


/*
		leaddata[1][0] = "Test Lead5";
		leaddata[1][1] = "Testing";
		leaddata[1][2] = "9514380497";
		leaddata[1][3] = "test@gmail.com";
		leaddata[1][4] = "Tevatel Company";
		leaddata[1][5] = "124";
		leaddata[1][6] = "Test Tag";
		leaddata[1][7] = "9514380497";
		leaddata[1][8] = "Callssss";
		leaddata[1][9] = "testing";
		leaddata[1][10] = " Lead Information";
		leaddata[1][11] = "NOT INTERESTED";



		leaddata[2][0] = "Test Lead6";
		leaddata[2][1] = "Testing";
		leaddata[2][2] = "9514380497";
		leaddata[2][3] = "test@gmail.com";
		leaddata[2][4] = "Tevatel Company";
		leaddata[2][5] = "124";
		leaddata[2][6] = "Test Tag";
		leaddata[2][7] = "9087654321";
		leaddata[2][8] = "Callssss";
		leaddata[2][9] = "testing";
		
		leaddata[2][10] = " Lead Information";
		leaddata[2][11] = "NOT INTERESTED";

*/



		return leaddata;
	}

	@DataProvider(name="ContactData")
	public String[][] contactdata() {

		String [][]contactdata = new String[1][4];

		contactdata[0][0] = "Test Contact";
		contactdata[0][1] = "9514380497";
		contactdata[0][2] = " Contact Details";
		contactdata[0][3] = "NOT INTERESTED";


		return contactdata;


	}	
	
	@DataProvider(name="MeetingData")
	public String[][] meetingdata() {

		String [][]meetingdata = new String[1][10];

		meetingdata[0][0] = "Decision-making meeting";
		meetingdata[0][1] = "9514380497";
		meetingdata[0][2] = "lead";
		meetingdata[0][3] = "23";
		meetingdata[0][4] = "00";
		meetingdata[0][5] = "Testing";
		meetingdata[0][6] = "15";
		
		meetingdata[0][7] ="Create Meeting";
		meetingdata[0][8] ="Upcoming";
		meetingdata[0][9] ="NOT INTERESTED";


		return meetingdata;


	}	

	@DataProvider(name="TicketData")
	public String[][] tiketdata() {

		String [][]tiketdata = new String[1][10];

		tiketdata[0][0] = "Open";
		tiketdata[0][1] = "Bug6";
		tiketdata[0][2] = "Testing";
		tiketdata[0][3] = "Testing";
		tiketdata[0][4] = "9514380497";
		tiketdata[0][5] = "Medium";
		tiketdata[0][6] = "Test";
		tiketdata[0][7] = "15";
		
		tiketdata[0][8] ="Create New Ticket";
		tiketdata[0][9] ="NOT INTERESTED";



		return tiketdata;


	}	
	
	@DataProvider(name="CallData")
	public String[][] calldata() {
		
		String [][]calldata = new String[1][3];
		
		calldata[0][0] = "9514380497";
		calldata[0][1] = "NOT INTERESTED";
		calldata[0][2] = "testing";
		
		return calldata;
	}


}
