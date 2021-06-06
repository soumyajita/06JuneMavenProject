package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver driver=null;
	
	@FindBy(xpath = "//h1")
	private WebElement heading;

	@FindBy(xpath = "//span[text()='Users']")
	private WebElement userBtn;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public UsersPage clickUser() {
		userBtn.click();
		return new UsersPage(driver);//navigate to usersPage
	}

}
