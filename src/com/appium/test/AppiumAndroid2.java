package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumAndroid2 {
		static	WebDriver webDriver;
		static	WebDriverWait wait;
		static AndroidDriver<AndroidElement> androidDriver;
		static AppiumDriver<MobileElement> appiumDriver;
		//   {
//		    	  "browsername": "chrome",
//		    	  "deviceName": "ASUS_X00TD",
//		    	  "platformName": "Android",
//		    	  "appPackage": "com.android.chrome",
//		    	  "appActivity": "com.google.android.apps.chrome.Main"
//		    	}
		@Test
		public  static  void baseCapabilities() throws MalformedURLException {

			DesiredCapabilities cap=new DesiredCapabilities();
			
			String appPackage="io.appium.android.apis";
			String appActivity="io.appium.android.apis.ApiDemos";
			String appPackagecChrome="com.android.chrome";
			String appActivityChrome="com.google.android.apps.chrome.Main";
			String devicNameSAM ="Galaxy J2";
			String deviceNameASUS =  "ASUS_X00TD";
			// com.instagram.android/com.instagram.mainactivity.MainActivity}
			//com.rahul.videoderbeta/com.rahul.videoderbeta.activities.ActivityMain
			String appPackagecInstagram="com.instagram.android";
			String appActivityInstagram="com.instagram.mainactivity.MainActivity";
		
			//io.appium.android.apis/io.appium.android.apis.ApiDemos}
		cap.setCapability("deviceName",devicNameSAM);
		//42007e7bfc629235
		cap.setCapability("udid", "42007e7bfc629235");

		cap.setCapability("platformName", "Android");
		//cap.setCapability("wdaLocalPort", 8100);

		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10000");
		//cap.setCapability("appPackage", appPackage);
		//cap.setCapability("appActivity", appActivity);
		cap.setCapability("clearDeviceLogsOnStart", true);
		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);
			
		

		androidDriver=new AndroidDriver <AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		wait = new WebDriverWait(androidDriver, 5);
		System.out.println("Appium Code is connected to Mobile 2");
		System.out.println("9. driver.getContext();--"+androidDriver.getContext().toString());

			}
}
