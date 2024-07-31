package com.qa.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseTest;
import com.qa.orangehrm.pages.DashboardPage;

public class LoginPageTest extends BaseTest{

	
	
	
	@Test(priority = 1)
	public void loginPageTitle() {
		
		String actTitle = loginpage.getLoginPageTitle();
        Assert.assertEquals(actTitle,  "OrangeHRM");	
	}
	
	@Test(priority = 2)
	public void loginPageURLTest() {
		String url = loginpage.getLoginPageUrl();
		Assert.assertTrue(url.contains("/auth/login"));;
	}
	
	
	
//	@Test(priority = 4@Test(priority = 3)
//	public void forgotPWDLinkExist()  {
//		Assert.assertTrue(loginpage.isForgotPasswordExist());
//	})
	
	@Test(priority = 3)
	public void login() {
	dashboardPage =loginpage.doLogin("Admin", "admin123");
		Assert.assertTrue(dashboardPage.getDashboardPageUrl().contains("dashboard/index"));
	}
	
	
	
}
