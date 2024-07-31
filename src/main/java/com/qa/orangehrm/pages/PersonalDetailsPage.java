package com.qa.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.orangehrm.utils.ElementUtil;

public class PersonalDetailsPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

//private locators
	private By personalDet = By.xpath("//h6[text()='Personal Details']");
	private By otherId = By
			.xpath("//label[text()='Other Id']/../following-sibling::div//input[@class='oxd-input oxd-input--active']");
	private By licenseNumber = By.xpath(
			"//label[contains(text(),'License Number')]/../following-sibling::div//input[@class='oxd-input oxd-input--active']");
	private By expiryDate = By.xpath(
			"//label[contains(text(),'Expiry Date')]/../following-sibling::div//input[@placeholder='yyyy-dd-mm']");
	private By nationality = By.xpath(
			"//label[text()='Nationality']/../following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']");
	private By maritalStatus = By.xpath(
			"//label[text()='Marital Status']/../following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']");
	private By dob = By
			.xpath("//label[contains(text(),'Date of')]/../following-sibling::div//input[@placeholder='yyyy-dd-mm']");
	private By maleRadio = By.xpath("//input[@value='1']");
	private By femaleRadio = By.xpath("//input[@value='2']");
	private By submitButton = By.xpath("(//button[@type='submit'])[1]");

	
	
	
	// constrc
	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

//methods
	
	
	
	public String getURL() {
		String url =eleUtil.waitForURLContains("viewPersonalDetails/empNumber", 5);
		System.out.println(url);
		return url;
	}
	
	
	
	
	
	public void personalDetails() {
		eleUtil.doSendkeys(otherId, "5684", 10);
		eleUtil.doSendkeys(licenseNumber, "2346", 5);

	}

	public void expiryDate() throws InterruptedException {
	    Thread.sleep(1000);
		eleUtil.doClick(expiryDate, 5);
		

	}
	
//	public void calendarExpiry() {
//		While();;
//	}

}
