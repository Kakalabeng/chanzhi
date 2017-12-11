package com.edu.login;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;

public class LoginWrongPasswordTest extends BaseTest{
	//正确的用户名，错误的密码
		@Test
		public  void WrongPassword() throws InterruptedException{
			Login loginPage=new Login(driver);
			loginPage.LoginWP();
			assertFalse(driver.getPageSource().contains("登录失败"));
			Thread.sleep(5000);
		}
}
