package com.WP.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.WP.Base.WPCore;

public class CustomEventListener extends WPCore implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before launching URL" + url );
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After launching URL" + url);

	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before finding element " + element);
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After finding element " + element);

	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before Clicking on WebElement " + element);
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Clicking on WebElement " + element);
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Alert # EXCEPTION OCCURED...");
		try {
			CommonUtils.captureScreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
