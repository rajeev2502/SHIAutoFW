package com.WP.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WP.Base.WPCore;
import com.WP.Pages.HomePage;

public class SHIHomePageTest extends WPCore{
	
	
	HomePage HPObj;
	
	public SHIHomePageTest()
	{
		super();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		initialize();
		HPObj = new HomePage();

	}
	
	@Test(priority = 0)
	public void verifyNARSLogo()
	{
		 Assert.assertTrue(HPObj.verifySHILogo());
	}
	
	@Test(priority = 1)
	public void verifyHeaderItems()
	{
		Assert.assertTrue(HPObj.verifyHeaderUtils());
		
	}
	
	@Test(priority = 2)
	public void verifyFooterItems()
	{
		Assert.assertTrue(HPObj.verifyFooterElements());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
