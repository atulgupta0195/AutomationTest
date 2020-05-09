package com.appium.test;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class appiumsever14 {
	@Test
private void appiumtest() {
	// TODO Auto-generated method stub
	   AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
      System.out.println("Appium Service created.  URL: '" + service.getUrl().toString() + "'");
      System.out.println("Starting Appium Service . . .");
      service.start();
}
}
