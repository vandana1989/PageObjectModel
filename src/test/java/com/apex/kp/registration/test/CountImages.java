package com.apex.kp.registration.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImages {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty("WebDriver.Chrome.driver","C:\\chromedriver.exe");
		String url ="https://www.amazon.com/";
		driver.get(url);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("count of the images" + images.size());
		for(WebElement img:images)
		{
			System.out.println(img.getAttribute("src"));
		}

	}

}
