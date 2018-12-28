package com.WP.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WP.Base.WPCore;
import com.WP.Pages.LoginPage;
import com.WP.Pages.SharedBeautyPage;

public class SHISharedBeautyPageTest extends WPCore {

	SharedBeautyPage SBPObj;
	LoginPage LPObj;

	public SHISharedBeautyPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		SBPObj = new SharedBeautyPage();

	}

	@Test(priority = 1)
	public void ValidateSharedBeautyPageTitle() {
		String title = SBPObj.getShrBeautyPageTitle();
		Assert.assertEquals(title, "Sites-shiseido_ca-Site | DEV-382");
	}

	@Test(priority = 2)
	public void VerifySharedBeautyPageLabel() {
		boolean labelDisplayed = SBPObj.VerifySharedBeautyLabel();
		Assert.assertTrue(labelDisplayed);
	}

	@Test(priority = 3)
	public void AccessLoginPage() {
		LPObj = SBPObj.GoToSignIn();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
