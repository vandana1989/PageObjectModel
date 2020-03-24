package com.apex.kp.signon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.kp.signon.constant.LoginConstant;

public class LoginPage implements LoginConstant {
	
	@FindBy(id=USERNAME_LOCATOR)
  private WebElement emailWebEle;
	@FindBy(id=PASSWORD_LOCATOR)
  private WebElement pwdWebElm;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void performsSignon(String Emailid, String pwd) {
		emailWebEle.sendKeys(Emailid);
		pwdWebElm.sendKeys(pwd);
	}
	
}
