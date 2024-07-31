package com.qa.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseTest;

public class DashboardPageTest extends BaseTest {

	@BeforeClass
	public void dashboardSetup() {
		dashboardPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void dashBoardPageTitleTest() {
		String actTitle = dashboardPage.getDashboardPageTitle();
		Assert.assertEquals(actTitle, "OrangeHRM");
	}
	
	@Test
	public void dashBoardPageUrlTest() {
		String actURL = dashboardPage.getDashboardPageUrl();
		Assert.assertTrue(actURL.contains("dashboard/index"));
	}
	
	
	@Test
	public void getPimPage() {
		dashboardPage.doClickOnPim();
		}

	

}
