package com.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashBoardTest extends TestBase {
	WebDriver driver = null;
	DashboardPage dp = null;
	@Test
		public void dashBoard() {
			driver = initializtion();
			LoginPage lp = new LoginPage(driver);
			
			dp = lp.validLogin();
			System.out.println(driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
			
			

		}
	}


