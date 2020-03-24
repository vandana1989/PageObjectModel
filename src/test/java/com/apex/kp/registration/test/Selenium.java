package com.apex.kp.registration.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty("WebDriver.Chrome.driver","C:\\chromedriver.exe");
		//image
	    String url="https://www.facebook.com/";
		driver.get(url);
//	    driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
//        if(driver.getTitle().equals("Facebook - Log In or Sign Up")) 
//         {
//	     System.out.println("we are in facebook home");
//         }
	   //radiobutton
//        driver.findElement(By.id("email")).sendKeys("vandana.sunkari@gmail.com");
//        driver.findElement(By.id("u_0_7")).click();
	  
        
        //checkbox
//        String url="https://www.cinemark.com/theatres/";
//		WebElement chkbox =  driver.findElement(By.id("Cinemark_XD"));
//	   for(int i=0;i<2;i++) 
//	   {
//	   chkbox.click();
//	   System.out.println("cinemark"+ chkbox.isSelected());
//	   }
	   
	   
	   //dropdown
//	   Select drpdwn =new Select(driver.findElement(By.id("month")));
//	   drpdwn.selectByValue("3");
	   
	   
	   //linktext
	 //  driver.findElement(By.linkText("Create a Page")).click();
	   
	   //partiallinktext
	  // driver.findElement(By.partialLinkText("Forgot")).click();
	   
       //Actions
        Actions builder =new Actions(driver);
        WebElement txtUsername = driver.findElement(By.id("email"));
        Action mouseoverhome =builder.moveToElement(txtUsername)
        		.click()
        		
        		.keyDown(txtUsername,Keys.SHIFT)
        		.sendKeys(txtUsername,"hello")
        		.keyUp(txtUsername,Keys.SHIFT)
        		.build();
        mouseoverhome.perform();
        
        driver.switchTo().alert().dismiss();
        
        
	  // driver.close();
	}

}
