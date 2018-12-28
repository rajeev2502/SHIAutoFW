package com.WP.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.WP.Utilities.CommonUtils;
import com.WP.Utilities.CustomEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WPCore {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver eventDriver;
	public static CustomEventListener custListener;

	public WPCore() {
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("D:\\PracticeFW\\src\\main\\java\\com\\WP\\Config\\Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialize() {
		try {
			String useBrowser = prop.getProperty("BROWSER");
			if (useBrowser.toLowerCase().equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (useBrowser.toLowerCase().equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (useBrowser.toLowerCase().equals("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}

			eventDriver = new EventFiringWebDriver(driver);
			custListener = new CustomEventListener();
			eventDriver.register(custListener);
			driver = eventDriver;

			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(CommonUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("DEV33URL"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}