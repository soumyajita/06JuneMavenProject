package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.OperatorsPage;
import com.pages.UsersPage;


	public class LoginTest extends TestBase {
		WebDriver driver = null;
		DashboardPage dp = null;
		UsersPage up = null;
		OperatorsPage op = null;
		@Test
		public void test01() {
			driver = initializtion();
			LoginPage lp = new LoginPage(driver);
			dp = lp.validLogin();
			//up = dp.clickUser();
			//op = up.clickOperator();
			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
		
		
		
	}

	

