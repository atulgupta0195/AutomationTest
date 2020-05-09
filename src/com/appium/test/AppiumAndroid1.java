package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumAndroid1 {
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
	@Test

	public static  void baseCapabilities() throws MalformedURLException {

		DesiredCapabilities cap=new DesiredCapabilities();
		String devicNameSAM ="Galaxy J2";
		String deviceNameASUS =  "ASUS_X00TD"; 
		String deviceNameRedmi =  "Redmi"; 
		
		String appPackage="io.appium.android.apis";
		String appActivity="io.appium.android.apis.ApiDemos";
		String appPackagecChrome="com.android.chrome";
		String appActivityChrome="com.google.android.apps.chrome.Main";
		
		//mCurrentFocus=Window{23470b1 u0 com.instagram.android/com.instagram.nux.activity.SignedOutFragmentActivity}
	
		String appPackagecInstagram="com.instagram.android";
		String appActivityInstagram="com.instagram.mainactivity.MainActivity";
		//com.escort.androidui.root com.escortLive2.map.MapViewActivity
		
	//	mCurrentFocus=Window{822e406 u0 com.escort.androidui.root/com.escortLive2.screens.SpeedLimitActivity}
		String apkEcortPackage ="com.escort.androidui.root";
		String apkEcortActivity="com.escortLive2.CobraMainActivity";
		// mCurrentFocus=Window{81da2e4 u0 com.cobra.iradar/com.escortLive2.map.MapViewActivity}
		String apkPackageiradar ="com.escort.androidui.root";
		String apkActivityiradar="com.escortLive2.screens.SpeedLimitActivity";
		// mCurrentFocus=Window{d76e91a u0 com.lacrosseview.app/com.lacrosseview.app.activities.HomeActivity}
		String apkPackagelacrosseview ="com.lacrosseview.app";
		String apkActivitylacrosseview="com.lacrosseview.app.activities.HomeActivity";
		
	cap.setCapability("deviceName",deviceNameRedmi );
	cap.setCapability("platformName", "Android");
	////J9AAGF0108853BZ
	//cap.setCapability("udid", "J9AAGF0108853BZ");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10000");
	//cap.setCapability("appPackage", appPackage);
	//cap.setCapability("appActivity", appActivity);
	cap.setCapability("clearDeviceLogsOnStart", true);
	cap.setCapability("appPackage", apkEcortPackage);
	cap.setCapability("appActivity", apkEcortActivity);
	cap.setCapability("autoAcceptAlerts", true);
	//cap.setCapability("wdaLocalPort", 8102);

	//cap.setCapability("appActivity", appActivityChrome);
	//cap.setCapability("browsername", "chrome");
	//cap.setCapability("appPackage", appPackagecChrome);
	//cap.setCapability("deviceName","chrome");
	//	webDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	//	appiumDriver=new AppiumDriver <MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );

	androidDriver=new AndroidDriver <AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );
	

	
	androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	wait = new WebDriverWait(androidDriver, 5);
	System.out.println("Appium Code is connected to Mobile 1");
	System.out.println("9. driver.getContext();--"+androidDriver.getContext().toString());
	WebDriverWait wait = new WebDriverWait(androidDriver, 5);
	wait.until(ExpectedConditions.alertIsPresent());
	androidDriver.switchTo().alert().accept();
	androidDriver.switchTo().alert().accept();

	}
}
