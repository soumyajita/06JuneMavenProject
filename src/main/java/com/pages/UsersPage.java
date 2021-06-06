package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	WebDriver driver = null;

	
		public UsersPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//span[text()='Operators']")
		private WebElement operatorButton;
		
		public OperatorsPage clickOperator() {
			operatorButton.click();
			return new OperatorsPage(driver);
		}
	}


