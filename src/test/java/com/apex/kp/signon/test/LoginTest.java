package com.apex.kp.signon.test;

import org.testng.annotations.Test;

import com.apex.kp.core.KpBaseTest;
import com.apex.kp.signon.constant.LoginConstant;
import com.apex.kp.signon.page.LoginPage;

import junit.framework.Assert;

public class LoginTest extends KpBaseTest implements LoginConstant {
	@Test
    public void testwithCorrectid() {
    	LoginPage loginpage = new LoginPage(driver);
    	loginpage.performsSignon("vandana.sunkari@gmail.com","123ge");
    	Assert.assertEquals("myuhc - Member Login | UnitedHealthcare", driver.getTitle());
    }
}
