package com.appium.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumBase {
//@Test
	static	WebDriver webDriver;
	static	WebDriverWait wait;
	static AndroidDriver<AndroidElement> androidDriver;
	static AppiumDriver<MobileElement> appiumDriver;
	//   {
//	    	  "browsername": "chrome",
//	    	  "deviceName": "ASUS_X00TD",
//	    	  "platformName": "Android",
//	    	  "appPackage": "com.android.chrome",
//	    	  "appActivity": "com.google.android.apps.chrome.Main"
//	    	}
	public static  AndroidDriver<AndroidElement> baseCapabilities() throws MalformedURLException {

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
	cap.setCapability("deviceName",devicNameSAM );
	cap.setCapability("platformName", "Android");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10000");
	//cap.setCapability("appPackage", appPackage);
	//cap.setCapability("appActivity", appActivity);
	cap.setCapability("clearDeviceLogsOnStart", true);
	cap.setCapability("appPackage", appPackage);
	cap.setCapability("appActivity", appActivity);
		
	//cap.setCapability("appActivity", appActivityChrome);
	//cap.setCapability("browsername", "chrome");
	//cap.setCapability("appPackage", appPackagecChrome);
	//cap.setCapability("deviceName","chrome");
	//	webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	//	appiumDriver=new AppiumDriver <MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );

	androidDriver=new AndroidDriver <AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );
	
	wait = new WebDriverWait(androidDriver, 5);
	System.out.println("Appium Code is connected to Mobile");
	return androidDriver;
	}
//public static void main(String[] args) throws MalformedURLException {
//	
//	baseCapabilities();
//}
}
