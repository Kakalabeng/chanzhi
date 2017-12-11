package com.edu.login;

import org.testng.annotations.Test;

import com.edu.action.Login_Action;
import com.webtest.core.BaseTest;

public class LoginWebtest extends BaseTest{
	@Test
	public void loginBack() throws Exception{
		Login_Action loginback=new Login_Action(webtest);
		loginback.loginBack("admin","admin");
	}
}
