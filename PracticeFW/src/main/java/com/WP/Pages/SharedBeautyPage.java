	package com.WP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WP.Base.WPCore;

public class SharedBeautyPage extends WPCore{
	
	@FindBy(xpath="//div[contains(@class,'sharedbeauty-intro')]/descendant::h3")
	WebElement LBLSharedBeauty;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[1]")
	WebElement LNKShrBeauty1;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[2]")
	WebElement LNKShrBeauty2;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[3]")
	WebElement LNKShrBeauty3;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[4]")
	WebElement LNKShrBeauty4;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[5]")
	WebElement LNKShrBeauty5;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[6]")
	WebElement LNKShrBeauty6;
	
	@FindBy(xpath="(//ul[contains(@class,'ShareBeauty-pageitems-list')]/descendant::a)[7]")
	WebElement LNKShrBeauty7;

	@FindBy(xpath="//div[contains(@id,'inline-video')]")
	WebElement LNKMainVideo;
	
	@FindBy(xpath="//div[contains(@class,'row sharedbeauty-discover')]/descendant::img")
	WebElement IMGShrBeautyDiscover;
	
	@FindBy(xpath="(//a[contains(@title,'Account sign in or sign up')])[1]")
	WebElement LNKSHISignIn;

	//Initialize the page ORs
	public SharedBeautyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getShrBeautyPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean VerifySharedBeautyLabel()
	{
		return LBLSharedBeauty.isDisplayed();
		/*LNKShrBeauty1.isDisplayed();
		LNKShrBeauty7.isDisplayed();
		LNKMainVideo.isDisplayed();
		IMGShrBeautyDiscover.isDisplayed();
*/		
	}
	
	public LoginPage GoToSignIn()
	{
		LNKSHISignIn.click();
		return new LoginPage();
	}
	
}
