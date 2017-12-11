package com.edu.memberlist;

import org.testng.annotations.Test;
import com.edu.action.Login_Action;
import com.edu.action.Memberlist_Action;
import com.webtest.core.BaseTest;

public class SelectMemberTest extends BaseTest{
	//全选
	@Test
	public void checkAll() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Memberlist_Action select=new Memberlist_Action(webtest);
		select.checkAll();
	}
	//反选
	@Test(dependsOnMethods="checkAll")
	public void inverse() throws InterruptedException{
		Memberlist_Action select=new Memberlist_Action(webtest);
		select.inverse();
	}
	
}
