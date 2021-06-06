package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver = null;
	@FindBy(id="email")
	private WebElement userName;

	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String text) {
		userName.sendKeys(text);//for email
	}
	public void enterPassword(String text) {
		password.sendKeys(text);//for password
	}
	public void clickLoginButton() {
		loginButton.click();//for login
	}
	public DashboardPage validLogin() {
		enterUserName("kiran@gmail.com");
		enterPassword("123456");
		clickLoginButton();
		return new DashboardPage(driver) ;//navigate to dashboardPage
	}
	
	

	

	/*@FindBys(@FindBy(xpath="//li//span"))
	private List<WebElement> actMenus;
	ArrayList<String> actualSubInfo = new ArrayList<String>();
	public ArrayList<String> getActMenus() {
		for (int i = 0; i < actMenus.size(); i++) {
			actualSubInfo.add(actMenus.get(i).getText());
		}
		return actualSubInfo;
	}
	public boolean validLeftMenu() {
		boolean validLeftMenu = true;
		
		ArrayList<String> expMenus = new ArrayList<String>();
		expMenus.add("Dashboard");
		expMenus.add("Users");
		expMenus.add("Operators");
		expMenus.add("Useful Links");
		expMenus.add("Downloads");
		expMenus.add("Logout");
		//expMenus.add("Login");
		System.out.println("print expected data::" + expMenus);
		
		if(actMenus==null || actMenus.size()==0) {
			validLeftMenu = false;
		} else {
			System.out.println(actMenus);
			
			for (int i = 0; i < expMenus.size(); i++) {
				if(!actMenus.contains(expMenus.get(i))) {
					validLeftMenu = false;
				}
				break;
			}
		}
		
		
		
		return validLeftMenu;
	}*/
}