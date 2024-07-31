package com.qa.orangehrm.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.orangehrm.factory.DriverFactory;
import com.qa.orangehrm.pages.DashboardPage;
import com.qa.orangehrm.pages.LoginPage;
import com.qa.orangehrm.pages.PIMPage;
import com.qa.orangehrm.pages.PersonalDetailsPage;

public class BaseTest {
	
	WebDriver driver;
	protected Properties prop;
	DriverFactory df;
	
	protected LoginPage loginpage;
	protected DashboardPage dashboardPage;
	protected PIMPage pimPage;
	protected PersonalDetailsPage personalDetPage;
		
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.initProp();
		
		driver = df.initDriver(prop);//call by refernece (prop)
		loginpage = new LoginPage(driver);
	}

	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}

	
	
}
