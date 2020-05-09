package com.appium.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.imagecomparison.FeatureDetector;
import io.appium.java_client.imagecomparison.FeaturesMatchingOptions;
import io.appium.java_client.imagecomparison.FeaturesMatchingResult;
import io.appium.java_client.imagecomparison.MatchingFunction;
import io.appium.java_client.remote.MobileCapabilityType;

public class EscortLive {
	static WebDriver webDriver;
	static WebDriverWait wait;
	 AndroidDriver<AndroidElement> androidDriver;
	 AppiumDriver<MobileElement> appiumDriver;
    private static By photos = MobileBy.id("com.instagram.android:id/logo");

    private String getReferenceImageB64() throws URISyntaxException, IOException {
        URL refImgUrl = getClass().getClassLoader().getResource("Edition031_Reference_Image.png");
        File refImgFile = Paths.get(refImgUrl.toURI()).toFile();
        return Base64.getEncoder().encodeToString(Files.readAllBytes(refImgFile.toPath()));
    }

    public  void actualTest(AppiumDriver driver) throws URISyntaxException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, 10);

            // get to the photo view
            wait.until(ExpectedConditions.presenceOfElementLocated(photos)).click();

            // wait for and click the correct image using a reference image template
            By sunriseImage = MobileBy.image(getReferenceImageB64());
            wait.until(ExpectedConditions.presenceOfElementLocated(sunriseImage)).click();

            // verify that the resulting alert proves we clicked the right image
            wait.until(ExpectedConditions.alertIsPresent());
            String alertText = driver.switchTo().alert().getText();
          //  Assert.assertThat(alertText, Matchers.containsString("sunrise"));
        } 
	@Test
	public  void baseCapabilities() throws URISyntaxException, IOException {

		DesiredCapabilities cap = new DesiredCapabilities();
		String devicNameSAM ="Galaxy J2";
		String deviceNameASUS =  "ASUS_X00TD"; 
		
		String appPackagecInstagram="com.instagram.android";
		String appActivityInstagram="com.instagram.mainactivity.MainActivity";
		
		String apkEcortPackage = "com.escort.androidui.root";
		String apkEcortActivity = "com.escortLive2.CobraMainActivity";

		String apkPackageiradar = "com.escort.androidui.root";
		String apkActivityiradar = "com.escortLive2.screens.SpeedLimitActivity";

		String apkPackagelacrosseview = "com.lacrosseview.app";
		String apkActivitylacrosseview = "com.lacrosseview.app.activities.HomeActivity";

		cap.setCapability("deviceName", deviceNameASUS);
		cap.setCapability("platformName", "Android");

		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10000");

		cap.setCapability("clearDeviceLogsOnStart", true);
		cap.setCapability("appPackage", appPackagecInstagram);
		cap.setCapability("appActivity", appActivityInstagram);
		cap.setCapability("autoAcceptAlerts", true);
		
		androidDriver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		wait = new WebDriverWait(androidDriver, 5);
		
//		wait.until(ExpectedConditions.alertIsPresent());
//		androidDriver.switchTo().alert().accept();
//		androidDriver.switchTo().alert().accept();
//
//		wait = new WebDriverWait(androidDriver, 5);
//		System.out.println("Appium Code is connected to Mobile");
//		System.out.println("9. driver.getContext();--" + androidDriver.getContext().toString());
//		System.out.println("--Connected to EscortLive--");
//		wait = new WebDriverWait(androidDriver, 15);

		//androidDriver.fin
//		androidDriver.launchApp();
// wait = new WebDriverWait(androidDriver, 5);
//		wait.until(ExpectedConditions.alertIsPresent());
//		androidDriver.switchTo().alert().accept();
//		androidDriver.switchTo().alert().accept();
		androidDriver.findElementById("com.instagram.android:id/logo");
		androidDriver.findElementByImage("com.instagram.android:id/logo");
		//actualTest(androidDriver);
	}  
}
