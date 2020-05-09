package com.appium.test;
import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServerJava {
	private static AppiumDriver driver;
	private static AppiumDriverLocalService server;
	public void startServer() {
		String appiumpath ="C:\\Users\\Atul Gupta\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\lib\\appium.js" ;
		String nodeJSpath ="‪C:\\Program Files\\nodejs\\node.exe";
		CommandLine cmd = new CommandLine(nodeJSpath);
		cmd.addArgument(appiumpath);
		cmd.addArgument("--address");
		cmd.addArgument("127.0.0.1");
		cmd.addArgument("--port");
		cmd.addArgument("4723");
		
		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(cmd, handler);
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		AppiumServerJava appiumServer = new AppiumServerJava();
		appiumServer.startServer();
		System.out.println("test started");
		appiumServer.stopServer();
	}
}