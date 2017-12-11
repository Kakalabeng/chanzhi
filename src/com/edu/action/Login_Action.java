package com.edu.action;

import com.webtest.core.WebDriverEngine;

public class Login_Action {
	WebDriverEngine webtest=null;
	public Login_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	//后台登录
	public void loginBack(String username,String password) throws InterruptedException{
		webtest.open("http://localhost:8032/chanzhieps/www/admin.php?");
		webtest.type("name=account", username);
		webtest.type("name=password", password);
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(5000);
	}
}
