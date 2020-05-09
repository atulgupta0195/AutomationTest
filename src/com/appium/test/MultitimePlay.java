package com.appium.test;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

public class MultitimePlay {
	
	public void multitest(AppiumDriver driver) {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
}
}
