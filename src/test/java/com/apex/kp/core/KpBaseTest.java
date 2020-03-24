package com.apex.kp.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.apex.kp.signon.constant.LoginConstant;

public class KpBaseTest implements LoginConstant{

	protected WebDriver driver;
	@BeforeTest
	public void setup(){
		
		System.setProperty("WebDriver.Chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		driver.get("https://www.myuhc.com/member/prewelcome.do?currentLanguageFromPreCheck=en");
	}
	@AfterTest
	public void cleanup() {
		driver.close();
		
	}
	
}
