package com.edu.login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;

public class LoginRightTest extends BaseTest {
	//正确的登录
	@Test
	public void LoginSuccess() throws InterruptedException{
		Login loginPage=new Login(driver);
		loginPage.LoginSuccess();
		assertTrue(driver.getPageSource().contains("前台"));
		Thread.sleep(3000);
	}
}
