package com.appium.test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollToElement extends AppiumBase{
	
//	public static void swipeVertical (AndroidDriver<AndroidElement> driver ,
//			  double startPercentage, double finalPercentage, double anchorPercentage, int duration)
//			  throws Exception {
//			  org.openqa.selenium.Dimension size = driver.manage().window().getSize();
//			  int anchor = (int) (size.width * anchorPercentage);
//			  int startPoint = (int) (size.height * startPercentage);
//			  int endPoint = (int) (size.height * finalPercentage);
//			  new TouchAction(driver).press(PointOption.point(anchor, startPoint))
//			  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
//			  .moveTo(PointOption.point(anchor, endPoint)).release().perform();
//			}
//	
//	public static boolean scrollToElement (By by,AndroidDriver<AndroidElement> driver) throws Exception {
//		boolean isFoundTheElement = driver.findElements(by).size() > 0;
//		while (isFoundTheElement == false) {
//		swipeVertical(driver,0.8, 0.1, 0.5, 2000);
//		isFoundTheElement = driver.findElements(by).size() > 0;
//		}
public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver =  baseCapabilities();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    

 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
//AndroidElement scroolElements2 = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"));");
  //System.out.println("scroolElements --> "+scroolElements2.getText());
    
 //OR
    
//  Dimension dimension=   driver.manage().window().getSize();
//  int x = dimension.getWidth()/2;
//  int starty =(int)(dimension.getHeight()*60);
//  int endy =(int)(dimension.getHeight()*10);
//  
  //driver.swipe(x,starty,endy,2000);
 //new TouchAction().press(0.2).moveTo(endy).release();
 //new TouchAction().longPress(753, 1483).moveTo(626, 503).release().perform();
//driver.findElementByAndroidUIAutomator("text(\"Graphics\")").click();
//AndroidElement scroolElements = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pictures\"));");
//System.out.println("scroolElements --> "+scroolElements.getText());
    
    
    //it will given  element after scroolling what ever element presend in view.
   // hence will not go back like scrool up.
   // here itis perfroming scroll down.
    
//  AndroidElement scroolElementsViews =   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
//  System.out.println("scroolElementsViews --> "+scroolElementsViews.getText());
//  AndroidElement scroolElements1st = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Accessibility\"));");
//  System.out.println("scroolElements1st --> "+scroolElements1st.getText());

  
}
}
