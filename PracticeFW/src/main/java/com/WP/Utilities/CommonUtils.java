package com.WP.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.WP.Base.WPCore;

public class CommonUtils extends WPCore {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void captureScreen() {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currDir = System.getProperty("user.dir");
		String currTime = new Date(System.currentTimeMillis()).toString().replaceAll("[:]", "_");
		try {
			FileUtils.copyFile(screenshot, new File(currDir + "\\sceenshots\\" + currTime + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
