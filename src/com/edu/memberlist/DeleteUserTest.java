package com.edu.memberlist;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

import com.edu.action.Login_Action;
import com.edu.action.Memberlist_Action;
import com.webtest.core.BaseTest;

public class DeleteUserTest extends BaseTest{
	//删除某一用户
	@Test
	public void delUser() throws InterruptedException{
		Login_Action login=new Login_Action(webtest);
		login.loginBack("admin", "admin");
		Memberlist_Action del=new Memberlist_Action(webtest);
		del.delUser("admin2", "admin");
		assertFalse(webtest.getHtmlSource().contains("李四"));
	}
}
