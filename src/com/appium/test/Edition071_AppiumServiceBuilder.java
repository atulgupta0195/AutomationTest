package com.appium.test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class Edition071_AppiumServiceBuilder {
private String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.app.zip";

private AppiumDriver driver;
private static AppiumDriverLocalService server;
private AppiumDriverLocalService service;
private static AppiumServiceBuilder builder;
private static DesiredCapabilities cap;
@BeforeClass
public static void startAppiumServer() {System.out.println("@BeforeClass");



AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
service.start();
//your test scripts logic...
//service.stop();
//your test scripts logic...
//service.stop();

//AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
//// Use any port, in case the default 4723 is already taken (maybe by another Appium server)
//serviceBuilder.usingAnyFreePort();
//// Tell serviceBuilder where node is installed. Or set this path in an environment variable named NODE_PATH
////C:\Program Files\nodejs\node_modules\npm\bin\node-gyp-bin
//serviceBuilder.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\C:\\Program Files\\nodejs\\"));
//// Tell serviceBuilder where Appium is installed. Or set this path in an environment variable named APPIUM_PATH
//serviceBuilder.withAppiumJS(new File("C:\\Program Files\\nodejs\\"));
//// The XCUITest driver requires that a path to the Carthage binary is in the PATH variable. I have this set for my shell, but the Java process does not see it. It can be inserted here.
//HashMap<String, String> environment = new HashMap();
//environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
//serviceBuilder.withEnvironment(environment);
//
//server = AppiumDriverLocalService.buildService(serviceBuilder);
//server.start();
}

@BeforeMethod
public void startSession() throws MalformedURLException {
	System.out.println("@BeforeMethod\r\n" + 
			"");
DesiredCapabilities cap = new DesiredCapabilities();

String appPackage="io.appium.android.apis";
String appActivity="io.appium.android.apis.ApiDemos";
String appPackagecChrome="com.android.chrome";
String appActivityChrome="com.google.android.apps.chrome.Main";
String devicNameSAM ="Galaxy J2";
String deviceNameASUS =  "ASUS_X00TD";
String appPackagecInstagram="com.instagram.android";
String appActivityInstagram="com.instagram.mainactivity.MainActivity";

cap.setCapability("deviceName",devicNameSAM );
cap.setCapability("udid", "42007e7bfc629235");
cap.setCapability("platformName", "Android");
cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10000");
cap.setCapability("clearDeviceLogsOnStart", true);
cap.setCapability("appPackage", appPackage);
cap.setCapability("appActivity", appActivity);

driver = new AndroidDriver<MobileElement>(server.getUrl(), cap);

//driver=new AndroidDriver <AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );

WebDriverWait wait = new WebDriverWait(driver, 5);
System.out.println("Appium Code is connected to Mobile");

}

@AfterMethod
public void endSession() {
	System.out.println("@AfterMethod");
try {
driver.quit();
} catch (Exception ign) {}
}

@AfterClass
public static void stopAppiumServer() {
	System.out.println("@AfterClass");
//server.stop();
}

@Test
public void test() {
// test code goes here
	System.out.println("@TEST");
assertTrue(true);
}
}