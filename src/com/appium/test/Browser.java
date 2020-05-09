package com.appium.test;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browser extends AppiumBase{

public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = baseCapabilities();
driver.getContext();
System.out.println("9. driver.getContext();--"+driver.getContext().toString());
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextSwitcher/android.widget.TextView"
//).click();
//
//System.out.println("10. driver.getContext();--"+driver.getContext().toString());
//
//Set<String> contextNames = driver.getContextHandles();
//for (String contextName : contextNames) {
//    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
//}
//String s =(String) contextNames.toArray()[1];
//driver.context(s);
//// set context to WEBVIEW_1
//
////do some web testing
//// driver.findElement(By.cssSelector(".green_button")).click();
//
//driver.context("NATIVE_APP");
//
//	//System.out.println("9. driver.getContextHandles();--"+driver.getContextHandles().toString());
//	//System.out.println("10. driver.getContextHandles();--"+driver.getContextHandles().size());
	}
}
