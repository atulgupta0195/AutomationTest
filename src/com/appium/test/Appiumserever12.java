package com.appium.test;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Appiumserever12 {
	@Test
private void testappiumserver() {
	////String Appium_Node_Path="C://Program Files//Appium//node.exe";
	////String Appium_JS_Path="C://Program Files//Appium//node_modules//appium//bin//appium.js";
		
//		  String Appium_JS_Path
//		  ="C://Users//Atul Gupta//AppData//Local//Programs//Appium//resources//app//node_modules//appium//build//lib//main.js"
//		  ; String Appium_Node_Path ="‪C://Program Files//nodejs//node.exe";
//		 
//		String Appium_JS_Path ="C:\\Users\\Atul Gupta\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
//		String Appium_Node_Path ="‪C:\\Program Files\\nodejs\\node.exe";
		String Appium_JS_Path ="C:/Users/Atul Gupta/AppData/Local/Programs/Appium/resources/app/node_modules/appium/build/lib/main.js";
		String Appium_Node_Path ="‪F:/WORKSPACE FOR APPUIM/ApppiumMobileTesting/AppiumNodeJs/node.exe";
	AppiumDriverLocalService appiumService;
	File Appium_JS_PathFile	= new File(Appium_JS_Path);
	Appium_JS_PathFile.exists();
	
	System.out.println("Appium_JS_PathFile :"+Appium_JS_PathFile.exists());
	System.out.println("Appium_JS_PathFile_PathFile :"+Appium_JS_PathFile.exists());
	System.out.println("Appium_JS_PathFile :"+Appium_JS_PathFile.toURI());
	System.out.println("Appium_JS_PathFile canRead :"+Appium_JS_PathFile.canRead());
	System.out.println("Appium_JS_PathFile canExecute :"+Appium_JS_PathFile.canExecute());
	System.out.println("Appium_JS_PathFile canExecute :"+Appium_JS_PathFile.getAbsoluteFile());
	File Appium_Node_PathFile	= new File(Appium_Node_Path);
	
	Appium_Node_PathFile.exists();
	System.out.println("Appium_Node_PathFile :"+Appium_Node_PathFile.exists());
	System.out.println("Appium_Node_PathFile :"+Appium_Node_PathFile.toURI());
	System.out.println("Appium_Node_PathFile canRead :"+Appium_Node_PathFile.canRead());
	System.out.println("Appium_Node_PathFile canExecute :"+Appium_Node_PathFile.canExecute());
	System.out.println("Appium_Node_PathFile canExecute :"+Appium_Node_PathFile.getAbsoluteFile());

		/*
		 * appiumService = AppiumDriverLocalService.buildService(new
		 * AppiumServiceBuilder(). usingAnyFreePort().usingDriverExecutable(new
		 * File(Appium_Node_Path)). withAppiumJS(new
		 * File(Appium_JS_Path)).withIPAddress("127.0.0.1").usingAnyFreePort());
		 * appiumService.start(); System.out.println(appiumService.getUrl());
		 */

}
}
