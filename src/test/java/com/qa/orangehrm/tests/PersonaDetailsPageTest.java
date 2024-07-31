package com.qa.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.orangehrm.base.BaseTest;

public class PersonaDetailsPageTest extends BaseTest{


	@BeforeClass
	public void pimPage() {
		dashboardPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}


	@Test
	public void personalDetailsPageURLTest() throws InterruptedException {
		pimPage = dashboardPage.doClickOnPim();
		personalDetPage = pimPage.addEmpDetails();
		String actURL = personalDetPage.getURL();
		Assert.assertTrue(actURL.contains("viewPersonalDetails/empNumber"));

	}



    @Test
    public void personalDetailsTest() throws InterruptedException {
    	personalDetPage.personalDetails();
    	personalDetPage.expiryDate();
    }











}
