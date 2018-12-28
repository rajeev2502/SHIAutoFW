package com.WP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WP.Base.WPCore;

public class HomePage extends WPCore {

	@FindBy(xpath = "//div[contains(@class,'column primary-logo')]/descendant::a")
	@CacheLookup
	WebElement SHILogo;

	@FindBy(xpath = "//div[@id='modal-cntr']/button")
	WebElement CloseEmailPopup;

	@FindBy(xpath = "(//span[contains(@class,'icon-search')])[1]")
	@CacheLookup
	WebElement ShiSearchBTN;

	@FindBy(xpath = "//input[contains(@placeholder,'What are you looking for?')]")
	@CacheLookup
	WebElement SearchInnerText;

	@FindBy(xpath = "//input[contains(@id,'q')]")
	@CacheLookup
	WebElement SearchTextBox;

	// PrimaryCategory =
	// xpath:://ul[@class='level-1']//li[contains(@class,'as-sub-menu')]/a[contains(text(),'{{PrimaryCategory}}')]
	// PrimaryCategoryL2 =
	// xpath::(//div[@class='level-2']//ul//li[contains(@class,'level-2-link')]/a[contains(text(),'{{PrimaryCategoryL2}}')])[1]
	// SecondaryCategory =
	// xpath::(//ul[contains(@class,'level-3')]//li//a[contains(text(),'{{SecondaryCategory}}')])[1]

	@FindBy(xpath = "//a[@title='Account sign in or sign up' or @class='utility-link login float-right']")
	@CacheLookup
	WebElement SignInLink;

	@FindBy(xpath = "//*[@id='minimized-header-container']//a[contains(@class,'utility-link contact float-right')]")
	@CacheLookup
	WebElement ContactUsIcon;

	@FindBy(xpath = "//*[@id='minimized-header-container']//a[contains(@class,'utility-link stores float-right')]")
	@CacheLookup
	WebElement StoreLocatorIcon;

	@FindBy(xpath = "//a[contains(@class,'utility-link newsletter')]")
	@CacheLookup
	WebElement NewLetterLink;

	@FindBy(xpath = "//*[@id='mini-cart']")
	@CacheLookup
	WebElement MiniCartIcon;

	@FindBy(xpath = "//div[contains(@class,'footer-links')]/descendant::a[contains(@href,'http://group.shiseido.com/')]")
	@CacheLookup
	WebElement LNKAboutShi;

	@FindBy(xpath = "//div[contains(@class,'footer-links')]/descendant::a[contains(@href,'http://shiseido.taleo.net/careersection/shiseidomain/jobsearch')]")
	@CacheLookup
	WebElement LNKCareers;

	@FindBy(xpath = "//div[contains(@class,'footer-links')]/descendant::a[contains(@href,'https://dev33.shiseido.ca/customer-service.html')]")
	@CacheLookup
	WebElement LNKLNKCustSupport;

	@FindBy(xpath = "//div[contains(@class,'footer-links')]/descendant::a[contains(@href,'https://dev33.shiseido.ca/on/demandware.store/Sites-shiseido_ca-Site/en_CA/CustomerService-ContactUs')]")
	@CacheLookup
	WebElement LNKContactUs;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifySHILogo() {
		return SHILogo.isDisplayed();
	}

	public void goToHomePage() {
		if (SHILogo.isDisplayed()) {
			SHILogo.click();
		}
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyHeaderUtils() {
		ContactUsIcon.isDisplayed();
		StoreLocatorIcon.isDisplayed();
		NewLetterLink.isDisplayed();
		SignInLink.isDisplayed();
		MiniCartIcon.isDisplayed();
		return true;
	}

	public boolean verifyFooterElements() {
		LNKAboutShi.isDisplayed();
		LNKCareers.isDisplayed();
		LNKLNKCustSupport.isDisplayed();
		LNKContactUs.isDisplayed();
		return true;
	}

	public void verifySearch() {
		SearchTextBox.isDisplayed();
		ShiSearchBTN.isDisplayed();
		SearchInnerText.isDisplayed();
	}

	public void search(String searchItem) {
		SearchTextBox.sendKeys(searchItem);
		ShiSearchBTN.click();
	}

	public LoginPage LoginToShiAccount() {
		SignInLink.click();
		return new LoginPage();
	}

}
