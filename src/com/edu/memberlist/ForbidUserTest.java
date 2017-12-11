package com.edu.memberlist;

import org.testng.annotations.Test;

import com.edu.action.Login_Action;
import com.edu.action.Memberlist_Action;
import com.webtest.core.BaseTest;

public class ForbidUserTest extends BaseTest{
	//禁用一天
	@Test
	public void forbidUser() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Memberlist_Action forbid=new Memberlist_Action(webtest);
		forbid.forbidUser("admin3");
	}
	//解除禁用
	@Test(dependsOnMethods="forbidUser")
	public void liftBan() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Memberlist_Action lift=new Memberlist_Action(webtest);
		lift.liftBan("admin3");
	}
}
