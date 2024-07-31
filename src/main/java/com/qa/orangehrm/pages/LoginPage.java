package com.qa.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangehrm.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// Page class/page library

	// 1.private by locators
	private By usernameLocator = By.xpath("//input[@placeholder='Username']");
	private By passwordLocator = By.name("password");
	private By loginBtn = By.xpath("//button[@type='submit']");
	private By forgotpwd = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	

	// 2.page class constru.....

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// 3.public actions/methods
	public String getLoginPageTitle() {

		String actTitle = eleUtil.waitForTitleIs("OrangeHRM", 5);

		System.out.println("login page title : " + actTitle);
		return actTitle;
	}

	public String getLoginPageUrl() {
		String url = eleUtil.waitForURLContains("auth/login", 5);
		System.out.println("loginpage url : " + url);
		return url;
	}

//	public boolean isForgotPasswordExist() {
//		return eleUtil.isElementDisplayed(forgotpwd);
//	}

	public DashboardPage doLogin(String user, String pwd)  {
		System.out.println("username : " + user + " pwd :" + pwd);
		
		eleUtil.waitForElementVisible(usernameLocator, 10).sendKeys(user);
	
		eleUtil.doSendkeys(passwordLocator, pwd);
		eleUtil.doClick(loginBtn);
		return new DashboardPage(driver);
	}

	//// p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']

}
