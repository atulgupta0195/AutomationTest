package com.appium.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServertest13 {
	@Test
private void server() throws InterruptedException, MalformedURLException {
		

			 DesiredCapabilities cap = new DesiredCapabilities();
			// String Appium_Node_Path = “C:\Program Files\nodejs\node.exe”;//That is my patch, change it to your path
			// String Appium_JS_Path = “C:\node_modules\appium\build\lib\main.js”; //That is my patch, change it to your path
			//	String Appium_JS_Path ="C://Users//Atul Gupta//AppData//Local//Programs//Appium//resources//app//node_modules//appium//build//lib//main.js";
				//String Appium_Node_Path ="‪C://Program Files//nodejs//node.exe";
			
//			 String Appium_JS_Path ="C:\\Users\\Atul Gupta\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
//				String Appium_Node_Path ="‪C:\\Program Files\\nodejs\\node.exe";
				String Appium_JS_Path ="C:/Users/Atul Gupta/AppData/Local/Programs/Appium/resources/app/node_modules/appium/build/lib/main.js";
				String Appium_Node_Path ="‪F:/WORKSPACE FOR APPUIM/ApppiumMobileTesting/AppiumNodeJs/node.exe";
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

				//driver = new AndroidDriver<MobileElement>(server.getUrl(), cap);

				//driver=new AndroidDriver <AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap );

				

			   AppiumDriverLocalService service;
			    service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
			             usingPort(4723).usingDriverExecutable(new File(Appium_Node_Path)).
			             withAppiumJS(new File(Appium_JS_Path))
			             .withArgument(GeneralServerFlag.RELAXED_SECURITY)
			             .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
			             .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
			             .withCapabilities(cap));
			     service.start();
			  
			     Thread.sleep(10000);
			     AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
			    		 WebDriverWait wait = new WebDriverWait(driver, 5);
					System.out.println("Appium Code is connected to Mobile");

}
}
