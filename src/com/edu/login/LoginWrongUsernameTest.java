package com.edu.login;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.backtest.BaseTest;

public class LoginWrongUsernameTest extends BaseTest{
	//错误的用户名，正确的密码
		@Test
		public  void WrongUsername() throws InterruptedException{
			Login loginPage=new Login(driver);
			loginPage.LoginWU();
			assertFalse(driver.getPageSource().contains("登录失败"));
			Thread.sleep(5000);
		}
}
