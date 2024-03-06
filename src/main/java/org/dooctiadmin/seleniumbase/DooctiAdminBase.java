package org.dooctiadmin.seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DooctiAdminBase {


	protected RemoteWebDriver driver = null;

	String URL ="https://console-v2.doocti.com/v2.1.106/auth/login";

	String email ="developv2_admin@doocti.com";

	String password ="Doocti@123";

	@BeforeTest
	public void startApp()  {



		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--incognito");

		driver = new ChromeDriver(option);


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(URL);

		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys(email);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

		driver.findElement(By.xpath("//div[text()='Login']")).click();




	}

	@AfterTest
	public void browserQuit() {

		//		driver.quit();
	}


	// Portal Data's
	/*	
	@DataProvider(name ="LoginData")
	public String[][] getData(){

		String[][] data = ReadExcel.getExcelData("Login_TestData");


		return data;

	}
	 */

	@DataProvider(name ="QueueData")
	public String[][] queueData() {

		String [][]qdata = new String [1][4];

		qdata[0][0] ="Test";
		qdata[0][1] = "3";
		qdata[0][2]="1";
		qdata[0][3]="25";


		return qdata;
	}

	@DataProvider(name = "DispoData")
	public String[][] dispoData() {

		String [][] ddata = new String[1][5];

		ddata[0][0]="Test Dispo";
		ddata[0][1]="Testing Purpose";
		ddata[0][2] ="3";
		ddata[0][3] ="1";
		ddata[0][4] ="Inactive";

		

		return ddata;

	}

	@DataProvider(name = "SubDispoData")
	public String[][] subdispoData() {

		String [][] sddata = new String[1][6];

		sddata[0][0]="Test Dispo";
		sddata[0][1]="Demo";
		sddata[0][2]="Testing Purpose";
		sddata[0][3] ="3";
		sddata[0][4] ="2";
		sddata[0][5] ="Inactive";


		return sddata;

	}

	@DataProvider(name = "TicketStatusData")
	public String[][] ticketStatusData() {

		String [][] tsdata = new String[1][4];

		tsdata[0][0]="Test Status";
		tsdata[0][1]="Demo";
		tsdata[0][2]="3";
		tsdata[0][3]="1";

		return tsdata;

	}

	@DataProvider(name = "PausecodeData")
	public String[][] pausecodeData() {

		String [][] pcdata = new String[1][6];

		pcdata[0][0]="Test Status";
		pcdata[0][1]="Demo";
		pcdata[0][2]="0";
		pcdata[0][3]="30";
		pcdata[0][4]="4";
		pcdata[0][5]="1";


		return pcdata;

	}

	@DataProvider(name = "AudioData")
	public String[][] audioData() {

		String [][] audiodata = new String[1][2];

		audiodata[0][0]="Testing";
		audiodata[0][1]="D:\\Testing File\\demo1.mp3";

		return audiodata;

	}

	@DataProvider(name = "BlocklistData")
	public String[][] blocklistData() {

		String [][]blocklistdata = new String[1][2];

		blocklistdata[0][0]= "D:\\Testing File\\sample_blocklist.csv";
		blocklistdata[0][1]= "1";
		
		return blocklistdata;

	}

	@DataProvider(name = "DidData")
	public String[][] didData() {

		String [][]diddata = new String[1][4];

		diddata[0][0]= "9876543210";
		diddata[0][1] ="Test purpose";
		diddata[0][2] ="4";
		diddata[0][3] ="2";

		return diddata;

	}

	@DataProvider(name = "TagData")
	public String[][] tagData() {

		String [][]tagdata = new String[1][4];

		tagdata[0][0]= "Testing";
		tagdata[0][1] ="Test purpose";
		tagdata[0][2] ="3";
		tagdata[0][3] ="1";


		return tagdata;

	}

	@DataProvider(name = "AnnouncementData")
	public String[][] announcementData() {

		String [][]announcementdata = new String[1][5];

		announcementdata[0][0]= "Testing";
		announcementdata[0][1] ="Test purpose";
		announcementdata[0][2] ="Preview Campaign";
		announcementdata[0][3] ="3";
		announcementdata[0][4] ="1";
		
		return announcementdata;

	}

	@DataProvider(name = "ScriptData")
	public String[][] scriptData() {

		String [][]scriptdata = new String[1][7];

		scriptdata[0][0]= "Testing";
		scriptdata[0][1] ="Test purpose";
		scriptdata[0][2] ="https://console-v2.doocti.com/v2.1.106/configurations/Script";
		scriptdata[0][3] ="Hello Tevatel";
		scriptdata[0][4] ="Text";
		scriptdata[0][5] ="3";
		scriptdata[0][6] ="1";
		
		return scriptdata;

	}

	@DataProvider(name = "InboundData")
	public String[][] inboundData() {

		String [][]inbounddata = new String[1][6];

		inbounddata[0][0]= "123";
		inbounddata[0][1] ="Testing";
		inbounddata[0][2] ="queue";
		inbounddata[0][3] ="QA";
		inbounddata[0][4] ="3";
		inbounddata[0][5] ="1";



		return inbounddata;

	}

	@DataProvider(name = "TimezoneData")
	public String[][] timezoneData() {

		String [][]timezonedata = new String[1][9];

		timezonedata[0][0]= "Test";
		timezonedata[0][1] ="Testing";
		timezonedata[0][2] ="0";
		timezonedata[0][3] ="05";
		timezonedata[0][4] ="11";
		timezonedata[0][5] ="00";
		timezonedata[0][6] ="Active";
		timezonedata[0][7] ="5";
		timezonedata[0][8] ="1";



		return timezonedata;

	}

	@DataProvider(name = "MeetingTitleData")
	public String[][] meetingtitleData() {

		String[][] meetingtitledata = new String[1][5];

		meetingtitledata[0][0] ="Test Title";
		meetingtitledata[0][1] ="Testing";
		meetingtitledata[0][2] ="Testing Purpose";
		meetingtitledata[0][3] ="4";
		meetingtitledata[0][4] ="1";
		
		
		return meetingtitledata;
	}
	
	// Data's for Users and Groups
	
	@DataProvider(name= "UserGroupData")
	public String[][] usergroupData() {
		
		String[][] usergroupdata = new String[1][1];
		
		usergroupdata[0][0] = "Testing";
		
		
		return usergroupdata;
	}
	
	@DataProvider(name= "UserData")
	public String[][] userData() {
		
		String[][] userdata = new String[1][8];
		
		userdata[0][0] = "developv2_agent10@doocti.com";
		userdata[0][1] = "Testing Purpose";
		userdata[0][2] = "376";
		userdata[0][3] = "developv2_agent12@doocti.com";
		userdata[0][4] = "Doocti@123";
		userdata[0][5] = "Agent";
		userdata[0][6] = "Testing";
		userdata[0][7] = "3";

		
		
		
		return userdata;
	}
	
	@DataProvider(name = "ChannelData")
	public String[][] channelData() {
		
		String [][] channeldata = new String[1][3];
		
		channeldata[0][0] ="Test Channel";
		channeldata[0][1] ="Channel Description";
		channeldata[0][2] ="1";

		
		return channeldata;
	}
	
	@DataProvider(name = "SourceData")
	public String[][] sourceData() {
		
		String [][] sourcedata = new String[1][3];
		
		sourcedata[0][0] ="Test Source";
		sourcedata[0][1] ="Source Description";
		sourcedata[0][2] ="1";
		
		return sourcedata;
	}
	
	@DataProvider(name = "TeamData")
	public String[][] teamData() {
		
		String [][] teamData = new String[1][8];
		
		teamData[0][0] ="Test Team";
		teamData[0][1] ="Team Description";
		teamData[0][2] ="Lead Source";
		teamData[0][3] ="Test Source";
		teamData[0][4] ="Test Channel";
		teamData[0][5] ="Preview Campaign";
		teamData[0][6] ="developv2_agent02@doocti.com";
		teamData[0][7] ="1";

		
		return teamData;
	}
	
	
	
}
