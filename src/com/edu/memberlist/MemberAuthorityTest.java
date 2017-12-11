package com.edu.memberlist;

import org.testng.annotations.Test;

import com.edu.action.Login_Action;
import com.edu.action.Memberlist_Action;
import com.webtest.core.BaseTest;

public class MemberAuthorityTest extends BaseTest{
	//赋予普通用户管理员权限
	@Test
	public void adminPower() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Memberlist_Action power=new Memberlist_Action(webtest);
		power.adminPower("admin1");
	}
	//赋予管理员超级管理员权限
	@Test(dependsOnMethods="adminPower")
	public void superPower() throws InterruptedException{
		Memberlist_Action power=new Memberlist_Action(webtest);
		power.superPower("admin1");
	}
	//更改超级管理员权限为普通用户权限
	@Test(dependsOnMethods="superPower")
	public void noPower() throws InterruptedException{
		Memberlist_Action power=new Memberlist_Action(webtest);
		power.noPower("admin1");
	}
}
