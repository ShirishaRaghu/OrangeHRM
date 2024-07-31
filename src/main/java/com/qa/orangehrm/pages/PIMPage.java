package com.qa.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangehrm.utils.ElementUtil;

public class PIMPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// pageclass

	// 1.privtae loctaors
	private By addEmp = By.xpath("//a[text()='Add Employee']");
	private By fullName = By.xpath("//input[@placeholder='First Name']");
	private By midName = By.xpath("//input[@placeholder='Middle Name']");
	private By lastName = By.xpath("//input[@placeholder='Last Name']");
	private By empList = By.xpath("//a[text()='Employee List']");
	private By empId = By.xpath(
			"//div[@class='oxd-input-group oxd-input-field-bottom-space']//div/input[@class='oxd-input oxd-input--active']");
	private By save = By.xpath("//button[@type='submit']");
	
	
	// constr
	public PIMPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// Test methods/objects
	public String doPimPageTitleTest() {
		String actTitle = eleUtil.waitForTitleIs("OrangeHRM", 5);
		System.out.println("Pim Page title is : " + actTitle);
		return actTitle;
	}

	public String doPimPageUrlTest() {
		String actUrl = eleUtil.waitForURLContains("pim/viewEmployeeList", 5);
		System.out.println("Pim Page title is : " + actUrl);
		return actUrl;
	}

	public PersonalDetailsPage addEmpDetails() throws InterruptedException {
		Thread.sleep(1000);
		eleUtil.doClick(addEmp, 5);
		eleUtil.doSendkeys(fullName, "Huja", 5);
		eleUtil.doSendkeys(midName, "ty", 5);
		eleUtil.doSendkeys(lastName, "k", 5);
		eleUtil.doSendkeys(empId, "4568", 5);
		eleUtil.doClick(save);

		return new PersonalDetailsPage(driver);

	}

	
}
