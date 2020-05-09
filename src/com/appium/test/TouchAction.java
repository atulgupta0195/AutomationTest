package com.appium.test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntries;
import org.testng.Assert;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.MobileDriver;
//import static io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TouchAction extends AppiumBase{
public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = baseCapabilities();
//	driver.setCapability("clearDeviceLogsOnStart", true);

	 driver.findElementByXPath("//android.widget.TextView[@text='Preference']");
	// LogEntries logEntries = driver.manage().logs().get("driver");

	// inspect available log types
	 Set<String> logtypes = driver.manage().logs().getAvailableLogTypes();
	 System.out.println("suported log types: " + logtypes.toString()); // [logcat, bugreport, server, client]
	// print first and last 10 lines of logs
	 LogEntries logs = driver.manage().logs().get("logcat");
	 System.out.println("First and last ten lines of log: ");
	 StreamSupport.stream(logs.spliterator(), false).limit(10).forEach(System.out::println);
	 System.out.println("...");
	 StreamSupport.stream(logs.spliterator(), false).skip(logs.getAll().size() - 10).forEach(System.out::println);
	// wait for more logs
	 try { Thread.sleep(5000); }
	 catch (Exception ign) {} // pause to allow visual verification

	 // demonstrate that each time get logs, we only get new logs
	 // which were generated since the last time we got logs
	 LogEntries secondCallToLogs = driver.manage().logs().get("logcat");
	 System.out.println("\nFirst ten lines of next log call: ");
	 StreamSupport.stream(secondCallToLogs.spliterator(), false).limit(10).forEach(System.out::println);

	 Assert.assertNotEquals(logs.iterator().next(), secondCallToLogs.iterator().next());
	 
	 // prin
//	TouchAction t =new TouchAction(((AndroidDriver<AndroidElement>) driver));
//			WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//			t.tap(tapOptions().withElement(element(expandList))).perform();
//			driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
//		WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
//			
//			t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
//			//Thread.sleep(2000);
//	WebElement element = driver.findElementByXPath("//android.widget.TextView[@text='Preference']");		
//	//WebElement recBtn = driver.findElement(MobileBy.id("img_button"));
//	new TouchAction((MobileDriver) driver).press(recBtn).waitAction(Duration.ofMillis(10000)).release().perform();
//	new TouchAction(driver).tap(tapOptions().withElement(element(element, 10, 20))).perform();
//
//	TouchActions action = new TouchActions(driver);
//	action.singleTap(element);
//	action.perform();
//	
	//new TouchAction(driver).longPress(753, 1483).moveTo(626, 503).release().perform();


			//System.out.println(driver.findElementById("android:id/title").isDisplayed());
}
}
