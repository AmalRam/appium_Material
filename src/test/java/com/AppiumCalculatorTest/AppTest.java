package com.AppiumCalculatorTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest 
{
   //static WebDriver driver;
	static AppiumDriver<MobileElement> driver;
	
	@Test
	public static void openCalculator() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		   cap.setCapability(MobileCapabilityType.UDID, "RZ8N80ZBCWA");
		   cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		   cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		   cap.setCapability(MobileCapabilityType.APPLICATION_NAME, "com.sec.android.app.popupcalculator");
		   cap.setCapability("appActicity", "com.sec.android.app.popupcalculator.Calculator");
		
		 cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); 
		   
		/*
		 * cap.setCapability("deviceName", "Galaxy M31"); cap.setCapability("udid",
		 * "RZ8N80ZBCWA"); cap.setCapability("platformName", "Android");
		 * cap.setCapability("platformVersion", "11"); cap.setCapability("appPackage",
		 * "com.sec.android.app.popupcalculator"); cap.setCapability("appActicity",
		 * "com.sec.android.app.popupcalculator.Calculator");
		 */
		
		   URL url = new URL("http://127.0.0.1:4723/wd/hub");
		   driver = new AppiumDriver<MobileElement> (url,cap);
		   driver = new AndroidDriver<MobileElement> (url,cap);
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		  // driver.findElement(By.id(""));
		   System.out.println("Appium trigger native app in your mobile device!");
		   
		   
	   }
	
}


