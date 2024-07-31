package com.qa.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangehrm.utils.ElementUtil;

public class DashboardPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//pageclass
	
	//1.privtae loctaors
	private By pimPage = By.xpath("//span[text()='PIM']");
	
	
	//constr
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}

	
	//page objects/methods
	public String getDashboardPageTitle() {

		String actTitle = eleUtil.waitForTitleIs("OrangeHRM", 5);

		System.out.println("dashboard page title : " + actTitle);
		return actTitle;
	}
	
	public String getDashboardPageUrl() {
		String url = eleUtil.waitForURLContains("dashboard/index", 5);
		System.out.println("dashboard url : " + url);
		return url;
	}

	public PIMPage doClickOnPim() {
		eleUtil.doClick(pimPage,5);
		return new PIMPage(driver);
	}
}
