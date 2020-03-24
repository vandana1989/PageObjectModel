package com.apex.kp.registration.test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty("WebDriver.Chrome.driver","C:\\chromedriver.exe");
		
	    String url="https://www.facebook.com/";
		driver.get(url);
	}
	
	public static void takeScreenshot(String fileName) {
		//take screenshot and store it as a file format
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,)
	}

}
