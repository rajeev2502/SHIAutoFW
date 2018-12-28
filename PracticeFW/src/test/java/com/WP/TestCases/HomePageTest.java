package com.WP.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WP.Base.WPCore;
import com.WP.Pages.HomePage;
import com.WP.Pages.LoginPage;
import com.WP.Utilities.CommonUtils;

public class HomePageTest extends WPCore {

	HomePage HPObj;
	CommonUtils Util;
	LoginPage LPObj;

	HomePageTest() {
		super();
		System.out.println("calling WPCore constructor to load properties");
	}

	@BeforeMethod
	public void setup() {
		initialize();
		System.out.println("Calling initialize() to launch browser!!!");
		HPObj = new HomePage();
	}

	@Test(priority = 1, enabled = true)
	public void verifyHomePageTitle() {
		String title = HPObj.getHomePageTitle();
		Assert.assertEquals(title, "Shiseido | DEV-382");
	}

	@Test(priority = 2, enabled = true)
	public void verifyHomePageLogo() {
		HPObj.verifySHILogo();
	}

	@Test(priority = 3, enabled = true)
	public void verifyHomePageSearch() {
		HPObj.verifySearch();
	}

	@Test(priority = 4, enabled = true)
	public void verifyHomePageHeader() {
		Assert.assertTrue(HPObj.verifyHeaderUtils());
	}

	@Test(priority = 5, enabled = true)
	public void verifyHomePageFooter() {
		Util = new CommonUtils();
		Util.scrollDown();
		Util.scrollDown();
		Assert.assertTrue(HPObj.verifyFooterElements());
	}

	@Test(priority = 6, enabled = true)
	public void SHISignIn() {
		LPObj = HPObj.LoginToShiAccount();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
