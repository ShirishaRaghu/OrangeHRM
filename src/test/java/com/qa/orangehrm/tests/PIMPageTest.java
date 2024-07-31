package com.qa.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseTest;

public class PIMPageTest extends BaseTest {

	@BeforeClass
	public void pimPage() {
		dashboardPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

//	public void getPimPageTitle() {
//		pimPage = dashboardPage.doClickOnPim();
//		String title = pimPage.doPimPageTitleTest();
//		Assert.assertEquals(title, "OrangeHRM");
//	}

	@Test
	public void addEmpDetTest() throws InterruptedException {
		pimPage = dashboardPage.doClickOnPim();
		personalDetPage = pimPage.addEmpDetails();
		Assert.assertTrue(personalDetPage.getURL().contains("viewPersonalDetails/empNumber"));
	}

	}
